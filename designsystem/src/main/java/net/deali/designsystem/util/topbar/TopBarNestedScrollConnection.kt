package net.deali.designsystem.util.topbar

import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import kotlin.math.abs


/**
 * 액션바 높이를 고려한 NestedScrollConnection
 *
 * ex)
 *     val lazyState = rememberLazyListState()
 *     val nestedScrollConnection = rememberTopBarNestedScrollConnection(
 *         topBarHeightPx = with(LocalDensity.current) { TOP_BAR_HEIGHT.toPx() },
 *         scrollState = lazyState,
 *     )
 *
 *     val topBarOffset by animateFloatAsState(
 *         targetValue = nestedScrollConnection.topBarOffset,
 *         label = ""
 *     )
 *
 *     Box(
 *         modifier = Modifier
 *             .nestedScroll(nestedScrollConnection)
 *     ) {
 *         LazyColumn(
 *             modifier = Modifier
 *                 .fillMaxSize()
 *                 .graphicsLayer { translationY = topBarOffset },
 *             state = lazyState,
 *             ...
 *         )
 *
 *         TopBar(
 *             modifier = Modifier
 *                 .height(TOP_BAR_HEIGHT)
 *                 .graphicsLayer { translationY = topBarOffset - TOP_BAR_HEIGHT.toPx() }
 *             ...
 *         )
 *     }
 *
 * @param topBarHeightPx 액션바 높이
 */
abstract class TopBarNestedScrollConnection(
    topBarHeightPx: Float
) : NestedScrollConnection {
    var topBarOffset by mutableFloatStateOf(topBarHeightPx)
}

/**
 * TopBarNestedScrollConnection 생성 함수
 */
@Composable
fun rememberTopBarNestedScrollConnection(
    topBarHeightPx: Float,
): TopBarNestedScrollConnection {
    val nestedScrollConnection = remember {
        object : TopBarNestedScrollConnection(topBarHeightPx) {
            override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
                val delta = available.y
                val newOffset = topBarOffset + delta
                topBarOffset = newOffset.coerceIn(0f, topBarHeightPx)

                return if (abs(topBarOffset) == topBarHeightPx || abs(topBarOffset) == 0f) {
                    super.onPreScroll(available, source)
                } else {
                    available
                }
            }
        }
    }

    return nestedScrollConnection
}

/**
 * TopBarNestedScrollConnection 생성 함수
 * @param scrollState ScrollableState를 통해 스크롤이 멈췄을 경우 행동을 추가 (snap)
 */
@Composable
fun rememberTopBarNestedScrollConnection(
    topBarHeightPx: Float,
    scrollState: ScrollableState,
): TopBarNestedScrollConnection {
    val nestedScrollConnection = rememberTopBarNestedScrollConnection(topBarHeightPx)

    LaunchedEffect(scrollState.isScrollInProgress) {
        if (!scrollState.isScrollInProgress) {
            nestedScrollConnection.topBarOffset = if (nestedScrollConnection.topBarOffset > topBarHeightPx / 2) {
                topBarHeightPx
            } else {
                0f
            }
        }
    }

    return nestedScrollConnection
}
