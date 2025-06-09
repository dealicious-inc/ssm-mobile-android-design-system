package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon
import net.deali.designsystem.component.SwitchSmall
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.component.badge
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.util.getRandomText

@Composable
fun TopBarScreen(onBackPress: () -> Unit) {
    var menuContent1Visible by remember { mutableStateOf(true) }
    var menuContent2Visible by remember { mutableStateOf(true) }
    var menuContent3Visible by remember { mutableStateOf(true) }

    NavigationContainer(
        navigationBar = {
            TopBar(
                title = "TopBar | ${getRandomText()}",
                menuContent = {
                    if (menuContent1Visible) {
                        Icon(
                            iconRes = R.drawable.ic_search,
                            size = 24.dp,
                            onClick = {},
                        )
                    }

                    if (menuContent2Visible) {
                        Icon(
                            iconRes = R.drawable.ic_bookmark_1,
                            size = 24.dp,
                            onClick = {},
                        )
                    }

                    if (menuContent3Visible) {
                        Icon(
                            modifier = Modifier.badge(count = 99),
                            iconRes = R.drawable.ic_cart,
                            size = 24.dp,
                            onClick = {},
                        )
                    }
                },
                onBack = onBackPress,
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(DealiColor.g10)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            ToggleOption(
                title = "menuContent1",
                selected = menuContent1Visible,
                onSelectedChange = { menuContent1Visible = it }
            )

            ToggleOption(
                title = "menuContent2",
                selected = menuContent2Visible,
                onSelectedChange = { menuContent2Visible = it }
            )

            ToggleOption(
                title = "menuContent3",
                selected = menuContent3Visible,
                onSelectedChange = { menuContent3Visible = it }
            )
        }
    }
}

@Composable
private fun ToggleOption(
    title: String,
    selected: Boolean,
    onSelectedChange: (Boolean) -> Unit,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        DealiText(
            text = title,
            style = DealiFont.b4r12,
            color = DealiColor.g100,
        )
        SwitchSmall(
            isOn = selected,
            onChange = onSelectedChange,
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun TopBarScreenPreview() {
    TopBarScreen(onBackPress = {})
}
