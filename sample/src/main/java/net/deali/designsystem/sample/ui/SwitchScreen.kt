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
import net.deali.designsystem.component.switchLarge
import net.deali.designsystem.component.switchSmall
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun SwitchScreen(onBackPress: () -> Unit) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Switch",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left,
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
                text = "Switch Large",
                style = DealiFont.b2r14,
                color = DealiColor.g100,
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                var on1 by remember { mutableStateOf(true) }
                var on2 by remember { mutableStateOf(true) }
                var on3 by remember { mutableStateOf(false) }
                var on4 by remember { mutableStateOf(false) }

                switchLarge(
                    isOn = on1,
                    onChange = { on1 = it }
                )
                switchLarge(
                    isOn = on2,
                    enabled = false,
                    onChange = { on2 = it }
                )
                switchLarge(
                    isOn = on3,
                    onChange = { on3 = it }
                )
                switchLarge(
                    isOn = on4,
                    enabled = false,
                    onChange = { on4 = it }
                )
            }

            SampleDivider()

            DealiText(
                text = "Switch Small",
                style = DealiFont.b2r14,
                color = DealiColor.g100,
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                var on1 by remember { mutableStateOf(true) }
                var on2 by remember { mutableStateOf(true) }
                var on3 by remember { mutableStateOf(false) }
                var on4 by remember { mutableStateOf(false) }

                switchSmall(
                    isOn = on1,
                    onChange = { on1 = it }
                )
                switchSmall(
                    isOn = on2,
                    enabled = false,
                    onChange = { on2 = it }
                )
                switchSmall(
                    isOn = on3,
                    onChange = { on3 = it }
                )
                switchSmall(
                    isOn = on4,
                    enabled = false,
                    onChange = { on4 = it }
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
        .background(color = DealiColor.g10)
)

@Composable
@Preview(showBackground = true)
private fun InputScreenPreview() {
    SwitchScreen(onBackPress = {})
}
