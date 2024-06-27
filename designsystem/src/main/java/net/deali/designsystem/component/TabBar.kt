@file:OptIn(ExperimentalFoundationApi::class, ExperimentalFoundationApi::class)

package net.deali.designsystem.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.PagerScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import net.deali.designsystem.internal.tabbar.CoreFixedTabBar
import net.deali.designsystem.internal.tabbar.CoreScrollableTabBar
import net.deali.designsystem.internal.tabbar.CoreTabBarLayout
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

/**
 * 화면의 1/n 크기 고정된 탭바
 * @param modifier
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param currentIndex 현재 선택된 탭의 인덱스
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 */
@JvmName("tabBarSegment01String")
@Composable
fun tabBarSegment01(
    tabTitles: List<String>,
    currentIndex: Int,
    modifier: Modifier = Modifier,
    onSelectTab: (index: Int) -> Unit,
) {
    CoreFixedTabBar(
        modifier = modifier.height(44.dp),
        tabTitles = tabTitles,
        currentIndex = currentIndex,
        selectedTextColor = DealiColor.g100,
        indicatorColor = DealiColor.g100,
        onSelectTab = onSelectTab,
    )
}

/**
 * 화면의 1/n 크기 고정된 탭바
 * @param modifier
 * @param tabs 각 탭의 타이틀 리스트
 * @param currentIndex 현재 선택된 탭의 인덱스
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 */
@JvmName("tabBarSegment01Tabs")
@Composable
fun tabBarSegment01(
    tabs: List<Tab>,
    currentIndex: Int,
    modifier: Modifier = Modifier,
    onSelectTab: (index: Int) -> Unit,
) {
    CoreFixedTabBar(
        modifier = modifier.height(44.dp),
        tabs = tabs,
        currentIndex = currentIndex,
        selectedTextColor = DealiColor.g100,
        indicatorColor = DealiColor.g100,
        onSelectTab = onSelectTab,
    )
}

/**
 * 가로 무한 스크롤 탭바 (primary01)
 * @param modifier
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param currentIndex 현재 선택된 탭의 인덱스
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 */
@JvmName("tabBarSlider01String")
@Composable
fun tabBarSlider01(
    tabTitles: List<String>,
    currentIndex: Int,
    modifier: Modifier = Modifier,
    onSelectTab: (index: Int) -> Unit,
) {
    CoreScrollableTabBar(
        modifier = modifier
            .fillMaxWidth()
            .height(44.dp),
        tabTitles = tabTitles,
        currentIndex = currentIndex,
        selectedTextColor = DealiColor.primary01,
        indicatorColor = DealiColor.primary01,
        useBadge = true,
        onSelectTab = onSelectTab,
    )
}

/**
 * 가로 무한 스크롤 탭바 (primary01)
 * @param modifier
 * @param tabs 각 탭의 타이틀 리스트
 * @param currentIndex 현재 선택된 탭의 인덱스
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 */
@JvmName("tabBarSlider01Tabs")
@Composable
fun tabBarSlider01(
    tabs: List<Tab>,
    currentIndex: Int,
    modifier: Modifier = Modifier,
    onSelectTab: (index: Int) -> Unit,
) {
    CoreScrollableTabBar(
        modifier = modifier
            .fillMaxWidth()
            .height(44.dp),
        tabs = tabs,
        currentIndex = currentIndex,
        selectedTextColor = DealiColor.primary01,
        indicatorColor = DealiColor.primary01,
        onSelectTab = onSelectTab,
    )
}

/**
 * 가로 무한 스크롤 탭바 (g100)
 * @param modifier
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param currentIndex 현재 선택된 탭의 인덱스
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 */
@JvmName("tabBarSlider02String")
@Composable
fun tabBarSlider02(
    tabTitles: List<String>,
    currentIndex: Int,
    modifier: Modifier = Modifier,
    onSelectTab: (index: Int) -> Unit,
) {
    CoreScrollableTabBar(
        modifier = modifier
            .fillMaxWidth()
            .height(44.dp),
        tabTitles = tabTitles,
        currentIndex = currentIndex,
        selectedTextColor = DealiColor.g100,
        indicatorColor = DealiColor.g100,
        useBadge = false,
        onSelectTab = onSelectTab,
    )
}

