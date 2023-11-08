package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

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


@Composable
fun BottomSheet(
    title: String,
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(modifier = modifier) {
        BottomSheetHeader(
            title = title,
            onDismiss = onDismiss
        )
        content()
    }
}

@Composable
fun BottomSheet(
    title: String,
    buttonText: String,
    modifier: Modifier = Modifier,
    isButtonEnabled: Boolean = true,
    isButtonLoading: Boolean = false,
    onButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(modifier = modifier) {
        BottomSheetHeader(
            title = title,
            onDismiss = onDismiss
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
    onPrimaryButtonClick: () -> Unit,
    onSecondaryButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(modifier = modifier) {
        BottomSheetHeader(
            title = title,
            onDismiss = onDismiss
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

@Composable
fun BottomSheetWithHandle(
    title: String,
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(modifier = modifier) {
        BottomSheetHandle()
        BottomSheetHeader(
            title = title,
            onDismiss = onDismiss,
        )
        content()
    }
}


@Composable
fun BottomSheetHeader(
    title: String,
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,
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
        Icon24(
            iconRes = R.drawable.ic_x,
            onClick = onDismiss,
        )
    }
}

@Composable
private fun BottomSheetFooter(
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
        btnOutlineLargePrimary01(
            modifier = Modifier.weight(1f),
            text = secondaryButtonText,
            enabled = isSecondaryButtonEnabled,
            loading = isSecondaryButtonLoading,
            onClick = onSecondaryButtonClick,
        )
        Spacer(modifier = Modifier.width(8.dp))
        btnFilledLargePrimary01(
            modifier = Modifier.weight(1f),
            text = primaryButtonText,
            enabled = isPrimaryButtonEnabled,
            loading = isPrimaryButtonLoading,
            onClick = onPrimaryButtonClick,
        )
    }
}

@Composable
private fun BottomSheetFooter(
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
        Divider(color = DealiColor.g20)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(98.dp)
                .padding(horizontal = 16.dp),
            contentAlignment = Alignment.Center,
        ) {
            btnFilledLargePrimary01(
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
private fun BottomSheetOption(
    text: String,
    isChecked: Boolean,
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
            icon()
        }

        DealiText(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically),
            text = text,
            style = if (isChecked) DealiFont.b1sb15 else DealiFont.b1r15,
            color = if (isChecked) DealiColor.primary01 else DealiColor.g100,
        )

        if (isChecked) {
            Icon24(
                modifier = Modifier.align(Alignment.CenterVertically),
                iconRes = R.drawable.ic_check,
                color = DealiColor.primary01,
            )
        }
    }
}

@Composable
private fun BottomSheetHandle(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(15.dp),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier
                .size(32.dp, 4.dp)
                .clip(RoundedCornerShape(100.dp))
                .background(DealiColor.g40)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewBottomSheet() {
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
private fun PreviewBottomSheetOption() {
    Column {
        BottomSheetOption(
            text = "옵션명",
            isChecked = false,
            onClick = {}
        )

        BottomSheetOption(
            text = "옵션명",
            isChecked = true,
            onClick = {}
        )

        BottomSheetOption(
            text = "옵션명",
            isChecked = false,
            onClick = {},
            icon = {
                Icon24(
                    modifier = Modifier.padding(end = 12.dp),
                    iconRes = R.drawable.ic_trash
                )
            }
        )
    }
}