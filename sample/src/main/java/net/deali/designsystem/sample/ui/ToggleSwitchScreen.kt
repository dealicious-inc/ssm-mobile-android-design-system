package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.Toggle
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.gray100
import net.deali.designsystem.theme.gray20

@Composable
fun ToggleSwitchScreen(onBackPress: () -> Unit) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Toggle/Switch",
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
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            var toggle1Selected by remember { mutableStateOf(false) }
            var toggle2Selected by remember { mutableStateOf(true) }
            var toggle3Selected by remember { mutableStateOf(false) }

            DealiText(
                text = "Toggle",
                style = AppTheme.typography.b2r14,
                color = gray100,
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Toggle(
                    selected = toggle1Selected,
                    onSelectedChange = { toggle1Selected = it },
                )
                Toggle(
                    selected = toggle2Selected,
                    onSelectedChange = { toggle2Selected = it },
                )
                Toggle(
                    selected = toggle3Selected,
                    enabled = false,
                    onSelectedChange = { toggle3Selected = it },
                )
            }

            SampleDivider()

            DealiText(
                text = "Switch",
                style = AppTheme.typography.b2r14,
                color = gray100,
            )

            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

            }
        }
    }
}

@Composable
private fun SampleDivider() = Box(
    modifier = Modifier
        .fillMaxWidth()
        .height(1.dp)
        .background(color = gray20)
)

@Composable
@Preview(showBackground = true)
private fun InputScreenPreview() {
    ToggleSwitchScreen(onBackPress = {})
}
