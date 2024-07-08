package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.RadioButton
import net.deali.designsystem.component.SwitchSmall
import net.deali.designsystem.component.TextInput
import net.deali.designsystem.component.chipOutlineSmall01
import net.deali.designsystem.internal.textfield.DealiTextFieldState
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.util.visualtransformation.DecimalSeparatorVisualTransformation
import net.deali.designsystem.util.visualtransformation.PhoneNumberVisualTransformation

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun TextInputScreen(onBackPress: () -> Unit) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Input",
                onBack = onBackPress,
            )
        }
    ) {
        var text by remember { mutableStateOf("") }
        var state by remember { mutableStateOf(DealiTextFieldState.ENABLED) }
        var isPlaceholderVisible by remember { mutableStateOf(true) }
        var placeholder by remember { mutableStateOf("") }
        var isNecessary by remember { mutableStateOf(true) }
        var label by remember { mutableStateOf("") }
        var isHelperTextVisible by remember { mutableStateOf(false) }
        var helperText by remember { mutableStateOf("") }
        var fixedContent by remember { mutableStateOf("") }
        var labelContent by remember { mutableStateOf("") }
        var visualTransformation by remember { mutableStateOf(VisualTransformation.None) }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            TextInput(
                value = text,
                onValueChange = { text = it },
                placeholder = if (isPlaceholderVisible) placeholder else null,
                label = label,
                isNecessary = isNecessary,
                helperText = helperText,
                isHelperTextVisible = isHelperTextVisible,
                state = state,
                visualTransformation = visualTransformation,
                labelContent = if (labelContent.isNotEmpty()) {
                    {
                        DealiText(
                            text = labelContent,
                            style = DealiFont.b4r12,
                            color = DealiColor.primary01
                        )
                    }
                } else null,
                innerFixedContent = if (fixedContent.isNotEmpty()) {
                    {
                        DealiText(
                            text = fixedContent,
                            style = DealiFont.b4r12,
                            color = DealiColor.primary01
                        )
                    }
                } else null,
            )

            SampleDivider()

            FlowRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                DealiTextFieldState.entries.forEach { innerState ->
                    RadioButton(
                        text = innerState.name,
                        selected = state == innerState
                    ) {
                        state = innerState
                    }
                }
            }

            SampleDivider()

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                ToggleOption(
                    title = "Placeholder\nVisible",
                    selected = isPlaceholderVisible,
                    onSelectedChange = { isPlaceholderVisible = it }
                )
                ToggleOption(
                    title = "Helper Text\nVisible",
                    selected = isHelperTextVisible,
                    onSelectedChange = { isHelperTextVisible = it }
                )
            }

            SampleDivider()

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

            SampleDivider()

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                DealiText(
                    text = "Visual Transformation",
                    style = DealiFont.b4r12,
                    color = DealiColor.g100,
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    chipOutlineSmall01(
                        onClick = {
                            text = ""
                            visualTransformation =
                                if (visualTransformation is DecimalSeparatorVisualTransformation) {
                                    VisualTransformation.None
                                } else {
                                    DecimalSeparatorVisualTransformation(prefix = "$ ")
                                }
                        },
                        text = "Decimal",
                        selected = visualTransformation is DecimalSeparatorVisualTransformation
                    )
                    chipOutlineSmall01(
                        onClick = {
                            text = ""
                            visualTransformation =
                                if (visualTransformation is PhoneNumberVisualTransformation) {
                                    VisualTransformation.None
                                } else {
                                    PhoneNumberVisualTransformation()
                                }
                        },
                        text = "Phone",
                        selected = visualTransformation is PhoneNumberVisualTransformation
                    )
                }
            }

            SampleDivider()

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
                title = "Label Content",
                value = labelContent,
                onValueChange = { labelContent = it },
                placeholder = "Label Content를 수정해 보세요.",
            )
            InputOption(
                title = "Helper Text",
                value = helperText,
                onValueChange = { helperText = it },
                placeholder = "Helper Text를 수정해 보세요.",
            )
            InputOption(
                title = "Fixed Content",
                value = fixedContent,
                onValueChange = { fixedContent = it },
                placeholder = "Fixed Content를 수정해 보세요.",
            )
        }
    }
}

@Composable
private fun SampleDivider() = Box(
    modifier = Modifier
        .fillMaxWidth()
        .height(1.dp)
        .background(color = DealiColor.g20)
)

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
    TextInputScreen(onBackPress = {})
}
