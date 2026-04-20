package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.PagerScope
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import net.deali.designsystem.R
import net.deali.designsystem.internal.tabbar.CoreFixedTabBar
import net.deali.designsystem.internal.tabbar.CoreScrollableTabBar
import net.deali.designsystem.internal.tabbar.CoreTabBarLayout
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.util.animation.animateScrollAndCentralizeItem

val TAB_BAR_CONTENT_PADDING = 16.dp

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
        modifier = modifier
            .height(44.dp)
            .background(DealiColor.primary04),
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
        modifier = modifier
            .height(44.dp)
            .background(DealiColor.primary04),
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
            .height(44.dp)
            .background(DealiColor.primary04),
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
            .height(44.dp)
            .background(DealiColor.primary04),
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
            .height(44.dp)
            .background(DealiColor.primary04),
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
            .height(44.dp)
            .background(DealiColor.primary04),
        tabs = tabs,
        currentIndex = currentIndex,
        selectedTextColor = DealiColor.g100,
        indicatorColor = DealiColor.g100,
        onSelectTab = onSelectTab,
    )
}

/**
 * 검정 Chip으로 이루어져 있는 탭바
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param currentIndex 현재 선택된 탭의 인덱스
 * @horizontalContentPadding 탭 좌우 여백 간격
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 */
@Composable
fun tabBarChip01(
    tabTitles: List<String>,
    currentIndex: Int,
    modifier: Modifier = Modifier,
    state: LazyListState = rememberLazyListState(),
    scope: CoroutineScope = rememberCoroutineScope(),
    backgroundColor: Color = DealiColor.primary04,
    onSelectTab: (index: Int) -> Unit,
) {
    val contentPaddingPx = with(LocalDensity.current) {
        TAB_BAR_CONTENT_PADDING.toPx()
    }

    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(backgroundColor),
        state = state,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = TAB_BAR_CONTENT_PADDING)
    ) {
        itemsIndexed(tabTitles) { index, title ->
            chipFilledSmall02(
                modifier = Modifier
                    .padding(vertical = 12.dp),
                text = title,
                selected = index == currentIndex,
                onClick = {
                    scope.launch {
                        onSelectTab(index)
                        state.animateScrollAndCentralizeItem(index, contentPaddingPx)
                    }
                },
            )
        }
    }
}

/**
 * Primary 색상 Chip으로 이루어져 있는 탭바
 * @param tabTitles 각 탭의 타이틀 리스트
 * @param currentIndex 현재 선택된 탭의 인덱스
 * @horizontalContentPadding 탭 좌우 여백 간격
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 */
@Composable
fun tabBarChip02(
    tabTitles: List<String>,
    currentIndex: Int,
    modifier: Modifier = Modifier,
    state: LazyListState = rememberLazyListState(),
    scope: CoroutineScope = rememberCoroutineScope(),
    backgroundColor: Color = DealiColor.primary04,
    onSelectTab: (index: Int) -> Unit,
) {
    val contentPaddingPx = with(LocalDensity.current) {
        TAB_BAR_CONTENT_PADDING.toPx()
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(backgroundColor),
    ) {
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            state = state,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(horizontal = TAB_BAR_CONTENT_PADDING)
        ) {
            itemsIndexed(tabTitles) { index, title ->
                chipFilledSmall03(
                    modifier = Modifier
                        .padding(vertical = 12.dp),
                    text = title,
                    selected = index == currentIndex,
                    onClick = {
                        scope.launch {
                            onSelectTab(index)
                            state.animateScrollAndCentralizeItem(index, contentPaddingPx)
                        }
                    },
                )
            }
        }

        HorizontalDivider(color = DealiColor.g20)
    }
}

/**
 * 이미지 + 텍스트 형태의 이미지칩으로 이루어진 가로 스크롤 탭바
 * @param imgChips [ImgChip] 리스트
 * @param currentIndex 현재 선택된 탭의 인덱스
 * @param onSelectTab 탭 클릭 or 탭 스와이프 시 콜백
 */
