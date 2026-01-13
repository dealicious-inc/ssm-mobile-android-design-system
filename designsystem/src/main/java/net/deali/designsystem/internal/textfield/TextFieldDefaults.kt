package net.deali.designsystem.internal.textfield

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.HorizontalSpacer
import net.deali.designsystem.component.Icon
import net.deali.designsystem.component.btnFilledTonalMedium03
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

internal object DealiTextFieldDefaults {
    val BorderWidth: Dp = 1.dp
    val BorderShape: Shape = RoundedCornerShape(6.dp)

    val TextStyle: TextStyle
        @Composable
        get() = DealiFont.b2r14

    @Composable
    fun cursor(): Brush {
        return SolidColor(DealiColor.g100)
    }

    @Composable
    fun paddings(): TextFieldPaddings {
        return TextFieldPaddingsImpl(
            decoratedStart = 6.dp,
            decoratedEnd = 12.dp,
            horizontal = 16.dp,
            vertical = 13.dp
        )
    }

    @Composable
    fun colors(): TextFieldColors {
        return TextFieldColorsImpl(
            backgroundColor = DealiColor.primary04,
            disabledBackgroundColor = DealiColor.g10,
            readOnlyBackgroundColor = DealiColor.g05,
            outlineColor = DealiColor.g20,
            focusedOutlineColor = DealiColor.g100,
            errorOutlineColor = DealiColor.error,
            readOnlyOutlineColor = DealiColor.g05,
            textColor = DealiColor.g100,
            disabledTextColor = DealiColor.g50,
            readOnlyTextColor = DealiColor.g80,
            placeholderTextColor = DealiColor.g70,
            labelTextColor = DealiColor.g100,
            helperTextColor = DealiColor.g70,
            errorHelperTextColor = DealiColor.error,
        )
    }

    @Composable
    fun TrailingRemoveIcon(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
    ) {
        Icon(
            modifier = modifier,
            iconRes = R.drawable.ic_x_circle_filled,
            size = 16.dp,
            color = DealiColor.g50,
            onClick = onClick,
        )
    }

    @Composable
    fun TrailingButton(
        text: String,
        onClick: () -> Unit,
        enabled: Boolean,
        modifier: Modifier = Modifier,
    ) {
        Row(modifier = modifier) {
            HorizontalSpacer(width = 8.dp)

            btnFilledTonalMedium03(
                text = text,
                enabled = enabled,
                onClick = onClick,
            )
        }
    }
}