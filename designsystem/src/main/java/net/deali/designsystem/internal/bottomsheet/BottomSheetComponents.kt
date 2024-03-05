package net.deali.designsystem.internal.bottomsheet

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.BottomSheetOption
import net.deali.designsystem.component.DatePicker
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.SingleSelectOption
import net.deali.designsystem.component.TimePicker
import net.deali.designsystem.component.TimePickerFormat
import net.deali.designsystem.component.rememberDatePickerState
import net.deali.designsystem.component.rememberTimePickerState
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.theme.DealiShape


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
    yearEnabled: Boolean = true,
    monthEnabled: Boolean = true,
    dateEnabled: Boolean = true,
) {
    val datePickerState = rememberDatePickerState()

    DatePicker(
        modifier = modifier
            .fillMaxWidth()
            .height(204.dp)
            .padding(8.dp),
        state = datePickerState,
        yearEnabled = yearEnabled,
        monthEnabled = monthEnabled,
        dateEnabled = dateEnabled,
        contentPadding = PaddingValues(horizontal = 40.dp)
    )
}

@Composable
internal fun BottomSheetDatePicker(
    modifier: Modifier = Modifier,
    initialYear: Int,
    initialMonth: Int,
    initialDate: Int,
    yearEnabled: Boolean = true,
    monthEnabled: Boolean = true,
    dateEnabled: Boolean = true,
) {
    val datePickerState = rememberDatePickerState(initialYear, initialMonth, initialDate)

    DatePicker(
        modifier = modifier
            .fillMaxWidth()
            .height(204.dp)
            .padding(8.dp),
        state = datePickerState,
        yearEnabled = yearEnabled,
        monthEnabled = monthEnabled,
        dateEnabled = dateEnabled,
        contentPadding = PaddingValues(horizontal = 40.dp)
    )
}


@Composable
internal fun BottomSheetTimePicker(
    modifier: Modifier = Modifier,
    timeFormat: TimePickerFormat = TimePickerFormat.Format12Hour,
    hourEnabled: Boolean = true,
    minuteEnabled: Boolean = true,
    secondEnabled: Boolean = true,
) {
    val timePickerState = rememberTimePickerState()

    TimePicker(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .border(
                width = 1.dp,
                color = DealiColor.g20,
                shape = DealiShape.radius10
            ),
        timeFormat = timeFormat,
        state = timePickerState,
        hourEnabled = hourEnabled,
        minuteEnabled = minuteEnabled,
        secondEnabled = secondEnabled,
        minuteInterval = 5,
        secondInterval = 10,
        contentPadding = PaddingValues(horizontal = 40.dp),
        decorationBox = { innerPickers ->
            Row(
                modifier = Modifier
                    .align(Alignment.Center)
                    .fillMaxWidth()
                    .height(26.dp)
                    .background(color = DealiColor.g10),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                DealiText(
                    text = ":",
                    style = DealiFont.sh3sb16,
                    color = DealiColor.g100
                )
                DealiText(
                    text = ":",
                    style = DealiFont.sh3sb16,
                    color = DealiColor.g100
                )
            }
            innerPickers()
        },
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