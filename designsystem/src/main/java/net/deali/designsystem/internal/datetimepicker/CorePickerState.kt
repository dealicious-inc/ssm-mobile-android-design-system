package net.deali.designsystem.internal.datetimepicker

import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.gestures.ScrollScope
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.lazy.LazyListItemInfo
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

@Stable
internal class CorePickerState(initialIndex: Int = 0) : ScrollableState {
    val lazyListState = LazyListState(firstVisibleItemIndex = initialIndex)

    private var _currentIndex: Int by mutableStateOf(initialIndex)

    var currentIndex: Int
        get() = _currentIndex
        internal set(value) {
            if (value != _currentIndex) {
                _currentIndex = value
            }
        }

    internal val centralVisibleIndexLayoutInfo: LazyListItemInfo?
        get() {
            val visibleItemsInfo = lazyListState.layoutInfo.visibleItemsInfo
            if (visibleItemsInfo.isEmpty()) return null
            return visibleItemsInfo.find {
                // offset 0 == 가운데 위치
                // 1픽셀 정도 오차범위는 발생할 수 있어서 여유있게 -2 ~ 2까지 커버하도록 구현
                it.offset in -2..2
            }
        }

    override val isScrollInProgress: Boolean
        get() = lazyListState.isScrollInProgress

    override fun dispatchRawDelta(delta: Float): Float =
        lazyListState.dispatchRawDelta(delta)

    override suspend fun scroll(
        scrollPriority: MutatePriority,
        block: suspend ScrollScope.() -> Unit
    ): Unit = lazyListState.scroll(scrollPriority, block)

    suspend fun scrollToItem(index: Int): Unit =
        lazyListState.scrollToItem(index, scrollOffset = 0)

    suspend fun animateScrollToItem(index: Int): Unit =
        lazyListState.animateScrollToItem(index, scrollOffset = 0)
}
