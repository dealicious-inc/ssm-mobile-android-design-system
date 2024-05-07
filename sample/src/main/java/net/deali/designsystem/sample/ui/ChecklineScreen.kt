package net.deali.designsystem.sample.ui

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
import net.deali.designsystem.component.Checkline
import net.deali.designsystem.theme.DealiColor

@Composable
fun ChecklineScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Checkline",
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
            Checkline(
                checked = checked,
                text = "Checkline / enabled: true",
                onCheck = {
                    checked = !checked
                }
            )

            Checkline(
                checked = checkedAd,
                text = "Checkline / enabled: true / isAd: true",
                isAd = true,
                onCheck = {
                    checkedAd = !checkedAd
                }
            )

            Checkline(
                checked = false,
                enabled = false,
                text = "Checkline / enabled: false",
                onCheck = { }
            )
        }
    }
}

@Composable
@Preview
private fun CheckBoxScreenPreview() {
    ChecklineScreen(
        onBackPress = {}
    )
}
