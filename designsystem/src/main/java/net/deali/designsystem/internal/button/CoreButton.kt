package net.deali.designsystem.internal.button

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.component.IconRotating

@Composable
internal fun CoreButton(
    onClick: () -> Unit,
    text: String,
    @DrawableRes leftIcon: Int?,
    @DrawableRes rightIcon: Int?,
    clickable: Boolean,
    enabled: Boolean,
    loading: Boolean,
    buttonStyle: ButtonStyle,
    buttonSize: ButtonSize,
    buttonColors: ButtonColors,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    isRoundShape: Boolean = false,
) {
    val buttonShape = ButtonDefaults.buttonShape(buttonSize = buttonSize, rounded = isRoundShape)
    val backgroundColor by buttonColors.backgroundColor(enabled)
    val outlineColor by buttonColors.outlineColor(enabled)
    val contentColor by buttonColors.contentColor(enabled)

    Box(
        modifier = modifier
            .clip(shape = buttonShape)
            .outlineBorder(buttonStyle = buttonStyle, color = outlineColor, shape = buttonShape)
            .defaultMinSize(minHeight = ButtonDefaults.buttonMinHeight(buttonSize = buttonSize))
            .background(brush = backgroundColor)
            .then(
                if (clickable) {
                    Modifier
                        .clickable(
                        interactionSource = interactionSource,
                        indication = rememberRipple(),
                        enabled = enabled,
                        role = Role.Button,
                        onClick = onClick,
                    )
                } else {
                    Modifier
                }
            ),
        contentAlignment = Alignment.Center,
    ) {
        if (loading && buttonStyle != ButtonStyle.Text) {
            Box(
                modifier = Modifier
                    .padding(
                        ButtonDefaults.buttonPaddings(
                            buttonSize = buttonSize,
                            buttonStyle = buttonStyle,
                            useLeftIcon = leftIcon != null,
                            useRightIcon = rightIcon != null,
                            isLoading = true,
                            rounded = isRoundShape
                        )
                    ),
                contentAlignment = Alignment.Center,
            ) {
                IconRotating(
                    modifier = Modifier.size(ButtonDefaults.loadingIconSize(buttonSize)),
                    iconRes = R.drawable.ic_loading_filled,
                    color = contentColor,
                )
            }
        } else {
            Row(
                modifier = Modifier
                    .padding(
                        ButtonDefaults.buttonPaddings(
                            buttonSize = buttonSize,
                            buttonStyle = buttonStyle,
                            useLeftIcon = leftIcon != null,
                            useRightIcon = rightIcon != null,
                            isLoading = false,
                            rounded = isRoundShape
                        )
                    ),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                if (leftIcon != null) {
                    Icon16(
                        iconRes = leftIcon,
                        color = contentColor,
                    )
                }
                DealiText(
                    text = text,
                    style = ButtonDefaults.buttonTextStyle(
                        buttonSize = buttonSize,
                        buttonStyle = buttonStyle
                    ),
                    color = contentColor,
                )
                if (rightIcon != null) {
                    Icon16(
                        iconRes = rightIcon,
                        color = contentColor,
                    )
                }
            }
        }
    }
}

@Stable
private fun Modifier.outlineBorder(
    buttonStyle: ButtonStyle,
    color: Color,
    shape: Shape,
): Modifier {
    return if (buttonStyle == ButtonStyle.Outline) {
        this.then(Modifier.border(width = 1.dp, color = color, shape = shape))
    } else {
        this
    }
}
