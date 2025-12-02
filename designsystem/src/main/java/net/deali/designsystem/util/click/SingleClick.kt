package net.deali.designsystem.util.click

import androidx.compose.foundation.Indication
import androidx.compose.foundation.IndicationNodeFactory
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.semantics.Role

/**
 * https://al-e-shevelev.medium.com/how-to-prevent-multiple-clicks-in-android-jetpack-compose-8e62224c9c5e
 * compose "여러번" 클릭을 방지하기 위해 사용하는 Modifier
 *
 * @param enabled 클릭 이벤트 활성화 여부
 * @param interval 클릭 활성화 간격 (밀리초)
 * @param onClick 클릭 이벤트 콜백
 */
@Composable
fun Modifier.singleClickable(
    enabled: Boolean = true,
    interval: Long = DEFAULT_CLICK_INTERVAL,
    interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
    indication: Indication? = LocalIndication.current,
    role: Role? = null,
    onClick: () -> Unit
): Modifier = this.composed(
    inspectorInfo = debugInspectorInfo {
        name = "singleClickable"
        properties["enabled"] = enabled
        properties["interval"] = interval
        properties["interactionSource"] = interactionSource
        properties["indication"] = indication
        properties["role"] = role
        properties["onClick"] = onClick
    }
) {
    val multipleEventsCutter = remember { MultipleEventsCutter(interval) }

    Modifier.clickable(
        enabled = enabled,
        onClick = { multipleEventsCutter.processEvent { onClick() } },
        interactionSource = interactionSource,
        indication = indication,
        role = role,
    )
}

private class MultipleEventsCutter(
    val interval: Long
) {
    private val now: Long
        get() = System.currentTimeMillis()

    private var lastEventTimeMs: Long = 0

    fun processEvent(event: () -> Unit) {
        if (now - lastEventTimeMs >= interval) {
            event.invoke()
            lastEventTimeMs = now
        }
    }
}

private const val DEFAULT_CLICK_INTERVAL = 300L