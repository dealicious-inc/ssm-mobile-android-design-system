package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.HorizontalDivider
import net.deali.designsystem.component.SwitchSmall
import net.deali.designsystem.component.TextAreaActionButtonType
import net.deali.designsystem.component.TextInput
import net.deali.designsystem.component.VerticalSpacer
import net.deali.designsystem.component.chipOutlineSmall01
import net.deali.designsystem.component.textAreaButton
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun TextAreaButtonScreen(onBackPress: () -> Unit) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "TextAreaButton",
                onBack = onBackPress,
            )
        }
    ) {
        var text by remember { mutableStateOf("") }
        var actionButtonType by remember { mutableStateOf(TextAreaActionButtonType.Send) }
        var isAttachButtonVisible by remember { mutableStateOf(true) }
        var isFlexible by remember { mutableStateOf(true) }
        var enabled by remember { mutableStateOf(true) }
        var isError by remember { mutableStateOf(false) }
        var isPlaceholderVisible by remember { mutableStateOf(true) }
        var placeholder by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            textAreaButton(
                value = text,
                onValueChange = { text = it },
                actionButtonType = actionButtonType,
                isAttachButtonVisible = isAttachButtonVisible,
                isFlexible = isFlexible,
                enabled = enabled,
                isError = isError,
                placeholder = if (isPlaceholderVisible) placeholder else null,
            )

            HorizontalDivider(color = DealiColor.g20)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                ToggleOption(
                    title = "Flexible",
                    selected = isFlexible,
                    onSelectedChange = { isFlexible = it }
                )
                ToggleOption(
                    title = "Enabled",
                    selected = enabled,
                    onSelectedChange = { enabled = it }
                )
                ToggleOption(
                    title = "Error",
                    selected = isError,
                    onSelectedChange = { isError = it }
                )
            }

            HorizontalDivider(color = DealiColor.g20)

            Column {
                DealiText(
                    text = "Visible 옵션",
                    style = DealiFont.b4r12,
                    color = DealiColor.g100,
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    ToggleOption(
                        title = "Attach Button",
                        selected = isAttachButtonVisible,
                        onSelectedChange = { isAttachButtonVisible = it }
                    )
                    ToggleOption(
                        title = "Placeholder",
                        selected = isPlaceholderVisible,
                        onSelectedChange = { isPlaceholderVisible = it }
                    )
                }
            }

            HorizontalDivider(color = DealiColor.g20)

            Column {
                DealiText(
                    text = "Button Type 옵션",
                    style = DealiFont.b4r12,
                    color = DealiColor.g100,
                )
                VerticalSpacer(height = 8.dp)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    chipOutlineSmall01(
                        onClick = { actionButtonType = TextAreaActionButtonType.Send },
                        text = "Send",
                        selected = actionButtonType == TextAreaActionButtonType.Send
                    )
                    chipOutlineSmall01(
                        onClick = { actionButtonType = TextAreaActionButtonType.Upload },
                        text = "Upload",
                        selected = actionButtonType == TextAreaActionButtonType.Upload
                    )
                }
            }

            HorizontalDivider(color = DealiColor.g20)

            InputOption(
                title = "Placeholder",
                value = placeholder,
                onValueChange = { placeholder = it },
                placeholder = "Placeholder를 수정해 보세요.",
            )
        }
    }
}

@Composable
private fun ToggleOption(
    title: String,
    selected: Boolean,
    onSelectedChange: (Boolean) -> Unit,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        DealiText(
            text = title,
            style = DealiFont.b4r12,
            color = DealiColor.g100,
        )
        SwitchSmall(
            isOn = selected,
            onChange = onSelectedChange,
        )
    }
}

@Composable
private fun InputOption(
    title: String,
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    modifier: Modifier = Modifier,
) {
    TextInput(
        value = value,
        onValueChange = onValueChange,
        placeholder = placeholder,
        label = title,
        modifier = modifier,
    )
}

@Composable
@Preview(showBackground = true)
private fun InputScreenPreview() {
    TextAreaButtonScreen(onBackPress = {})
}
