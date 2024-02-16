package net.deali.designsystem.internal.bottomsheet

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.deali.designsystem.component.BottomSheetOption
import net.deali.designsystem.component.SingleSelectOption


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