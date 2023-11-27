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
import kotlin.math.min

/**
 * 피커에서 선택 가능 한 기본 최소 날짜. 기본값은 [Date]에서 표현 가능 한 최소 날짜로, 1970년 1월 1일 00:00:00 GMT 이다.
 */
private val defaultMinimumDate = Date(0)

/**
 * 피커에서 선택 가능 한 기본 최대 날짜. 기본값은 [Date]의 최소값의 200년 후인 2170년 1월 1일 00:00:00 GMT 이다.
 */
private val defaultMaximumDate = Date().apply {
    val maxCalendar = Calendar.getInstance()
    maxCalendar.set(Calendar.YEAR, 2170)
    maxCalendar.set(Calendar.MONTH, Calendar.JANUARY)
    maxCalendar.set(Calendar.DAY_OF_MONTH, 1)
    this.time = maxCalendar.timeInMillis
}

/**
 * 디자인 시스템 날짜 피커 컴포넌트.
 *
 * @param state 피커의 상태 값들을 관리하고 상태 호이스팅을 위한 state 객체.
 * @param modifier 컴포넌트에 적용 할 Modifier.
 * @param yearEnabled year 피커 활성화 여부.
 * @param monthEnabled month 피커 활성화 여부.
 * @param dateEnabled date 피커 활성화 여부.
 * @param minimumDate 선택 가능 한 최소 날짜.
 * @param maximumDate 선택 가능 한 최대 날짜.
 * @param itemHeight 피커 내부에 그려지는 [yearItemContent], [monthItemContent], [dateItemContent]들의 높이.
 * @param pickerSpacing year, month, date 피커 사이의 간격.
 * @param contentPadding year, month, date 피커 바깥을 감싸는 패딩.
 * @param decorationBox 피커 뒤에 그려지는 데코레이션 컨텐츠.
 * @param yearItemContent year 피커를 그리는 Composable.
 * @param monthItemContent month 피커를 그리는 Composable.
 * @param dateItemContent date 피커를 그리는 Composable.
 */
