package net.deali.designsystem.internal.tabbar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.HorizontalDivider
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
internal fun CoreFixedTabBar(
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
            modifier = Modifier.align(Alignment.BottomCenter),
            color = DealiColor.g30
        )

        TabRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
                .background(DealiColor.primary04),
            selectedTabIndex = currentIndex,
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(
                    modifier = Modifier
                        .tabIndicatorOffset(tabPositions[currentIndex])
                        .background(DealiColor.secondary02),
                    height = 2.dp,
                    color = indicatorColor
                )
            },
            tabs = {
                tabTitles.forEachIndexed { index, title ->
                    TabItem(
                        modifier = Modifier,
                        title = title,
                        isSelected = index == currentIndex,
                        selectedTextColor = selectedTextColor,
                        useBadge = useBadge,
                        onClick = remember {
                            {
                                onSelectTab(index)
                            }
                        }
                    )
                }
            }
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

        ScrollableTabRow(
            modifier = Modifier
                .fillMaxWidth(),
            selectedTabIndex = currentIndex,
            backgroundColor = DealiColor.primary04,
            edgePadding = 4.dp,
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(
                    modifier = Modifier
                        .tabIndicatorOffset(tabPositions[currentIndex])
                        .padding(horizontal = 12.dp),
                    height = 2.dp,
                    color = indicatorColor
                )
            },
        ) {
            tabTitles.forEachIndexed { index, title ->
                TabItem(
                    modifier = Modifier.padding(horizontal = 12.dp),
                    title = title,
                    isSelected = currentIndex == index,
                    selectedTextColor = selectedTextColor,
                    useBadge = useBadge,
                    onClick = remember {
                        { onSelectTab(index) }
                    },
                )
            }
        }

//        LazyRow(
//            state = lazyListState,
//            horizontalArrangement = Arrangement.spacedBy(20.dp), //Badge 영역 좌우 2dp씩 TabItem이 들고 있음.
//            contentPadding = PaddingValues(horizontal = 16.dp)
//
//        ) {
//            itemsIndexed(tabTitles) { index, title ->
//                TabItem(
//                    modifier = Modifier,
//                    title = title,
//                    isSelected = currentIndex == index,
//                    selectedTextColor = selectedTextColor,
//                    indicatorColor = indicatorColor,
//                    useBadge = useBadge,
//                    onClick = remember {
//                        { onSelectTab(index) }
//                    },
//                )
//            }
//        }
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
        modifier = modifier
            .width(IntrinsicSize.Max)
            .fillMaxHeight()
            .background(DealiColor.primary04)
            .clickable(onClick = onClick),
    ) {
        if (isSelected) {
            Box(
                modifier = Modifier.align(Alignment.Center)
            ) {
                DealiText(
                    modifier = Modifier
                        .padding(start = 2.dp, end = 2.dp)
                        .align(Alignment.Center),
                    text = title,
                    style = DealiFont.b1sb15,
                    color = selectedTextColor,
                )

                if (useBadge) {
                    Box(
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .size(4.dp)
                            .clip(CircleShape)
                            .background(DealiColor.primary01)
                    )
                }
            }
        } else {
            DealiText(
                modifier = Modifier
                    .padding(start = 2.dp, end = 2.dp)
                    .align(Alignment.Center),
                text = title,
                style = DealiFont.b1r15,
                color = DealiColor.g100,
            )
        }
    }
}

@Preview
@Composable
fun PreviewCoreScrollableTabBar() {
    val titles = listOf("탭 타이틀1", "탭 타이틀2", "탭 타이틀3", "탭 타이틀4", "탭 타이틀5", "탭 타이틀6")

    CoreScrollableTabBar(
        modifier = Modifier
            .height(44.dp)
            .background(DealiColor.primary05),
        tabTitles = titles,
        currentIndex = 1,
        selectedTextColor = DealiColor.primary01,
        indicatorColor = DealiColor.primary01,
        useBadge = true,
        onSelectTab = {}
    )
}