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
fun ButtonSmallFulled(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    ButtonSmall(
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
fun ButtonMediumFulled(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    ButtonMedium(
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
fun ButtonLargeFulled(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    ButtonLarge(
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
fun ButtonSmallOutlined(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    ButtonSmall(
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
fun ButtonMediumOutlined(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    ButtonMedium(
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
fun ButtonLargeOutlined(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    ButtonLarge(
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
fun ButtonSmallTonalOutlined(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    ButtonSmall(
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
fun ButtonMediumTonalOutlined(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    ButtonMedium(
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
fun ButtonLargeTonalOutlined(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    ButtonLarge(
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
fun ButtonSmallText(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    ButtonSmall(
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
fun ButtonMediumText(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    ButtonMedium(
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
fun ButtonLargeText(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    leftIcon: Painter? = null,
    rightIcon: Painter? = null,
    processIcon: Painter? = null,
    onClick: () -> Unit
) {
    ButtonLarge(
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
private fun ButtonSmall(
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
            IconRotating(
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
private fun ButtonMedium(
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
            IconRotating(
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
private fun ButtonLarge(
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
            IconRotating(
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
private fun ButtonSmallFulledPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonSmallFulled(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonSmallFulled(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonMediumFulledPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonMediumFulled(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonMediumFulled(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonLargeFulledPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonLargeFulled(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonLargeFulled(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonSmallOutlinedPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonSmallOutlined(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonSmallOutlined(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonMediumOutlinedPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonMediumOutlined(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonMediumOutlined(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonLargeOutlinedPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonLargeOutlined(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonLargeOutlined(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonSmallTonalOutlinedPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonSmallTonalOutlined(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonSmallTonalOutlined(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonMediumTonalOutlinedPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonMediumTonalOutlined(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonMediumTonalOutlined(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonLargeTonalOutlinedPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonLargeTonalOutlined(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonLargeTonalOutlined(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonSmallTextPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonSmallText(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonSmallText(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonMediumTextPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonMediumText(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonMediumText(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonLargeTextPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonLargeText(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonLargeText(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}
