package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.util.click.singleClickable

@Composable
fun Icon(
    @DrawableRes iconRes: Int,
    size: Dp,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    enabled: Boolean = true,
    noRipple: Boolean = false,
) {
    val rippleRadius = when {
        size < 24.dp -> {
            16.dp
        }

        else -> {
            24.dp
        }
    }

    Icon(
        modifier = modifier
            .singleClickable(
                onClick = onClick,
                role = Role.Image,
                enabled = enabled,
                interactionSource = remember { MutableInteractionSource() },
                indication = if (noRipple) {
                    null
                } else {
                    ripple(bounded = false, radius = rippleRadius)
                }
            ),
        iconRes = iconRes,
        size = size,
        color = color
    )
}

@Composable
fun Icon(
    @DrawableRes iconRes: Int,
    size: Dp,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified
) {
    Image(
        modifier = modifier
            .size(size),
        painter = painterResource(id = iconRes),
        contentScale = ContentScale.Crop,
        contentDescription = null,
        colorFilter = if (color == Color.Unspecified) null else ColorFilter.tint(color)
    )
}

@Composable
fun IconRotating(
    @DrawableRes iconRes: Int,
    color: Color,
    modifier: Modifier = Modifier,
    durationMillis: Int = 2000
) {
    val transition = rememberInfiniteTransition(label = "transition")
    val currentAngle by transition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = durationMillis,
                easing = LinearEasing
            )
        ),
        label = "angle",
    )
    val painter = painterResource(id = iconRes)

    Canvas(modifier = modifier) {
        rotate(degrees = currentAngle) {
            with(painter) {
                draw(
                    size = size,
                    colorFilter = if (color == Color.Unspecified) null else ColorFilter.tint(color)
                )
            }
        }
    }
}

@Composable
@Preview
private fun IconPreview() {
    Row {
        Icon(
            iconRes = R.drawable.ic_bookmark_1,
            size = 16.dp,
        )

        Icon(
            iconRes = R.drawable.ic_bookmark_1,
            size = 24.dp,
        )

        Icon(
            iconRes = R.drawable.ic_bookmark_1,
            size = 32.dp,
        )
    }
}
