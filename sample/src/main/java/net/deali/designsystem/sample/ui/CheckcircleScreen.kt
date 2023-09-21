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
import net.deali.designsystem.R
import net.deali.designsystem.component.Checkcircle
import net.deali.designsystem.component.CheckcircleAd
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.theme.DealiColor

@Composable
fun CheckcircleScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Checkcircle",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left,
                        onClick = onBackPress
                    )
                }
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
                onCheck = {
                    checked = !checked
                }
            )

            Checkcircle(
                checked = false,
                enabled = false,
                onCheck = {}
            )

            CheckcircleAd(
                checked = checkedAd,
                onCheck = {
                    checkedAd = !checkedAd
                }
            )
        }
    }
}

@Composable
@Preview
private fun CheckBoxScreenPreview() {
    CheckcircleScreen(
        onBackPress = {}
    )
}
