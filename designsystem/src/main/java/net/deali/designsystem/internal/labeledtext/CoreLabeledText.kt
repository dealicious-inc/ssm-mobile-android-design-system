package net.deali.designsystem.internal.labeledtext

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.HorizontalSpacer
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.component.VerticalSpacer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
internal fun SingleLabeledTextBullet(
    text: String,
    color: Color,
    highlightText: String = "",
    highlightColor: Color = Color.Unspecified,
    isHighlightBold: Boolean = false,
) {
    CoreSingleLabeledText(
        text = text,
        color = color,
        leftContent = {
            Box(
                modifier = Modifier
                    .padding(top = 7.dp, end = 8.dp),
            ) {
                Box(
                    modifier = Modifier
                        .size(3.dp)
                        .clip(CircleShape)
                        .background(color),
                )
            }
        },
        highlightText = highlightText,
        highlightColor = highlightColor,
        isHighlightBold = isHighlightBold,
    )
}

@Composable
internal fun SingleLabeledTextBullet(
    annotatedString: AnnotatedString,
    color: Color,
) {
    CoreSingleLabeledText(
        annotatedString = annotatedString,
        color = color,
        leftContent = {
            Box(
                modifier = Modifier
                    .padding(top = 7.dp, end = 8.dp),
            ) {
                Box(
                    modifier = Modifier
                        .size(3.dp)
                        .clip(CircleShape)
                        .background(color),
                )
            }
        }
    )
}

@Composable
internal fun SingleLabeledTextNumber(
    text: String,
    color: Color,
    number: Number,
    highlightText: String = "",
    highlightColor: Color = Color.Unspecified,
    isHighlightBold: Boolean = false,
) {
    CoreSingleLabeledText(
        text = text,
        color = color,
        leftContent = {
            Box(
                modifier = Modifier.padding(end = 4.dp)
            ) {
                DealiText(
                    text = "$number.",
                    style = DealiFont.b3r13,
                    color = color,
                )
            }
        },
        highlightText = highlightText,
        highlightColor = highlightColor,
        isHighlightBold = isHighlightBold,
    )
}

@Composable
internal fun SingleLabeledTextNumber(
    annotatedString: AnnotatedString,
    number: Number,
    color: Color,
) {
    CoreSingleLabeledText(
        annotatedString = annotatedString,
        color = color,
        leftContent = {
            Box(
                modifier = Modifier.padding(end = 4.dp)
            ) {
                DealiText(
                    text = "$number.",
                    style = DealiFont.b3r13,
                    color = color,
                )
            }
        },
    )
}

@Composable
internal fun SingleLabeledTextIcon01(
    text: String,
    color: Color,
    @DrawableRes iconRes: Int,
    highlightText: String = "",
    highlightColor: Color = Color.Unspecified,
    isHighlightBold: Boolean = false,
) {
    CoreSingleLabeledText(
        text = text,
        color = color,
        leftContent = {
            Icon16(
                modifier = Modifier.padding(end = 8.dp),
                iconRes = iconRes,
                color = DealiColor.g80,
            )
        },
        highlightText = highlightText,
        highlightColor = highlightColor,
        isHighlightBold = isHighlightBold,
    )
}

@Composable
private fun CoreSingleLabeledText(
    text: String,
    color: Color,
    leftContent: @Composable () -> Unit,
    highlightText: String = "",
    highlightColor: Color = Color.Unspecified,
    isHighlightBold: Boolean = false,
) {
    Row {
        leftContent()

        if (highlightText.isNotEmpty() && highlightColor != Color.Unspecified) {
            val annotatedString = buildAnnotatedString {
                append(text)
                addStyle(
                    style = SpanStyle(
                        color = highlightColor,
                        fontWeight = if (isHighlightBold) DealiFont.b3sb13.fontWeight else DealiFont.b3r13.fontWeight,
                    ),
                    start = text.indexOf(highlightText),
                    end = text.indexOf(highlightText) + highlightText.length
                )
            }
            DealiText(
                text = annotatedString,
                style = DealiFont.b3r13,
                color = color,
            )
        } else {
            DealiText(
                text = text,
                style = DealiFont.b3r13,
                color = color,
            )
        }
    }
}

@Composable
private fun CoreSingleLabeledText(
    annotatedString: AnnotatedString,
    color: Color,
    leftContent: @Composable () -> Unit,
) {
    Row {
        leftContent()

        DealiText(
            text = annotatedString,
            style = DealiFont.b3r13,
            color = color,
        )
    }
}

@Composable
internal fun LabeledTextContainer(
    textList: List<String>,
    modifier: Modifier = Modifier,
    title: String = "",
    @DrawableRes titleIconRes: Int = 0,
    textContent: @Composable (index: Int) -> Unit,
) {
    Column(
        modifier = modifier,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            if (titleIconRes != 0) {
                Icon16(
                    iconRes = titleIconRes,
                    modifier = Modifier.align(Alignment.CenterVertically),
                    color = DealiColor.g100,
                )

                HorizontalSpacer(8.dp)
            }

            if (title.isNotEmpty()) {
                DealiText(
                    text = title,
                    style = DealiFont.b3sb13,
                    color = DealiColor.g100,
                )
            }
        }

        if (title.isNotEmpty()) {
            VerticalSpacer(8.dp)
        }

        textList.forEachIndexed { index, it ->
            textContent(index)

            if (index < textList.size - 1) {
                VerticalSpacer(8.dp)
            }
        }

    }
}
