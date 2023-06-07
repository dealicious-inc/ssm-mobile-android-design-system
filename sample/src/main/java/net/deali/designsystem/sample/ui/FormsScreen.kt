package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.appresource.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.Input
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.gray100
import net.deali.designsystem.theme.gray20
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = white100)
                .scrollable(state = rememberScrollState(), orientation = Orientation.Vertical)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            FormsSampleTitleText(text = "Input")

            var text1 by remember { mutableStateOf("") }
            Input(
                value = text1,
                onValueChange = { text1 = it },
            )

            var text2 by remember { mutableStateOf("") }
            Input(
                value = text2,
                onValueChange = { text2 = it },
                enabled = false,
            )

            var text3 by remember { mutableStateOf("") }
            Input(
                value = text3,
                onValueChange = { text3 = it },
                isError = true,
            )

            FormsSampleDivider()

            var text4 by remember { mutableStateOf("") }
            var helperText4 by remember { mutableStateOf("") }
            Input(
                value = text4,
                onValueChange = { text4 = it },
                modifier = Modifier.onFocusChanged { state ->
                    helperText4 = if (state.hasFocus) "Helper text" else ""
                },
                placeholder = "Text Input",
                label = "Label",
                helperText = helperText4,
            )

            var text5 by remember { mutableStateOf("") }
            var helperText5 by remember { mutableStateOf("") }
            Input(
                value = text5,
                onValueChange = { text5 = it },
                modifier = Modifier.onFocusChanged { state ->
                    helperText5 = if (state.hasFocus) "Helper text" else ""
                },
                enabled = false,
                placeholder = "Text Input",
                label = "Label",
                helperText = helperText5,
            )

            var text6 by remember { mutableStateOf("") }
            var helperText6 by remember { mutableStateOf("") }
            Input(
                value = text6,
                onValueChange = { text6 = it },
                modifier = Modifier.onFocusChanged { state ->
                    helperText6 = if (state.hasFocus) "Helper text" else ""
                },
                isError = true,
                placeholder = "Text Input",
                label = "Label",
                helperText = helperText6,
            )

            FormsSampleTitleText(text = "Input + Button")

            FormsSampleTitleText(text = "TextField")
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
private fun FormsSampleDivider() = Spacer(
    modifier = Modifier
        .fillMaxWidth()
        .height(1.dp)
        .background(color = gray20)
)

@Composable
@Preview
private fun FormsScreenPreview() {
    FormsScreen(
        onBackPress = {}
    )
}
