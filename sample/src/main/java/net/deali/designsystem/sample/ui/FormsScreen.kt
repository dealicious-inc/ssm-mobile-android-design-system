package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import net.deali.designsystem.R
import net.deali.designsystem.component.ButtonMediumOutlined
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.TextInput
import net.deali.designsystem.component.TextInputWithButton
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.util.BigPasswordVisualTransformation

@Composable
fun FormsScreen(
    navigateToInput: () -> Unit,
    navigateToInputWithButton: () -> Unit,
    navigateToTextField: () -> Unit,
    onBackPress: () -> Unit,
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Forms",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left_16_ver01,
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            ButtonMediumOutlined(
                text = "Text Input",
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
                onClick = navigateToInput,
            )
            ButtonMediumOutlined(
                text = "Text Input + Button",
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
                onClick = navigateToInputWithButton,
            )
            ButtonMediumOutlined(
                text = "Text Field",
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
                onClick = navigateToTextField,
            )
        }
    }
}

@Deprecated(
    "옵션 조절 가능한 샘플 화면으로 변경했으나, 혹시나 되돌릴 가능성을 위해 남겨둠.",
    ReplaceWith("FormsScreen"),
)
@Composable
fun FormsScreenOld(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Forms",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left_16_ver01,
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        var text1 by remember { mutableStateOf("") }
        var text2 by remember { mutableStateOf("") }
        var text3 by remember { mutableStateOf("") }
        var text4 by remember { mutableStateOf("") }
        var text5 by remember { mutableStateOf("") }
        var text6 by remember { mutableStateOf("") }
        var text7 by remember { mutableStateOf("") }
        var text8 by remember { mutableStateOf("") }
        var text9 by remember { mutableStateOf("") }
        var text10 by remember { mutableStateOf("") }
        var text11 by remember { mutableStateOf("") }
        var text12 by remember { mutableStateOf("") }
        var text13 by remember { mutableStateOf("") }
        var text14 by remember { mutableStateOf("") }
        var text15 by remember { mutableStateOf("") }

        var timer9 by remember { mutableStateOf(60 * 3) }
        val timerText9 by remember(timer9) {
            derivedStateOf {
                val minute = timer9 / 60
                val second = timer9 % 60
                val minuteStr = if (minute < 10) "0${minute}" else minute.toString()
                val secondStr = if (second < 10) "0${second}" else second.toString()
                "${minuteStr}:${secondStr}"
            }
        }
        LaunchedEffect(timer9) {
            delay(1000)
            if (timer9 > 0) {
                timer9 -= 1
            } else {
                timer9 = 60 * 3
            }
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = AppTheme.colors.primary04),
            contentPadding = PaddingValues(all = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            item {
                FormsSampleTitleText(text = "Input")
            }

            item {
                TextInput(
                    value = text1,
                    onValueChange = { text1 = it },
                )
            }

            item {
                TextInput(
                    value = text2,
                    onValueChange = { text2 = it },
                    enabled = false,
                )
            }

            item {
                TextInput(
                    value = text3,
                    onValueChange = { text3 = it },
                    isError = true,
                )
            }

            item {
                TextInput(
                    value = text4,
                    onValueChange = { text4 = it },
                    placeholder = "Text input",
                    label = "Label",
                    helperText = "Helper text",
                )
            }

            item {
                TextInput(
                    value = text5,
                    onValueChange = { text5 = it },
                    enabled = false,
                    placeholder = "Text input",
                    label = "Label",
                    helperText = "Helper text",
                )
            }

            item {
                TextInput(
                    value = text6,
                    onValueChange = { text6 = it },
                    isError = true,
                    placeholder = "Text input",
                    label = "Label",
                    helperText = "Helper text",
                )
            }

            item {
                TextInput(
                    value = text7,
                    onValueChange = { text7 = it },
                    trailingIconRes = R.drawable.ic_x_24_ver01,
                    onIconClick = { text7 = "" },
                    placeholder = "Text input with icon"
                )
            }

            item {
                TextInput(
                    value = text8,
                    onValueChange = { text8 = it },
                    trailingIconRes = if (text8.isNotEmpty()) {
                        R.drawable.ic_x_24_ver01
                    } else {
                        null
                    },
                    onIconClick = { text8 = "" },
                    placeholder = "Text input with icon",
                    helperText = "Icon will be visible when typed"
                )
            }

            item {
                TextInput(
                    value = text9,
                    onValueChange = { text9 = it },
                    placeholder = "Text Input with custom trailing content",
                    label = "Label",
                    helperText = "Helper text",
                    trailingContent = {
                        DealiText(
                            text = timerText9,
                            style = AppTheme.typography.b2r14,
                            color = AppTheme.colors.error,
                        )
                    }
                )
            }

            item {
                TextInput(
                    value = text10,
                    onValueChange = { text10 = it },
                    textStyle = AppTheme.typography.b2r14,
                    placeholder = "Text input",
                    label = "Custom text style"
                )
            }

            item {
                TextInput(
                    value = text11,
                    onValueChange = { text11 = it },
                    visualTransformation = BigPasswordVisualTransformation(),
                    placeholder = "Password",
                    label = "Password visual transformation",
                )
            }

            item {
                FormsSampleTitleText(text = "Input + Button")
            }

            item {
                TextInputWithButton(
                    value = text12,
                    onValueChange = { text12 = it },
                    buttonText = "Button",
                    onButtonClick = {},
                    placeholder = "Text input",
                )
            }

            item {
                TextInputWithButton(
                    value = text13,
                    onValueChange = { text13 = it },
                    buttonText = "Button",
                    onButtonClick = {},
                    inputEnabled = false,
                    placeholder = "Text input",
                )
            }

            item {
                TextInputWithButton(
                    value = text14,
                    onValueChange = { text14 = it },
                    buttonText = "Button",
                    onButtonClick = {},
                    placeholder = "Text input",
                    label = "Label",
                    helperText = "Helper text",
                )
            }

            item {
                TextInputWithButton(
                    value = text15,
                    onValueChange = { text15 = it },
                    buttonText = "Button",
                    onButtonClick = {},
                    inputEnabled = false,
                    placeholder = "Text input",
                    label = "Label",
                    helperText = "Helper text",
                )
            }

            item {
                FormsSampleTitleText(text = "TextField")
            }
        }
    }
}

@Composable
private fun FormsSampleTitleText(
    text: String,
    modifier: Modifier = Modifier
) = DealiText(
    text = text,
    style = AppTheme.typography.sh3b16,
    color = AppTheme.colors.text01,
    modifier = modifier
)

@Composable
@Preview(showBackground = true)
private fun FormsScreenPreview() {
    FormsScreen(
        navigateToInput = {},
        navigateToInputWithButton = {},
        navigateToTextField = {},
        onBackPress = {},
    )
}
