@file:OptIn(ExperimentalFoundationApi::class)

package net.deali.designsystem.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.tabbar.CoreFixedTabBar
import net.deali.designsystem.internal.tabbar.CoreScrollableTabBar
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont


@Composable
fun TabBar(
    tabTitles: List<String>,
    currentIndex: Int,
    onSelectTab: (index: Int) -> Unit,
    isScrollableTab: Boolean,
) {
    if (isScrollableTab) {
        CoreScrollableTabBar(
            modifier = Modifier.height(44.dp),
            tabTitles = tabTitles,
            currentIndex = currentIndex,
            selectedTextColor = DealiColor.primary01,
            selectedIndicatorColor = DealiColor.primary01,
            useBadge = true,
            onSelectTab = onSelectTab
        )
    } else {
        CoreFixedTabBar(
            modifier = Modifier.height(44.dp),
            tabTitles = tabTitles,
            currentIndex = currentIndex,
            selectedTextColor = DealiColor.g100,
            selectedIndicatorColor = DealiColor.g100,
            useBadge = false,
            onSelectTab = onSelectTab,
        )
    }
}

@Composable
fun CategoryTabBar(
    tabTitles: List<String>,
    currentIndex: Int,
    onSelectTab: (index: Int) -> Unit,
) {
    CoreScrollableTabBar(
        modifier = Modifier.height(44.dp),
        tabTitles = tabTitles,
        currentIndex = currentIndex,
        selectedTextColor = DealiColor.primary01,
        selectedIndicatorColor = DealiColor.primary01,
        useBadge = true,
        onSelectTab = onSelectTab
    )
}

@Composable
fun ScrollableTabBarSmall(
    tabTitles: List<String>,
    currentIndex: Int,
    onSelectTab: (index: Int) -> Unit,
) {
    CoreScrollableTabBar(
        modifier = Modifier.height(36.dp),
        tabTitles = tabTitles,
        currentIndex = currentIndex,
        selectedTextColor = DealiColor.primary01,
        selectedIndicatorColor = DealiColor.primary01,
        textModifier = Modifier.padding(top = 4.dp, bottom = 12.dp),
        useBadge = true,
        onSelectTab = onSelectTab
    )
}


@Composable
fun TabBarLayout(
    modifier: Modifier = Modifier,
    tabTitles: List<String>,
    onSelectTab: (index: Int) -> Unit,
    initialPage: Int = 0,
    pageContent: @Composable (page: Int) -> Unit,
) {
    val pagerState = rememberPagerState(initialPage = initialPage)

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TabBar(
            tabTitles = tabTitles,
            currentIndex = pagerState.currentPage,
            onSelectTab = onSelectTab,
            isScrollableTab = true,
        )

        HorizontalPager(
            pageCount = tabTitles.size,
            modifier = Modifier,
            state = pagerState,
            userScrollEnabled = true, //TODO 기능 확인
            pageContent = pageContent,
        )
    }
}

@Preview
@Composable
private fun PreviewFixedTabBar() {
    TabBar(
        tabTitles = listOf("탭이름0", "탭이름1", "탭이름2"),
        currentIndex = 1,
        onSelectTab = {},
        isScrollableTab = false
    )
}

@Preview
@Composable
private fun PreviewScrollableTabBar() {
    TabBar(
        tabTitles = listOf("탭이름0", "탭이름1", "탭이름2"),
        currentIndex = 1,
        onSelectTab = {},
        isScrollableTab = true,
    )
}

@Preview
@Composable
private fun PreviewScrollableTabBarSmall() {
    ScrollableTabBarSmall(
        tabTitles = listOf("탭이름0", "탭이름1", "탭이름2"),
        currentIndex = 1,
        onSelectTab = {}
    )
}

@Preview
@Composable
private fun PreviewTabBarLayout() {
    val titles = listOf("탭 이름1", "탭 이름2", "탭 이름3", "탭 이름4")
    TabBarLayout(
        tabTitles = titles,
        onSelectTab = {}
    ) { page ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(DealiColor.g60)
        ) {
            DealiText(
                modifier = Modifier.align(Alignment.Center),
                text = "${titles[page]}\n(index: $page)",
                style = DealiFont.h1sb32,
                color = DealiColor.g100,
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewScrollableTabRow() {
    ScrollableTabRow(
        selectedTabIndex = 0,
        modifier = Modifier.height(44.dp),
        backgroundColor = DealiColor.g40,
        contentColor = DealiColor.primary01,
        edgePadding = 16.dp,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.tabIndicatorOffset(tabPositions[0])
            )
        },
        divider = {
            TabRowDefaults.Divider()
        },
        tabs = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(DealiColor.primary01)
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(DealiColor.primary02)
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(DealiColor.primary03)
            )
        },


        )
}