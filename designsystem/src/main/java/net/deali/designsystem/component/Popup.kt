package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import net.deali.designsystem.theme.AppTheme

@Composable
fun Popup(
    title: String,
    content: String,
    dismissText: String,
    confirmText: String,
    properties: DialogProperties = DialogProperties(),
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    Popup(
        onDismissRequest = onDismiss,
        properties = properties
    ) {
        Spacer(modifier = Modifier.height(18.dp))

        DealiText(
            modifier = Modifier
                .padding(
                    end = 8.dp
                ),
            text = title,
            style = AppTheme.typography.sh1sb20,
            color = AppTheme.colors.text01
        )

        Spacer(modifier = Modifier.height(18.dp))

        DealiText(
            text = content,
            style = AppTheme.typography.sh3r16,
            color = AppTheme.colors.text03
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            ButtonMediumOutlined(
                modifier = Modifier
                    .weight(1f),
                text = dismissText,
                enabled = true,
                onClick = onDismiss
            )

            ButtonMediumFilled(
                modifier = Modifier
                    .weight(1f),
                text = confirmText,
                enabled = true,
                onClick = onConfirm
            )
        }
    }
}

@Composable
fun Popup(
    content: String,
    dismissText: String,
    confirmText: String,
    properties: DialogProperties = DialogProperties(),
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    Popup(
        onDismissRequest = onDismiss,
        properties = properties
    ) {
        Spacer(modifier = Modifier.height(28.dp))

        DealiText(
            text = content,
            style = AppTheme.typography.sh3r16,
            color = AppTheme.colors.text03
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            ButtonMediumOutlined(
                modifier = Modifier
                    .weight(1f),
                text = dismissText,
                enabled = true,
                onClick = onDismiss
            )

            ButtonMediumFilled(
                modifier = Modifier
                    .weight(1f),
                text = confirmText,
                enabled = true,
                onClick = onConfirm
            )
        }
    }
}

@Composable
fun PopupSingleButton(
    title: String,
    content: String,
    confirmText: String,
    properties: DialogProperties = DialogProperties(),
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    Popup(
        onDismissRequest = onDismiss,
        properties = properties
    ) {
        Spacer(modifier = Modifier.height(18.dp))

        DealiText(
            modifier = Modifier
                .padding(
                    end = 8.dp
                ),
            text = title,
            style = AppTheme.typography.sh1sb20,
            color = AppTheme.colors.text01
        )

        Spacer(modifier = Modifier.height(18.dp))

        DealiText(
            text = content,
            style = AppTheme.typography.sh3r16,
            color = AppTheme.colors.text03
        )

        Spacer(modifier = Modifier.height(24.dp))

        ButtonMediumFilled(
            modifier = Modifier
                .fillMaxWidth(),
            text = confirmText,
            enabled = true,
            onClick = onConfirm
        )
    }
}

@Composable
fun PopupSingleButton(
    content: String,
    confirmText: String,
    properties: DialogProperties = DialogProperties(),
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    Popup(
        onDismissRequest = onDismiss,
        properties = properties
    ) {
        Spacer(modifier = Modifier.height(28.dp))

        DealiText(
            text = content,
            style = AppTheme.typography.sh3r16,
            color = AppTheme.colors.text03
        )

        Spacer(modifier = Modifier.height(24.dp))

        ButtonMediumFilled(
            modifier = Modifier
                .fillMaxWidth(),
            text = confirmText,
            enabled = true,
            onClick = onConfirm
        )
    }
}

@Composable
private fun Popup(
    properties: DialogProperties = DialogProperties(),
    onDismissRequest: () -> Unit,
    content: @Composable ColumnScope.() -> Unit
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = properties
    ) {
        Column(
            modifier = Modifier
                .clip(AppTheme.shapes.radius10)
                .background(AppTheme.colors.primary04)
                .width(280.dp)
                .padding(
                    bottom = 20.dp,
                    start = 20.dp,
                    end = 20.dp
                ),
            content = content
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun PopupPreview() {
    Popup(
        title = "title",
        content = "댓글을 삭제하시겠습니까?",
        dismissText = "취소",
        confirmText = "확인",
        onDismiss = {},
        onConfirm = {}
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun PopupWithoutTitlePreview() {
    Popup(
        content = "댓글을 삭제하시겠습니까?",
        dismissText = "취소",
        confirmText = "확인",
        onDismiss = {},
        onConfirm = {}
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun PopupSingleButtonPreview() {
    PopupSingleButton(
        title = "title",
        content = "댓글을 삭제하시겠습니까?",
        confirmText = "확인",
        onDismiss = {},
        onConfirm = {}
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun PopupSingleButtonWithoutTitlePreview() {
    PopupSingleButton(
        content = "댓글을 삭제하시겠습니까?",
        confirmText = "확인",
        onDismiss = {},
        onConfirm = {}
    )
}
