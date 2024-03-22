@file:OptIn(ExperimentalFoundationApi::class, ExperimentalFoundationApi::class)

package net.deali.designsystem.internal.tabbar

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
    selectedIndicatorColor: Color,
    textModifier: Modifier = Modifier,
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
                .fillMaxWidth(),
            selectedTabIndex = currentIndex,
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(
                    modifier = Modifier.pagerTabIndicatorOffset(
                        pagerState = pagerState,
                        tabPositions = tabPositions
                    ),
                    height = indicatorThickness,
                    color = indicatorColor
                )
            },
            tabs = tabContent
        ) {
            
        }




        //
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(20.dp), //Badge 영역 좌우 2dp씩 TabItem이 들고 있음.
        ) {
            tabTitles.forEachIndexed { index, title ->
                TabItem(
                    modifier = textModifier.weight(1f),
                    title = title,
                    isSelected = currentIndex == index,
                    selectedTextColor = selectedTextColor,
                    selectedIndicatorColor = selectedIndicatorColor,
                    useBadge = useBadge,
                    onClick = remember {
                        { onSelectTab(index) }
                    },
                )
            }
        }
    }
}

@Composable
internal fun CoreScrollableTabBar(
    modifier: Modifier = Modifier,
    tabTitles: List<String>,
    currentIndex: Int,
    selectedTextColor: Color,
    selectedIndicatorColor: Color,
    textModifier: Modifier = Modifier,
    useBadge: Boolean,
    onSelectTab: (index: Int) -> Unit,
) {
    val lazyListState = rememberLazyListState()

    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(DealiColor.primary04)

    ) {
        HorizontalDivider(
            modifier = Modifier.align(Alignment.BottomCenter),
            color = DealiColor.g30
        )

        LazyRow(
            state = lazyListState,
            horizontalArrangement = Arrangement.spacedBy(20.dp), //Badge 영역 좌우 2dp씩 TabItem이 들고 있음.
            contentPadding = PaddingValues(horizontal = 16.dp)

        ) {
            itemsIndexed(tabTitles) { index, title ->
                TabItem(
                    modifier = Modifier,
                    title = title,
                    isSelected = currentIndex == index,
                    selectedTextColor = selectedTextColor,
                    selectedIndicatorColor = selectedIndicatorColor,
                    textModifier = textModifier,
                    useBadge = useBadge,
                    onClick = remember {
                        { onSelectTab(index) }
                    },
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
    selectedTextColor: Color,
    selectedIndicatorColor: Color,
    textModifier: Modifier = Modifier,
    useBadge: Boolean,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier
            .width(IntrinsicSize.Max)
            .fillMaxHeight()
            .clickable(onClick = onClick),
    ) {
        if (isSelected) {
            Box(
                modifier = Modifier.align(Alignment.Center)
            ) {
                DealiText(
                    modifier = textModifier
                        .padding(start = 2.dp, end = 2.dp)
                        .align(Alignment.Center),
                    text = title,
                    style = DealiFont.b1sb15,
                    color = selectedTextColor,
                )

                if (useBadge) {
                    Box(
                        modifier = textModifier
                            .align(Alignment.TopEnd)
                            .size(4.dp)
                            .clip(CircleShape)
                            .background(DealiColor.primary01)
                    )
                }
            }

            HorizontalDivider(
                modifier = Modifier
                    .padding(horizontal = 2.dp)
                    .align(Alignment.BottomCenter),
                color = selectedIndicatorColor,
                thickness = 2.dp,
            )

        } else {
            DealiText(
                modifier = textModifier
                    .padding(start = 2.dp, end = 2.dp)
                    .align(Alignment.Center),
                text = title,
                style = DealiFont.b1r15,
                color = DealiColor.g100,
            )
        }
    }
}