@file:OptIn(ExperimentalFoundationApi::class)

package net.deali.designsystem.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import net.deali.designsystem.internal.tabbar.CoreFixedTabBar
import net.deali.designsystem.internal.tabbar.CoreScrollableTabBar
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

/**
 * 탭바
 *
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param currentIndex 현재 선택된 탭의 인덱스
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 * @param isScrollableTab 탭 메뉴 가로로 스크롤 가능 여부 (true: 가로 무한 스크롤, false: 화면의 1/n 크기 고정)
 */
@Composable
fun TabBar(
    tabTitles: List<String>,
    currentIndex: Int,
    onSelectTab: (index: Int) -> Unit,
    isScrollableTab: Boolean,
    shortTopPadding: Boolean = false,
    selectedTextColor: Color = DealiColor.g100,
    indicatorColor: Color = DealiColor.g100,
) {
    if (isScrollableTab) {
        val height = if (shortTopPadding) 36.dp else 44.dp

        CoreScrollableTabBar(
            modifier = Modifier.height(height),
            tabTitles = tabTitles,
            currentIndex = currentIndex,
            selectedTextColor = selectedTextColor,
            indicatorColor = indicatorColor,
            useBadge = true,
            shortTopPadding = shortTopPadding,
            onSelectTab = onSelectTab,
        )
    } else {
        CoreFixedTabBar(
            modifier = Modifier.height(44.dp),
            tabTitles = tabTitles,
            currentIndex = currentIndex,
            selectedTextColor = selectedTextColor,
            indicatorColor = indicatorColor,
            useBadge = true,
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
        indicatorColor = DealiColor.primary01,
        useBadge = true,
        onSelectTab = onSelectTab
    )
}

/**
 * 상단에 탭바가 있는 레이아웃
 *
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 * @param initialPage 시작 시 노출할 탭 페이지 인덱스
 * @param userSwipeEnabled 좌우로 스와이프 시 탭 전환을 가능하게 할 지 여부
 * @param isScrollableTab 탭 메뉴 가로로 스크롤 가능 여부 (true: 가로 무한 스크롤, false: 화면의 1/n 크기 고정)
 * @param shortTopPadding 상단 여백이 없는 레이아웃 적용
 * @param pageContent 탭 하단 페이지 컨텐츠
 */
@Composable
fun TabBarLayout(
    modifier: Modifier = Modifier,
    tabTitles: List<String>,
    onSelectTab: (index: Int) -> Unit,
    initialPage: Int = 0,
    userSwipeEnabled: Boolean,
    isScrollableTab: Boolean,
    shortTopPadding: Boolean = false,
    pageContent: @Composable (page: Int) -> Unit,
) {
    val pagerState = rememberPagerState(initialPage = initialPage)
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        TabBar(
            tabTitles = tabTitles,
            currentIndex = pagerState.currentPage,
            onSelectTab = {
                coroutineScope.launch {
                    pagerState.animateScrollToPage(it)
                }
                onSelectTab(it)
            },
            shortTopPadding = shortTopPadding,
            isScrollableTab = isScrollableTab,
        )

        HorizontalPager(
            pageCount = tabTitles.size,
            modifier = Modifier,
            state = pagerState,
            userScrollEnabled = userSwipeEnabled,
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
private fun PreviewTabBarLayout() {
    val titles = listOf("탭 이름1", "탭 이름2", "탭 이름3", "탭 이름4")
    TabBarLayout(
        tabTitles = titles,
        onSelectTab = {},
        isScrollableTab = true,
        userSwipeEnabled = false,
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