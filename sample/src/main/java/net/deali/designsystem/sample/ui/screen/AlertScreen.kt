package net.deali.designsystem.sample.ui.screen

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
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.Alert
import net.deali.designsystem.component.AlertSingleButton
import net.deali.designsystem.component.CheckBox
import net.deali.designsystem.component.btnFilledSmall01
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor

@Composable
fun AlertScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Alert",
                onBack = onBackPress,
            )
        }
    ) {
        var alertState1 by remember { mutableStateOf(false) }
        var alertState2 by remember { mutableStateOf(false) }
        var alertState3 by remember { mutableStateOf(false) }
        var alertState4 by remember { mutableStateOf(false) }
        var alertState5 by remember { mutableStateOf(false) }
        var alertState6 by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = DealiColor.primary04)
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            btnFilledSmall01(
                text = "Title, ContentText, 2 Buttons",
                enabled = true,
                onClick = { alertState1 = true },
            )

            btnFilledSmall01(
                text = "Title, ContentText, Content, 2 Buttons",
                enabled = true,
                onClick = { alertState2 = true },
            )

            btnFilledSmall01(
                text = "ContentText, 2 Buttons",
                enabled = true,
                onClick = { alertState3 = true },
            )

            btnFilledSmall01(
                text = "ContentText, Content, 2 Buttons",
                enabled = true,
                onClick = { alertState4 = true },
            )

            btnFilledSmall01(
                text = "Title, ContentText, 1 Button",
                enabled = true,
                onClick = { alertState5 = true },
            )

            btnFilledSmall01(
                text = "ContentText, 1 Button",
                enabled = true,
                onClick = { alertState6 = true },
            )
        }

        if (alertState1) {
            Alert(
                title = "title",
                contentText = "댓글을 삭제하시겠습니까?",
                leftButtonText = "취소",
                rightButtonText = "확인",
                onLeftButtonClick = { alertState1 = false },
                onRightButtonClick = { alertState1 = false },
                onDismissRequest = { alertState1 = false }
            )
        }

        if (alertState2) {
            var checked by remember { mutableStateOf(false) }

            Alert(
                title = "title",
                contentText = "해당 주문을 취소하시겠어요?",
                content = {
                    CheckBox(
                        checked = checked,
                        text = "주문 취소 후 장바구니 담기",
                        onCheck = {
                            checked = !checked
                        }
                    )
                },
                leftButtonText = "취소",
                rightButtonText = "확인",
                onLeftButtonClick = { alertState2 = false },
                onRightButtonClick = { alertState2 = false },
                onDismissRequest = { alertState2 = false },
            )
        }

        if (alertState3) {
            Alert(
                contentText = "댓글을 삭제하시겠습니까?",
                leftButtonText = "취소",
                rightButtonText = "확인",
                onLeftButtonClick = { alertState3 = false },
                onRightButtonClick = { alertState3 = false },
                onDismissRequest = { alertState3 = false }
            )
        }

        if (alertState4) {
            var checked by remember { mutableStateOf(false) }

            Alert(
                contentText = "해당 주문을 취소하시겠어요?",
                content = {
                    CheckBox(
                        checked = checked,
                        text = "주문 취소 후 장바구니 담기",
                        onCheck = {
                            checked = !checked
                        }
                    )
                },
                leftButtonText = "취소",
                rightButtonText = "확인",
                onLeftButtonClick = { alertState4 = false },
                onRightButtonClick = { alertState4 = false },
                onDismissRequest = { alertState4 = false },
            )
        }

        if (alertState5) {
            AlertSingleButton(
                title = "title",
                contentText = "댓글을 삭제하시겠습니까?",
                buttonText = "확인",
                onButtonClick = { alertState5 = false },
                onDismissRequest = { alertState5 = false }
            )
        }

        if (alertState6) {
            AlertSingleButton(
                contentText = "댓글을 삭제하시겠습니까?",
                buttonText = "확인",
                onButtonClick = { alertState6 = false },
                onDismissRequest = { alertState6 = false }
            )
        }
    }
}

@Composable
@Preview
private fun AlertScreenPreview() {
    AlertScreen(
        onBackPress = {}
    )
}
