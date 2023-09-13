package net.deali.designsystem.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.util.getRandomText

@Composable
fun RadioButton(
    text: String,
    selected: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(4.dp))
            .selectable(
                selected = selected,
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(),
                enabled = enabled,
                role = Role.RadioButton,
                onClick = onClick
            )
            .then(modifier),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioIcon(
            selected = selected,
            enabled = enabled
        )

        DealiText(
            modifier = Modifier
                .padding(start = 8.dp),
            text = text,
            style = DealiFont.b3r13,
            color = when {
                enabled.not() -> DealiColor.g50
                else -> DealiColor.g100
            }
        )
    }
}

@Composable
private fun RadioIcon(
    selected: Boolean,
    enabled: Boolean = true,
    radioButtonSize: Dp = 18.dp,
    radioButtonDotSize: Dp = 8.dp,
    radioButtonPadding: Dp = 3.dp
) {
    val dotRadius = animateDpAsState(
        targetValue = if (selected) radioButtonDotSize / 2 else 0.dp,
        animationSpec = tween(durationMillis = 100),
        label = "radius",
    )

    val backgroundColor = when {
        enabled.not() -> DealiColor.g10
        else -> DealiColor.primary04
    }

    val borderColor = when {
        enabled.not() -> DealiColor.g30
        selected -> DealiColor.primary01
        else -> DealiColor.g100
    }

    val dotColor = when {
        selected -> DealiColor.primary01
        else -> DealiColor.transparent
    }

    Canvas(
        modifier = Modifier
            .padding(radioButtonPadding)
            .requiredSize(radioButtonSize)
    ) {
        val strokeWidth = 1.dp.toPx()
        drawCircle(
            color = backgroundColor,
            radius = (radioButtonSize / 2).toPx() - strokeWidth / 2,
        )

        drawCircle(
            color = borderColor,
            radius = (radioButtonSize / 2).toPx() - strokeWidth / 2,
            style = Stroke(strokeWidth)
        )

        if (dotRadius.value > 0.dp) {
            drawCircle(dotColor, dotRadius.value.toPx(), style = Fill)
        }
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun RadioButtonPreview() {
    Column(
        modifier = Modifier
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        RadioButton(
            text = getRandomText(3),
            selected = false,
            onClick = {}
        )

        RadioButton(
            text = getRandomText(3),
            selected = true,
            onClick = {}
        )

        RadioButton(
            text = getRandomText(3),
            selected = false,
            enabled = false,
            onClick = {}
        )
    }
}
