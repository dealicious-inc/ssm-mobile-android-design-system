package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.collections.immutable.persistentListOf
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.component.tabBarSlider02Layout

@Composable
fun ButtonsRoundScreen(
    onBackPress: () -> Unit
) {
    Column {
        TopBar(
            onBack = onBackPress,
            title = "Buttons Round",
            modifier = Modifier.fillMaxWidth(),
        )

        val tabTitles = remember { persistentListOf("Large", "Medium", "SemiMedium", "Small") }

        tabBarSlider02Layout(
            tabTitles = tabTitles,
            userSwipeEnabled = true,
            onSelectTab = {},
        ) { page ->
            when (page) {
                0 -> ButtonRoundLargeSamples()
                1 -> ButtonRoundMediumSamples()
                2 -> ButtonRoundSemiMediumSamples()
                3 -> ButtonRoundSmallSamples()
            }
        }
    }
}

@Composable
@Preview
private fun ButtonsScreenPreview() {
    ButtonsRoundScreen(
        onBackPress = {}
    )
}
