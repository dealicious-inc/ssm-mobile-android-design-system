package net.deali.designsystem.util.animation

import android.content.res.Resources
import android.util.TypedValue
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.lazy.LazyListState

suspend fun LazyListState.animateScrollAndCentralizeItem(index: Int) {
    val itemInfo = this.layoutInfo.visibleItemsInfo.firstOrNull { it.index == index }
    if (itemInfo != null) {
        //중앙값을 구할 때, LazyRow horizontal contentPadding 16dp의 반값인 8dp만큼 조정한다.
        val metrics = Resources.getSystem().displayMetrics
        val pxValue = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8f, metrics)

        val center = (layoutInfo.viewportEndOffset / 2) - pxValue
        val childCenter = (itemInfo.offset + itemInfo.size / 2)
        animateScrollBy((childCenter - center).toFloat())
    } else {
        animateScrollToItem(index)
    }
}
