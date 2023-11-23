package net.deali.designsystem.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import net.deali.designsystem.internal.datetimepicker.CorePicker
import net.deali.designsystem.internal.datetimepicker.CorePickerState
import net.deali.designsystem.internal.datetimepicker.DefaultPickerDecoration
import net.deali.designsystem.internal.datetimepicker.DefaultPickerItemContent
import net.deali.designsystem.internal.datetimepicker.calculateFarIndexForRepeatedPicker
import java.util.Calendar
import java.util.Date

/**
 * 12시간제에서 시간 interval로 사용 가능 한 12의 약수이면서 6 이하인 값.
 */
private val divisorsOf12 = listOf(1, 2, 3, 4, 6)

/**
 * 24시간제에서 시간 interval로 사용 가능 한 24의 약수이면서 12 이하인 값.
 */
private val divisorsOf24 = listOf(1, 2, 3, 4, 6, 8, 12)

/**
 * 분 또는 초 interval로 사용 가능 한 60의 약수이면서 30 이하인 값.
 */
private val divisorsOf60 = listOf(1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30)

enum class TimePickerFormat {
    Format12Hour, Format24Hour
}

enum class TimePickerPeriod {
    Am, Pm
}

/**
 * 디자인 시스템 시간 피커 컴포넌트
 *
 * @param timeFormat 시간 피커 시간 표시 형식 (12시간제/24시간제). 12시간제 형식을 사용하면 [periodItemContent]가 활성화 됩니다.
 * @param state 피커의 상태 값들을 관리하고 상태 호이스팅을 위한 state 객체.
 * @param modifier 컴포넌트에 적용 할 Modifier.
 * @param hourEnabled hour 피커 활성화 여부.
 * @param minuteEnabled minute 피커 활성화 여부.
 * @param secondEnabled second 피커 활성화 여부.
 * @param hourInterval hour 피커에서 선택 할 수 있는 시간 간격. 예를 들어 5라면 5시간 간격으로 선택 가능하다.
 * [timeFormat]이 12시간제인 경우 interval 값은 반드시 12의 약수이면서 6 이하 값(1, 2, 3, 4, 6)만 선택 할 수 있고,
 * 24시간제인 경우에는 반드시 24의 약수이면서 12 이하 값(1, 2, 3, 4, 6, 8, 12)만 선택 할 수 있습니다.
 * @param minuteInterval minute 피커에서 선택 할 수 있는 분 간격. 예를 들어 5라면 5분 간격으로 선택 가능하다.
 * interval 값은 반드시 60의 약수이면서 30 이하 값(1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30)만 선택 할 수 있습니다.
 * @param secondInterval second 피커에서 선택 할 수 있는 초 간격. 예를 들어 5라면 5초 간격으로 선택 가능하다.
 * interval 값은 반드시 60의 약수이면서 30 이하 값(1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30)만 선택 할 수 있습니다.
 * @param itemHeight 피커 내부에서 그려지는 [hourItemContent], [minuteItemContent], [secondItemContent], [periodItemContent]들의 높이.
 * @param pickerSpacing hour, minute, second, period 피커 사이의 간격.
 * @param contentPadding hour, minute, second, period 피커 바깥을 감싸는 패딩.
 * @param decorationBox 피커 뒤에 그려지는 데코레이션 컨텐츠.
 * @param periodItemContent period(AM/PM) 피커를 그리는 Composable.
 * @param hourItemContent hour 피커를 그리는 Composable.
 * @param minuteItemContent minute 피커를 그리는 Composable.
 * @param secondItemContent second 피커를 그리는 Composable.
 */
