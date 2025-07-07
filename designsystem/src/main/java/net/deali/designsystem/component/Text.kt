package net.deali.designsystem.component

import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import net.deali.designsystem.theme.DealiColor

@Composable
fun DealiText(
    text: String,
    style: TextStyle,
    modifier: Modifier = Modifier,
    color: Color = DealiColor.g100,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    val mergedStyle = style.merge(
        TextStyle(
            color = color,
            textAlign = textAlign ?: TextAlign.Unspecified,
        )
    )

    BasicText(
        text = text,
        modifier = modifier,
        overflow = overflow,
        maxLines = maxLines,
        style = mergedStyle,
    )
}

@Composable
fun DealiText(
    text: String,
    style: TextStyle,
    brush: Brush,
    modifier: Modifier = Modifier,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    val mergedStyle = style.merge(
        TextStyle(
            brush = brush,
            textAlign = textAlign ?: TextAlign.Unspecified,
        )
    )

    BasicText(
        text = text,
        modifier = modifier,
        overflow = overflow,
        maxLines = maxLines,
        style = mergedStyle,
    )
}

@Composable
fun DealiText(
    text: AnnotatedString,
    style: TextStyle,
    color: Color,
    modifier: Modifier = Modifier,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
    inlineContent: Map<String, InlineTextContent> = mapOf(),
) {
    val mergedStyle = style.merge(
        TextStyle(
            color = color,
            textAlign = textAlign ?: TextAlign.Unspecified,
        )
    )

    BasicText(
        text = text,
        modifier = modifier,
        overflow = overflow,
        maxLines = maxLines,
        style = mergedStyle,
        inlineContent = inlineContent,
    )
}