@Composable
fun tabBarImgChip(
    imgChips: List<ImgChip>,
    currentIndex: Int,
    onSelectTab: (index: Int) -> Unit,
    modifier: Modifier = Modifier,
    backgroundColor: Color = DealiColor.primary04,
    state: LazyListState = rememberLazyListState(),
    scope: CoroutineScope = rememberCoroutineScope(),
) {
    val paddingPx = with(LocalDensity.current) {
        TAB_BAR_CONTENT_PADDING.toPx()
    }

    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(backgroundColor),
        state = state,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = TAB_BAR_CONTENT_PADDING)
    ) {
        itemsIndexed(imgChips) { index, imgChip ->
            imgChipSmall01(
                modifier = Modifier
                    .padding(vertical = 12.dp),
                text = imgChip.text,
                imageUrl = imgChip.imageUrl,
                subContent = imgChip.subContent,
                selected = index == currentIndex,
                placeholder = imgChip.placeholder ?: R.drawable.ic_home_filled,
                rightIcon = imgChip.rightIcon,
                rightIconColor = imgChip.rightIconColor ?: Color.Unspecified,
                onClick = {
                    scope.launch {
                        onSelectTab(index)

                        //select 된 후에 칩 크기가 변한 후 스크롤 애니메이션을 실행하기 위해 100ms 딜레이 추가
                        delay(100)
                        state.animateScrollAndCentralizeItem(index, paddingPx)
                    }
                },
                onRightIconClick = imgChip.onRightIconClick,
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
    modifier: Modifier = Modifier,
    initialPage: Int = 0,
    pagerState: PagerState = rememberPagerState(
        initialPage = initialPage,
        pageCount = { tabTitles.size }
    ),
    onSelectTab: (index: Int) -> Unit,
    pageContent: @Composable PagerScope.(page: Int) -> Unit
) {
    CoreTabBarLayout(
        modifier = modifier
            .background(DealiColor.primary04),
        pagerState = pagerState,
        onSelectTab = onSelectTab,
        userSwipeEnabled = userSwipeEnabled,
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
    modifier: Modifier = Modifier,
    initialPage: Int = 0,
    pagerState: PagerState = rememberPagerState(
        initialPage = initialPage,
        pageCount = { tabs.size }
    ),
    onSelectTab: (index: Int) -> Unit,
    pageContent: @Composable PagerScope.(page: Int) -> Unit
) {
    CoreTabBarLayout(
        modifier = modifier
            .background(DealiColor.primary04),
        pagerState = pagerState,
        onSelectTab = onSelectTab,
        userSwipeEnabled = userSwipeEnabled,
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
    modifier: Modifier = Modifier,
    initialPage: Int = 0,
    pagerState: PagerState = rememberPagerState(
        initialPage = initialPage,
        pageCount = { tabTitles.size }
    ),
    onSelectTab: (index: Int) -> Unit,
    pageContent: @Composable PagerScope.(page: Int) -> Unit
) {
    CoreTabBarLayout(
        modifier = modifier
            .background(DealiColor.primary04),
        pagerState = pagerState,
        onSelectTab = onSelectTab,
        userSwipeEnabled = userSwipeEnabled,
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
    modifier: Modifier = Modifier,
    initialPage: Int = 0,
    pagerState: PagerState = rememberPagerState(
        initialPage = initialPage,
        pageCount = { tabs.size }
    ),
    onSelectTab: (index: Int) -> Unit,
    pageContent: @Composable PagerScope.(page: Int) -> Unit
) {
    CoreTabBarLayout(
        modifier = modifier
            .background(DealiColor.primary04),
        pagerState = pagerState,
        onSelectTab = onSelectTab,
        userSwipeEnabled = userSwipeEnabled,
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
    userSwipeEnabled: Boolean,
    modifier: Modifier = Modifier,
    initialPage: Int = 0,
    pagerState: PagerState = rememberPagerState(
        initialPage = initialPage,
        pageCount = { tabTitles.size }
    ),
    onSelectTab: (index: Int) -> Unit,
    pageContent: @Composable PagerScope.(page: Int) -> Unit
) {
    CoreTabBarLayout(
        modifier = modifier
            .background(DealiColor.primary04),
        pagerState = pagerState,
        onSelectTab = onSelectTab,
        userSwipeEnabled = userSwipeEnabled,
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
    userSwipeEnabled: Boolean,
    modifier: Modifier = Modifier,
    initialPage: Int = 0,
    pagerState: PagerState = rememberPagerState(
        initialPage = initialPage,
        pageCount = { tabs.size }
    ),
    onSelectTab: (index: Int) -> Unit,
    pageContent: @Composable PagerScope.(page: Int) -> Unit
) {
    CoreTabBarLayout(
        modifier = modifier
            .background(DealiColor.primary04),
        pagerState = pagerState,
        onSelectTab = onSelectTab,
        userSwipeEnabled = userSwipeEnabled,
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
    userSwipeEnabled: Boolean,
    modifier: Modifier = Modifier,
    initialPage: Int = 0,
    pagerState: PagerState = rememberPagerState(
        initialPage = initialPage,
        pageCount = { tabTitles.size }
    ),
    onSelectTab: (index: Int) -> Unit,
    pageContent: @Composable PagerScope.(page: Int) -> Unit
) {
    CoreTabBarLayout(
        modifier = modifier
            .background(DealiColor.primary04),
        pagerState = pagerState,
        onSelectTab = onSelectTab,
        userSwipeEnabled = userSwipeEnabled,
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
@Stable
data class Tab(
    val text: String,
    val isShowBadge: Boolean,
)

/**
 * tabBarImgChip에서 사용할 이미지 칩 클래스
 *
 * @param imageUrl 이미지 URL
 * @param text 이미지 칩 텍스트
 * @param modifier Modifier
 * @param placeholder default 이미지 리소스 (없을 시 ic_home_filled 로 처리)
 * @param rightIcon 오른쪽 아이콘 리소스 id
 * @param rightIconColor 오른쪽 아이콘 있을 경우 색상
 * @param subContent 이미지 칩 하단 추가 컨텐츠
 * @param onRightIconClick 오른쪽 아이콘 클릭 시 콜백
 */
@Stable
data class ImgChip(
    val imageUrl: String,
    val text: String,
    val modifier: Modifier = Modifier,
    @DrawableRes val placeholder: Int? = null,
    @DrawableRes val rightIcon: Int? = null,
    val rightIconColor: Color? = Color.Unspecified,
    val subContent: @Composable (() -> Unit)? = null,
    val onRightIconClick: (() -> Unit)? = null,
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
private fun PreviewTabBarChip02() {
    tabBarChip02(
        tabTitles = listOf("서브0", "서브1", "서브2"),
        currentIndex = 1,
        onSelectTab = {},
    )
}

@Preview
@Composable
private fun PreviewTabBarImageChip() {
    val imgChips = List(5) { index ->
        ImgChip(
            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png",
            text = "이미지칩$index",
        )
    }

    tabBarImgChip(
        imgChips = imgChips,
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
                        text = "$page - $subPage",
                        style = DealiFont.h1sb32,
                        color = DealiColor.g100
                    )
                }
            }
        }
    )
}
