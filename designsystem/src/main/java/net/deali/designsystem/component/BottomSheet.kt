package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R

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
        BottomSheetFooterOneButton(
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
        BottomSheetFooterTwoButtons(
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
        BottomSheetFooterTwoButtons(
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
