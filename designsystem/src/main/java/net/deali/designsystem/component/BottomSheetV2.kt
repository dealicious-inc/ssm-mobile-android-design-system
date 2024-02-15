package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.bottomsheet.BottomSheetFooterOneButton
import net.deali.designsystem.internal.bottomsheet.BottomSheetFooterTwoButtons
import net.deali.designsystem.internal.bottomsheet.BottomSheetHeader
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

/**
 * 모든 content 직접 구성하는 BottomSheet
 */
@Composable
fun BottomSheetEmpty(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(
        modifier = modifier.padding(top = 8.dp),
        content = content,
    )
}

/**
 * 텍스트 컨텐트가 있고 버튼이 없는 BottomSheet
 */
@Composable
fun TextBottomSheetNoButton(
    modifier: Modifier = Modifier,
    title: String? = null,
    text: String,
    onDismiss: () -> Unit,
    hideXButton: Boolean = false,
) {
    Column(modifier = modifier) {
        if (title != null) {
            BottomSheetHeader(
                title = title,
                hideXButton = hideXButton,
                onDismiss = onDismiss,
            )
        }

        DealiText(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 24.dp),
            text = text,
            style = DealiFont.b2r14,
            color = DealiColor.g80
        )
    }
}

/**
 * 텍스트 컨텐트가 있고 버튼이 하나인 BottomSheet
 */
@Composable
fun TextBottomSheetOneButton(
    modifier: Modifier = Modifier,
    title: String? = null,
    text: String,
    buttonText: String,
    isButtonEnabled: Boolean = true,
    isButtonLoading: Boolean = false,
    hideXButton: Boolean = false,
    onButtonClick: () -> Unit,
    onDismiss: () -> Unit,
) {
    Column(modifier = modifier) {
        if (title != null) {
            BottomSheetHeader(
                title = title,
                hideXButton = hideXButton,
                onDismiss = onDismiss,
            )
        }

        DealiText(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 12.dp),
            text = text,
            style = DealiFont.b2r14,
            color = DealiColor.g80
        )
        BottomSheetFooterOneButton(
            buttonText = buttonText,
            isButtonEnabled = isButtonEnabled,
            isButtonLoading = isButtonLoading,
            onButtonClick = onButtonClick,
        )
    }
}


/**
 * 텍스트 컨텐트가 있고 버튼이 두개인 BottomSheet
 */
@Composable
fun TextBottomSheetTwoButtons(
    modifier: Modifier = Modifier,
    title: String? = null,
    text: String,
    primaryButtonText: String,
    secondaryButtonText: String,
    isPrimaryButtonEnabled: Boolean = true,
    isSecondaryButtonEnabled: Boolean = true,
    isPrimaryButtonLoading: Boolean = false,
    isSecondaryButtonLoading: Boolean = false,
    hideXButton: Boolean = false,
    onPrimaryButtonClick: () -> Unit,
    onSecondaryButtonClick: () -> Unit,
    onDismiss: () -> Unit,
) {
    Column(modifier = modifier) {
        if (title != null) {
            BottomSheetHeader(
                title = title,
                hideXButton = hideXButton,
                onDismiss = onDismiss,
            )
        }

        DealiText(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 12.dp),
            text = text,
            style = DealiFont.b2r14,
            color = DealiColor.g80
        )

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
 * 자유 형식의 버튼이 없는 BottomSheet
 */
@Composable
fun BottomSheetNoButton(
    modifier: Modifier = Modifier,
    title: String? = null,
    hideXButton: Boolean = false,
    onDismiss: () -> Unit,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(modifier = modifier) {
        if (title != null) {
            BottomSheetHeader(
                title = title,
                hideXButton = hideXButton,
                onDismiss = onDismiss,
            )
        }
        content()
    }
}

/**
 * 자유 형식의 버튼 1개 있는 BottomSheet
 */
@Composable
fun BottomSheetOneButton(
    modifier: Modifier = Modifier,
    title: String? = null,
    buttonText: String,
    isButtonEnabled: Boolean = true,
    isButtonLoading: Boolean = false,
    hideXButton: Boolean = false,
    onButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(modifier = modifier) {
        if (title != null) {
            BottomSheetHeader(
                title = title,
                hideXButton = hideXButton,
                onDismiss = onDismiss,
            )
        }
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
 * 자유 형식의 버튼 2개 있는 BottomSheet
 */
@Composable
fun BottomSheetTwoButtons(
    modifier: Modifier = Modifier,
    title: String? = null,
    primaryButtonText: String,
    secondaryButtonText: String,
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
        if (title != null) {
            BottomSheetHeader(
                title = title,
                hideXButton = hideXButton,
                onDismiss = onDismiss,
            )
        }

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
fun PreviewTextBottomSheetNoButton() {
    TextBottomSheetNoButton(
        title = "타이틀",
        text = "텍스트가 이렇게 깁니다 텍스트가 이렇게 깁니다 텍스트가 이렇게 깁니다 텍스트가 이렇게 깁니다 텍스트가 이렇게 깁니다 텍스트가 이렇게 깁니다 텍스트가 이렇게 깁니다 텍스트가 이렇게 깁니다 텍스트가 이렇게 깁니다 텍스트가 이렇게 깁니다 ",
        onDismiss = {},
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTextBottomSheetOneButton() {
    TextBottomSheetOneButton(
        title = "타이틀",
        text = "버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 ",
        buttonText = "버튼명",
        onButtonClick = {},
        onDismiss = {},
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTextBottomSheetTwoButtons() {
    TextBottomSheetTwoButtons(
        title = "타이틀",
        text = "버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 버튼1개 텍스트 ",
        primaryButtonText = "확인",
        secondaryButtonText = "취소",
        onPrimaryButtonClick = {},
        onSecondaryButtonClick = {},
        onDismiss = {},
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewBottomSheetNoButton() {
    BottomSheetNoButton(
        title = "타이틀",
        onDismiss = {},
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(DealiColor.primary03)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewBottomSheetOneButton() {
    BottomSheetOneButton(
        title = "타이틀",
        buttonText = "확인",
        onButtonClick = {},
        onDismiss = {},
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(DealiColor.primary03)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewBottomSheetTwoButtons() {
    BottomSheetTwoButtons(
        title = "타이틀",
        primaryButtonText = "확인",
        secondaryButtonText = "취소",
        onPrimaryButtonClick = {},
        onSecondaryButtonClick = {},
        onDismiss = {}
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(DealiColor.primary03)
        )
    }
}
