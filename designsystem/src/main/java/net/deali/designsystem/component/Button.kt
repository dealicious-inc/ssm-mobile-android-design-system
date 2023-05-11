package net.deali.designsystem.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.gray50
import net.deali.designsystem.theme.pink60


@Composable
fun SmallFulledButton(
    enabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    SmallButton(
        modifier = modifier,
        backgroundColor = pink60,
        disabledBackgroundColor = gray50,
        enabled = enabled,
        onClick = onClick
    ) {
        content()
    }
}

@Composable
fun MediumFulledButton(
    enabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    MediumButton(
        modifier = modifier,
        backgroundColor = pink60,
        disabledBackgroundColor = gray50,
        enabled = enabled,
        onClick = onClick
    ) {
        content()
    }
}

@Composable
fun LargeFulledButton(
    enabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    LargeButton(
        modifier = modifier,
        backgroundColor = pink60,
        disabledBackgroundColor = gray50,
        enabled = enabled,
        onClick = onClick
    ) {
        content()
    }
}

@Composable
private fun SmallButton(
    enabled: Boolean,
    backgroundColor: Color,
    disabledBackgroundColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier
            .height(32.dp),
        shape = AppTheme.shapes.smallButton,
        backgroundColor = backgroundColor,
        disabledBackgroundColor = disabledBackgroundColor,
        enabled = enabled,
        contentPadding = PaddingValues(horizontal = 16.dp),
        onClick = onClick
    ) {
        content()
    }
}

@Composable
private fun MediumButton(
    enabled: Boolean,
    backgroundColor: Color,
    disabledBackgroundColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier
            .height(46.dp),
        shape = AppTheme.shapes.mediumButton,
        backgroundColor = backgroundColor,
        disabledBackgroundColor = disabledBackgroundColor,
        enabled = enabled,
        contentPadding = PaddingValues(horizontal = 20.dp),
        onClick = onClick
    ) {
        content()
    }
}

@Composable
private fun LargeButton(
    enabled: Boolean,
    backgroundColor: Color,
    disabledBackgroundColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier
            .height(50.dp),
        shape = AppTheme.shapes.largeButton,
        backgroundColor = backgroundColor,
        disabledBackgroundColor = disabledBackgroundColor,
        enabled = enabled,
        contentPadding = PaddingValues(horizontal = 40.dp),
        onClick = onClick
    ) {
        content()
    }
}

@Composable
private fun Button(
    shape: Shape,
    backgroundColor: Color,
    disabledBackgroundColor: Color,
    enabled: Boolean,
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier,
    border: BorderStroke? = null,
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit
) {
    Box(
        modifier = modifier
            .then(if (border != null) Modifier.border(border, shape) else Modifier)
            .background(color = if (enabled) backgroundColor else disabledBackgroundColor, shape = shape)
            .clip(shape)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(),
                enabled = enabled,
                role = Role.Button,
                onClick = onClick
            ),
        propagateMinConstraints = true
    ) {
        Row(
            modifier = Modifier.padding(contentPadding),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            content = content
        )
    }
}


@Composable
@Preview(showBackground = true, widthDp = 180, backgroundColor = 0XFFFFFF)
private fun SmallFulledButtonPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        SmallFulledButton(
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "Default",
                style = AppTheme.typography.H1_32_B,
            )
        }
    }
}

@Composable
@Preview(showBackground = true, widthDp = 180, backgroundColor = 0XFFFFFF)
private fun MediumFulledButtonPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        MediumFulledButton(
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "Default",
                style = AppTheme.typography.H1_32_B,
            )
        }
    }
}

@Composable
@Preview(showBackground = true, widthDp = 180, backgroundColor = 0XFFFFFF)
private fun LargeFulledButtonPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        LargeFulledButton(
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "Default",
                style = AppTheme.typography.H1_32_B,
            )
        }
    }
}