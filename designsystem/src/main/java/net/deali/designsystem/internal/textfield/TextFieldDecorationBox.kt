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
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import net.deali.designsystem.theme.DealiFont

@Composable
internal fun DealiTextFieldDecorationBox(
    enabled: Boolean,
    isError: Boolean,
    singleLine: Boolean,
    colors: DealiTextFieldColors,
    interactionSource: MutableInteractionSource,
    isValueEmpty: Boolean,
    placeholder: String?,
    label: String?,
    helperText: String?,
    isHelperTextVisible: Boolean,
    modifier: Modifier = Modifier,
    innerTextField: @Composable () -> Unit,
    leadingContent: @Composable (() -> Unit)?,
    trailingContent: @Composable (() -> Unit)?,
) {
    val focused by interactionSource.collectIsFocusedAsState()
    val isLabelVisible = !label.isNullOrEmpty()
    val isPlaceholderVisible = if (focused) false else !placeholder.isNullOrEmpty() && isValueEmpty
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
        InnerTextField(
            colors = colors,
            paddings = DealiTextFieldDefaults.paddings(),
            placeholder = placeholder,
            isPlaceholderVisible = isPlaceholderVisible,
            enabled = enabled,
            isError = isError,
            focused = focused,
            singleLine = singleLine,
            modifier = Modifier
                .fillMaxWidth()
                .defaultMinSize(minHeight = 46.dp)
                .zIndex(1f),
            innerTextField = innerTextField,
            leadingContent = leadingContent,
            trailingContent = trailingContent,
        )
        AnimatedVisibility(
            visible = isHelperTextVisible,
            enter = expandVertically(),
            exit = shrinkVertically(),
        ) {
            Column {
                Spacer(modifier = Modifier.height(spacing))
                HelperText(
                    helperText = helperText,
                    isError = isError,
                    colors = colors,
                    topSpacing = spacing,
                    modifier = Modifier.fillMaxWidth(),
                )
            }
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
                style = DealiFont.b2r14,
                color = textColor,
                overflow = TextOverflow.Clip,
                maxLines = 1
            )

            Spacer(modifier = Modifier.requiredHeight(bottomSpacing))
        }
    }
}

@Composable
private fun InnerTextField(
    colors: DealiTextFieldColors,
    paddings: DealiTextFieldPaddingValues,
    placeholder: String?,
    isPlaceholderVisible: Boolean,
    enabled: Boolean,
    isError: Boolean,
    focused: Boolean,
    singleLine: Boolean,
    modifier: Modifier = Modifier,
    innerTextField: @Composable () -> Unit,
    leadingContent: @Composable (() -> Unit)?,
    trailingContent: @Composable (() -> Unit)?,
) {
    val backgroundColor by colors.backgroundColor(enabled)
    val outlineColor by colors.outlineColor(enabled, focused, isError)
    val paddingValues by paddings.padding(
        singleLine = singleLine,
        hasLeadingContent = leadingContent != null,
        hasTrailingContent = trailingContent != null,
    )

    val borderModifier = outlineColor?.let { color ->
        Modifier.border(
            width = DealiTextFieldDefaults.BorderWidth,
            color = color,
            shape = DealiTextFieldDefaults.BorderShape
        )
    } ?: Modifier

    val mergedModifier = modifier.then(
        Modifier
            .background(
                color = backgroundColor,
                shape = DealiTextFieldDefaults.BorderShape
            )
            .then(borderModifier)
            .padding(paddingValues)
    )

    Row(
        modifier = mergedModifier,
        horizontalArrangement = when {
            leadingContent != null -> Arrangement.spacedBy(8.dp)
            trailingContent != null -> Arrangement.spacedBy(16.dp)
            else -> Arrangement.Start
        },
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (leadingContent != null) {
            Box {
                leadingContent()
            }
        }
        Box(modifier = Modifier.weight(1f)) {
            PlaceholderText(
                placeholder = placeholder,
                isVisible = isPlaceholderVisible,
                colors = colors
            )
            innerTextField()
        }
        if (trailingContent != null) {
            Box {
                trailingContent()
            }
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
            style = DealiFont.b2r14,
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
                append(helperText ?: "")
            },
            style = DealiFont.b4r12,
            color = textColor,
            overflow = TextOverflow.Clip,
        )
    }
}
