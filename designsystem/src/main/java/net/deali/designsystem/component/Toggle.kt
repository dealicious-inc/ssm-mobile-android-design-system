package net.deali.designsystem.component

import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.toggle.ToggleDefaults
import net.deali.designsystem.theme.gray50
import net.deali.designsystem.util.drawShadow

// TODO: Toggle과 Switch 중 하나로 통일하는 방안을 디자인 측에서 논의중.
@Composable
fun Toggle(
    selected: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onSelectedChange: (Boolean) -> Unit,
) {
    var currentSelected by remember(selected) { mutableStateOf(selected) }
    val colors = ToggleDefaults.colors()
    val slideColor by colors.slideColor(selected, enabled)
    val handleColor by colors.handleColor(selected, enabled)

    ToggleLayout(
        modifier = modifier,
        enabled = enabled,
        interactionSource = interactionSource,
        onClick = {
            val newState = !currentSelected
            currentSelected = newState
            onSelectedChange(newState)
        }
    ) {
        ToggleSlide(
            color = slideColor,
            size = ToggleDefaults.SlideSize,
            modifier = Modifier
                .requiredSize(ToggleDefaults.SlideSize)
                .align(Alignment.Center)
        )

        val transition = updateTransition(
            targetState = currentSelected,
            label = "transition"
        )
        val handleOffsetX by transition.animateDp(
            transitionSpec = { tween(durationMillis = 200) },
            label = "handleOffsetX",
            targetValueByState = { targetIsSelected ->
                if (targetIsSelected) {
                    ToggleDefaults.SlideSize.width - (ToggleDefaults.HandleRadius * 2)
                } else {
                    0.dp
                }
            }
        )

        ToggleHandle(
            color = handleColor,
            radius = ToggleDefaults.HandleRadius,
            modifier = Modifier
                .requiredSize(size = ToggleDefaults.HandleRadius * 2)
                .offset(x = handleOffsetX),
        )
    }
}

@Composable
private fun ToggleLayout(
    onClick: () -> Unit,
    enabled: Boolean,
    interactionSource: MutableInteractionSource,
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(modifier = modifier) {
        Box(
            modifier = Modifier
                .defaultMinSize(
                    minWidth = ToggleDefaults.MinSize.width,
                    minHeight = ToggleDefaults.MinSize.height,
                )
                .clickable(
                    enabled = enabled,
                    role = Role.Switch,
                    indication = null,
                    interactionSource = interactionSource,
                    onClick = onClick,
                ),
            content = content,
        )
    }
}

@Composable
private fun ToggleSlide(
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
private fun ToggleHandle(
    color: Color,
    radius: Dp,
    modifier: Modifier = Modifier,
) {
    val radiusPx = with(LocalDensity.current) { radius.toPx() }

    Canvas(modifier = modifier) {
        drawShadow(
            color = gray50,
            cornerRadius = CornerRadius(x = radiusPx, y = radiusPx),
        )
        drawCircle(
            color = color,
            radius = radiusPx,
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun TogglePreview() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        var selected1 by remember { mutableStateOf(false) }
        var selected2 by remember { mutableStateOf(true) }
        var selected3 by remember { mutableStateOf(false) }

        Toggle(
            selected = selected1,
            onSelectedChange = { selected1 = it },
        )
        Toggle(
            selected = selected2,
            onSelectedChange = { selected2 = it },
        )
        Toggle(
            selected = selected3,
            enabled = false,
            onSelectedChange = { selected3 = it },
        )
    }
}
