package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.Popup
import net.deali.designsystem.component.PopupSingleButton
import net.deali.designsystem.component.btnFilledSmallPrimary01
import net.deali.designsystem.theme.DealiColor

@Composable
fun PopupScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Popup",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left,
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        var popupState1 by remember { mutableStateOf(false) }
        var popupState2 by remember { mutableStateOf(false) }
        var popupState3 by remember { mutableStateOf(false) }
        var popupState4 by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = DealiColor.primary04)
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            btnFilledSmallPrimary01(
                text = "popup title content dismiss confirm",
                enabled = true,
                onClick = { popupState1 = true },
            )

            btnFilledSmallPrimary01(
                text = "popup title content confirm",
                enabled = true,
                onClick = { popupState2 = true },
            )

            btnFilledSmallPrimary01(
                text = "content dismiss confirm",
                enabled = true,
                onClick = { popupState3 = true },
            )

            btnFilledSmallPrimary01(
                text = "content confirm",
                enabled = true,
                onClick = { popupState4 = true },
            )
        }

        if (popupState1) {
            Popup(
                title = "title",
                content = "댓글을 삭제하시겠습니까?",
                leftButtonText = "취소",
                rightButtonText = "확인",
                onLeftButtonClick = { popupState1 = false },
                onRightButtonClick = { popupState1 = false },
                onDismiss = { popupState1 = false },
            )
        }

        if (popupState2) {
            Popup(
                content = "댓글을 삭제하시겠습니까?",
                leftButtonText = "취소",
                rightButtonText = "확인",
                onLeftButtonClick = { popupState2 = false },
                onRightButtonClick = { popupState2 = false },
                onDismiss = { popupState2 = false },
            )
        }

        if (popupState3) {
            PopupSingleButton(
                title = "title",
                content = "댓글을 삭제하시겠습니까?",
                buttonText = "확인",
                onButtonClick = { popupState3 = false },
                onDismiss = { popupState3 = false },
            )
        }

        if (popupState4) {
            PopupSingleButton(
                content = "댓글을 삭제하시겠습니까?",
                buttonText = "확인",
                onButtonClick = { popupState4 = false },
                onDismiss = { popupState4 = false },
            )
        }
    }
}

@Composable
@Preview
private fun PopupScreenPreview() {
    PopupScreen(
        onBackPress = {}
    )
}
