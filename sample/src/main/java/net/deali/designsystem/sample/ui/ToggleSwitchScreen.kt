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
import net.deali.designsystem.component.Switch
import net.deali.designsystem.component.Toggle
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.gray100
import net.deali.designsystem.theme.AppTheme.colors.divider03

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
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            DealiText(
                text = "Toggle",
                style = AppTheme.typography.b2r14,
                color = gray100,
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                var selected1 by remember { mutableStateOf(false) }
                var selected2 by remember { mutableStateOf(true) }
                var selected3 by remember { mutableStateOf(false) }

                Toggle(
                    selected = selected1,
                    onSelectedChange = { selected1 = it },
                )
                Toggle(
                    selected = selected2,
                    onSelectedChange = { selected2 = it },
                )
                Toggle(
                    selected = selected3,
                    enabled = false,
                    onSelectedChange = { selected3 = it },
                )
            }

            SampleDivider()

            DealiText(
                text = "Switch",
                style = AppTheme.typography.b2r14,
                color = gray100,
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                var selected1 by remember { mutableStateOf(false) }
                var selected2 by remember { mutableStateOf(true) }
                var selected3 by remember { mutableStateOf(false) }

                Switch(
                    selected = selected1,
                    onSelectedChange = { selected1 = it },
                )
                Switch(
                    selected = selected2,
                    onSelectedChange = { selected2 = it },
                )
                Switch(
                    selected = selected3,
                    enabled = false,
                    onSelectedChange = { selected3 = it },
                )
            }
        }
    }
}

@Composable
private fun SampleDivider() = Box(
    modifier = Modifier
        .fillMaxWidth()
        .height(1.dp)
        .background(color = AppTheme.colors.divider03)
)

@Composable
@Preview(showBackground = true)
private fun InputScreenPreview() {
    ToggleSwitchScreen(onBackPress = {})
}
