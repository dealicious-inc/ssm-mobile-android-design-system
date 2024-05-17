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
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Dropdown
import net.deali.designsystem.component.SwitchSmall
import net.deali.designsystem.component.TextInput
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun DropdownScreen(onBackPress: () -> Unit) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Dropdown",
                onBack = onBackPress,
            )
        }
    ) {
        var value by remember { mutableStateOf("") }
        var icon by remember { mutableStateOf(true) }
        var isDisabled by remember { mutableStateOf(false) }
        var isNecessary by remember { mutableStateOf(true) }
        var isOpen by remember { mutableStateOf(true) }
        var label by remember { mutableStateOf("") }
        var isHelperTextVisible by remember { mutableStateOf(false) }
        var helperText by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Dropdown(
                value = value,
                label = label,
                isNecessary = isNecessary,
                icon = if (icon) R.drawable.ic_alarm else null,
                isOpen = isOpen,
                helperText = helperText,
                isHelperTextVisible = isHelperTextVisible,
                isDisabled = isDisabled,
                onClick = {}
            )

            SampleDivider()

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                ToggleOption(
                    title = "Icon",
                    selected = icon,
                    onSelectedChange = { icon = it }
                )

                ToggleOption(
                    title = "isDisabled",
                    selected = isDisabled,
                    onSelectedChange = { isDisabled = it }
                )
            }

            SampleDivider()

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
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

                ToggleOption(
                    title = "open\n",
                    selected = isOpen,
                    onSelectedChange = { isOpen = it }
                )
            }

            SampleDivider()

            InputOption(
                title = "Value",
                value = value,
                onValueChange = { value = it },
                placeholder = "value를 수정해 보세요.",
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
private fun DropdownScreenPreview() {
    DropdownScreen(onBackPress = {})
}
