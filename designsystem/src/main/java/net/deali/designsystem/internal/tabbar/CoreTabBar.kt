@file:OptIn(ExperimentalFoundationApi::class)

package net.deali.designsystem.internal.tabbar

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerScope
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.HorizontalDivider
import net.deali.designsystem.component.badge
import net.deali.designsystem.internal.tabbar.TabRowDefaults.dealiTabIndicatorOffset
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
internal fun CoreFixedTabBar(
    modifier: Modifier = Modifier,
    tabTitles: List<String>,
    currentIndex: Int,
    selectedTextColor: Color = DealiColor.primary01,
    indicatorColor: Color = DealiColor.primary01,
    useBadge: Boolean,
    onSelectTab: (index: Int) -> Unit,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(DealiColor.primary04)

    ) {
        HorizontalDivider(
            modifier = Modifier.align(Alignment.BottomCenter),
            color = DealiColor.g30
        )

        TabRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            selectedTabIndex = currentIndex,
            backgroundColor = DealiColor.transparent,
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(
                    modifier = Modifier
                        .tabIndicatorOffset(tabPositions[currentIndex]),
                    height = 2.dp,
                    color = indicatorColor
                )
            },
            tabs = {
                tabTitles.forEachIndexed { index, title ->
                    TabItem(
                        modifier = Modifier
                            .padding(horizontal = 8.dp),
                        title = title,
                        isSelected = index == currentIndex,
                        selectedTextColor = selectedTextColor,
                        useBadge = useBadge,
                        onClick = { onSelectTab(index) }
                    )
                }
            },
            divider = {}
        )
    }
}

@Composable
internal fun CoreScrollableTabBar(
    modifier: Modifier = Modifier,
    tabTitles: List<String>,
    currentIndex: Int,
    selectedTextColor: Color,
    indicatorColor: Color,
    useBadge: Boolean,
    onSelectTab: (index: Int) -> Unit,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(DealiColor.primary04)
    ) {
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            color = DealiColor.g30
        )

        DealiScrollableTabRow(
            selectedTabIndex = currentIndex,
            backgroundColor = DealiColor.transparent,
            edgePadding = 16.dp,
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(
                    modifier = Modifier
                        .dealiTabIndicatorOffset(tabPositions[currentIndex]),
                    height = 2.dp,
                    color = indicatorColor
                )
            },
            divider = {}
        ) {
            tabTitles.forEachIndexed { index, title ->
                TabItem(
                    modifier = Modifier
                        .padding(horizontal = TabItemSpaceHalf),
                    title = title,
                    isSelected = currentIndex == index,
                    selectedTextColor = selectedTextColor,
                    useBadge = useBadge,
                    onClick = { onSelectTab(index) },
                )
            }
        }
    }
}

@Composable
private fun TabItem(
    modifier: Modifier = Modifier,
    title: String,
    isSelected: Boolean,
    selectedTextColor: Color = DealiColor.g100,
    useBadge: Boolean,
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .clickable(onClick = onClick),
    ) {
        if (isSelected) {
            val badgeModifier = if (useBadge) {
                Modifier.badge(
                    badgeRadius = 2.dp,
                    offset = DpOffset(x = 4.dp, 2.dp)
                )
            } else {
                Modifier
            }

            DealiText(
                modifier = modifier
                    .align(Alignment.Center)
                    .then(badgeModifier),
                text = title,
                style = DealiFont.b1sb15,
                color = selectedTextColor,
            )
        } else {
            DealiText(
                modifier = modifier
                    .align(Alignment.Center),
                text = title,
                style = DealiFont.b1r15,
                color = DealiColor.g100,
            )
        }
    }
}

@Composable
internal fun CoreTabBarLayout(
    tabCount: Int,
    onSelectTab: (index: Int) -> Unit,
    initialPage: Int = 0,
    userSwipeEnabled: Boolean,
    tabBar: @Composable (
        currentIndex: Int,
        onPageChange: (index: Int) -> Unit,
    ) -> Unit,
    pageContent: @Composable PagerScope.(page: Int) -> Unit
) {
    val pagerState = rememberPagerState(
        initialPage = initialPage,
        pageCount = { tabCount }
    )
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        tabBar(
            pagerState.currentPage
        ) { index ->
            coroutineScope.launch {
                pagerState.animateScrollToPage(index)
            }
            onSelectTab(index)
        }

        HorizontalPager(
            modifier = Modifier,
            state = pagerState,
            userScrollEnabled = userSwipeEnabled,
            pageContent = pageContent,
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun PreviewCoreFixedTabBar() {
    val titles = listOf("탭 타이틀1", "탭 타이틀2")
    CoreFixedTabBar(
        modifier = Modifier
            .fillMaxWidth()
            .height(44.dp),
        tabTitles = titles,
        currentIndex = 0,
        useBadge = false,
        onSelectTab = {},
    )
}

@Preview(showBackground = true, backgroundColor = 0x000000)
@Composable
private fun PreviewCoreScrollableTabBar() {
    val titles = listOf("탭 타이틀1", "탭 타이틀2")
    CoreScrollableTabBar(
        modifier = Modifier
            .fillMaxWidth()
            .height(36.dp),
        tabTitles = titles,
        currentIndex = 1,
        selectedTextColor = DealiColor.primary01,
        indicatorColor = DealiColor.primary01,
        useBadge = true,
        onSelectTab = {}
    )
}