@Composable
fun TimePicker(
    timeFormat: TimePickerFormat,
    state: TimePickerState,
    modifier: Modifier = Modifier,
    hourEnabled: Boolean = true,
    minuteEnabled: Boolean = true,
    secondEnabled: Boolean = true,
    hourInterval: Int = 1,
    minuteInterval: Int = 1,
    secondInterval: Int = 1,
    itemHeight: Dp = 48.dp,
    pickerSpacing: Dp = 0.dp,
    contentPadding: PaddingValues = PaddingValues(all = 0.dp),
    decorationBox: @Composable BoxScope.(innerPickers: @Composable () -> Unit) -> Unit =
        @Composable { innerPickers ->
            DefaultPickerDecoration()
            innerPickers()
        },
    periodItemContent: @Composable BoxScope.(period: TimePickerPeriod) -> Unit = { period ->
        DefaultPickerItemContent(text = if (period == TimePickerPeriod.Am) "AM" else "PM")
    },
    hourItemContent: @Composable BoxScope.(hour: Int) -> Unit = { hour ->
        DefaultPickerItemContent(text = if (hour >= 10) hour.toString() else "0${hour}")
    },
    minuteItemContent: @Composable BoxScope.(minute: Int) -> Unit = { minute ->
        DefaultPickerItemContent(text = if (minute >= 10) minute.toString() else "0${minute}")
    },
    secondItemContent: @Composable BoxScope.(second: Int) -> Unit = { second ->
        DefaultPickerItemContent(text = if (second >= 10) second.toString() else "0${second}")
    }
) {
    when (timeFormat) {
        TimePickerFormat.Format12Hour -> check(hourInterval in divisorsOf12) {
            "hourInterval은 12의 약수이면서 6 이하의 자연수만 사용 가능합니다."
        }

        TimePickerFormat.Format24Hour -> check(hourInterval in divisorsOf24) {
            "hourInterval은 24의 약수이면서 12 이하의 자연수만 사용 가능합니다."
        }
    }
    check(minuteInterval in divisorsOf60) {
        "minuteInterval은 60의 약수이면서 30 이하의 자연수만 사용 가능합니다."
    }
    check(secondInterval in divisorsOf60) {
        "secondInterval은 60의 약수이면서 30 이하의 자연수만 사용 가능합니다."
    }

    val amPm = remember { listOf(TimePickerPeriod.Am, TimePickerPeriod.Pm) }
    val hours = remember {
        when (timeFormat) {
            TimePickerFormat.Format12Hour -> (1..12 step hourInterval).toList()
            TimePickerFormat.Format24Hour -> (0..23 step hourInterval).toList()
        }
    }
    val minutes = remember { (0..59 step minuteInterval).toList() }
    val seconds = remember { (0..59 step secondInterval).toList() }

    LaunchedEffect(Unit) {
        val initialHour = state.currentHour
        val initialMinute = state.currentMinute
        val initialSecond = state.currentSecond
        state.updateTimeFormat(timeFormat)
        state.updateIntervals(hourInterval, minuteInterval, secondInterval)
        state.scrollTo(initialHour, initialMinute, initialSecond)
    }

    LaunchedEffect(
        state.periodPickerState.currentIndex,
        state.hourPickerState.currentIndex,
        state.minutePickerState.currentIndex,
        state.secondPickerState.currentIndex
    ) {
        when (timeFormat) {
            TimePickerFormat.Format12Hour -> {
                snapshotFlow {
                    listOf(
                        state.periodPickerState,
                        state.hourPickerState,
                        state.minutePickerState,
                        state.secondPickerState
                    )
                }.collect {
                    val periodIndex = it[0].currentIndex
                    val hourIndex = it[1].currentIndex
                    val minuteIndex = it[2].currentIndex
                    val secondIndex = it[3].currentIndex
                    val amOrPm = amPm[periodIndex]
                    val hour = hours[hourIndex]
                    state.currentHour = when (amOrPm) {
                        TimePickerPeriod.Am -> {
                            if (hour != 12) hour else 0
                        }

                        TimePickerPeriod.Pm -> {
                            if (hour != 12) hour + 12 else 12
                        }
                    }
                    state.currentMinute = minutes[minuteIndex]
                    state.currentSecond = seconds[secondIndex]
                }
            }

            TimePickerFormat.Format24Hour -> {
                snapshotFlow {
                    listOf(
                        state.hourPickerState,
                        state.minutePickerState,
                        state.secondPickerState
                    )
                }.collect {
                    val hourIndex = it[0].currentIndex
                    val minuteIndex = it[1].currentIndex
                    val secondIndex = it[2].currentIndex
                    state.currentHour = hours[hourIndex]
                    state.currentMinute = minutes[minuteIndex]
                    state.currentSecond = seconds[secondIndex]
                }
            }
        }
    }

    BoxWithConstraints(modifier) {
        decorationBox {
            Row(
                modifier = Modifier
                    .size(maxWidth, maxHeight)
                    .padding(contentPadding),
                horizontalArrangement = Arrangement.spacedBy(pickerSpacing)
            ) {
                if (timeFormat == TimePickerFormat.Format12Hour && hourEnabled) {
                    CorePicker(
                        values = amPm,
                        state = state.periodPickerState,
                        modifier = Modifier.weight(1f),
                        repeated = false,
                        itemHeight = itemHeight,
                        itemContent = periodItemContent
                    )
                }
                if (hourEnabled) {
                    CorePicker(
                        values = hours,
                        state = state.hourPickerState,
                        modifier = Modifier.weight(1f),
                        repeated = true,
                        itemHeight = itemHeight,
                        itemContent = hourItemContent
                    )
                }
                if (minuteEnabled) {
                    CorePicker(
                        values = minutes,
                        state = state.minutePickerState,
                        modifier = Modifier.weight(1f),
                        repeated = true,
                        itemHeight = itemHeight,
                        itemContent = minuteItemContent
                    )
                }
                if (secondEnabled) {
                    CorePicker(
                        values = seconds,
                        state = state.secondPickerState,
                        modifier = Modifier.weight(1f),
                        repeated = true,
                        itemHeight = itemHeight,
                        itemContent = secondItemContent
                    )
                }
            }
        }
    }
}

