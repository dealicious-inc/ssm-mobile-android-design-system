package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.component.tabBarSlider02Layout
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun TextLinkScreen(
    onBackPress: () -> Unit
) {
    Column {
        TopBar(
            onBack = onBackPress,
            title = "TextLink",
            modifier = Modifier.fillMaxWidth(),
        )

        val tabTitles = remember { listOf("Large", "Medium", "Small") }

        tabBarSlider02Layout(
            tabTitles = tabTitles,
            userSwipeEnabled = true,
            onSelectTab = {},
        ) { page ->
            when (page) {
                0 -> TextLinkLargeSamples()
                1 -> TextLinkMediumSamples()
                2 -> TextLinkSmallSamples()
            }
        }
    }
}

@Composable
internal fun TextLinkSampleLayout(
    title: String,
    dark: Boolean = false,
    content: @Composable () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(if (dark) DealiColor.primary05 else DealiColor.primary04)
            .padding(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        DealiText(
            modifier = Modifier.padding(horizontal = 16.dp),
            text = title,
            style = DealiFont.sh3sb16,
            color = if (dark) DealiColor.g10 else DealiColor.g100,
        )
        content()
    }
}

@Composable
internal fun TextLinkByStatus(
    leftIcon: Int?,
    rightIcon: Int?,
    content: @Composable (text: String, leftIcon: Int?, rightIcon: Int?, enabled: Boolean) -> Unit
) {
    val texts = listOf("Default", "Disabled")
    val enabled = listOf(true, false, true)
    Row(
        modifier = Modifier
            .horizontalScroll(
                state = rememberScrollState(),
            )
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        for (i in 0 until 2) {
            content(texts[i], leftIcon, rightIcon, enabled[i])
        }
    }
}

@Composable
@Preview
private fun ButtonsScreenPreview() {
    TextLinkScreen {}
}