/**
 * 가로 무한 스크롤 탭바 (g100)
 * @param modifier
 * @param tabs 각 탭의 타이틀 리스트
 * @param currentIndex 현재 선택된 탭의 인덱스
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 */
@JvmName("tabBarSlider02Tabs")
@Composable
fun tabBarSlider02(
    tabs: List<Tab>,
    currentIndex: Int,
    modifier: Modifier = Modifier,
    onSelectTab: (index: Int) -> Unit,
) {
    CoreScrollableTabBar(
        modifier = modifier
            .fillMaxWidth()
            .height(44.dp),
        tabs = tabs,
        currentIndex = currentIndex,
        selectedTextColor = DealiColor.g100,
        indicatorColor = DealiColor.g100,
        onSelectTab = onSelectTab,
    )
}

/**
 * Chip으로 이루어져 있는 탭바
 * @param modifier
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param currentIndex 현재 선택된 탭의 인덱스
 * @param onSelectTab 탭 선택 시 콜백
 */
@Composable
fun tabBarChip01(
    tabTitles: List<String>,
    currentIndex: Int,
    modifier: Modifier = Modifier,
    state: LazyListState = rememberLazyListState(),
    scope: CoroutineScope = rememberCoroutineScope(),
    onSelectTab: (index: Int) -> Unit,
) {
    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(DealiColor.primary04),
        state = state,
        contentPadding = PaddingValues(horizontal = 12.dp)
    ) {
        itemsIndexed(tabTitles) { index, title ->
            chipFilledSmall02(
                modifier = Modifier
                    .padding(horizontal = 4.dp, vertical = 12.dp),
                text = title,
                selected = index == currentIndex,
                onClick = {
                    scope.launch {
                        onSelectTab(index)
                        state.animateScrollToItem(index)
                    }
                },
            )
        }
    }
}

/**
 * 화면의 1/n 크기 고정된 탭바를 사용하는 레이아웃
 *
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 * @param initialPage 시작 시 노출할 탭 페이지 인덱스
 * @param userSwipeEnabled 좌우로 스와이프 시 탭 전환을 가능하게 할 지 여부
 * @param pageContent 탭 하단 페이지 컨텐츠 내용 Composable
 */
@JvmName("tabBarSegment01LayoutString")
@Composable
fun tabBarSegment01Layout(
    tabTitles: List<String>,
    userSwipeEnabled: Boolean,
    initialPage: Int = 0,
    onSelectTab: (index: Int) -> Unit,
    pageContent: @Composable PagerScope.(page: Int) -> Unit
) {
    CoreTabBarLayout(
        tabCount = tabTitles.size,
        onSelectTab = onSelectTab,
        userSwipeEnabled = userSwipeEnabled,
        initialPage = initialPage,
        tabBar = { currentIndex, onPageChange ->
            tabBarSegment01(
                tabTitles = tabTitles,
                currentIndex = currentIndex,
                onSelectTab = onPageChange
            )
        },
        pageContent = pageContent,
    )
}

/**
 * 화면의 1/n 크기 고정된 탭바를 사용하는 레이아웃
 *
 * @param tabs 각 탭의 타이틀 리스트
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 * @param initialPage 시작 시 노출할 탭 페이지 인덱스
 * @param userSwipeEnabled 좌우로 스와이프 시 탭 전환을 가능하게 할 지 여부
 * @param pageContent 탭 하단 페이지 컨텐츠 내용 Composable
 */
@JvmName("tabBarSegment01LayoutTabs")
@Composable
fun tabBarSegment01Layout(
    tabs: List<Tab>,
    userSwipeEnabled: Boolean,
    initialPage: Int = 0,
    onSelectTab: (index: Int) -> Unit,
    pageContent: @Composable (page: Int) -> Unit,
) {
    CoreTabBarLayout(
        tabCount = tabs.size,
        onSelectTab = onSelectTab,
        userSwipeEnabled = userSwipeEnabled,
        initialPage = initialPage,
        tabBar = { currentIndex, onPageChange ->
            tabBarSegment01(
                tabs = tabs,
                currentIndex = currentIndex,
                onSelectTab = onPageChange
            )
        },
        pageContent = pageContent,
    )
}

