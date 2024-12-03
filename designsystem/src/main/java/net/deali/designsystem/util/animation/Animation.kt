package net.deali.designsystem.util.animation

import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.lazy.LazyListState

/**
 * LazyListState를 사용하여 스크롤을 애니메이션하고, 해당 아이템을 중앙에 위치하도록 합니다.
 *
 * @param index 중앙에 위치시킬 아이템의 인덱스
 * @param contentPaddingPx 중앙값 계산을 위한 LazyRow의 horizontal contentPadding
 */
suspend fun LazyListState.animateScrollAndCentralizeItem(index: Int, contentPaddingPx: Float) {
    val itemInfo = this.layoutInfo.visibleItemsInfo.firstOrNull { it.index == index }
    if (itemInfo != null) {
        val center = (layoutInfo.viewportEndOffset / 2) - (contentPaddingPx / 2)
        val childCenter = (itemInfo.offset + itemInfo.size / 2)
        animateScrollBy((childCenter - center))
    } else {
        animateScrollToItem(index)
    }
}
