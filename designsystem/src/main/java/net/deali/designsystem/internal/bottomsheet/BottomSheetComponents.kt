package net.deali.designsystem.internal.bottomsheet

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.btnFilledLarge01
import net.deali.designsystem.component.btnOutlineLarge01
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont


@Composable
fun BottomSheetHeader(
    modifier: Modifier = Modifier,
    title: String,
    hideXButton: Boolean = false,
    onDismiss: () -> Unit = {},
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(top = 24.dp)
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        DealiText(
            modifier = Modifier.weight(1f),
            text = title,
            style = DealiFont.sh2sb18,
            color = DealiColor.g100,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
        )
        Spacer(modifier = Modifier.width(16.dp))

        if (hideXButton.not()) {
            Icon24(
                iconRes = R.drawable.ic_x,
                onClick = onDismiss,
            )
        }
    }
}

@Composable
internal fun BottomSheetFooterOneButton(
    buttonText: String,
    modifier: Modifier = Modifier,
    isButtonEnabled: Boolean = true,
    isButtonLoading: Boolean = false,
    onButtonClick: () -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(DealiColor.primary04),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(74.dp)
                .padding(horizontal = 16.dp),
            contentAlignment = Alignment.Center,
        ) {
            btnFilledLarge01(
                modifier = Modifier.fillMaxWidth(),
                text = buttonText,
                enabled = isButtonEnabled,
                loading = isButtonLoading,
                onClick = onButtonClick,
            )
        }
    }
}

@Composable
internal fun BottomSheetFooterTwoButtons(
    primaryButtonText: String,
    secondaryButtonText: String,
    modifier: Modifier = Modifier,
    isPrimaryButtonEnabled: Boolean = true,
    isSecondaryButtonEnabled: Boolean = true,
    isPrimaryButtonLoading: Boolean = false,
    isSecondaryButtonLoading: Boolean = false,
    onPrimaryButtonClick: () -> Unit,
    onSecondaryButtonClick: () -> Unit,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(74.dp)
            .background(DealiColor.primary04)
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        btnOutlineLarge01(
            modifier = Modifier.weight(1f),
            text = secondaryButtonText,
            enabled = isSecondaryButtonEnabled,
            loading = isSecondaryButtonLoading,
            onClick = onSecondaryButtonClick,
        )
        Spacer(modifier = Modifier.width(8.dp))
        btnFilledLarge01(
            modifier = Modifier.weight(1f),
            text = primaryButtonText,
            enabled = isPrimaryButtonEnabled,
            loading = isPrimaryButtonLoading,
            onClick = onPrimaryButtonClick,
        )
    }
}




/**
 * 단일 옵션 선택할 때 사용.
 * 좌측에 아이콘이 붙는 경우 icon composable 작성
 */
data class SingleSelectOption(
    val text: String,
    val isSelected: Boolean,
    val icon: @Composable () -> Unit = {},
)


//
//@Composable
//internal fun BottomSheetFooter(
//    buttonText: String,
//    modifier: Modifier = Modifier,
//    isButtonEnabled: Boolean = true,
//    isButtonLoading: Boolean = false,
//    onButtonClick: () -> Unit,
//) {
//    Column(
//        modifier = modifier
//            .fillMaxWidth()
//            .background(DealiColor.primary04),
//    ) {
//        Divider(color = DealiColor.g20)
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(98.dp)
//                .padding(horizontal = 16.dp),
//            contentAlignment = Alignment.Center,
//        ) {
//            btnFilledLarge01(
//                modifier = Modifier.fillMaxWidth(),
//                text = buttonText,
//                enabled = isButtonEnabled,
//                loading = isButtonLoading,
//                onClick = onButtonClick,
//            )
//        }
//    }
//}
//
//@Composable
//internal fun BottomSheetFooter(
//    primaryButtonText: String,
//    secondaryButtonText: String,
//    modifier: Modifier = Modifier,
//    isPrimaryButtonEnabled: Boolean = true,
//    isSecondaryButtonEnabled: Boolean = true,
//    isPrimaryButtonLoading: Boolean = false,
//    isSecondaryButtonLoading: Boolean = false,
//    onPrimaryButtonClick: () -> Unit,
//    onSecondaryButtonClick: () -> Unit,
//) {
//    Row(
//        modifier = modifier
//            .fillMaxWidth()
//            .height(74.dp)
//            .background(DealiColor.primary04)
//            .padding(horizontal = 16.dp),
//        verticalAlignment = Alignment.CenterVertically,
//    ) {
//        btnOutlineLarge01(
//            modifier = Modifier.weight(1f),
//            text = secondaryButtonText,
//            enabled = isSecondaryButtonEnabled,
//            loading = isSecondaryButtonLoading,
//            onClick = onSecondaryButtonClick,
//        )
//        Spacer(modifier = Modifier.width(8.dp))
//        btnFilledLarge01(
//            modifier = Modifier.weight(1f),
//            text = primaryButtonText,
//            enabled = isPrimaryButtonEnabled,
//            loading = isPrimaryButtonLoading,
//            onClick = onPrimaryButtonClick,
//        )
//    }
//}

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
internal fun BottomSheetOption(
    text: String,
    isSelected: Boolean,
    icon: @Composable () -> Unit = {},
    onClick: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp)
            .background(DealiColor.primary04)
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp)
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.CenterVertically)
        ) {
            Box(
                modifier = Modifier.padding(end = 8.dp)
            ) {
                icon()
            }
        }

        DealiText(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically),
            text = text,
            style = if (isSelected) DealiFont.b1sb15 else DealiFont.b1r15,
            color = if (isSelected) DealiColor.primary01 else DealiColor.g100,
        )

        if (isSelected) {
            Icon24(
                modifier = Modifier.align(Alignment.CenterVertically),
                iconRes = R.drawable.ic_check,
                color = DealiColor.primary01,
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun PreviewBottomSheetHeader() {
    BottomSheetHeader(
        title = "헤더"
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewBottomSheetFooter1() {
    BottomSheetFooterOneButton(
        buttonText = "버튼",
        onButtonClick = {}
    )
}


@Preview(showBackground = true)
@Composable
private fun PreviewBottomSheetFooter2() {
    BottomSheetFooterTwoButtons(
        primaryButtonText = "확인",
        secondaryButtonText = "취소",
        onPrimaryButtonClick = {},
        onSecondaryButtonClick = {},
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewBottomSheetOption() {
    BottomSheetOption(
        text = "옵션이 여기 있습니다",
        isSelected = false,
        icon = {
            Icon16(iconRes = R.drawable.ic_trash)
        },
        onClick = {}
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