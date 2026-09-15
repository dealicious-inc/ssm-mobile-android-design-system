package net.deali.designsystem.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.ensureActive
import net.deali.designsystem.internal.datetimepicker.CorePicker
import net.deali.designsystem.internal.datetimepicker.CorePickerState
import net.deali.designsystem.internal.datetimepicker.DefaultPickerDecoration
import net.deali.designsystem.internal.datetimepicker.DefaultPickerItemContent
import net.deali.designsystem.util.internal.calculateHorizontalPadding
import net.deali.designsystem.util.internal.calculateVerticalPadding
import net.deali.designsystem.util.internal.countTrue
import java.util.Calendar
import java.util.Date


/**
 * 피커에서 선택 가능 한 기본 최소 날짜. 기본값은 [Date]에서 표현 가능 한 최소 날짜로, 1970년 1월 1일 00:00:00 GMT 이다.
 */
internal val defaultMinimumDate = Date(0)

/**
 * 피커에서 선택 가능 한 기본 최대 날짜. 기본값은 [Date]의 최소값의 200년 후인 2170년 1월 1일 00:00:00 GMT 이다.
 */
internal val defaultMaximumDate = Date().apply {
    val maxCalendar = Calendar.getInstance()
    maxCalendar.set(Calendar.YEAR, 2170)
    maxCalendar.set(Calendar.MONTH, Calendar.JANUARY)
    maxCalendar.set(Calendar.DAY_OF_MONTH, 1)
    this.time = maxCalendar.timeInMillis
}

/**
 * 디자인 시스템 날짜 피커 컴포넌트.
 *
 * year, month, date 피커 모두 반복(무한 순환)되지 않으며, [minimumDate]와 [maximumDate] 사이에서 선택 가능 한 값만 노출합니다.
 * 예를 들어 최대 날짜가 2026-09-15라면 2026년 선택 시 10~12월은 노출되지 않고, 9월 선택 시 16~30일은 노출되지 않습니다.
 * 연도나 월이 바뀌어 현재 선택 값이 노출 목록을 벗어나는 경우, 가장 가까운 선택 가능 한 값으로 즉시 보정됩니다.
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
    val minimum = remember(minimumDate.time) { YearMonthDate.from(minimumDate) }
    val maximum = remember(maximumDate.time) { YearMonthDate.from(maximumDate) }

    LaunchedEffect(minimum, maximum) {
        state.updateBoundary(minimum, maximum)
    }

    // 선택 불가능 한 값은 목록에서 제외하고, 현재 선택 값이 목록을 벗어나면 가장 가까운 선택 가능 한 값으로 보정한다.
    // 월 목록은 선택된 연도에, 일 목록은 선택된 연월에 따라 달라진다.
    val years = remember(minimum, maximum) { selectableYears(minimum, maximum) }
    val selectedYear = state.currentYear.coerceIn(years.first(), years.last())
    val months = remember(selectedYear, minimum, maximum) {
        selectableMonths(selectedYear, minimum, maximum)
    }
    val selectedMonth = state.currentMonth.coerceIn(months.first(), months.last())
    val dates = remember(selectedYear, selectedMonth, minimum, maximum) {
        selectableDates(selectedYear, selectedMonth, minimum, maximum)
    }
    val selectedDate = state.currentDate.coerceIn(dates.first(), dates.last())

    SyncPickerSelection(state.yearPickerState, years, selectedYear) { state.currentYear = it }
    SyncPickerSelection(state.monthPickerState, months, selectedMonth) { state.currentMonth = it }
    SyncPickerSelection(state.datePickerState, dates, selectedDate) { state.currentDate = it }

    BoxWithConstraints(modifier) {
        val layoutDirection = LocalLayoutDirection.current
        val horizontalContentPadding by remember(contentPadding) {
            derivedStateOf {
                contentPadding.calculateHorizontalPadding(layoutDirection)
            }
        }
        val leftContentPadding by remember(horizontalContentPadding) {
            derivedStateOf {
                horizontalContentPadding.calculateLeftPadding(layoutDirection)
            }
        }
        val rightContentPadding by remember(horizontalContentPadding) {
            derivedStateOf {
                horizontalContentPadding.calculateRightPadding(layoutDirection)
            }
        }
        val itemPickerCount by remember(yearEnabled, monthEnabled, dateEnabled) {
            derivedStateOf {
                booleanArrayOf(yearEnabled, monthEnabled, dateEnabled).countTrue()
            }
        }
        val itemPickerWidth by remember(maxWidth, itemPickerCount, horizontalContentPadding) {
            derivedStateOf {
                val maxWidthWithoutPadding = maxWidth - leftContentPadding - rightContentPadding
                maxWidthWithoutPadding / itemPickerCount
            }
        }

        decorationBox {
            Row(
                modifier = Modifier
                    .size(maxWidth, maxHeight)
                    .padding(contentPadding.calculateVerticalPadding()),
                horizontalArrangement = Arrangement.spacedBy(pickerSpacing)
            ) {
                if (yearEnabled) {
                    CorePicker(
                        values = years,
                        state = state.yearPickerState,
                        modifier = Modifier.width(itemPickerWidth + leftContentPadding),
                        itemHeight = itemHeight,
                        contentPadding = PaddingValues.Absolute(left = leftContentPadding),
                        key = { it },
                        itemContent = yearItemContent
                    )
                }
                if (monthEnabled) {
                    val widthAndPadding by remember(
                        yearEnabled,
                        dateEnabled,
                        itemPickerWidth,
                        contentPadding
                    ) {
                        derivedStateOf {
                            val leftPadding = if (yearEnabled) 0.dp else leftContentPadding
                            val rightPadding = if (dateEnabled) 0.dp else rightContentPadding
                            val width = itemPickerWidth + leftPadding + rightPadding
                            val padding = PaddingValues.Absolute(
                                left = leftPadding,
                                right = rightPadding
                            )
                            Pair(width, padding)
                        }
                    }
                    val (width, padding) = widthAndPadding

                    CorePicker(
                        values = months,
                        state = state.monthPickerState,
                        modifier = Modifier.width(width),
                        itemHeight = itemHeight,
                        contentPadding = padding,
                        key = { it },
                        itemContent = monthItemContent
                    )
                }
                if (dateEnabled) {
                    CorePicker(
                        values = dates,
                        state = state.datePickerState,
                        modifier = Modifier.width(itemPickerWidth + rightContentPadding),
                        itemHeight = itemHeight,
                        contentPadding = PaddingValues.Absolute(right = rightContentPadding),
                        key = { it },
                        itemContent = dateItemContent
                    )
                }
            }
        }
    }
}

/**
 * 피커의 값 목록과 선택 값을 동기화한다.
 *
 * - [values]가 바뀌면 다음 측정에서 [selected]가 피커 중앙에 오도록 위치를 맞추고, 선택 값도 [selected]로 보정한다.
 *   (피커가 비활성화되어 그려지지 않는 경우에도 선택 값이 항상 선택 가능 범위 안에 있도록 한다.)
 * - 이후 피커 중앙에 위치한 값이 바뀔 때마다 [onSelected]로 알린다.
 */
