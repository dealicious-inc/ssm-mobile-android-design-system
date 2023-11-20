package net.deali.designsystem.internal.switch

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import net.deali.designsystem.util.drawShadow

@Composable
internal fun CoreSwitch(
    size: SwitchSize,
    isOn: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onChange: (Boolean) -> Unit,
) {
    var currentSelected by remember(isOn) { mutableStateOf(isOn) }
    val colors = SwitchDefaults.colors()
    val switchSize = SwitchDefaults.switchSize(size = size)
    val switchHandleRadius = SwitchDefaults.switchHandleRadius(size = size)
    val slideColor by colors.slideColor(isOn, enabled)
    val handleColor = colors.handleColor()

    Box(
        modifier = modifier
            .defaultMinSize(
                minWidth = switchSize.width,
                minHeight = switchSize.height,
            )
            .clickable(
                enabled = enabled,
                role = Role.Switch,
                indication = null,
                interactionSource = interactionSource,
                onClick = {
                    val newState = !currentSelected
                    currentSelected = newState
                    onChange(newState)
                }
            )
    ) {
        SwitchSlide(
            modifier = Modifier
                .requiredSize(switchSize)
                .align(Alignment.Center),
            color = slideColor,
            size = switchSize,
        )

        val transition = updateTransition(
            targetState = currentSelected,
            label = "transition"
        )
        val handleOffsetX by transition.animateDp(
            transitionSpec = { tween(durationMillis = 200) },
            label = "handleOffsetX",
            targetValueByState = { targetIsSelected ->
                val spacing = switchSize.height / 2f - switchHandleRadius
                if (targetIsSelected) {
                    switchSize.width - (switchHandleRadius * 2) - spacing
                } else {
                    spacing
                }
            }
        )
        val handleOffsetY = switchSize.height / 2f - switchHandleRadius

        SwitchHandle(
            modifier = Modifier
                .requiredSize(size = switchHandleRadius * 2)
                .offset(x = handleOffsetX, y = handleOffsetY),
            color = handleColor,
            radius = switchHandleRadius,
        )
    }
}

@Composable
private fun SwitchSlide(
    color: Color,
    size: DpSize,
    modifier: Modifier = Modifier,
) {
    val pixelSize = with(LocalDensity.current) { size.toSize() }
    val radius = pixelSize.height / 2f

    Canvas(modifier = modifier) {
        drawRoundRect(
            color = color,
            size = pixelSize,
            cornerRadius = CornerRadius(radius),
        )
    }
}

@Composable
private fun SwitchHandle(
    color: Color,
    radius: Dp,
    modifier: Modifier = Modifier,
) {
    val radiusPx = with(LocalDensity.current) { radius.toPx() }

    Canvas(modifier = modifier) {
        drawShadow(cornerRadius = CornerRadius(x = radiusPx, y = radiusPx))
        drawCircle(
            color = color,
            radius = radiusPx,
        )
    }
}
