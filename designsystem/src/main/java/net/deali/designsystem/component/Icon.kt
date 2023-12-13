package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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

@Composable
fun Icon16(
    @DrawableRes iconRes: Int,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified
) {
    Icon(
        modifier = modifier,
        iconRes = iconRes,
        size = 16.dp,
        color = color
    )
}

@Composable
fun Icon16(
    @DrawableRes iconRes: Int,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    color: Color = Color.Unspecified,
    onClick: () -> Unit,
    noRipple: Boolean = false,
) {
    Icon(
        modifier = Modifier
            .clip(CircleShape)
            .clickable(
                onClick = onClick,
                role = Role.Image,
                enabled = enabled,
                interactionSource = remember { MutableInteractionSource() },
                indication = if (noRipple) null else rememberRipple()
            )
            .then(modifier),
        iconRes = iconRes,
        size = 16.dp,
        color = color
    )
}

@Composable
fun Icon24(
    @DrawableRes iconRes: Int,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
) {
    Icon(
        modifier = modifier,
        iconRes = iconRes,
        size = 24.dp,
        color = color,
    )
}

@Composable
fun Icon24(
    @DrawableRes iconRes: Int,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    color: Color = Color.Unspecified,
    onClick: () -> Unit = {},
    noRipple: Boolean = false,
) {
    Icon(
        modifier = Modifier
            .clip(CircleShape)
            .clickable(
                onClick = onClick,
                role = Role.Image,
                enabled = enabled,
                interactionSource = remember { MutableInteractionSource() },
                indication = if (noRipple) null else rememberRipple(),
            )
            .then(modifier),
        iconRes = iconRes,
        size = 24.dp,
        color = color
    )
}

@Composable
fun Icon32(
    @DrawableRes iconRes: Int,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified
) {
    Icon(
        modifier = modifier,
        iconRes = iconRes,
        size = 32.dp,
        color = color
    )
}

@Composable
fun Icon32(
    modifier: Modifier = Modifier,
    @DrawableRes iconRes: Int,
    enabled: Boolean = true,
    color: Color = Color.Unspecified,
    onClick: () -> Unit,
    noRipple: Boolean = false,
) {
    Icon(
        modifier = Modifier
            .clip(CircleShape)
            .clickable(
                onClick = onClick,
                role = Role.Image,
                enabled = enabled,
                interactionSource = remember { MutableInteractionSource() },
                indication = if (noRipple) null else rememberRipple(),
            )
            .then(modifier),
        iconRes = iconRes,
        size = 32.dp,
        color = color
    )
}

@Composable
private fun Icon(
    @DrawableRes iconRes: Int,
    size: Dp,
    color: Color,
    modifier: Modifier = Modifier
) {
    Icon(
        modifier = modifier,
        iconRes = iconRes,
        width = size,
        height = size,
        color = color
    )
}

@Composable
private fun Icon(
    @DrawableRes iconRes: Int,
    width: Dp,
    height: Dp,
    color: Color,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            .width(width)
            .height(height),
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
        Icon16(
            iconRes = R.drawable.ic_bookmark
        )

        Icon24(
            iconRes = R.drawable.ic_bookmark
        )

        Icon32(
            iconRes = R.drawable.ic_bookmark
        )
    }
}
