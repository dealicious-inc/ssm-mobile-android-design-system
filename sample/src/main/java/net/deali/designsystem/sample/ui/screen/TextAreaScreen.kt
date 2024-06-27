package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
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
import net.deali.designsystem.component.RadioButton
import net.deali.designsystem.component.SwitchSmall
import net.deali.designsystem.component.TextInput
import net.deali.designsystem.component.textArea
import net.deali.designsystem.internal.textfield.DealiTextFieldState
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun TextAreaScreen(onBackPress: () -> Unit) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "TextArea",
                onBack = onBackPress,
            )
        }
    ) {
        var text by remember { mutableStateOf("") }
        var isFlexible by remember { mutableStateOf(true) }
        var state by remember { mutableStateOf(DealiTextFieldState.ENABLED) }
        var isPlaceholderVisible by remember { mutableStateOf(true) }
        var placeholder by remember { mutableStateOf("") }
        var isNecessary by remember { mutableStateOf(true) }
        var label by remember { mutableStateOf("") }
        var isHelperTextVisible by remember { mutableStateOf(false) }
        var isCounterTextVisible by remember { mutableStateOf(false) }
        var helperText by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            textArea(
                value = text,
                onValueChange = { text = it },
                isFlexible = isFlexible,
                state = state,
                placeholder = if (isPlaceholderVisible) placeholder else null,
                label = label,
                isNecessary = isNecessary,
                helperText = helperText,
                isHelperTextVisible = isHelperTextVisible,
                isCounterTextVisible = isCounterTextVisible,
            )

            HorizontalDivider(color = DealiColor.g20)

            FlowRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                DealiTextFieldState.values().forEach { innerState ->
                    RadioButton(
                        text = innerState.name,
                        selected = state == innerState
                    ) {
                        state = innerState
                    }
                }
            }

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
                        title = "Placeholder",
                        selected = isPlaceholderVisible,
                        onSelectedChange = { isPlaceholderVisible = it }
                    )
                }
            }

            HorizontalDivider(color = DealiColor.g20)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                ToggleOption(
                    title = "Necessary\n",
                    selected = isNecessary,
                    onSelectedChange = { isNecessary = it }
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
                        title = "Helper Text",
                        selected = isHelperTextVisible,
                        onSelectedChange = { isHelperTextVisible = it }
                    )

                    ToggleOption(
                        title = "Counter Text",
                        selected = isCounterTextVisible,
                        onSelectedChange = { isCounterTextVisible = it }
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
            InputOption(
                title = "Label",
                value = label,
                onValueChange = { label = it },
                placeholder = "Label을 수정해 보세요.",
            )
            InputOption(
                title = "Helper Text",
                value = helperText,
                onValueChange = { helperText = it },
                placeholder = "Helper Text를 수정해 보세요.",
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
    TextAreaScreen(onBackPress = {})
}
