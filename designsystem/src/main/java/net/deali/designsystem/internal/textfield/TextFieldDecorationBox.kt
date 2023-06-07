package net.deali.designsystem.internal.textfield

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.theme.AppTheme

@Composable
internal fun DealiTextFieldDecorationBox(
    innerTextField: @Composable () -> Unit,
    enabled: Boolean,
    isError: Boolean,
    colors: DealiTextFieldColors,
    interactionSource: MutableInteractionSource,
    isValueEmpty: Boolean,
    placeholder: String?,
    label: String?,
    helperText: String?,
    modifier: Modifier = Modifier,
) {
    val focused = interactionSource.collectIsFocusedAsState().value
    val isLabelVisible = !label.isNullOrEmpty()
    val isPlaceholderVisible = if (focused) false else !placeholder.isNullOrEmpty() && isValueEmpty
    val isHelperTextVisible = !helperText.isNullOrEmpty()
    val spacing = 4.dp

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start,
    ) {
        LabelText(
            label = label,
            isVisible = isLabelVisible,
            colors = colors,
            bottomSpacing = spacing,
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(20.dp + spacing),
        )
        OutlinedTextField(
            innerTextField = innerTextField,
            colors = colors,
            paddings = DealiTextFieldDefaults.paddings(),
            placeholder = placeholder,
            isPlaceholderVisible = isPlaceholderVisible,
            enabled = enabled,
            isError = isError,
            focused = focused,
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(46.dp)
                .zIndex(1f),
        )
        AnimatedVisibility(
            visible = isHelperTextVisible,
            enter = expandVertically(),
            exit = shrinkVertically(),
        ) {
            HelperText(
                helperText = helperText,
                isError = isError,
                colors = colors,
                topSpacing = spacing,
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(18.dp + spacing),
            )
        }
    }
}

@Composable
private fun LabelText(
    label: String?,
    isVisible: Boolean,
    colors: DealiTextFieldColors,
    bottomSpacing: Dp,
    modifier: Modifier = Modifier
) {
    if (isVisible) {
        Column(modifier = modifier) {
            val textColor by colors.labelTextColor()
            DealiText(
                text = label ?: "",
                style = AppTheme.typography.b2r14,
                color = textColor,
                overflow = TextOverflow.Clip,
                maxLines = 1
            )

            Spacer(modifier = Modifier.requiredHeight(bottomSpacing))
        }
    }
}

@Composable
private fun OutlinedTextField(
    innerTextField: @Composable () -> Unit,
    colors: DealiTextFieldColors,
    paddings: DealiTextFieldPaddingValues,
    placeholder: String?,
    isPlaceholderVisible: Boolean,
    enabled: Boolean,
    isError: Boolean,
    focused: Boolean,
    modifier: Modifier = Modifier,
) {
    val backgroundColor by colors.backgroundColor(enabled)
    val outlineColor by colors.outlineColor(enabled, focused, isError)
    val paddingValues by paddings.padding(decorated = false)

    val mergedModifier = modifier.then(
        Modifier
            .background(
                color = backgroundColor,
                shape = DealiTextFieldDefaults.BorderShape
            )
            .border(
                width = DealiTextFieldDefaults.BorderWidth,
                color = outlineColor,
                shape = DealiTextFieldDefaults.BorderShape
            )
            .padding(paddingValues)
    )

    Row(
        modifier = mergedModifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box {
            PlaceholderText(
                placeholder = placeholder,
                isVisible = isPlaceholderVisible,
                colors = colors
            )
            innerTextField()
        }
    }
}

@Composable
private fun PlaceholderText(
    placeholder: String?,
    isVisible: Boolean,
    colors: DealiTextFieldColors,
    modifier: Modifier = Modifier
) {
    if (isVisible) {
        val textColor by colors.placeholderTextColor()
        DealiText(
            text = placeholder ?: "",
            style = AppTheme.typography.b2r14,
            color = textColor,
            modifier = modifier
        )
    }
}

@Composable
private fun HelperText(
    helperText: String?,
    isError: Boolean,
    colors: DealiTextFieldColors,
    topSpacing: Dp,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Spacer(modifier = Modifier.requiredHeight(topSpacing))

        val textColor by colors.helperTextColor(isError)
        DealiText(
            text = buildString {
                append(DealiTextFieldDefaults.HelperTextBullet)
                append(helperText)
            },
            style = AppTheme.typography.b4r12,
            color = textColor,
            overflow = TextOverflow.Clip,
            maxLines = 1
        )
    }
}
