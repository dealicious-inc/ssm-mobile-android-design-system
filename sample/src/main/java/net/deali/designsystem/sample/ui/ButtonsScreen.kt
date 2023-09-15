package net.deali.designsystem.sample.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.pagerTabIndicatorOffset
import kotlinx.coroutines.launch
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@OptIn(ExperimentalFoundationApi::class, ExperimentalPagerApi::class)
@Composable
fun ButtonsScreen(
    onBackPress: () -> Unit
) {
    Column {
        ActionBar(
            onBack = onBackPress,
            title = "Buttons",
            modifier = Modifier.fillMaxWidth(),
        )

        val coroutineScope = rememberCoroutineScope()
        val pagerState = rememberPagerState()
        val tabTitles = remember { listOf("Large", "Medium", "Small") }
        TabRow(
            selectedTabIndex = pagerState.currentPage,
            modifier = Modifier.fillMaxWidth(),
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(
                    modifier = Modifier.pagerTabIndicatorOffset(
                        pagerState = pagerState,
                        tabPositions = tabPositions,
                    ),
                    color = DealiColor.g100,
                )
            }
        ) {
            for ((index, tabTitle) in tabTitles.withIndex()) {
                Tab(
                    selected = pagerState.currentPage == index,
                    onClick = {
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(index)
                        }
                    },
                    modifier = Modifier
                        .height(48.dp)
                        .background(DealiColor.primary04),
                ) {
                    DealiText(
                        text = tabTitle,
                        style = DealiFont.b2sb14,
                        color = DealiColor.g100,
                    )
                }
            }
        }
        HorizontalPager(
            pageCount = 3,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            state = pagerState,
        ) { page ->
            when (page) {
                0 -> LargeButtonSamples()
                1 -> MediumButtonSamples()
                2 -> SmallButtonSamples()
            }
        }
    }
}

@Composable
internal fun ButtonSampleLayout(
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
internal fun ButtonsByStatus(
    leftIcon: Int?,
    rightIcon: Int?,
    scrollEnabled: Boolean = false,
    content: @Composable (String, Int?, Int?, Boolean, Boolean) -> Unit
) {
    val texts = listOf("Default", "Disabled", "Loading")
    val enableds = listOf(true, false, true)
    val loadings = listOf(false, false, true)
    Row(
        modifier = Modifier
            .horizontalScroll(
                state = rememberScrollState(),
                enabled = scrollEnabled,
            )
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        for (i in 0 until 3) {
            content(texts[i], leftIcon, rightIcon, enableds[i], loadings[i])
        }
    }
}

@Composable
@Preview
private fun ButtonsScreenPreview() {
    ButtonsScreen(
        onBackPress = {}
    )
}
