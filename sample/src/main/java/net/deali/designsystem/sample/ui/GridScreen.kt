package net.deali.designsystem.sample.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun GridScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Grid",
                onBack = onBackPress,
            )
        }
    ) {
        DealiText(
            text = "GRID SCREEN EMPTY",
            style = DealiFont.h1sb32,
            color = DealiColor.g100
        )
    }
}

@Composable
@Preview
private fun GridScreenPreview() {
    GridScreen(
        onBackPress = {}
    )
}