/**
 * [TimePicker]의 상태를 관리하고 호이스팅하기 위한 상태 관리 객체를 생성하고 remember.
 * 현재 시간을 초기 값으로 사용합니다.
 *
 * @param timeFormat [TimePicker]가 사용하는 [TimePickerFormat].
 */
@Composable
fun rememberTimePickerState(timeFormat: TimePickerFormat): TimePickerState {
    val today = Calendar.getInstance()
    today.time = Date()

    val todayHour = today.get(Calendar.HOUR_OF_DAY)
    val todayMinute = today.get(Calendar.MINUTE)
    val todaySecond = today.get(Calendar.SECOND)

    return rememberTimePickerState(
        timeFormat = timeFormat,
        initialPeriod = when (timeFormat) {
            TimePickerFormat.Format12Hour -> {
                if (todayHour < 12) {
                    TimePickerPeriod.Am
                } else {
                    TimePickerPeriod.Pm
                }
            }

            TimePickerFormat.Format24Hour -> {
                TimePickerPeriod.Am
            }
        },
        initialHour = when (timeFormat) {
            TimePickerFormat.Format12Hour -> {
                if (todayHour <= 12) {
                    todayHour
                } else {
                    todayHour - 12
                }
            }

            TimePickerFormat.Format24Hour -> {
                todayHour
            }
        },
        initialMinute = todayMinute,
        initialSecond = todaySecond
    )
}

/**
 * [TimePicker]의 상태를 관리하고 호이스팅하기 위한 상태 관리 객체를 생성하고 remember.
 *
 * @param timeFormat [TimePicker]가 사용하는 [TimePickerFormat].
 * @param initialPeriod 초기 AM/PM 값. [timeFormat]이 24시간제인 경우 무시됩니다.
 * @param initialHour 초기 시간 값. [initialPeriod]가 [TimePickerPeriod.Am]인 경우 1에서 12 사이,
 * [TimePickerPeriod.Pm]인 경우 0에서 23 사이 값이여야 합니다.
 * @param initialMinute 초기 분 값 0에서 59 사이 값이여야 합니다..
 * @param initialSecond 초기 초 값. 0에서 59 사이 값이여야 합니다.
 */
