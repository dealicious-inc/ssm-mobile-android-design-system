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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.appresource.R
import net.deali.designsystem.component.ButtonSmallTonalOutlined
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.Popup
import net.deali.designsystem.component.PopupSingleButton
import net.deali.designsystem.theme.white100

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
                        iconRes = R.drawable.ic_arrow_left_16_ver01,
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
                .background(color = white100)
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            ButtonSmallTonalOutlined(
                text = "popup title content dismiss confirm",
                enabled = true
            ) {
                popupState1 = true
            }

            ButtonSmallTonalOutlined(
                text = "popup title content confirm",
                enabled = true
            ) {
                popupState2 = true
            }

            ButtonSmallTonalOutlined(
                text = "content dismiss confirm",
                enabled = true
            ) {
                popupState3 = true
            }

            ButtonSmallTonalOutlined(
                text = "content confirm",
                enabled = true
            ) {
                popupState4 = true
            }
        }

        if (popupState1) {
            Popup(
                title = "title",
                content = "댓글을 삭제하시겠습니까?",
                dismissText = "취소",
                confirmText = "확인",
                onDismiss = { popupState1 = false },
                onConfirm = { popupState1 = false }
            )
        }

        if (popupState2) {
            Popup(
                content = "댓글을 삭제하시겠습니까?",
                dismissText = "취소",
                confirmText = "확인",
                onDismiss = { popupState2 = false },
                onConfirm = { popupState2 = false }
            )
        }

        if (popupState3) {
            PopupSingleButton(
                title = "title",
                content = "댓글을 삭제하시겠습니까?",
                confirmText = "확인",
                onDismiss = { popupState3 = false },
                onConfirm = { popupState3 = false }
            )
        }

        if (popupState4) {
            PopupSingleButton(
                content = "댓글을 삭제하시겠습니까?",
                confirmText = "확인",
                onDismiss = { popupState4 = false },
                onConfirm = { popupState4 = false }
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