@Composable
fun DatePicker(
    state: DatePickerState,
    modifier: Modifier = Modifier,
    yearEnabled: Boolean = true,
    monthEnabled: Boolean = true,
    dateEnabled: Boolean = true,
    minimumDate: Date = remember { defaultMinimumDate },
    maximumDate: Date = remember { defaultMaximumDate },
    itemHeight: Dp = 48.dp,
    pickerSpacing: Dp = 0.dp,
    contentPadding: PaddingValues = PaddingValues(all = 0.dp),
    decorationBox: @Composable BoxScope.(innerPickers: @Composable () -> Unit) -> Unit =
        @Composable { innerPickers ->
            DefaultPickerDecoration()
            innerPickers()
        },
    yearItemContent: @Composable BoxScope.(year: Int) -> Unit = { year ->
        DefaultPickerItemContent(text = year.toString())
    },
    monthItemContent: @Composable BoxScope.(month: Int) -> Unit = { month ->
        DefaultPickerItemContent(text = if (month >= 10) month.toString() else "0${month}")
    },
    dateItemContent: @Composable BoxScope.(date: Int) -> Unit = { date ->
        DefaultPickerItemContent(text = if (date >= 10) date.toString() else "0${date}")
    }
) {
    val minimumYearMonthDate = remember(minimumDate.time) { getYearMonthDateFrom(minimumDate) }
    val maximumYearMonthDate = remember(maximumDate.time) { getYearMonthDateFrom(maximumDate) }
    val (minYear, minMonth, minDate) = minimumYearMonthDate
    val (maxYear, maxMonth, maxDate) = maximumYearMonthDate

    val years = remember { (minYear..maxYear).toList() }
    val months = remember { (1..12).toList() }
    val dates = remember { (1..31).toList() }

    LaunchedEffect(Unit) {
        val initialYear = state.currentYear
        val initialMonth = state.currentMonth
        val initialDate = state.currentDate
        state.updateMinMax(minYear, maxYear, minMonth, maxMonth, minDate, maxDate)
        state.scrollTo(initialYear, initialMonth, initialDate)
    }

    LaunchedEffect(state.isScrollInProgress) {
        if (!state.isScrollInProgress) {
            val currentYearIndex = state.yearPickerState.currentIndex
            val currentYear = minYear + currentYearIndex
            val isSameToMinYear = currentYear == minYear
            val isSameToMaxYear = currentYear == maxYear

            val currentMonthIndex = state.monthPickerState.currentIndex
            when {
                isSameToMinYear && currentMonthIndex + 1 < minMonth -> {
                    state.monthPickerState.animateScrollToItem(
                        calculateFarIndexForRepeatedPicker(
                            index = minMonth - 1,
                            valuesCount = months.size
                        )
                    )
                }

                isSameToMaxYear && currentMonthIndex + 1 > maxMonth -> {
                    state.monthPickerState.animateScrollToItem(
                        calculateFarIndexForRepeatedPicker(
                            index = maxMonth - 1,
                            valuesCount = months.size
                        )
                    )
                }
            }
            val isSameToMinMonth = currentMonthIndex + 1 == minMonth
            val isSameToMaxMonth = currentMonthIndex + 1 == maxMonth

            val currentDateIndex = state.datePickerState.currentIndex
            val lastDateOfMonth = calculateLastDateOfMonth(state.currentYear, state.currentMonth)
            when {
                isSameToMinYear && isSameToMinMonth && currentDateIndex + 1 < minDate -> {
                    state.datePickerState.animateScrollToItem(
                        calculateFarIndexForRepeatedPicker(
                            index = minDate - 1,
                            valuesCount = dates.size
                        )
                    )
                }

                isSameToMaxYear && isSameToMaxMonth && currentDateIndex + 1 > maxDate -> {
                    state.datePickerState.animateScrollToItem(
                        calculateFarIndexForRepeatedPicker(
                            index = min(maxDate - 1, lastDateOfMonth - 1),
                            valuesCount = dates.size
                        )
                    )
                }

                currentDateIndex + 1 > lastDateOfMonth -> {
                    state.datePickerState.animateScrollToItem(
                        calculateFarIndexForRepeatedPicker(
                            index = lastDateOfMonth - 1,
                            valuesCount = dates.size
                        )
                    )
                }
            }
        }
    }

    LaunchedEffect(
        state.yearPickerState.currentIndex,
        state.monthPickerState.currentIndex,
        state.datePickerState.currentIndex
    ) {
        snapshotFlow {
            listOf(
                state.yearPickerState,
                state.monthPickerState,
                state.datePickerState
            )
        }.collect {
            val yearIndex = it[0].currentIndex
            val monthIndex = it[1].currentIndex
            val dateIndex = it[2].currentIndex

            val selectedYear = years[yearIndex]
            val isSameToMinYear = selectedYear == minYear
            val isSameToMaxYear = selectedYear == maxYear

            val selectedMonth = months[monthIndex]
            val actualSelectedMonth = when {
                isSameToMinYear && selectedMonth < minMonth -> minMonth
                isSameToMaxYear && selectedMonth > maxMonth -> maxMonth
                else -> selectedMonth
            }
            val isSameToMinMonth = actualSelectedMonth == minMonth
            val isSameToMaxMonth = actualSelectedMonth == maxMonth

            val selectedDate = dates[dateIndex]
            val filteredSelectedDate = when {
                isSameToMinYear && isSameToMinMonth && selectedDate < minDate -> minDate
                isSameToMaxYear && isSameToMaxMonth && selectedDate > maxDate -> maxDate
                else -> selectedDate
            }
            val lastDateOfMonth = calculateLastDateOfMonth(selectedYear, actualSelectedMonth)
            val actualSelectedDate = filteredSelectedDate.coerceIn(1, lastDateOfMonth)

            state.currentYear = selectedYear
            state.currentMonth = actualSelectedMonth
            state.currentDate = actualSelectedDate
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
                if (yearEnabled) {
                    CorePicker(
                        values = years,
                        state = state.yearPickerState,
                        modifier = Modifier.weight(1f),
                        repeated = false,
                        itemHeight = itemHeight,
                        itemContent = yearItemContent
                    )
                }
                if (monthEnabled) {
                    CorePicker(
                        values = months,
                        state = state.monthPickerState,
                        modifier = Modifier.weight(1f),
                        repeated = true,
                        itemHeight = itemHeight,
                        itemContent = monthItemContent
                    )
                }
                if (dateEnabled) {
                    CorePicker(
                        values = dates,
                        state = state.datePickerState,
                        modifier = Modifier.weight(1f),
                        repeated = true,
                        itemHeight = itemHeight,
                        itemContent = dateItemContent
                    )
                }
            }
        }
    }
}