@Composable
@Stable
fun rememberTimePickerState(
    timeFormat: TimePickerFormat,
    initialPeriod: TimePickerPeriod,
    initialHour: Int,
    initialMinute: Int,
    initialSecond: Int
): TimePickerState {
    when (timeFormat) {
        TimePickerFormat.Format12Hour -> require(initialHour in 1..12) {
            "timeFormat이 12시간제인 경우 initialHour는 1에서 12 사이 값이여야 합니다: initialHour=$initialHour"
        }

        TimePickerFormat.Format24Hour -> require(initialHour in 0..23) {
            "timeFormat이 24시간제인 경우 initialHour는 0에서 23 사이 값이여야 합니다: initialHour=$initialHour"
        }
    }
    require(initialMinute in 0..59) {
        "initialMinute는 0에서 59 사이 값이여야 합니다: initialMinute=$initialMinute"
    }
    require(initialSecond in 0..59) {
        "initialSecond는 0에서 59 사이 값이여야 합니다: initialSecond=$initialSecond"
    }

    return rememberSaveable(saver = TimePickerState.Saver) {
        TimePickerState(
            initialHour = initialHour,
            initialMinute = initialMinute,
            initialSecond = initialSecond,
//            initialPeriodIndex = when (initialPeriod) {
//                TimePickerPeriod.Am -> 0
//                TimePickerPeriod.Pm -> 1
//            },
//            initialHourIndex = when (initialPeriod) {
//                TimePickerPeriod.Am -> initialHour - 1
//                TimePickerPeriod.Pm -> initialHour
//            },
//            initialMinuteIndex = initialMinute,
//            initialSecondIndex = initialSecond
        )
    }
}

