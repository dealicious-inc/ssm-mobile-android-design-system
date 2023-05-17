package net.deali.designsystem.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.gray10
import net.deali.designsystem.theme.gray30
import net.deali.designsystem.theme.gray50
import net.deali.designsystem.theme.gray80
import net.deali.designsystem.theme.pink60
import net.deali.designsystem.theme.transparent
import net.deali.designsystem.theme.white100
import net.deali.designsystem.unit.getRandomText


@Composable
fun SmallFulledButton(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    SmallButton(
        modifier = modifier,
        text = text,
        textColor = white100,
        backgroundColor = if (enabled) pink60 else gray50,
        enabled = enabled,
        process = process,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun MediumFulledButton(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    MediumButton(
        modifier = modifier,
        text = text,
        textColor = white100,
        backgroundColor = if (enabled) pink60 else gray50,
        enabled = enabled,
        process = process,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun LargeFulledButton(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    LargeButton(
        modifier = modifier,
        text = text,
        textColor = white100,
        backgroundColor = if (enabled) pink60 else gray50,
        enabled = enabled,
        process = process,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun SmallOutlinedButton(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    SmallButton(
        modifier = modifier,
        text = text,
        textColor = if (enabled) pink60 else gray50,
        backgroundColor = white100,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, if (enabled) pink60 else gray50),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun MediumOutlinedButton(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    MediumButton(
        modifier = modifier,
        text = text,
        textColor = if (enabled) pink60 else gray50,
        backgroundColor = white100,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, if (enabled) pink60 else gray50),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun LargeOutlinedButton(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    LargeButton(
        modifier = modifier,
        text = text,
        textColor = if (enabled) pink60 else gray50,
        backgroundColor = white100,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, if (enabled) pink60 else gray50),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun SmallTonalOutlinedButton(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    SmallButton(
        modifier = modifier,
        text = text,
        textColor = if (enabled) gray80 else gray50,
        backgroundColor = gray10,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, gray30),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun MediumTonalOutlinedButton(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    MediumButton(
        modifier = modifier,
        text = text,
        textColor = if (enabled) gray80 else gray50,
        backgroundColor = gray10,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, gray30),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun LargeTonalOutlinedButton(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    LargeButton(
        modifier = modifier,
        text = text,
        textColor = if (enabled) gray80 else gray50,
        backgroundColor = gray10,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, gray30),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun SmallTextButton(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    SmallButton(
        modifier = modifier,
        text = text,
        textColor = if (enabled) gray80 else gray50,
        backgroundColor = white100,
        enabled = enabled,
        process = process,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun MediumTextButton(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    MediumButton(
        modifier = modifier,
        text = text,
        textColor = if (enabled) gray80 else gray50,
        backgroundColor = white100,
        enabled = enabled,
        process = process,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun LargeTextButton(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    LargeButton(
        modifier = modifier,
        text = text,
        textColor = if (enabled) gray80 else gray50,
        backgroundColor = white100,
        enabled = enabled,
        process = process,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
private fun SmallButton(
    text: String,
    enabled: Boolean,
    process: Boolean,
    textColor: Color,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
    border: BorderStroke? = null,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit,
) {
    DealiButton(
        modifier = modifier
            .height(32.dp),
        enabled = enabled && !process,
        shape = AppTheme.shapes.radius4,
        backgroundColor = backgroundColor,
        contentPadding = PaddingValues(horizontal = 16.dp),
        border = border,
        onClick = onClick
    ) {
        if (process && processIcon != null) {
            RotatingIcon(
                modifier = Modifier
                    .size(24.dp),
                painter = processIcon,
                color = textColor
            )
        } else {
            if (leftIcon != null) {
                Icon16(
                    painter = leftIcon,
                    color = textColor
                )
            }

            DealiText(
                text = text,
                style = AppTheme.typography.B2_14_M,
                color = textColor
            )

            if (rightIcon != null) {
                Icon16(
                    painter = rightIcon,
                    color = textColor
                )
            }
        }
    }
}

@Composable
private fun MediumButton(
    text: String,
    enabled: Boolean,
    process: Boolean,
    textColor: Color,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
    border: BorderStroke? = null,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit,
) {
    DealiButton(
        modifier = modifier
            .height(46.dp),
        enabled = enabled && !process,
        shape = AppTheme.shapes.radius6,
        backgroundColor = backgroundColor,
        contentPadding = PaddingValues(horizontal = 20.dp),
        border = border,
        onClick = onClick
    ) {
        if (process && processIcon != null) {
            RotatingIcon(
                modifier = Modifier
                    .size(24.dp),
                painter = processIcon,
                color = textColor
            )
        } else {
            if (leftIcon != null) {
                Icon16(
                    painter = leftIcon,
                    color = textColor
                )
            }

            DealiText(
                text = text,
                style = AppTheme.typography.B2_14_B,
                color = textColor
            )

            if (rightIcon != null) {
                Icon16(
                    painter = rightIcon,
                    color = textColor
                )
            }
        }
    }
}

@Composable
private fun LargeButton(
    text: String,
    enabled: Boolean,
    process: Boolean,
    textColor: Color,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
    border: BorderStroke? = null,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit,
) {
    DealiButton(
        modifier = modifier
            .height(50.dp),
        enabled = enabled && !process,
        shape = AppTheme.shapes.radius6,
        backgroundColor = backgroundColor,
        contentPadding = PaddingValues(horizontal = 40.dp),
        border = border,
        onClick = onClick
    ) {
        if (process && processIcon != null) {
            RotatingIcon(
                modifier = Modifier
                    .size(24.dp),
                painter = processIcon,
                color = textColor
            )
        } else {
            if (leftIcon != null) {
                Icon16(
                    painter = leftIcon,
                    color = textColor
                )
            }

            DealiText(
                text = text,
                style = AppTheme.typography.B1_15_B,
                color = textColor
            )

            if (rightIcon != null) {
                Icon16(
                    painter = rightIcon,
                    color = textColor
                )
            }
        }
    }
}

@Composable
fun DealiButton(
    shape: Shape,
    enabled: Boolean,
    modifier: Modifier = Modifier,
    backgroundColor: Color = transparent,
    border: BorderStroke? = null,
    contentPadding: PaddingValues = PaddingValues(),
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit
) {
    Row(
        modifier = modifier
            .then(if (border != null) Modifier.border(border, shape) else Modifier)
            .background(color = backgroundColor, shape = shape)
            .clip(shape)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(),
                enabled = enabled,
                role = Role.Button,
                onClick = onClick
            )
            .padding(contentPadding),
        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        content()
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun SmallFulledButtonPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        SmallFulledButton(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        SmallFulledButton(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun MediumFulledButtonPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        MediumFulledButton(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        MediumFulledButton(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun LargeFulledButtonPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        LargeFulledButton(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        LargeFulledButton(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun SmallOutlinedButtonPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        SmallOutlinedButton(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        SmallOutlinedButton(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun MediumOutlinedButtonPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        MediumOutlinedButton(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        MediumOutlinedButton(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun LargeOutlinedButtonPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        LargeOutlinedButton(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        LargeOutlinedButton(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun SmallTonalOutlinedButtonPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        SmallTonalOutlinedButton(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        SmallTonalOutlinedButton(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun MediumTonalOutlinedButtonPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        MediumTonalOutlinedButton(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        MediumTonalOutlinedButton(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun LargeTonalOutlinedButtonPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        LargeTonalOutlinedButton(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        LargeTonalOutlinedButton(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun SmallTextButtonPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        SmallTextButton(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        SmallTextButton(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun MediumTextButtonPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        MediumTextButton(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        MediumTextButton(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun LargeTextButtonPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        LargeTextButton(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        LargeTextButton(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}