/**
 * 가로 무한 스크롤 탭바(g100)를 사용하는 레이아웃
 *
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 * @param initialPage 시작 시 노출할 탭 페이지 인덱스
 * @param userSwipeEnabled 좌우로 스와이프 시 탭 전환을 가능하게 할 지 여부
 * @param pageContent 탭 하단 페이지 컨텐츠 내용 Composable
 */
@JvmName("tabBarSlider02LayoutString")
@Composable
fun tabBarSlider02Layout(
    tabTitles: List<String>,
    userSwipeEnabled: Boolean,
    initialPage: Int = 0,
    onSelectTab: (index: Int) -> Unit,
    pageContent: @Composable PagerScope.(page: Int) -> Unit
) {
    CoreTabBarLayout(
        tabCount = tabTitles.size,
        onSelectTab = onSelectTab,
        userSwipeEnabled = userSwipeEnabled,
        initialPage = initialPage,
        tabBar = { currentIndex, onPageChange ->
            tabBarSlider02(
                tabTitles = tabTitles,
                currentIndex = currentIndex,
                onSelectTab = onPageChange
            )
        },
        pageContent = pageContent,
    )
}

/**
 * 가로 무한 스크롤 탭바(g100)를 사용하는 레이아웃
 *
 * @param tabs 각 탭의 타이틀 리스트
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 * @param initialPage 시작 시 노출할 탭 페이지 인덱스
 * @param userSwipeEnabled 좌우로 스와이프 시 탭 전환을 가능하게 할 지 여부
 * @param pageContent 탭 하단 페이지 컨텐츠 내용 Composable
 */
@JvmName("tabBarSlider02LayoutTabs")
@Composable
fun tabBarSlider02Layout(
    tabs: List<Tab>,
    userSwipeEnabled: Boolean,
    initialPage: Int = 0,
    onSelectTab: (index: Int) -> Unit,
    pageContent: @Composable (page: Int) -> Unit,
) {
    CoreTabBarLayout(
        tabCount = tabs.size,
        onSelectTab = onSelectTab,
        userSwipeEnabled = userSwipeEnabled,
        initialPage = initialPage,
        tabBar = { currentIndex, onPageChange ->
            tabBarSlider02(
                tabs = tabs,
                currentIndex = currentIndex,
                onSelectTab = onPageChange
            )
        },
        pageContent = pageContent,
    )
}

/**
 * 가로 무한 스크롤 탭바(primary01)를 사용하는 레이아웃
 *
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 * @param initialPage 시작 시 노출할 탭 페이지 인덱스
 * @param userSwipeEnabled 좌우로 스와이프 시 탭 전환을 가능하게 할 지 여부
 * @param pageContent 탭 하단 페이지 컨텐츠 내용 Composable
 */
@JvmName("tabBarSlider01LayoutString")
@Composable
fun tabBarSlider01Layout(
    tabTitles: List<String>,
    initialPage: Int = 0,
    userSwipeEnabled: Boolean = false,
    onSelectTab: (index: Int) -> Unit,
    pageContent: @Composable PagerScope.(page: Int) -> Unit
) {
    CoreTabBarLayout(
        tabCount = tabTitles.size,
        onSelectTab = onSelectTab,
        userSwipeEnabled = userSwipeEnabled,
        initialPage = initialPage,
        tabBar = { currentIndex, onPageChange ->
            tabBarSlider01(
                tabTitles = tabTitles,
                currentIndex = currentIndex,
                onSelectTab = onPageChange
            )
        },
        pageContent = pageContent,
    )
}

/**
 * 가로 무한 스크롤 탭바(primary01)를 사용하는 레이아웃
 *
 * @param tabs 각 탭의 타이틀 리스트
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 * @param initialPage 시작 시 노출할 탭 페이지 인덱스
 * @param userSwipeEnabled 좌우로 스와이프 시 탭 전환을 가능하게 할 지 여부
 * @param pageContent 탭 하단 페이지 컨텐츠 내용 Composable
 */
