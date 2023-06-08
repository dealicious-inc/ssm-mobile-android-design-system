package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import net.deali.appresource.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.Input
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.gray100
import net.deali.designsystem.theme.white100

@Composable
fun FormsScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Forms",
                navigationIcon = {
                    Icon24(
                        painter = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
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
                .background(color = white100),
            contentPadding = PaddingValues(all = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            item {
                FormsSampleTitleText(text = "Input")
            }

            item {
                Input(
                    value = text1,
                    onValueChange = { text1 = it },
                )
            }

            item {
                Input(
                    value = text2,
                    onValueChange = { text2 = it },
                    enabled = false,
                )
            }

            item {
                Input(
                    value = text3,
                    onValueChange = { text3 = it },
                    isError = true,
                )
            }

            item {
                Input(
                    value = text4,
                    onValueChange = { text4 = it },
                    placeholder = "Text input",
                    label = "Label",
                    helperText = "Helper text",
                )
            }

            item {
                Input(
                    value = text5,
                    onValueChange = { text5 = it },
                    enabled = false,
                    placeholder = "Text input",
                    label = "Label",
                    helperText = "Helper text",
                )
            }

            item {
                Input(
                    value = text6,
                    onValueChange = { text6 = it },
                    isError = true,
                    placeholder = "Text input",
                    label = "Label",
                    helperText = "Helper text",
                )
            }

            item {
                Input(
                    value = text7,
                    onValueChange = { text7 = it },
                    trailingIconRes = R.drawable.ic_x_line_24_ver01,
                    onIconClick = { text7 = "" },
                    placeholder = "Text input with icon"
                )
            }

            item {
                Input(
                    value = text8,
                    onValueChange = { text8 = it },
                    trailingIconRes = if (text8.isNotEmpty()) {
                        R.drawable.ic_x_line_24_ver01
                    } else {
                        null
                    },
                    onIconClick = { text8 = "" },
                    placeholder = "Text input with icon",
                    helperText = "Icon will be visible when typed"
                )
            }

            item {
                Input(
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
                Input(
                    value = text10,
                    onValueChange = { text10 = it },
                    visualTransformation = PasswordVisualTransformation(),
                    placeholder = "Password",
                    label = "Password visual transformation",
                )
            }

            item {
                Input(
                    value = text11,
                    onValueChange = { text11 = it },
                    textStyle = AppTheme.typography.b2b14,
                    placeholder = "Custom text style",
                )
            }

            item {
                FormsSampleTitleText(text = "Input + Button")
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
    color = gray100,
    modifier = modifier
)

@Composable
@Preview
private fun FormsScreenPreview() {
    FormsScreen(
        onBackPress = {}
    )
}
