package net.deali.designsystem.internal.bottomsheet

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.BottomSheetOption
import net.deali.designsystem.component.DatePicker
import net.deali.designsystem.component.SingleSelectOption
import net.deali.designsystem.component.TimePicker
import net.deali.designsystem.component.TimePickerFormat
import net.deali.designsystem.component.TimePickerPeriod
import net.deali.designsystem.component.defaultMaximumDate
import net.deali.designsystem.component.defaultMinimumDate
import net.deali.designsystem.component.rememberDatePickerState
import net.deali.designsystem.component.rememberTimePickerState
import net.deali.designsystem.internal.datetimepicker.DefaultPickerDecoration
import net.deali.designsystem.internal.datetimepicker.DefaultPickerItemContent
import java.util.Date


@Composable
internal fun SingleSelectOptionList(
    modifier: Modifier = Modifier,
    list: List<SingleSelectOption>,
    onSelectOption: (index: Int) -> Unit,
    onDismiss: () -> Unit,
) {
    val state = rememberLazyListState()

    LazyColumn(
        modifier = modifier,
        state = state,
    ) {
        itemsIndexed(list) { index, option ->
            BottomSheetOption(
                text = option.text,
                isSelected = option.isSelected,
                onClick = {
                    onSelectOption(index)
                    onDismiss()
                }
            )
        }
    }
}

@Composable
internal fun BottomSheetDatePicker(
    modifier: Modifier = Modifier,
    initialYear: Int? = null,
    initialMonth: Int? = null,
    initialDate: Int? = null,
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
    val datePickerState = if (initialYear != null && initialMonth != null && initialDate != null) {
        rememberDatePickerState(initialYear, initialMonth, initialDate)
    } else {
        rememberDatePickerState()
    }

    DatePicker(
        modifier = modifier,
        state = datePickerState,
        yearEnabled = yearEnabled,
        monthEnabled = monthEnabled,
        dateEnabled = dateEnabled,
        minimumDate = minimumDate,
        maximumDate = maximumDate,
        itemHeight = itemHeight,
        pickerSpacing = pickerSpacing,
        contentPadding = contentPadding,
        decorationBox = decorationBox,
        yearItemContent = yearItemContent,
        monthItemContent = monthItemContent,
        dateItemContent = dateItemContent,
    )
}

@Composable
internal fun BottomSheetTimePicker(
    modifier: Modifier = Modifier,
    timeFormat: TimePickerFormat = TimePickerFormat.Format12Hour,
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
    val timePickerState = rememberTimePickerState()

    TimePicker(
        modifier = modifier,
        timeFormat = timeFormat,
        state = timePickerState,
        hourEnabled = hourEnabled,
        minuteEnabled = minuteEnabled,
        secondEnabled = secondEnabled,
        hourInterval = hourInterval,
        minuteInterval = minuteInterval,
        secondInterval = secondInterval,
        itemHeight = itemHeight,
        pickerSpacing = pickerSpacing,
        contentPadding = contentPadding,
        decorationBox = decorationBox,
        periodItemContent = periodItemContent,
        hourItemContent = hourItemContent,
        minuteItemContent = minuteItemContent,
        secondItemContent = secondItemContent,
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewSingleSelectOptionList() {
    SingleSelectOptionList(
        list = listOf(
            SingleSelectOption("옵션1", true),
            SingleSelectOption("옵션2", false),
            SingleSelectOption("옵션3", false),
            SingleSelectOption("옵션4", false),
        ),
        onSelectOption = {},
        onDismiss = {}
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewBottomSheetDatePicker() {
    BottomSheetDatePicker()
}

@Preview(showBackground = true)
@Composable
private fun PreviewBottomSheetTimePicker() {
    BottomSheetTimePicker(
        secondEnabled = false
    )
}