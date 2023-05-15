package net.deali.designsystem.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Icon16(
    painter: Painter,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified
) {
    Icon(
        modifier = modifier,
        size = 16.dp,
        painter = painter,
        color = color
    )
}

@Composable
fun Icon16(
    painter: Painter,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    color: Color = Color.Unspecified,
    onClick: () -> Unit
) {
    Icon(
        modifier = modifier
            .clickable(
                onClick = onClick,
                role = Role.Button,
                enabled = enabled,
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(bounded = false, radius = 16.dp)
            ),
        size = 16.dp,
        painter = painter,
        color = color
    )
}

@Composable
fun Icon24(
    painter: Painter,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified
) {
    Icon(
        modifier = modifier,
        size = 24.dp,
        painter = painter,
        color = color
    )
}

@Composable
fun Icon24(
    painter: Painter,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    color: Color = Color.Unspecified,
    onClick: () -> Unit
) {
    Icon(
        modifier = modifier
            .clickable(
                onClick = onClick,
                role = Role.Button,
                enabled = enabled,
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(bounded = false, radius = 24.dp)
            ),
        size = 24.dp,
        painter = painter,
        color = color
    )
}

@Composable
fun Icon32(
    painter: Painter,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified
) {
    Icon(
        modifier = modifier,
        size = 32.dp,
        painter = painter,
        color = color
    )
}

@Composable
fun Icon32(
    painter: Painter,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    color: Color = Color.Unspecified,
    onClick: () -> Unit
) {
    Icon(
        modifier = modifier
            .clickable(
                onClick = onClick,
                role = Role.Button,
                enabled = enabled,
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(bounded = false, radius = 24.dp)
            ),
        size = 32.dp,
        painter = painter,
        color = color
    )
}

@Composable
private fun Icon(
    size: Dp,
    painter: Painter,
    color: Color,
    modifier: Modifier = Modifier
) {
    Icon(
        modifier = modifier,
        width = size,
        height = size,
        painter = painter,
        color = color
    )
}

@Composable
private fun Icon(
    width: Dp,
    height: Dp,
    painter: Painter,
    color: Color,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            .width(width)
            .height(height),
        painter = painter,
        contentScale = ContentScale.Crop,
        contentDescription = null,
        colorFilter = if (color == Color.Unspecified) null else ColorFilter.tint(color)
    )
}
