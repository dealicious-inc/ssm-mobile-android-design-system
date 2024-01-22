@file:OptIn(ExperimentalFoundationApi::class)

package net.deali.designsystem.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import kotlin.math.absoluteValue
import kotlin.math.sign

@Composable
fun IndicatorPinkDot(
    pageCount: Int,
    pageIndexMapping: (Int) -> Int,
    modifier: Modifier = Modifier,
    pagerState: PagerState = rememberPagerState()
) {
    IndicatorDot(
        modifier = modifier,
        pagerState = pagerState,
        pageCount = pageCount,
        activeColor = DealiColor.primary01,
        inactiveColor = DealiColor.g30,
        indicatorSize = 6.dp,
        space = 6.dp,
        pageIndexMapping = pageIndexMapping
    )
}

@Composable
fun IndicatorWhiteDot(
    pageCount: Int,
    pageIndexMapping: (Int) -> Int,
    modifier: Modifier = Modifier,
    pagerState: PagerState = rememberPagerState()
) {
    IndicatorDot(
        modifier = modifier,
        pagerState = pagerState,
        pageCount = pageCount,
        activeColor = DealiColor.primary04,
        inactiveColor = DealiColor.w50,
        indicatorSize = 6.dp,
        space = 6.dp,
        pageIndexMapping = pageIndexMapping
    )
}

@Composable
private fun IndicatorDot(
    pagerState: PagerState,
    pageCount: Int,
    activeColor: Color,
    inactiveColor: Color,
    indicatorSize: Dp,
    space: Dp,
    modifier: Modifier = Modifier,
    pageIndexMapping: (Int) -> Int
) {
    val currentDensity = LocalDensity.current

    val indicatorSizePx = currentDensity.run { indicatorSize.roundToPx().toFloat() }
    val spacePx = currentDensity.run { space.roundToPx() }

    Box(
        modifier = modifier,
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.spacedBy(space),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val indicatorModifier = Modifier
                .size(6.dp)
                .background(inactiveColor, CircleShape)

            repeat(pageCount) {
                Spacer(modifier = indicatorModifier)
            }
        }

        Spacer(
            Modifier
                .offset {
                    val position = pageIndexMapping(pagerState.currentPage)
                    val offset = pagerState.currentPageOffsetFraction
                    val next = pageIndexMapping(pagerState.currentPage + offset.sign.toInt())
                    val scrollPosition = ((next - position) * offset.absoluteValue + position)
                        .coerceIn(
                            0f, (pageCount - 1)
                                .coerceAtLeast(0)
                                .toFloat()
                        )

                    IntOffset(
                        x = ((spacePx + indicatorSizePx) * scrollPosition).toInt(),
                        y = 0
                    )
                }
                .size(indicatorSize)
                .background(
                    color = activeColor,
                    shape = CircleShape
                )
        )
    }
}

@Composable
fun IndicatorNumber(
    pageCount: Int,
    modifier: Modifier = Modifier,
    pagerDataState: PagerDataState = rememberPageDataState(),
    pagerState: PagerState = rememberPagerState()
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        DealiText(
            text = String.format("%02d", pagerDataState.pageMapper(pagerState.currentPage) + 1),
            style = DealiFont.b3sb13,
            color = DealiColor.primary04
        )

        Spacer(
            modifier = Modifier
                .width(1.dp)
                .height(10.dp)
                .background(DealiColor.primary04)
        )

        DealiText(
            text = String.format("%02d", pageCount),
            style = DealiFont.b3r13,
            color = DealiColor.primary04
        )
    }
}

@Composable
fun IndicatorPagination(
    pageCount: Int,
    modifier: Modifier = Modifier,
    pagerDataState: PagerDataState = rememberPageDataState(),
    pagerState: PagerState = rememberPagerState()
) {
    Row(
        modifier = modifier
            .background(
                color = DealiColor.b40,
                shape = RoundedCornerShape(14.dp)
            )
            .padding(
                horizontal = 8.dp,
                vertical = 4.dp
            ),
        horizontalArrangement = Arrangement.spacedBy(2.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        DealiText(
            text = String.format("%02d", pagerDataState.pageMapper(pagerState.currentPage) + 1),
            style = DealiFont.b3sb13,
            color = DealiColor.primary04
        )

        DealiText(
            text = "/",
            style = DealiFont.b3r13,
            color = DealiColor.w50
        )

        DealiText(
            text = String.format("%02d", pageCount),
            style = DealiFont.b3r13,
            color = DealiColor.w50
        )
    }
}

@Composable
fun rememberPageDataState(
    initialPageCount: Int = 0,
    initialMaxCount: Int = Int.MAX_VALUE,
    initialStartIndex: Int = initialMaxCount / 2
): PagerDataState {
    return rememberSaveable(saver = PagerDataState.Saver) {
        PagerDataState(
            pageCount = initialPageCount,
            maxCount = initialMaxCount,
            startIndex = initialStartIndex
        )
    }
}

class PagerDataState(
    val pageCount: Int = 0,
    val maxCount: Int = Int.MAX_VALUE,
    val startIndex: Int = maxCount / 2
) {
    val pagerCount: Int
        get() = if (pageCount > 1) maxCount else pageCount

    fun pageMapper(index: Int) = (index - startIndex).floorMod(pageCount)

    private fun Int.floorMod(other: Int): Int = when (other) {
        0 -> this
        else -> this - floorDiv(other) * other
    }

    companion object {
        val Saver: Saver<PagerDataState, List<Int>> = Saver(
            save = {
                listOf(
                    it.pageCount,
                    it.maxCount,
                    it.startIndex
                )
            },
            restore = {
                PagerDataState(
                    pageCount = it[0],
                    maxCount = it[1],
                    startIndex = it[2]
                )
            }
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun IndicatorDotPinkPreview() {
    IndicatorPinkDot(
        modifier = Modifier
            .padding(10.dp),
        pageCount = 5,
        pageIndexMapping = { it }
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XBEC5D2)
private fun IndicatorDotWhitePreview() {
    IndicatorWhiteDot(
        modifier = Modifier
            .padding(10.dp),
        pageCount = 5,
        pageIndexMapping = { it }
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XBEC5D2)
private fun IndicatorNumberPreview() {
    IndicatorNumber(
        modifier = Modifier
            .padding(10.dp),
        pageCount = 5
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XBEC5D2)
private fun IndicatorPaginationPreview() {
    IndicatorPagination(
        modifier = Modifier
            .padding(10.dp),
        pageCount = 5
    )
}
