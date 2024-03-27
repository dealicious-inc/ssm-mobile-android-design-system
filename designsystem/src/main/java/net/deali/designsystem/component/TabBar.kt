@file:OptIn(ExperimentalFoundationApi::class, ExperimentalFoundationApi::class)

package net.deali.designsystem.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
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
 * 가장 상위 1depth 에서 사용하는 탭바
 * @param modifier
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param currentIndex 현재 선택된 탭의 인덱스
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 * @param isScrollableTab 탭 메뉴 가로로 스크롤 가능 여부 (true: 가로 무한 스크롤, false: 화면의 1/n 크기 고정)
 * @param useBadge 우측 상단 빨간 뱃지 표시 여부
 * @param selectedTextColor
 * @param indicatorColor
 */
@Composable
fun TabBar(
    modifier: Modifier = Modifier,
    tabTitles: List<String>,
    currentIndex: Int,
    onSelectTab: (index: Int) -> Unit,
    isScrollableTab: Boolean,
    useBadge: Boolean = false,
    selectedTextColor: Color = DealiColor.g100,
    indicatorColor: Color = DealiColor.g100,
) {
    if (isScrollableTab) {
        CoreScrollableTabBar(
            modifier = modifier
                .fillMaxWidth()
                .height(44.dp),
            tabTitles = tabTitles,
            currentIndex = currentIndex,
            selectedTextColor = selectedTextColor,
            indicatorColor = indicatorColor,
            useBadge = useBadge,
            isThirdDepth = false,
            onSelectTab = onSelectTab,
        )
    } else {
        CoreFixedTabBar(
            modifier = modifier.height(44.dp),
            tabTitles = tabTitles,
            currentIndex = currentIndex,
            selectedTextColor = selectedTextColor,
            indicatorColor = indicatorColor,
            useBadge = useBadge,
            onSelectTab = onSelectTab,
        )
    }
}

/**
 * Chip으로 이루어져 있는 2depth용 탭바
 * @param modifier
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param currentIndex 현재 선택된 탭의 인덱스
 * @param onSelectTab 탭 선택 시 콜백
 * @param selectedTextColor
 * @param indicatorColor
 */
@Composable
fun SubTabBar(
    modifier: Modifier = Modifier,
    tabTitles: List<String>,
    currentIndex: Int,
    onSelectTab: (index: Int) -> Unit,
) {
    val lazyListState = rememberLazyListState()

    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(DealiColor.primary04),
        state = lazyListState,
        contentPadding = PaddingValues(horizontal = 12.dp)
    ) {
        itemsIndexed(tabTitles) { index, title ->
            chipFilledSmall02(
                modifier = Modifier
                    .padding(horizontal = 4.dp, vertical = 12.dp),
                text = title,
                selected = index == currentIndex,
                onClick = remember {
                    { onSelectTab(index) }
                },
            )
        }
    }
}

/**
 * 상단 여백이 좁은 3depth 전용 scrollable 탭바
 * @param modifier
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param currentIndex 현재 선택된 탭의 인덱스
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 * @param useBadge 우측 상단 빨간 뱃지 표시 여부
 * @param selectedTextColor
 * @param indicatorColor
 *
 */
@Composable
fun TabBar3Depth(
    modifier: Modifier = Modifier,
    tabTitles: List<String>,
    currentIndex: Int,
    onSelectTab: (index: Int) -> Unit,
    useBadge: Boolean = true,
    selectedTextColor: Color = DealiColor.g100,
    indicatorColor: Color = DealiColor.g100,
) {
    CoreScrollableTabBar(
        modifier = modifier
            .fillMaxWidth()
            .height(36.dp),
        tabTitles = tabTitles,
        currentIndex = currentIndex,
        selectedTextColor = selectedTextColor,
        indicatorColor = indicatorColor,
        useBadge = useBadge,
        isThirdDepth = true,
        onSelectTab = onSelectTab,
    )
}

/**
 * 상단에 1depth 탭바가 있는 레이아웃
 *
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 * @param initialPage 시작 시 노출할 탭 페이지 인덱스
 * @param userSwipeEnabled 좌우로 스와이프 시 탭 전환을 가능하게 할 지 여부
 * @param isScrollableTab 탭 메뉴 가로로 스크롤 가능 여부 (true: 가로 무한 스크롤, false: 화면의 1/n 크기 고정)
 * @param useBadge 빨간 점 뱃지 사용 여부
 * @param pageContent 탭 하단 페이지 컨텐츠
 */
@Composable
fun TabBarLayout(
    tabTitles: List<String>,
    onSelectTab: (index: Int) -> Unit,
    initialPage: Int = 0,
    userSwipeEnabled: Boolean,
    isScrollableTab: Boolean,
    useBadge: Boolean = true,
    pageContent: @Composable (page: Int) -> Unit,
) {
    val pagerState = rememberPagerState(initialPage = initialPage)
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        TabBar(
            modifier = Modifier.fillMaxWidth(),
            tabTitles = tabTitles,
            currentIndex = pagerState.currentPage,
            onSelectTab = {
                coroutineScope.launch {
                    pagerState.animateScrollToPage(it)
                }
                onSelectTab(it)
            },
            isScrollableTab = isScrollableTab,
            useBadge = useBadge,
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

/**
 * 상단에 탭바가 있는 레이아웃
 *
 * @param modifier
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 * @param initialPage 시작 시 노출할 탭 페이지 인덱스
 * @param userSwipeEnabled 좌우로 스와이프 시 탭 전환을 가능하게 할 지 여부
 * @param pageContent 탭 하단 페이지 컨텐츠
 */
@Composable
fun SubTabBarLayout(
    modifier: Modifier = Modifier,
    tabTitles: List<String>,
    onSelectTab: (index: Int) -> Unit,
    initialPage: Int = 0,
    userSwipeEnabled: Boolean = false,
    pageContent: @Composable (page: Int) -> Unit,
) {
    val pagerState = rememberPagerState(initialPage = initialPage)
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        SubTabBar(
            tabTitles = tabTitles,
            currentIndex = pagerState.currentPage,
            onSelectTab = {
                coroutineScope.launch {
                    pagerState.animateScrollToPage(it)
                }
                onSelectTab(it)
            },
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
private fun PreviewSubTabBar() {
    SubTabBar(
        tabTitles = listOf("서브0", "서브1", "서브2"),
        currentIndex = 1,
        onSelectTab = {},
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
                .fillMaxWidth()
                .height(100.dp)
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

@Preview
@Composable
private fun PreviewSubTabBarLayout() {
    val titles = listOf("탭 이름1", "탭 이름2", "탭 이름3")
    val subTabTitles = listOf("서브1", "서브2", "서브3", "서브4", "서브5")

    TabBarLayout(
        tabTitles = titles,
        onSelectTab = {},
        isScrollableTab = true,
        userSwipeEnabled = false,
        useBadge = false,
    ) { page ->
        SubTabBarLayout(
            tabTitles = subTabTitles,
            onSelectTab = {},
            modifier = Modifier,
            initialPage = 1
        ) { subPage ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(DealiColor.g60)
            ) {
                DealiText(
                    modifier = Modifier.align(Alignment.Center),
                    text = "${titles[page]}\n(index: $page) / (subIndex: $subPage)",
                    style = DealiFont.h1sb32,
                    color = DealiColor.g100,
                )

            }
        }
    }
}