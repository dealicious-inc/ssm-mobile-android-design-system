package net.deali.designsystem.sample.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.tabBarSegment01Layout
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ChipScreen(onBackPress: () -> Unit) {
    Column {
        ActionBar(
            onBack = onBackPress,
            title = "Chip",
            modifier = Modifier.fillMaxWidth(),
        )

        val tabTitles = remember { listOf("Large", "Medium", "Small") }

        tabBarSegment01Layout(
            tabTitles = tabTitles,
            userSwipeEnabled = false,
            onSelectTab = {}
        ) { page ->
            when (page) {
                0 -> LargeChipSamples()
                1 -> MediumChipSamples()
                2 -> SmallChipSamples()
            }
        }
    }
}

@Composable
internal fun ChipSampleLayout(
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