/**
 * [DatePicker]의 상태를 관리하고 호이스팅하기 위한 상태 관리 객체를 생성하고 remember.
 * 현재 시간을 초기 값으로 사용합니다.
 */
@Composable
@Stable
fun rememberDatePickerState(): DatePickerState {
    val today = Calendar.getInstance()
    today.time = Date()

    val todayYear = today.get(Calendar.YEAR)
    val todayMonth = today.get(Calendar.MONTH) + 1
    val todayDate = today.get(Calendar.DAY_OF_MONTH)

    return rememberSaveable(saver = DatePickerState.Saver) {
        DatePickerState(
            initialYear = todayYear,
            initialMonth = todayMonth,
            initialDate = todayDate
        )
    }
}

/**
 * [DatePicker]의 상태를 관리하고 호이스팅하기 위한 상태 관리 객체를 생성하고 remember.
 *
 * @param initialYear 초기 연도 값. 반드시 양수여야 합니다.
 * @param initialMonth 초기 달 값. 1에서 12 사이 값이여야 합니다.
 * @param initialDate 초기 날짜 값. 1에서 31 사이 값이여야 합니다.
 */
@Composable
@Stable
fun rememberDatePickerState(
    initialYear: Int,
    initialMonth: Int,
    initialDate: Int
): DatePickerState {
    require(initialYear > 1) {
        "initialYear는 양수 값이여야 합니다: initialYear=$initialYear"
    }
    require(initialMonth in 1..12) {
        "initialMonth는 1에서 12 사이 값이여야 합니다: initialMonth=$initialMonth"
    }
    require(initialDate in 1..31) {
        "initialDate는 1에서 31 사이 값이여야 합니다: initialDate=$initialDate"
    }

    return rememberSaveable(saver = DatePickerState.Saver) {
        DatePickerState(
            initialYear = initialYear,
            initialMonth = initialMonth,
            initialDate = initialDate
        )
    }
}

