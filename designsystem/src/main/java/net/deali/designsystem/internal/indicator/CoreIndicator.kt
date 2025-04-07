package net.deali.designsystem.internal.indicator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.absoluteValue
import kotlin.math.sign

@Composable
internal fun CoreIndicator(
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
