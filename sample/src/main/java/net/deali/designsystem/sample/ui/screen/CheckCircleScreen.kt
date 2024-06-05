package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import net.deali.designsystem.component.Checkcircle
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor

@Composable
fun CheckCircleScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Checkcircle",
                onBack = onBackPress,
            )
        }
    ) {
        var checked by remember { mutableStateOf(true) }
        var checkedAd by remember { mutableStateOf(true) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = DealiColor.primary04)
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Checkcircle(
                checked = checked,
                text = "Checkcircle / enabled: true",
                onCheck = {
                    checked = !checked
                }
            )

            Checkcircle(
                checked = checkedAd,
                text = "Checkcircle / enabled: true / isAd: true",
                isAd = true,
                onCheck = {
                    checkedAd = !checkedAd
                }
            )

            Checkcircle(
                checked = false,
                enabled = false,
                text = "Checkcircle / enabled: false",
                onCheck = { }
            )
        }
    }
}

@Composable
@Preview
private fun CheckBoxScreenPreview() {
    CheckCircleScreen(
        onBackPress = {}
    )
}