@Stable
class DatePickerState(
    initialYear: Int,
    initialMonth: Int,
    initialDate: Int
) {
    internal val yearPickerState = CorePickerState()
    internal val monthPickerState = CorePickerState()
    internal val datePickerState = CorePickerState()

    private var _currentYear: Int by mutableStateOf(initialYear)
    private var _currentMonth: Int by mutableStateOf(initialMonth)
    private var _currentDate: Int by mutableStateOf(initialDate)

    /** 현재 선택 된 연도. */
    var currentYear: Int
        get() = _currentYear
        internal set(value) {
            if (value != _currentYear) {
                _currentYear = value
            }
        }

    /** 현재 선택 된 달. */
    var currentMonth: Int
        get() = _currentMonth
        internal set(value) {
            if (value != _currentMonth) {
                _currentMonth = value
            }
        }

    /** 현재 선택 된 날짜. */
    var currentDate: Int
        get() = _currentDate
        internal set(value) {
            if (value != _currentDate) {
                _currentDate = value
            }
        }

    /** 현재 선택 된 날짜를 [Date]객체로 반환 */
    val currentAsDate: Date
        get() {
            val calendar = Calendar.getInstance()
            calendar.set(Calendar.YEAR, currentYear)
            calendar.set(Calendar.MONTH, currentMonth - 1)
            calendar.set(Calendar.DAY_OF_MONTH, currentDate)
            return calendar.time
        }

    /** 현재 선택 된 날짜를 [Long]형 타임 스탭프로 반환 */
    val currentAsTimeStamp: Long
        get() = currentAsDate.time

    private var minYear: Int by mutableStateOf(NotInitialized)
    private var maxYear: Int by mutableStateOf(NotInitialized)
    private var minMonth: Int by mutableStateOf(NotInitialized)
    private var maxMonth: Int by mutableStateOf(NotInitialized)
    private var minDate: Int by mutableStateOf(NotInitialized)
    private var maxDate: Int by mutableStateOf(NotInitialized)

    /** 현재 피커가 스크롤 중인지 여부. */
    val isScrollInProgress: Boolean
        get() = yearPickerState.lazyListState.isScrollInProgress ||
                monthPickerState.lazyListState.isScrollInProgress ||
                datePickerState.lazyListState.isScrollInProgress

    /**
     * 특정 날짜로 애니메이션 없이 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소를 벗어난다면 가능 한 만큼만 이동합니다.
     */
    suspend fun scrollTo(year: Int, month: Int, date: Int) {
        if (year < 1) return
        if (month < 1 || month > 12) return
        if (date < 1 || date > 31) return
        if (
            minYear == NotInitialized || maxYear == NotInitialized ||
            minMonth == NotInitialized || maxMonth == NotInitialized ||
            minDate == NotInitialized || maxDate == NotInitialized
        ) {
            return
        }
        yearPickerState.scrollToItem(calculateYearScrollTargetIndex(year))
        monthPickerState.scrollToItem(calculateMonthScrollTargetIndex(year, month))
        datePickerState.scrollToItem(calculateDateScrollTargetIndex(year, month, date))
    }

    /**
     * 특정 연도로 애니메이션 없이 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소를 벗어난다면 가능 한 만큼만 이동합니다.
     * 만약 0보다 작은 값이 주어진 경우라면 이동하지 않습니다.
     */
    suspend fun scrollToYear(year: Int) {
        if (year < 1) return
        if (minYear == NotInitialized || maxYear == NotInitialized) return
        yearPickerState.scrollToItem(calculateYearScrollTargetIndex(year))
    }

    /**
     * 특정 달로 애니메이션 없이 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소를 벗어난다면 가능 한 만큼만 이동합니다.
     * 만약 1에서 12 사이의 값이 주어지지 않았다면 이동하지 않습니다.
     */
    suspend fun scrollToMonth(month: Int) {
        if (month < 1 || month > 12) return
        if (minMonth == NotInitialized || maxMonth == NotInitialized) return
        monthPickerState.scrollToItem(calculateMonthScrollTargetIndex(currentYear, month))
    }

    /**
     * 특정 날짜로 애니메이션 없이 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소를 벗어난다면 가능 한 만큼만 이동합니다.
     * 만약 1에서 31 사이의 값이 주어지지 않았다면 이동하지 않습니다.
     */
    suspend fun scrollToDate(date: Int) {
        if (date < 1 || date > 31) return
        if (minDate == NotInitialized || maxDate == NotInitialized) return
        datePickerState.scrollToItem(
            calculateDateScrollTargetIndex(
                currentYear,
                currentMonth,
                date
            )
        )
    }

    /**
     * 특정 날짜로 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소를 벗어난다면 가능 한 만큼만 이동합니다.
     */
    suspend fun animateScrollTo(year: Int, month: Int, date: Int) {
        if (year < 1) return
        if (month < 1 || month > 12) return
        if (date < 1 || date > 31) return
        if (
            minYear == NotInitialized || maxYear == NotInitialized ||
            minMonth == NotInitialized || maxMonth == NotInitialized ||
            minDate == NotInitialized || maxDate == NotInitialized
        ) {
            return
        }
        coroutineScope {
            launch {
                yearPickerState.animateScrollToItem(calculateYearScrollTargetIndex(year))
            }
            launch {
                monthPickerState.animateScrollToItem(calculateMonthScrollTargetIndex(year, month))
            }
            launch {
                datePickerState.animateScrollToItem(
                    calculateDateScrollTargetIndex(
                        year,
                        month,
                        date
                    )
                )
            }
        }
    }

    /**
     * 특정 연도로 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소 날짜를 벗어난다면 가능 한 만큼만 이동합니다.
     */
    suspend fun animateScrollToYear(year: Int) {
        if (year < 1) return
        if (minYear == NotInitialized || maxYear == NotInitialized) return
        yearPickerState.animateScrollToItem(calculateYearScrollTargetIndex(year))
    }

    /**
     * 특정 달로 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소 날짜를 벗어난다면 가능 한 만큼만 이동합니다.
     */
    suspend fun animateScrollToMonth(month: Int) {
        if (month < 1 || month > 12) return
        if (minMonth == NotInitialized || maxMonth == NotInitialized) return
        monthPickerState.animateScrollToItem(calculateMonthScrollTargetIndex(currentYear, month))
    }

    /**
     * 특정 날짜로 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소 날짜를 벗어난다면 가능 한 만큼만 이동합니다.
     */
    suspend fun animateScrollToDate(date: Int) {
        if (date < 1 || date > 31) return
        if (minDate == NotInitialized || maxDate == NotInitialized) return
        datePickerState.animateScrollToItem(
            calculateDateScrollTargetIndex(
                currentYear,
                currentMonth,
                date
            )
        )
    }

    internal fun updateMinMax(
        minYear: Int,
        maxYear: Int,
        minMonth: Int,
        maxMonth: Int,
        minDate: Int,
        maxDate: Int,
    ) {
        if (this.minYear != minYear) {
            this.minYear = minYear
        }
        if (this.maxYear != maxYear) {
            this.maxYear = maxYear
        }
        if (this.minMonth != minMonth) {
            this.minMonth = minMonth
        }
        if (this.maxMonth != maxMonth) {
            this.maxMonth = maxMonth
        }
        if (this.minDate != minDate) {
            this.minDate = minDate
        }
        if (this.maxDate != maxDate) {
            this.maxDate = maxDate
        }
    }

    private fun calculateYearScrollTargetIndex(year: Int): Int {
        return (year - minYear).coerceIn(0, maxYear - minYear)
    }

    private fun calculateMonthScrollTargetIndex(year: Int, month: Int): Int {
        return when {
            year <= minYear && month <= minMonth -> {
                calculateFarIndexForRepeatedPicker(minMonth - 1, 12)
            }

            year >= maxYear && month >= maxMonth -> {
                calculateFarIndexForRepeatedPicker(maxMonth - 1, 12)
            }

            else -> {
                calculateFarIndexForRepeatedPicker(month - 1, 12)
            }
        }
    }

    private fun calculateDateScrollTargetIndex(year: Int, month: Int, date: Int): Int {
        return when {
            year <= minYear && month <= minMonth && date <= minDate -> {
                val lastDateOfMonth = calculateLastDateOfMonth(year, minMonth)
                val targetDate = minDate.coerceIn(0, lastDateOfMonth)
                calculateFarIndexForRepeatedPicker(targetDate - 1, 31)
            }

            year >= maxYear && month >= maxMonth && date >= maxDate -> {
                val lastDateOfMonth = calculateLastDateOfMonth(year, maxMonth)
                val targetDate = maxMonth.coerceIn(0, lastDateOfMonth)
                calculateFarIndexForRepeatedPicker(targetDate - 1, 31)
            }

            else -> {
                val lastDateOfMonth = calculateLastDateOfMonth(year, month)
                val targetDate = date.coerceIn(0, lastDateOfMonth)
                calculateFarIndexForRepeatedPicker(targetDate - 1, 31)
            }
        }
    }

    companion object {
        val Saver: Saver<DatePickerState, List<Int>> = Saver(
            save = {
                listOf(
                    it.currentYear,
                    it.currentMonth,
                    it.currentDate
                )
            },
            restore = {
                DatePickerState(
                    initialYear = it[0],
                    initialMonth = it[1],
                    initialDate = it[2]
                )
            }
        )

        private const val NotInitialized: Int = -1
    }
}

/**
 * [Date] 객체의 시간을 year, month, dayOfMonth 3개의 숫자로 분리.
 */
private fun getYearMonthDateFrom(date: Date): Triple<Int, Int, Int> {
    val calendar = Calendar.getInstance()
    calendar.time = date

    val year = calendar.get(Calendar.YEAR)
    val month = calendar.get(Calendar.MONTH) + 1
    val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)
    return Triple(year, month, dayOfMonth)
}

/** 주어진 연월의 가장 마지막 날짜 반환 */
private fun calculateLastDateOfMonth(year: Int, month: Int): Int {
    return when (month) {
        1 -> 31
        2 -> if (isLeafYear(year)) 29 else 28
        3 -> 31
        4 -> 30
        5 -> 31
        6 -> 30
        7 -> 31
        8 -> 31
        9 -> 30
        10 -> 31
        11 -> 30
        12 -> 31
        else -> throw IllegalArgumentException("$month is impossible month")
    }
}

/** 주어진 연도가 윤년인지 확인 */
private fun isLeafYear(year: Int): Boolean {
    return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)
}
