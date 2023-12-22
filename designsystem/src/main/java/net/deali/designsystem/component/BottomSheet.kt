package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.bottomsheet.BottomSheetFooter
import net.deali.designsystem.internal.bottomsheet.BottomSheetHandle
import net.deali.designsystem.internal.bottomsheet.SingleSelectOptionList
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

/**
 * 모든 content 직접 구성
 */
@Composable
fun BottomSheet(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(
        modifier = modifier.padding(top = 8.dp),
        content = content,
    )
}

/**
 * 타이틀 Default
 */
@Composable
fun BottomSheet(
    title: String,
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,
    hideXButton: Boolean = false,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(modifier = modifier) {
        BottomSheetHeader(
            title = title,
            hideXButton = hideXButton,
            onDismiss = onDismiss,
        )
        content()
    }
}

/**
 * 타이틀, 버튼1 Default
 */
@Composable
fun BottomSheet(
    title: String,
    buttonText: String,
    modifier: Modifier = Modifier,
    isButtonEnabled: Boolean = true,
    isButtonLoading: Boolean = false,
    hideXButton: Boolean = false,
    onButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(modifier = modifier) {
        BottomSheetHeader(
            title = title,
            hideXButton = hideXButton,
            onDismiss = onDismiss,
        )
        content()
        BottomSheetFooter(
            buttonText = buttonText,
            isButtonEnabled = isButtonEnabled,
            isButtonLoading = isButtonLoading,
            onButtonClick = onButtonClick,
        )
    }
}

/**
 * 타이틀, 버튼1, 버튼2 Default
 */
@Composable
fun BottomSheet(
    title: String,
    primaryButtonText: String,
    secondaryButtonText: String,
    modifier: Modifier = Modifier,
    isPrimaryButtonEnabled: Boolean = true,
    isSecondaryButtonEnabled: Boolean = true,
    isPrimaryButtonLoading: Boolean = false,
    isSecondaryButtonLoading: Boolean = false,
    hideXButton: Boolean = false,
    onPrimaryButtonClick: () -> Unit,
    onSecondaryButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(modifier = modifier) {
        BottomSheetHeader(
            title = title,
            hideXButton = hideXButton,
            onDismiss = onDismiss,
        )
        content()
        BottomSheetFooter(
            primaryButtonText = primaryButtonText,
            secondaryButtonText = secondaryButtonText,
            isPrimaryButtonEnabled = isPrimaryButtonEnabled,
            isSecondaryButtonEnabled = isSecondaryButtonEnabled,
            isPrimaryButtonLoading = isPrimaryButtonLoading,
            isSecondaryButtonLoading = isSecondaryButtonLoading,
            onPrimaryButtonClick = onPrimaryButtonClick,
            onSecondaryButtonClick = onSecondaryButtonClick,
        )
    }
}

/**
 * 타이틀X, 버튼 2개
 */
@Composable
fun BottomSheet(
    primaryButtonText: String,
    secondaryButtonText: String,
    modifier: Modifier = Modifier,
    isPrimaryButtonEnabled: Boolean = true,
    isSecondaryButtonEnabled: Boolean = true,
    isPrimaryButtonLoading: Boolean = false,
    isSecondaryButtonLoading: Boolean = false,
    onPrimaryButtonClick: () -> Unit,
    onSecondaryButtonClick: () -> Unit,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(modifier = modifier) {
        content()
        BottomSheetFooter(
            primaryButtonText = primaryButtonText,
            secondaryButtonText = secondaryButtonText,
            isPrimaryButtonEnabled = isPrimaryButtonEnabled,
            isSecondaryButtonEnabled = isSecondaryButtonEnabled,
            isPrimaryButtonLoading = isPrimaryButtonLoading,
            isSecondaryButtonLoading = isSecondaryButtonLoading,
            onPrimaryButtonClick = onPrimaryButtonClick,
            onSecondaryButtonClick = onSecondaryButtonClick,
        )
    }
}

/**
 * 상단 핸들이 있는 BottomSheet
 * 타이틀 Default
 */
@Composable
fun BottomSheetWithHandle(
    title: String,
    modifier: Modifier = Modifier,
    hideXButton: Boolean = false,
    onDismiss: () -> Unit,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(modifier = modifier) {
        BottomSheetHandle()
        BottomSheetHeader(
            title = title,
            hideXButton = hideXButton,
            onDismiss = onDismiss,
        )
        content()
    }
}

/**
 * 상단 핸들이 있는 BottomSheet
 * 타이틀 Default
 */
@Composable
fun BottomSheetSingleSelectOption(
    title: String,
    modifier: Modifier = Modifier,
    singleSelectOptionList: List<SingleSelectOption>,
    onSelectOption: (index: Int) -> Unit,
    hideXButton: Boolean = false,
    onDismiss: () -> Unit,
) {
    Column(modifier = modifier) {
        BottomSheetHeader(
            title = title,
            hideXButton = hideXButton,
            onDismiss = onDismiss,
        )

        SingleSelectOptionList(
            list = singleSelectOptionList,
            onSelectOption = onSelectOption,
            onDismiss = onDismiss,
        )
    }
}


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


/**
 * 단일 옵션 선택할 때 사용.
 * 좌측에 아이콘이 붙는 경우 icon composable 작성
 */
data class SingleSelectOption(
    val text: String,
    val isSelected: Boolean,
    val icon: @Composable () -> Unit = {},
)


@Preview(showBackground = true)
@Composable
private fun PreviewBottomSheet1() {
    BottomSheet(
        title = "제목인데용",
        buttonText = "버튼명1",
        onButtonClick = {},
        onDismiss = {}
    ) {
        Text(
            text = "텍스트 컨텐츠.\n형식 자유"
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewBottomSheet_TwoButton() {
    BottomSheet(
        primaryButtonText = "탈퇴",
        secondaryButtonText = "취소",
        onPrimaryButtonClick = {},
        onSecondaryButtonClick = {},
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(114.dp)
                .background(color = Color(0xFFFFE0E0))
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewBottomSheetSingleSelectOption() {
    BottomSheetSingleSelectOption(
        title = "단일 선택 바텀시트",
        singleSelectOptionList = listOf(
            SingleSelectOption(
                text = "옵션명1",
                isSelected = true,
            ),
            SingleSelectOption(
                text = "옵션명2",
                isSelected = false,
            ),
            SingleSelectOption(
                text = "옵션명3",
                isSelected = false,
                icon = {
                    Icon16(iconRes = R.drawable.ic_trash)
                }
            )
        ),
        onDismiss = {},
        onSelectOption = {}
    )
}