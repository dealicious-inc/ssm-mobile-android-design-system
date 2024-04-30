package net.deali.designsystem.internal.textfield

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.Canvas
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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@OptIn(ExperimentalTextApi::class)
@Composable
internal fun DealiTextFieldDecorationBox(
    enabled: Boolean,
    isError: Boolean,
    singleLine: Boolean,
    colors: DealiTextFieldColors,
    interactionSource: MutableInteractionSource,
    isValueEmpty: Boolean,
    placeholder: String?,
    placeholderMaxLines: Int,
    placeholderOverflow: TextOverflow,
    label: String?,
    isNecessary: Boolean,
    helperText: String?,
    textLength: Int,
    maxLength: Int,
    isHelperTextVisible: Boolean,
    isCounterTextVisible: Boolean,
    innerTextFieldMinHeight: Dp,
    innerTextFieldMaxHeight: Dp,
    modifier: Modifier = Modifier,
    innerTextField: @Composable () -> Unit,
    labelContent: @Composable (() -> Unit)?,
    buttonContent: @Composable (() -> Unit)?,
    leadingContent: @Composable (() -> Unit)?,
    trailingContent: @Composable (() -> Unit)?,
    fixedContent: @Composable (() -> Unit)?,
) {
    val focused by interactionSource.collectIsFocusedAsState()
    val isLabelVisible = !label.isNullOrEmpty() || isNecessary || labelContent != null
    val isBottomLabelVisible = (!helperText.isNullOrEmpty() && isHelperTextVisible) || isCounterTextVisible
    val isPlaceholderVisible = !placeholder.isNullOrEmpty() && isValueEmpty
    val columnSpacing = 4.dp

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start,
    ) {
        AnimatedVisibility(
            visible = isLabelVisible,
            enter = expandVertically(expandFrom = Alignment.Top),
            exit = shrinkVertically(shrinkTowards = Alignment.Top)
        ) {
            Column {
                ConstraintLayout(
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {
                    val (labelRef, labelContentRef) = createRefs()
                    createHorizontalChain(labelRef, labelContentRef, chainStyle = ChainStyle.Packed(0f))

                    LabelText(
                        modifier = Modifier
                            .constrainAs(labelRef) {
                                start.linkTo(parent.start)
                                end.linkTo(labelContentRef.start)
                                width = Dimension.preferredWrapContent
                                centerVerticallyTo(parent)
                            },
                        label = label,
                        colors = colors,
                    )

                    val textMeasurer = rememberTextMeasurer()
                    val oneLineTextHeight = with(LocalDensity.current) {
                        textMeasurer.measure(
                            text = "A",
                            style = DealiFont.b2r14
                        ).size.height.toDp()
                    }

                    Row(
                        modifier = Modifier
                            .constrainAs(labelContentRef) {
                                start.linkTo(labelRef.end)
                                end.linkTo(parent.end)
                                top.linkTo(parent.top)
                            }
                            .height(oneLineTextHeight)
                            .padding(horizontal = 4.dp),
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        if (isNecessary) {
                            Canvas(
                                modifier = Modifier
                                    .size(5.dp)
                                    .align(Alignment.Top)
                                    .offset(y = 4.dp)
                            ) {
                                drawCircle(color = DealiColor.primary01)
                            }
                        }

                        labelContent?.invoke()
                    }
                }

                Spacer(modifier = Modifier.height(columnSpacing))
            }
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            InnerTextField(
                colors = colors,
                paddings = DealiTextFieldDefaults.paddings(),
                placeholder = placeholder,
                isPlaceholderVisible = isPlaceholderVisible,
                placeholderMaxLines = placeholderMaxLines,
                placeholderOverflow = placeholderOverflow,
                enabled = enabled,
                isError = isError,
                focused = focused,
                singleLine = singleLine,
                modifier = Modifier
                    .weight(1f)
                    .heightIn(
                        min = innerTextFieldMinHeight,
                        max = innerTextFieldMaxHeight
                    )
                    .zIndex(1f),
                innerTextField = innerTextField,
                leadingContent = leadingContent,
                trailingContent = trailingContent,
                fixedContent = fixedContent,
            )

            if (buttonContent != null) {
                buttonContent()
            }
        }

        AnimatedVisibility(
            visible = isBottomLabelVisible,
            enter = expandVertically(),
            exit = shrinkVertically(),
        ) {
            Column {
                Spacer(modifier = Modifier.height(columnSpacing))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 4.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ) {
                    if (isHelperTextVisible) {
                        HelperText(
                            modifier = Modifier.weight(1f),
                            helperText = helperText,
                            isError = isError,
                            colors = colors,
                        )
                    }

                    Spacer(modifier = Modifier.width(4.dp))

                    if (isCounterTextVisible) {
                        CounterText(
                            textLength = textLength,
                            maxLength = maxLength,
                            colors = colors,
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun LabelText(
    label: String?,
    colors: DealiTextFieldColors,
    modifier: Modifier = Modifier
) {
    val textColor by colors.labelTextColor()

    DealiText(
        modifier = modifier,
        text = label ?: "",
        style = DealiFont.b2r14,
        color = textColor,
    )
}

@Composable
private fun PlaceholderText(
    placeholder: String?,
    isVisible: Boolean,
    colors: DealiTextFieldColors,
    maxLines: Int,
    overflow: TextOverflow,
    modifier: Modifier = Modifier
) {
    if (isVisible) {
        val textColor by colors.placeholderTextColor()
        DealiText(
            text = placeholder ?: "",
            style = DealiFont.b2r14,
            color = textColor,
            maxLines = maxLines,
            overflow = overflow,
            modifier = modifier
        )
    }
}

@Composable
private fun HelperText(
    helperText: String?,
    isError: Boolean,
    colors: DealiTextFieldColors,
    modifier: Modifier = Modifier
) {
    val textColor by colors.helperTextColor(isError)
    DealiText(
        modifier = modifier,
        text = helperText ?: "",
        style = DealiFont.b4r12,
        color = textColor,
        overflow = TextOverflow.Clip,
    )
}

@Composable
private fun CounterText(
    textLength: Int,
    maxLength: Int,
    colors: DealiTextFieldColors,
    modifier: Modifier = Modifier
) {
    val textColor by colors.helperTextColor(false)

    DealiText(
        modifier = modifier,
        text = "$textLength/$maxLength",
        style = DealiFont.b4r12,
        color = textColor
    )
}

@Composable
private fun InnerTextField(
    colors: DealiTextFieldColors,
    paddings: DealiTextFieldPaddingValues,
    placeholder: String?,
    isPlaceholderVisible: Boolean,
    placeholderMaxLines: Int,
    placeholderOverflow: TextOverflow,
    enabled: Boolean,
    isError: Boolean,
    focused: Boolean,
    singleLine: Boolean,
    modifier: Modifier = Modifier,
    innerTextField: @Composable () -> Unit,
    leadingContent: @Composable (() -> Unit)?,
    trailingContent: @Composable (() -> Unit)?,
    fixedContent: @Composable (() -> Unit)?,
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
            fixedContent != null -> Arrangement.spacedBy(16.dp)
            else -> Arrangement.Start
        },
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (leadingContent != null) {
            leadingContent()
        }
        Box(modifier = Modifier.weight(1f)) {
            PlaceholderText(
                placeholder = placeholder,
                isVisible = isPlaceholderVisible,
                colors = colors,
                maxLines = placeholderMaxLines,
                overflow = placeholderOverflow,
            )
            innerTextField()
        }
        if (trailingContent != null || fixedContent != null) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                trailingContent?.invoke()
                fixedContent?.invoke()
            }
        }
    }
}
