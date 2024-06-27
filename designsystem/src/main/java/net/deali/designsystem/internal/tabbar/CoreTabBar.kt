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
import net.deali.designsystem.component.Tab
import net.deali.designsystem.component.badge
import net.deali.designsystem.internal.tabbar.TabRowDefaults.dealiTabIndicatorOffset
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@JvmName("CoreFixedTabBarString")
@Composable
internal fun CoreFixedTabBar(
    tabTitles: List<String>,
    currentIndex: Int,
    modifier: Modifier = Modifier,
    selectedTextColor: Color = DealiColor.primary01,
    indicatorColor: Color = DealiColor.primary01,
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
                    FixedTabItem(
                        modifier = Modifier,
                        title = title,
                        isSelected = index == currentIndex,
                        selectedTextColor = selectedTextColor,
                        useBadge = false,
                        onClick = { onSelectTab(index) }
                    )
                }
            },
            divider = {}
        )
    }
}

@JvmName("CoreFixedTabBarTabs")
@Composable
internal fun CoreFixedTabBar(
    tabs: List<Tab>,
    currentIndex: Int,
    modifier: Modifier = Modifier,
    selectedTextColor: Color = DealiColor.primary01,
    indicatorColor: Color = DealiColor.primary01,
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
                tabs.forEachIndexed { index, tab ->
                    FixedTabItem(
                        modifier = Modifier,
                        title = tab.text,
                        isSelected = index == currentIndex,
                        selectedTextColor = selectedTextColor,
                        useBadge = tab.isShowBadge,
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
    tabTitles: List<String>,
    currentIndex: Int,
    selectedTextColor: Color,
    indicatorColor: Color,
    useBadge: Boolean,
    modifier: Modifier = Modifier,
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
internal fun CoreScrollableTabBar(
    tabs: List<Tab>,
    currentIndex: Int,
    selectedTextColor: Color,
    indicatorColor: Color,
    modifier: Modifier = Modifier,
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
            tabs.forEachIndexed { index, tab ->
                TabItem(
                    modifier = Modifier
                        .padding(horizontal = TabItemSpaceHalf),
                    title = tab.text,
                    isSelected = currentIndex == index,
                    selectedTextColor = selectedTextColor,
                    useBadge = tab.isShowBadge,
                    onClick = { onSelectTab(index) },
                )
            }
        }
    }
}

@Composable
private fun FixedTabItem(
    title: String,
    isSelected: Boolean,
    useBadge: Boolean,
    modifier: Modifier = Modifier,
    selectedTextColor: Color = DealiColor.g100,
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .clickable(onClick = onClick),
    ) {
        val badgeModifier = if (useBadge) {
            Modifier
                .badge(
                    badgeRadius = 2.dp,
                    offset = DpOffset(x = 4.dp, 2.dp)
                )
                .padding(end = 2.dp)
        } else {
            Modifier
        }

        DealiText(
            modifier = modifier
                .align(Alignment.Center)
                .then(badgeModifier),
            text = title,
            style = if (isSelected) DealiFont.b1sb15 else DealiFont.b1r15,
            color = if (isSelected) selectedTextColor else DealiColor.g70,
        )
    }
}

@Composable
private fun TabItem(
    title: String,
    isSelected: Boolean,
    useBadge: Boolean,
    modifier: Modifier = Modifier,
    selectedTextColor: Color = DealiColor.g100,
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .clickable(onClick = onClick),
    ) {
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
            style = if (isSelected) DealiFont.b1sb15 else DealiFont.b1r15,
            color = if (isSelected) selectedTextColor else DealiColor.g100,
        )
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
    val tabs = listOf(
        Tab("탭 타이틀1", false),
        Tab("탭 타이틀2", false),
    )

    CoreFixedTabBar(
        modifier = Modifier
            .fillMaxWidth()
            .height(44.dp),
        tabs = tabs,
        currentIndex = 0,
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
