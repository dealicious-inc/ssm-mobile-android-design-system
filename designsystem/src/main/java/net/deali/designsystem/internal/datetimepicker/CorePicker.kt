package net.deali.designsystem.internal.datetimepicker

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
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
import kotlinx.collections.immutable.ImmutableList
import net.deali.designsystem.util.internal.calculateHorizontalPadding
import net.deali.designsystem.util.internal.calculateVerticalPadding
import net.deali.designsystem.util.internal.plus
import kotlin.math.abs

/**
 * 날짜/시간 피커 공통 휠 컴포넌트. 아이템은 반복되지 않으며 첫 번째와 마지막 아이템이 스크롤의 양 끝이다.
 *
 * @param key 각 아이템을 식별할 key. 지정하면 [values]가 바뀌어도 값 기준으로 아이템을 추적한다.
 */
@OptIn(ExperimentalSnapperApi::class)
@Composable
internal fun <T> CorePicker(
    values: ImmutableList<T>,
    state: CorePickerState,
    itemHeight: Dp,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(),
    key: ((value: T) -> Any)? = null,
    decorationBox: @Composable BoxScope.(innerPicker: @Composable () -> Unit) -> Unit =
        @Composable { innerPicker -> innerPicker() },
    itemContent: @Composable BoxScope.(value: T) -> Unit
) {
    val lazyListState = state.lazyListState
    val snapperLayoutInfo = rememberLazyListSnapperLayoutInfo(lazyListState)

    LaunchedEffect(state) {
        snapshotFlow { state.centralVisibleIndexLayoutInfo?.index }.collect { index ->
            if (index != null) {
                state.currentIndex = index
            }
        }
    }

    BoxWithConstraints(modifier) {
        // 피커의 선택된 아이템이 중앙에 위치하도록 만들기 위한 필수적인 수직 패딩 값.
        val centralizerPadding by remember(maxHeight) {
            derivedStateOf {
                PaddingValues(vertical = (maxHeight / 2) - (itemHeight / 2))
            }
        }

        decorationBox {
            LazyColumn(
                modifier = Modifier
                    .size(maxWidth, maxHeight)
                    .padding(contentPadding.calculateVerticalPadding()),
                state = lazyListState,
                contentPadding = centralizerPadding + contentPadding.calculateHorizontalPadding(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                flingBehavior = rememberSnapperFlingBehavior(lazyListState)
            ) {
                val itemBoxModifier = Modifier
                    .fillMaxWidth()
                    .height(itemHeight)
                // key가 주어지면 values가 바뀌어도 LazyColumn이 아이템을 값 기준으로 추적한다.
                val itemKey: ((Int) -> Any)? = key?.let { keyOf -> { index -> keyOf(values[index]) } }
                items(count = values.size, key = itemKey) { index ->
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
