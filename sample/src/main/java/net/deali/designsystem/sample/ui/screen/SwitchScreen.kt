package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.HorizontalDivider
import net.deali.designsystem.component.SwitchLarge
import net.deali.designsystem.component.SwitchSmall
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun SwitchScreen(onBackPress: () -> Unit) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Switch",
                onBack = onBackPress,
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

                SwitchLarge(
                    isOn = on1,
                    onChange = { on1 = it }
                )
                SwitchLarge(
                    isOn = on2,
                    enabled = false,
                    onChange = { on2 = it }
                )
                SwitchLarge(
                    isOn = on3,
                    onChange = { on3 = it }
                )
                SwitchLarge(
                    isOn = on4,
                    enabled = false,
                    onChange = { on4 = it }
                )
            }

            HorizontalDivider(DealiColor.g20)

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

                SwitchSmall(
                    isOn = on1,
                    onChange = { on1 = it }
                )
                SwitchSmall(
                    isOn = on2,
                    enabled = false,
                    onChange = { on2 = it }
                )
                SwitchSmall(
                    isOn = on3,
                    onChange = { on3 = it }
                )
                SwitchSmall(
                    isOn = on4,
                    enabled = false,
                    onChange = { on4 = it }
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun InputScreenPreview() {
    SwitchScreen(onBackPress = {})
}
