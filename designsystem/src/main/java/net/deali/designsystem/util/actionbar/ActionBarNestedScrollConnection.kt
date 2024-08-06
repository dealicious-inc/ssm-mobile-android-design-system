package net.deali.designsystem.util.actionbar

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
 *     val nestedScrollConnection = rememberActionBarNestedScrollConnection(
 *         actionBarHeightPx = with(LocalDensity.current) { ACTION_BAR_HEIGHT.toPx() },
 *         scrollState = lazyState,
 *     )
 *
 *     val actionBarHeight by animateDpAsState(
 *         targetValue = with(LocalDensity.current) {
 *             nestedScrollConnection.actionBarOffset.toDp()
 *         },
 *         label = ""
 *     )
 *
 *     Column(
 *         modifier = Modifier
 *             .nestedScroll(nestedScrollConnection)
 *     ) {
 *         ActionBar(
 *             modifier = Modifier
 *                 .height(actionBarHeight)
 *             ...
 *         )
 *
 *         LazyColumn(
 *             modifier = Modifier
 *                 .weight(1f),
 *             state = lazyState,
 *             ...
 *         )
 *     }
 *
 * @param actionBarHeightPx 액션바 높이
 */
abstract class ActionBarNestedScrollConnection(
    actionBarHeightPx: Float
) : NestedScrollConnection {
    var actionBarOffset by mutableFloatStateOf(actionBarHeightPx)
}

/**
 * ActionBarNestedScrollConnection 생성 함수
 */
@Composable
fun rememberActionBarNestedScrollConnection(
    actionBarHeightPx: Float,
): ActionBarNestedScrollConnection {
    val nestedScrollConnection = remember {
        object : ActionBarNestedScrollConnection(actionBarHeightPx) {
            override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
                val delta = available.y
                val newOffset = actionBarOffset + delta
                actionBarOffset = newOffset.coerceIn(0f, actionBarHeightPx)

                return if (abs(actionBarOffset) == actionBarHeightPx || abs(actionBarOffset) == 0f) {
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
 * ActionBarNestedScrollConnection 생성 함수
 * @param scrollState ScrollableState를 통해 스크롤이 멈췄을 경우 행동을 추가 (snap)
 */
@Composable
fun rememberActionBarNestedScrollConnection(
    actionBarHeightPx: Float,
    scrollState: ScrollableState,
): ActionBarNestedScrollConnection {
    val nestedScrollConnection = rememberActionBarNestedScrollConnection(actionBarHeightPx)

    LaunchedEffect(scrollState.isScrollInProgress) {
        if (!scrollState.isScrollInProgress) {
            nestedScrollConnection.actionBarOffset = if (nestedScrollConnection.actionBarOffset > actionBarHeightPx / 2) {
                actionBarHeightPx
            } else {
                0f
            }
        }
    }

    return nestedScrollConnection
}
