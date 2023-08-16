package net.deali.designsystem.internal.button

import androidx.annotation.DrawableRes
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
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.component.IconRotating
import net.deali.designsystem.theme.AppTheme

@Composable
internal fun ButtonSmall(
    text: String,
    enabled: Boolean,
    process: Boolean,
    textStyle: TextStyle,
    textColor: Color,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
    border: BorderStroke? = null,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    CoreDealiButton(
        modifier = modifier
            .height(32.dp),
        enabled = enabled && !process,
        shape = AppTheme.shapes.radius4,
        backgroundColor = backgroundColor,
        contentPadding = getButtonHorizontalPadding(ButtonSize.SMALL, leftIcon, rightIcon),
        border = border,
        onClick = onClick
    ) {
        if (process && processIcon != null) {
            IconRotating(
                modifier = Modifier
                    .size(24.dp),
                iconRes = processIcon,
                color = textColor
            )
        } else {
            if (leftIcon != null) {
                Icon16(
                    iconRes = leftIcon,
                    color = textColor
                )
            }

            DealiText(
                text = text,
                style = textStyle,
                color = textColor
            )

            if (rightIcon != null) {
                Icon16(
                    iconRes = rightIcon,
                    color = textColor
                )
            }
        }
    }
}

@Composable
internal fun ButtonMedium(
    text: String,
    enabled: Boolean,
    process: Boolean,
    textStyle: TextStyle,
    textColor: Color,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
    border: BorderStroke? = null,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    CoreDealiButton(
        modifier = modifier
            .height(46.dp),
        enabled = enabled && !process,
        shape = AppTheme.shapes.radius6,
        backgroundColor = backgroundColor,
        contentPadding = getButtonHorizontalPadding(ButtonSize.MEDIUM, leftIcon, rightIcon),
        border = border,
        onClick = onClick
    ) {
        if (process && processIcon != null) {
            IconRotating(
                modifier = Modifier
                    .size(24.dp),
                iconRes = processIcon,
                color = textColor
            )
        } else {
            if (leftIcon != null) {
                Icon16(
                    iconRes = leftIcon,
                    color = textColor
                )
            }

            DealiText(
                text = text,
                style = textStyle,
                color = textColor
            )

            if (rightIcon != null) {
                Icon16(
                    iconRes = rightIcon,
                    color = textColor
                )
            }
        }
    }
}

@Composable
internal fun ButtonLarge(
    text: String,
    enabled: Boolean,
    process: Boolean,
    textStyle: TextStyle,
    textColor: Color,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
    border: BorderStroke? = null,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    CoreDealiButton(
        modifier = modifier
            .height(50.dp),
        enabled = enabled && !process,
        shape = AppTheme.shapes.radius6,
        backgroundColor = backgroundColor,
        contentPadding = getButtonHorizontalPadding(ButtonSize.LARGE, leftIcon, rightIcon),
        border = border,
        onClick = onClick
    ) {
        if (process && processIcon != null) {
            IconRotating(
                modifier = Modifier
                    .size(24.dp),
                iconRes = processIcon,
                color = textColor
            )
        } else {
            if (leftIcon != null) {
                Icon16(
                    iconRes = leftIcon,
                    color = textColor
                )
            }

            DealiText(
                text = text,
                style = textStyle,
                color = textColor
            )

            if (rightIcon != null) {
                Icon16(
                    iconRes = rightIcon,
                    color = textColor
                )
            }
        }
    }
}

@Composable
private fun CoreDealiButton(
    shape: Shape,
    enabled: Boolean,
    modifier: Modifier = Modifier,
    backgroundColor: Color = AppTheme.colors.transparent,
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

private fun getButtonHorizontalPadding(
    buttonSize: ButtonSize,
    @DrawableRes leftIcon: Int?,
    @DrawableRes rightIcon: Int?
) = PaddingValues(
    start = getButtonHorizontalPaddingCalc(buttonSize, leftIcon, rightIcon),
    end = getButtonHorizontalPaddingCalc(buttonSize, rightIcon, leftIcon)
)

private fun getButtonHorizontalPaddingCalc(
    buttonSize: ButtonSize,
    @DrawableRes anchorIcon: Int?,
    @DrawableRes otherSideIcon: Int?
) = when {
    anchorIcon != null -> when (buttonSize) {
        ButtonSize.LARGE -> 16.dp
        ButtonSize.MEDIUM -> 16.dp
        ButtonSize.SMALL -> 12.dp
    }

    otherSideIcon != null -> when (buttonSize) {
        ButtonSize.LARGE -> 20.dp
        ButtonSize.MEDIUM -> 20.dp
        ButtonSize.SMALL -> 16.dp
    }

    else -> when (buttonSize) {
        ButtonSize.LARGE -> 40.dp
        ButtonSize.MEDIUM -> 20.dp
        ButtonSize.SMALL -> 20.dp
    }
}

private enum class ButtonSize {
    LARGE,
    MEDIUM,
    SMALL
}