@Composable
private fun SyncPickerSelection(
    pickerState: CorePickerState,
    values: ImmutableList<Int>,
    selected: Int,
    onSelected: (Int) -> Unit
) {
    remember(values) {
        pickerState.requestScrollToItem(values.indexOf(selected))
    }

    LaunchedEffect(pickerState, values) {
        onSelected(selected)
        snapshotFlow {
            pickerState.centralVisibleIndexLayoutInfo?.let { Pair(it.index, it.key) }
        }.collect { central ->
            if (central == null) return@collect
            val (index, key) = central
            // 목록이 바뀐 직후에는 아직 이전 목록 기준으로 측정된 아이템이 중앙에 있을 수 있다.
            // index와 key가 현재 목록과 일치하는 경우에만 실제로 그려진 값으로 보고 반영한다.
            if (values.getOrNull(index) == key) {
                onSelected(values[index])
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
 * [Long]형의 타임 스탬프로 초기 값을 지정합니다.
 */
@Composable
@Stable
fun rememberDatePickerState(initialTime: Long): DatePickerState {
    val initialCalendar = Calendar.getInstance()
    val dateInstance = Date()
    dateInstance.time = initialTime
    initialCalendar.time = dateInstance

    val initialYear = initialCalendar.get(Calendar.YEAR)
    val initialMonth = initialCalendar.get(Calendar.MONTH) + 1
    val initialDate = initialCalendar.get(Calendar.DAY_OF_MONTH)

    return rememberSaveable(saver = DatePickerState.Saver) {
        DatePickerState(
            initialYear = initialYear,
            initialMonth = initialMonth,
            initialDate = initialDate
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

    private var _currentYear: Int by mutableIntStateOf(initialYear)
    private var _currentMonth: Int by mutableIntStateOf(initialMonth)
    private var _currentDate: Int by mutableIntStateOf(initialDate)

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
            calendar.set(Calendar.HOUR_OF_DAY, 0)
            calendar.set(Calendar.MINUTE, 0)
            calendar.set(Calendar.SECOND, 0)
            calendar.set(Calendar.MILLISECOND, 0)
            return calendar.time
        }

    /** 현재 선택 된 날짜를 [Long]형 타임 스탭프로 반환 */
    val currentAsTimeStamp: Long
        get() = currentAsDate.time

    /** 선택 가능 한 최소 날짜. [DatePicker]에 연결되기 전에는 null. */
    private var minimum: YearMonthDate? by mutableStateOf<YearMonthDate?>(null)

    /** 선택 가능 한 최대 날짜. [DatePicker]에 연결되기 전에는 null. */
    private var maximum: YearMonthDate? by mutableStateOf<YearMonthDate?>(null)

    /** 현재 피커가 스크롤 중인지 여부. */
    val isScrollInProgress: Boolean
        get() = yearPickerState.lazyListState.isScrollInProgress ||
                monthPickerState.lazyListState.isScrollInProgress ||
                datePickerState.lazyListState.isScrollInProgress

    /**
     * 특정 날짜로 애니메이션 없이 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소를 벗어난다면 가장 가까운 선택 가능 한 날짜로 이동합니다.
     */
    suspend fun scrollTo(year: Int, month: Int, date: Int) {
        if (year < 1) return
        if (month < 1 || month > 12) return
        if (date < 1 || date > 31) return
        val target = resolveScrollTarget(year, month, date) ?: return
        select(target.value)
        yearPickerState.scrollToItem(target.yearIndex)
        monthPickerState.scrollToItem(target.monthIndex)
        datePickerState.scrollToItem(target.dateIndex)
    }

    /**
     * 특정 연도로 애니메이션 없이 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소를 벗어난다면 가장 가까운 선택 가능 한 연도로 이동합니다.
     * 만약 0보다 작은 값이 주어진 경우라면 이동하지 않습니다.
     */
    suspend fun scrollToYear(year: Int) {
        if (year < 1) return
        val target = resolveScrollTarget(year, currentMonth, currentDate) ?: return
        yearPickerState.scrollToItem(target.yearIndex)
        currentYear = target.value.year
    }

    /**
     * 특정 달로 애니메이션 없이 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소를 벗어난다면 가장 가까운 선택 가능 한 달로 이동합니다.
     * 만약 1에서 12 사이의 값이 주어지지 않았다면 이동하지 않습니다.
     */
    suspend fun scrollToMonth(month: Int) {
        if (month < 1 || month > 12) return
        val target = resolveScrollTarget(currentYear, month, currentDate) ?: return
        monthPickerState.scrollToItem(target.monthIndex)
        currentMonth = target.value.month
    }

    /**
     * 특정 날짜로 애니메이션 없이 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소를 벗어난다면 가장 가까운 선택 가능 한 날짜로 이동합니다.
     * 만약 1에서 31 사이의 값이 주어지지 않았다면 이동하지 않습니다.
     */
    suspend fun scrollToDate(date: Int) {
        if (date < 1 || date > 31) return
        val target = resolveScrollTarget(currentYear, currentMonth, date) ?: return
        datePickerState.scrollToItem(target.dateIndex)
        currentDate = target.value.date
    }

    /**
     * 특정 날짜로 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소 날짜를 벗어난다면 가장 가까운 선택 가능 한 날짜로 이동합니다.
     */
    suspend fun animateScrollTo(year: Int, month: Int, date: Int) {
        if (year < 1) return
        if (month < 1 || month > 12) return
        if (date < 1 || date > 31) return
        val target = resolveScrollTarget(year, month, date) ?: return

        // 연도에 따라 월 목록이, 연월에 따라 일 목록이 달라지므로 연도 → 월 → 일 순서로 이동한다.
        // 이동 도중 목록이 바뀌면 피커는 현재 선택 값 기준으로 위치를 재조정하므로, 매 단계마다 선택 값을 목표 값으로 맞춰
        // 재조정이 항상 목표 값을 향하도록 한다. 재조정으로 애니메이션이 중단되어도 이미 목표 위치에 있으므로 다음 단계로 진행한다.
        select(target.value)
        yearPickerState.animateScrollToItemUnlessCancelled(target.yearIndex)
        select(target.value)
        monthPickerState.animateScrollToItemUnlessCancelled(target.monthIndex)
        select(target.value)
        datePickerState.animateScrollToItemUnlessCancelled(target.dateIndex)
        select(target.value)
    }

    /**
     * 특정 연도로 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소 날짜를 벗어난다면 가장 가까운 선택 가능 한 연도로 이동합니다.
     */
    suspend fun animateScrollToYear(year: Int) {
        if (year < 1) return
        val target = resolveScrollTarget(year, currentMonth, currentDate) ?: return
        yearPickerState.animateScrollToItem(target.yearIndex)
        currentYear = target.value.year
    }

    /**
     * 특정 달로 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소 날짜를 벗어난다면 가장 가까운 선택 가능 한 달로 이동합니다.
     */
    suspend fun animateScrollToMonth(month: Int) {
        if (month < 1 || month > 12) return
        val target = resolveScrollTarget(currentYear, month, currentDate) ?: return
        monthPickerState.animateScrollToItem(target.monthIndex)
        currentMonth = target.value.month
    }

    /**
     * 특정 날짜로 스크롤 이동.
     * 만약 주어진 값이 피커에서 선택 가능 한 최대, 최소 날짜를 벗어난다면 가장 가까운 선택 가능 한 날짜로 이동합니다.
     */
    suspend fun animateScrollToDate(date: Int) {
        if (date < 1 || date > 31) return
        val target = resolveScrollTarget(currentYear, currentMonth, date) ?: return
        datePickerState.animateScrollToItem(target.dateIndex)
        currentDate = target.value.date
    }

    internal fun updateBoundary(minimum: YearMonthDate, maximum: YearMonthDate) {
        if (this.minimum != minimum) {
            this.minimum = minimum
        }
        if (this.maximum != maximum) {
            this.maximum = maximum
        }
    }

    private fun select(value: YearMonthDate) {
        currentYear = value.year
        currentMonth = value.month
        currentDate = value.date
    }

    /**
     * 주어진 날짜를 선택 가능 한 범위 안의 가장 가까운 날짜로 보정하고, 각 피커에서의 인덱스를 계산.
     * 선택 가능 한 범위가 아직 설정되지 않았다면 null.
     */
    private fun resolveScrollTarget(year: Int, month: Int, date: Int): ScrollTarget? {
        val minimum = minimum ?: return null
        val maximum = maximum ?: return null

        val years = selectableYears(minimum, maximum)
        val targetYear = year.coerceIn(years.first(), years.last())
        val months = selectableMonths(targetYear, minimum, maximum)
        val targetMonth = month.coerceIn(months.first(), months.last())
        val dates = selectableDates(targetYear, targetMonth, minimum, maximum)
        val targetDate = date.coerceIn(dates.first(), dates.last())

        return ScrollTarget(
            value = YearMonthDate(targetYear, targetMonth, targetDate),
            yearIndex = years.indexOf(targetYear),
            monthIndex = months.indexOf(targetMonth),
            dateIndex = dates.indexOf(targetDate)
        )
    }

    private class ScrollTarget(
        val value: YearMonthDate,
        val yearIndex: Int,
        val monthIndex: Int,
        val dateIndex: Int
    )

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
    }
}

/**
 * 애니메이션 스크롤이 다른 스크롤(목록 변경에 따른 위치 재조정 등)에 의해 중단되어도 예외를 전파하지 않고 반환한다.
 * 호출한 코루틴 자체가 취소된 경우에는 그대로 취소된다.
 */
private suspend fun CorePickerState.animateScrollToItemUnlessCancelled(index: Int) {
    try {
        animateScrollToItem(index)
    } catch (e: CancellationException) {
        currentCoroutineContext().ensureActive()
    }
}

/** 연, 월(1~12), 일(1~31)로 분리된 날짜. */
internal data class YearMonthDate(
    val year: Int,
    val month: Int,
    val date: Int
) {
    companion object {
        /** [Date] 객체의 시간을 year, month, dayOfMonth 3개의 숫자로 분리. */
        fun from(date: Date): YearMonthDate {
            val calendar = Calendar.getInstance()
            calendar.time = date
            return YearMonthDate(
                year = calendar.get(Calendar.YEAR),
                month = calendar.get(Calendar.MONTH) + 1,
                date = calendar.get(Calendar.DAY_OF_MONTH)
            )
        }
    }
}

/** 선택 가능 한 연도 목록. */
private fun selectableYears(minimum: YearMonthDate, maximum: YearMonthDate): ImmutableList<Int> {
    return (minimum.year..maxOf(minimum.year, maximum.year)).toImmutableList()
}

/** 주어진 연도에서 선택 가능 한 월 목록. 최소/최대 연도인 경우 범위를 벗어나는 월은 제외한다. */
private fun selectableMonths(
    year: Int,
    minimum: YearMonthDate,
    maximum: YearMonthDate
): ImmutableList<Int> {
    val first = if (year <= minimum.year) minimum.month else 1
    val last = if (year >= maximum.year) maximum.month else 12
    return (first..maxOf(first, last)).toImmutableList()
}

/** 주어진 연월에서 선택 가능 한 날짜 목록. 해당 월에 없는 날짜와 최소/최대 날짜를 벗어나는 날짜는 제외한다. */
private fun selectableDates(
    year: Int,
    month: Int,
    minimum: YearMonthDate,
    maximum: YearMonthDate
): ImmutableList<Int> {
    val lastDateOfMonth = calculateLastDateOfMonth(year, month)
    val first = if (year <= minimum.year && month <= minimum.month) {
        minimum.date.coerceIn(1, lastDateOfMonth)
    } else {
        1
    }
    val last = if (year >= maximum.year && month >= maximum.month) {
        maximum.date.coerceIn(1, lastDateOfMonth)
    } else {
        lastDateOfMonth
    }
    return (first..maxOf(first, last)).toImmutableList()
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
