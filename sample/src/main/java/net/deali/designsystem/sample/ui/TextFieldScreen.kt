package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.DealiTextField
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.TextInput
import net.deali.designsystem.component.SwitchSmall
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun TextFieldScreen(onBackPress: () -> Unit) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "TextField",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left,
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        var text by remember { mutableStateOf("") }
        var enabled by remember { mutableStateOf(true) }
        var isError by remember { mutableStateOf(false) }
        var isPlaceholderVisible by remember { mutableStateOf(true) }
        var placeholder by remember { mutableStateOf("") }
        var isLabelVisible by remember { mutableStateOf(true) }
        var label by remember { mutableStateOf("") }
        var isHelperTextVisible by remember { mutableStateOf(false) }
        var helperText by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            DealiTextField(
                value = text,
                onValueChange = { text = it },
                enabled = enabled,
                isError = isError,
                minLines = 4,
                placeholder = if (isPlaceholderVisible) placeholder else null,
                label = if (isLabelVisible) label else null,
                helperText = helperText,
                isHelperTextVisible = isHelperTextVisible,
            )

            SampleDivider()

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
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

            SampleDivider()

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
                    ToggleOption(
                        title = "Label",
                        selected = isLabelVisible,
                        onSelectedChange = { isLabelVisible = it }
                    )
                    ToggleOption(
                        title = "Helper Text",
                        selected = isHelperTextVisible,
                        onSelectedChange = { isHelperTextVisible = it }
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
                title = "Helper Text",
                value = helperText,
                onValueChange = { helperText = it },
                placeholder = "Helper Text를 수정해 보세요.",
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
    TextFieldScreen(onBackPress = {})
}