@JvmName("tabBarSlider01LayoutTabs")
@Composable
fun tabBarSlider01Layout(
    tabs: List<Tab>,
    initialPage: Int = 0,
    userSwipeEnabled: Boolean = false,
    onSelectTab: (index: Int) -> Unit,
    pageContent: @Composable (page: Int) -> Unit,
) {
    CoreTabBarLayout(
        tabCount = tabs.size,
        onSelectTab = onSelectTab,
        userSwipeEnabled = userSwipeEnabled,
        initialPage = initialPage,
        tabBar = { currentIndex, onPageChange ->
            tabBarSlider01(
                tabs = tabs,
                currentIndex = currentIndex,
                onSelectTab = onPageChange
            )
        },
        pageContent = pageContent,
    )
}


/**
 * Chip으로 이루어져 있는 탭바
 *
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 * @param initialPage 시작 시 노출할 탭 페이지 인덱스
 * @param userSwipeEnabled 좌우로 스와이프 시 탭 전환을 가능하게 할 지 여부
 * @param pageContent 탭 하단 페이지 컨텐츠 내용 Composable
 */
@Composable
fun tabBarChip01Layout(
    tabTitles: List<String>,
    initialPage: Int = 0,
    userSwipeEnabled: Boolean = false,
    onSelectTab: (index: Int) -> Unit,
    pageContent: @Composable PagerScope.(page: Int) -> Unit
) {
    CoreTabBarLayout(
        tabCount = tabTitles.size,
        onSelectTab = onSelectTab,
        userSwipeEnabled = userSwipeEnabled,
        initialPage = initialPage,
        tabBar = { currentIndex, onPageChange ->
            tabBarChip01(
                tabTitles = tabTitles,
                currentIndex = currentIndex,
                onSelectTab = onPageChange
            )
        },
        pageContent = pageContent,
    )
}

/**
 * tabBarSegment01에서 사용할 탭 클래스
 * @param text 각 탭의 타이틀
 * @param isShowBadge 각 탭에서 뱃지의 표시 여부
 */
data class Tab(
    val text: String,
    val isShowBadge: Boolean,
)

@Preview
@Composable
private fun PreviewTabBarSegment01() {
    tabBarSegment01(
        tabTitles = listOf("탭이름0", "탭이름1", "탭이름2"),
        currentIndex = 1,
        onSelectTab = {},
    )
}

@Preview
@Composable
private fun PreviewTabBarSlider01() {
    tabBarSlider01(
        tabTitles = listOf("탭이름0", "탭이름1", "탭이름2"),
        currentIndex = 1,
        onSelectTab = {},
    )
}

@Preview
@Composable
private fun PreviewTabBarSlider02() {
    tabBarSlider02(
        tabTitles = listOf("탭이름0", "탭이름1", "탭이름2"),
        currentIndex = 1,
        onSelectTab = {},
    )
}

@Preview
@Composable
private fun PreviewTabBarChip01() {
    tabBarChip01(
        tabTitles = listOf("서브0", "서브1", "서브2"),
        currentIndex = 1,
        onSelectTab = {},
    )
}

@Preview
@Composable
private fun PreviewTabBarSegment01Layout() {
    tabBarSegment01Layout(
        tabTitles = listOf("고정0", "고정1", "고정2"),
        onSelectTab = {},
        userSwipeEnabled = true,
        pageContent = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(DealiColor.primary03)
            ) {
                DealiText(
                    modifier = Modifier.align(Alignment.Center),
                    text = "탭 $it",
                    style = DealiFont.h1sb32,
                    color = DealiColor.g100
                )
            }
        }
    )
}

@Preview
@Composable
private fun PreviewTabBarSegment01Layout2Depth() {
    tabBarSegment01Layout(
        tabTitles = listOf("원뎁스0", "원뎁스1", "원뎁스2", "원뎁스3"),
        onSelectTab = {},
        userSwipeEnabled = true,
        pageContent = { page ->

            tabBarChip01Layout(
                tabTitles = listOf("투뎁스0", "투뎁스1", "투뎁스2", "투뎁스3", "투뎁스4"),
                onSelectTab = {},
                userSwipeEnabled = true
            ) { subPage ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(DealiColor.primary03)
                ) {
                    DealiText(
                        modifier = Modifier.align(Alignment.Center),
                        text = "${page} - $subPage",
                        style = DealiFont.h1sb32,
                        color = DealiColor.g100
                    )
                }
            }
        }
    )
}
