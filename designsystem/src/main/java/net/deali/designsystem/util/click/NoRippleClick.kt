package net.deali.designsystem.util.click

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.platform.debugInspectorInfo

/**
 * 리플 없는 클릭 Modifier.
 *
 * @param enabled 클릭 이벤트 활성화 여부
 * @param interactionSource [MutableInteractionSource]
 * @param onClick 클릭 이벤트 콜백
 */
fun Modifier.noRippleClickable(
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
    onClick: () -> Unit
) = this.composed(
    inspectorInfo = debugInspectorInfo {
        name = "noRippleClickable"
        properties["enabled"] = enabled
        properties["interactionSource"] = interactionSource
        properties["onClick"] = onClick
    }
) {
    Modifier.singleClickable(
        indication = null,
        interactionSource = interactionSource ?: remember { MutableInteractionSource() },
        enabled = enabled,
        onClick = onClick
    )
}