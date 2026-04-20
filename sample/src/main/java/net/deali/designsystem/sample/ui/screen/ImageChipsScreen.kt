package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.collections.immutable.persistentListOf
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.component.tabBarSegment01Layout
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun ImageChipsScreen(onBackPress: () -> Unit) {
    Column {
        TopBar(
            onBack = onBackPress,
            title = "ImageChips",
            modifier = Modifier.fillMaxWidth(),
        )

        val tabTitles = remember { persistentListOf("Large", "Medium", "Small") }

        tabBarSegment01Layout(
            tabTitles = tabTitles,
            userSwipeEnabled = false,
            onSelectTab = {}
        ) { page ->
            when (page) {
                0 -> LargeImageChipSamples()
                1 -> MediumImageChipSamples()
                2 -> SmallImageChipSamples()
            }
        }
    }
}

@Composable
internal fun ImageChipSampleLayout(
    title: String,
    content: @Composable () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(DealiColor.primary04)
            .padding(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        DealiText(
            modifier = Modifier.padding(horizontal = 16.dp),
            text = title,
            style = DealiFont.sh3sb16,
            color = DealiColor.g100,
        )
        content()


    }
}

@Preview
@Composable
private fun PreviewImageChipsScreen() {
    ImageChipsScreen(onBackPress = {})
}
