package net.deali.designsystem.internal.datetimepicker

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.unit.Dp
import dev.chrisbanes.snapper.ExperimentalSnapperApi
import dev.chrisbanes.snapper.LazyListSnapperLayoutInfo
import dev.chrisbanes.snapper.rememberLazyListSnapperLayoutInfo
import dev.chrisbanes.snapper.rememberSnapperFlingBehavior
import kotlin.math.abs

@OptIn(ExperimentalSnapperApi::class)
@Composable
internal fun <T> CorePicker(
    values: List<T>,
    state: CorePickerState,
    itemHeight: Dp,
    repeated: Boolean,
    modifier: Modifier = Modifier,
    decorationBox: @Composable BoxScope.(innerPicker: @Composable () -> Unit) -> Unit =
        @Composable { innerPicker -> innerPicker() },
    itemContent: @Composable BoxScope.(value: T) -> Unit
) {
    val lazyListState = state.lazyListState
    val snapperLayoutInfo = rememberLazyListSnapperLayoutInfo(lazyListState)

    LaunchedEffect(state) {
        snapshotFlow { state.centralVisibleIndexLayoutInfo?.index }.collect { index ->
            if (index != null) {
                state.currentIndex = if (repeated) index % values.size else index
            }
        }
    }

    if (repeated) {
        LaunchedEffect(Unit) {
            state.scrollToItem(calculateRepeatedLazyListMidIndex(
                index = state.currentIndex,
                valuesCount = values.size
            ))
        }

        LaunchedEffect(state.isScrollInProgress) {
            if (!state.isScrollInProgress) {
                state.scrollToItem(calculateRepeatedLazyListMidIndex(
                    index = state.currentIndex,
                    valuesCount = values.size
                ))
            }
        }
    }

    BoxWithConstraints(modifier) {
        decorationBox {
            LazyColumn(
                modifier = Modifier.size(maxWidth, maxHeight),
                state = lazyListState,
                contentPadding = PaddingValues(vertical = (maxHeight / 2) - (itemHeight / 2)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                flingBehavior = rememberSnapperFlingBehavior(lazyListState)
            ) {
                val itemBoxModifier = Modifier
                    .fillMaxWidth()
                    .height(itemHeight)
                if (repeated) {
                    items(count = Int.MAX_VALUE) { index ->
                        Box(
                            modifier = itemBoxModifier.pickerAlpha(
                                index = index,
                                itemHeight = itemHeight,
                                lazyListState = lazyListState,
                                snapperLayoutInfo = snapperLayoutInfo
                            ),
                            content = { itemContent(values[index % values.size]) }
                        )
                    }
                } else {
                    items(count = values.size) { index ->
                        Box(
                            modifier = itemBoxModifier.pickerAlpha(
                                index = index,
                                itemHeight = itemHeight,
                                lazyListState = lazyListState,
                                snapperLayoutInfo = snapperLayoutInfo
                            ),
                            content = { itemContent(values[index]) }
                        )
                    }
                }
            }
        }
    }
}

internal fun calculateRepeatedLazyListMidIndex(index: Int, valuesCount: Int): Int {
    return valuesCount * 1000 + index
}

@OptIn(ExperimentalSnapperApi::class)
@Stable
private fun Modifier.pickerAlpha(
    index: Int,
    itemHeight: Dp,
    lazyListState: LazyListState,
    snapperLayoutInfo: LazyListSnapperLayoutInfo
): Modifier {
    return this.composed(
        inspectorInfo = {
            debugInspectorInfo {
                name = "pickerAlpha"
                properties["lazyListState"] = lazyListState
                properties["snapperLayoutInfo"] = snapperLayoutInfo
                properties["index"] = index
            }
        },
        factory = {
            val itemHeightPx = with(LocalDensity.current) { itemHeight.toPx() }
            val absoluteDistanceToIndexSnap = abs(snapperLayoutInfo.distanceToIndexSnap(index))
            Modifier.alpha(
                alpha = if (absoluteDistanceToIndexSnap < itemHeightPx) {
                    1f - (absoluteDistanceToIndexSnap / itemHeightPx) + 0.25f
                } else {
                    0.25f
                }
            )
        }
    )
}
