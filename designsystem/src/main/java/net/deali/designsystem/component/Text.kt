package net.deali.designsystem.component

import androidx.compose.foundation.text.BasicText
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
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
    val mergedStyle = style.merge(
        TextStyle(
            color = color,
            textAlign = textAlign,
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
) {
    val mergedStyle = style.merge(
        TextStyle(
            color = color,
            textAlign = textAlign,
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