@Stable
class TimePickerState(
    initialHour: Int,
    initialMinute: Int,
    initialSecond: Int,
) {
    internal val periodPickerState = CorePickerState()
    internal val hourPickerState = CorePickerState()
    internal val minutePickerState = CorePickerState()
    internal val secondPickerState = CorePickerState()

    private var _currentHour: Int by mutableStateOf(initialHour)
    private var _currentMinute: Int by mutableStateOf(initialMinute)
    private var _currentSecond: Int by mutableStateOf(initialSecond)

    /** 현재 선택 된 시간. 12/24시간제 상관 없이 항상 0~23 사이의 값으로 반환합니다. */
    var currentHour: Int
        get() = _currentHour
        internal set(value) {
            if (value != _currentHour) {
                _currentHour = value
            }
        }

    /** 현재 선택 된 분. */
    var currentMinute: Int
        get() = _currentMinute
        internal set(value) {
            if (value != _currentMinute) {
                _currentMinute = value
            }
        }

    /** 현재 선택 된 초. */
    var currentSecond: Int
        get() = _currentSecond
        internal set(value) {
            if (value != _currentSecond) {
                _currentSecond = value
            }
        }

    private var timeFormat: TimePickerFormat? by mutableStateOf(null)

    private var hourInterval: Int by mutableStateOf(NotInitialized)
    private var minuteInterval: Int by mutableStateOf(NotInitialized)
    private var secondInterval: Int by mutableStateOf(NotInitialized)

    /** 현재 피커가 스크롤 중인지 여부. */
    val isScrollInProgress: Boolean
        get() = periodPickerState.lazyListState.isScrollInProgress ||
                hourPickerState.lazyListState.isScrollInProgress ||
                minutePickerState.lazyListState.isScrollInProgress ||
                secondPickerState.lazyListState.isScrollInProgress

    /** 특정 시간으로 애니메이션 없이 스크롤 이동 */
    suspend fun scrollTo(hour: Int, minute: Int, second: Int) {
        scrollToHour(hour)
        scrollToMinute(minute)
        scrollToSecond(second)
    }

    /**
     * 특정한 AM/PM으로 애니메이션 없이 스크롤 이동 */
    suspend fun scrollToPeriod(period: TimePickerPeriod) {
        periodPickerState.scrollToItem(
            when (period) {
                TimePickerPeriod.Am -> 0
                TimePickerPeriod.Pm -> 1
            }
        )
    }

    /**
     * 특정 시간으로 애니메이션 없이 스크롤 이동. 피커의 12/24시간제와는 무관하게 항상 0~23 사이의 시간으로 주어져야 합니다.
     * 피커가 12시간제인 경우, AM/PM도 함께 스크롤 될 수 있습니다.
     * 만약 주어진 값이 피커에서 선택할 수 없는 값이라면 이동하지 않습니다.
     */
    suspend fun scrollToHour(hour: Int) {
        if (hour < 0 || hour > 23) return
        val currentTimeFormat = timeFormat
        if (hourInterval == NotInitialized || currentTimeFormat == null) return
        when (currentTimeFormat) {
            TimePickerFormat.Format12Hour -> {
                val (hour12, period) = deconstructHour24ToHour12AndPeriod(hour)
                val targetIndex = calculateHourScrollTargetIndex(hour12)
                if (targetIndex == NoIndex) return
                scrollToPeriod(period)
                hourPickerState.scrollToItem(targetIndex)
            }

            TimePickerFormat.Format24Hour -> {
                val targetIndex = calculateHourScrollTargetIndex(hour)
                if (targetIndex == NoIndex) return
                hourPickerState.scrollToItem(targetIndex)
            }
        }
    }

    /**
     * 특정 분으로 애니메이션 없이 스크롤 이동. 항상 0에서 59 사이의 값이 주어져야 합니다. 그 외의 값은 이동하지 않습니다.
     * 만약 주어진 값이 피커에서 선택할 수 없는 값이라면 이동하지 않습니다.
     */
    suspend fun scrollToMinute(minute: Int) {
        if (minute < 0 || minute > 59) return
        if (minuteInterval == NotInitialized) return
        val targetIndex = calculateMinuteScrollTargetIndex(minute)
        if (targetIndex == NoIndex) return
        minutePickerState.scrollToItem(targetIndex)
    }

    /**
     * 특정 초로 애니메이션 없이 스크롤 이동. 항상 0에서 59 사이의 값이 주어져야 합니다. 그 외의 값은 이동하지 않습니다.
     * 만약 주어진 값이 피커에서 선택할 수 없는 값이라면 이동하지 않습니다.
     */
    suspend fun scrollToSecond(second: Int) {
        if (second < 0 || second > 59) return
        if (secondInterval == NotInitialized) return
        val targetIndex = calculateSecondScrollTargetIndex(second)
        if (targetIndex == NoIndex) return
        secondPickerState.scrollToItem(targetIndex)
    }

    /** 특정 시간으로 스크롤 이동 */
    suspend fun animateScrollTo(hour: Int, minute: Int, second: Int) {
        coroutineScope {
            launch {
                animateScrollToHour(hour)
            }
            launch {
                animateScrollToMinute(minute)
            }
            launch {
                animateScrollToSecond(second)
            }
        }
    }

    /** 특정 AM/PM으로 스크롤 이동 */
    suspend fun animateScrollToPeriod(period: TimePickerPeriod) {
        periodPickerState.animateScrollToItem(
            when (period) {
                TimePickerPeriod.Am -> 0
                TimePickerPeriod.Pm -> 1
            }
        )
    }

    /**
     * 특정 시간으로 스크롤 이동. 피커의 12/24시간제와는 무관하게 항상 0~23 사이의 시간으로 주어져야 합니다.
     * 피커가 12시간제인 경우, AM/PM도 함께 스크롤 될 수 있습니다.
     * 만약 주어진 값이 피커에서 선택할 수 없는 값이라면 이동하지 않습니다.
     */
    suspend fun animateScrollToHour(hour: Int) {
        if (hour < 0 || hour > 23) return
        val currentTimeFormat = timeFormat
        if (hourInterval == NotInitialized || currentTimeFormat == null) return
        when (currentTimeFormat) {
            TimePickerFormat.Format12Hour -> {
                val (hour12, period) = deconstructHour24ToHour12AndPeriod(hour)
                val targetIndex = calculateHourScrollTargetIndex(hour12)
                if (targetIndex == NoIndex) return
                coroutineScope {
                    launch {
                        animateScrollToPeriod(period)
                    }
                    launch {
                        hourPickerState.animateScrollToItem(targetIndex)
                    }
                }
            }

            TimePickerFormat.Format24Hour -> {
                val targetIndex = calculateHourScrollTargetIndex(hour)
                if (targetIndex == NoIndex) return
                hourPickerState.animateScrollToItem(targetIndex)
            }
        }
    }

    /**
     * 특정 분으로 스크롤 이동. 항상 0에서 59 사이의 값이 주어져야 합니다. 그 외의 값은 이동하지 않습니다.
     * 만약 주어진 값이 피커에서 선택할 수 없는 값이라면 이동하지 않습니다.
     */
    suspend fun animateScrollToMinute(minute: Int) {
        if (minute < 0 || minute > 59) return
        if (minuteInterval == NotInitialized) return
        val targetIndex = calculateMinuteScrollTargetIndex(minute)
        if (targetIndex == NoIndex) return
        minutePickerState.animateScrollToItem(targetIndex)
    }

    /**
     * 특정 초로 스크롤 이동. 항상 0에서 59 사이의 값이 주어져야 합니다. 그 외의 값은 이동하지 않습니다.
     * 만약 주어진 값이 피커에서 선택할 수 없는 값이라면 이동하지 않습니다.
     */
    suspend fun animateScrollToSecond(second: Int) {
        if (second < 0 || second > 59) return
        if (secondInterval == NotInitialized) return
        val targetIndex = calculateSecondScrollTargetIndex(second)
        if (targetIndex == NoIndex) return
        secondPickerState.scrollToItem(targetIndex)
    }

    internal fun updateTimeFormat(timeFormat: TimePickerFormat) {
        if (this.timeFormat != timeFormat) {
            this.timeFormat = timeFormat
        }
    }

    internal fun updateIntervals(
        hourInterval: Int,
        minuteInterval: Int,
        secondInterval: Int
    ) {
        if (this.hourInterval != hourInterval) {
            this.hourInterval = hourInterval
        }
        if (this.minuteInterval != minuteInterval) {
            this.minuteInterval = minuteInterval
        }
        if (this.secondInterval != secondInterval) {
            this.secondInterval = secondInterval
        }
    }

    private fun deconstructHour24ToHour12AndPeriod(hour24: Int): Pair<Int, TimePickerPeriod> {
        val period = if (hour24 < 12) TimePickerPeriod.Am else TimePickerPeriod.Pm
        val hour12 = if (period == TimePickerPeriod.Am) {
            if (hour24 == 0) 12 else hour24
        } else {
            if (hour24 == 12) 12 else hour24 - 12
        }
        return Pair(hour12, period)
    }

    private fun calculateHourScrollTargetIndex(hour: Int): Int {
        val possibleHours = getPossibleHours()
        val hourIndexInPossibles = possibleHours?.indexOf(hour) ?: NoIndex
        if (possibleHours == null || hourIndexInPossibles == NoIndex) return NoIndex
        return calculateFarIndexForRepeatedPicker(hourIndexInPossibles, possibleHours.count())
    }

    private fun calculateMinuteScrollTargetIndex(minute: Int): Int {
        val possibleMinutes = getPossibleMinutes()
        val minuteIndexInPossibles = possibleMinutes?.indexOf(minute) ?: NoIndex
        if (possibleMinutes == null || minuteIndexInPossibles == NoIndex) return NoIndex
        return calculateFarIndexForRepeatedPicker(minuteIndexInPossibles, possibleMinutes.count())
    }

    private fun calculateSecondScrollTargetIndex(second: Int): Int {
        val possibleSeconds = getPossibleSeconds()
        val secondIndexInPossibles = possibleSeconds?.indexOf(second) ?: NoIndex
        if (possibleSeconds == null || secondIndexInPossibles == NoIndex) return NoIndex
        return calculateFarIndexForRepeatedPicker(secondIndexInPossibles, possibleSeconds.count())
    }

    private fun getPossibleHours(): IntProgression? {
        if (hourInterval == NotInitialized) return null
        return when (timeFormat) {
            TimePickerFormat.Format12Hour -> (1..12 step hourInterval)
            TimePickerFormat.Format24Hour -> (0..23 step hourInterval)
            null -> null
        }
    }

    private fun getPossibleMinutes(): IntProgression? {
        if (minuteInterval == NotInitialized) return null
        return (0..59 step minuteInterval)
    }

    private fun getPossibleSeconds(): IntProgression? {
        if (secondInterval == NotInitialized) return null
        return (0..59 step secondInterval)
    }

    companion object {
        val Saver: Saver<TimePickerState, List<Int>> = Saver(
            save = {
                listOf(
                    it.currentHour,
                    it.currentMinute,
                    it.currentSecond,
                )
            },
            restore = {
                TimePickerState(
                    initialHour = it[0],
                    initialMinute = it[1],
                    initialSecond = it[2],
                )
            }
        )

        private const val NotInitialized: Int = -1
        private const val NoIndex: Int = -1
    }
}
