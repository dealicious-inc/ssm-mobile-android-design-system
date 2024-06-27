package net.deali.designsystem.component

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow

@Composable
fun DealiText(
    text: String,
    style: TextStyle,
    color: Color,
    modifier: Modifier = Modifier,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
) {
    var mergedStyle = style.merge(
        TextStyle(
            color = color
        )
    )
    if (textAlign != null) {
        mergedStyle = mergedStyle.merge(
            TextStyle(
                textAlign = textAlign,
            )
        )
    }


    BasicText(
        text = text,
        modifier = modifier,
        overflow = overflow,
        maxLines = maxLines,
        style = mergedStyle,
    )
}

@OptIn(ExperimentalTextApi::class)
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
    var mergedStyle = style.merge(
        TextStyle(
            brush = brush
        )
    )
    if (textAlign != null) {
        mergedStyle = mergedStyle.merge(
            TextStyle(
                textAlign = textAlign,
            )
        )
    }

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
) {
    var mergedStyle = style.merge(
        TextStyle(
            color = color
        )
    )
    if (textAlign != null) {
        mergedStyle = mergedStyle.merge(
            TextStyle(
                textAlign = textAlign,
            )
        )
    }

    BasicText(
        text = text,
        modifier = modifier,
        overflow = overflow,
        maxLines = maxLines,
        style = mergedStyle,
    )
}
