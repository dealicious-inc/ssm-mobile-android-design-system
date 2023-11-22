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
import net.deali.designsystem.internal.datetimepicker.CorePicker
import net.deali.designsystem.internal.datetimepicker.CorePickerState
import net.deali.designsystem.internal.datetimepicker.DefaultPickerDecoration
import net.deali.designsystem.internal.datetimepicker.DefaultPickerItemContent
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
            TimePickerFormat.Format12Hour -> (1..12).toList()
            TimePickerFormat.Format24Hour -> (0..23).toList()
        }
    }
    val minutes = remember { (0..59 step minuteInterval).toList() }
    val seconds = remember { (0..59 step secondInterval).toList() }

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
            initialPeriodIndex = when (initialPeriod) {
                TimePickerPeriod.Am -> 0
                TimePickerPeriod.Pm -> 1
            },
            initialHourIndex = when (initialPeriod) {
                TimePickerPeriod.Am -> initialHour - 1
                TimePickerPeriod.Pm -> initialHour
            },
            initialMinuteIndex = initialMinute,
            initialSecondIndex = initialSecond
        )
    }
}

@Stable
class TimePickerState(
    initialPeriodIndex: Int = 0,
    initialHourIndex: Int = 0,
    initialMinuteIndex: Int = 0,
    initialSecondIndex: Int = 0
) {
    internal val periodPickerState = CorePickerState(initialIndex = initialPeriodIndex)
    internal val hourPickerState = CorePickerState(initialIndex = initialHourIndex)
    internal val minutePickerState = CorePickerState(initialIndex = initialMinuteIndex)
    internal val secondPickerState = CorePickerState(initialIndex = initialSecondIndex)

    private var _currentHour: Int by mutableStateOf(initialHourIndex)
    private var _currentMinute: Int by mutableStateOf(initialMinuteIndex)
    private var _currentSecond: Int by mutableStateOf(initialSecondIndex)

    /** 현재 선택 된 시간. 12시간제/24시간제와 상관 없이 항상 0~23 사이의 값으로 반환합니다. */
    var currentHour: Int
        get() = _currentHour
        internal set(value) {
            if (value != _currentHour) {
                _currentHour = value
            }
        }

    /** 현재 선택 된 분. 0~59 사이의 값으로 반환합니다. */
    var currentMinute: Int
        get() = _currentMinute
        internal set(value) {
            if (value != _currentMinute) {
                _currentMinute = value
            }
        }

    /** 현재 선택 된 초. 0~59 사이의 값으로 반환합니다. */
    var currentSecond: Int
        get() = _currentSecond
        internal set(value) {
            if (value != _currentSecond) {
                _currentSecond = value
            }
        }

    /** 현재 피커가 스크롤 중인지 여부. */
    val isScrollInProgress: Boolean
        get() = periodPickerState.lazyListState.isScrollInProgress ||
                hourPickerState.lazyListState.isScrollInProgress ||
                minutePickerState.lazyListState.isScrollInProgress ||
                secondPickerState.lazyListState.isScrollInProgress

    companion object {
        val Saver: Saver<TimePickerState, List<Int>> = Saver(
            save = {
                listOf(
                    it.periodPickerState.currentIndex,
                    it.hourPickerState.currentIndex,
                    it.minutePickerState.currentIndex,
                    it.secondPickerState.currentIndex
                )
            },
            restore = {
                TimePickerState(
                    initialPeriodIndex = it[0],
                    initialHourIndex = it[1],
                    initialMinuteIndex = it[2],
                    initialSecondIndex = it[3]
                )
            }
        )
    }
}
