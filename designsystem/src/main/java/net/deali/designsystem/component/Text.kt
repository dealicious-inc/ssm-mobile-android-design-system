package net.deali.designsystem.component

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow

@Composable
fun DealiText(
    text: String,
    style: TextStyle,
    modifier: Modifier = Modifier,
    color: Color,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
) {
    val mergedStyle = style.merge(
        TextStyle(
            color = color
        )
    )

    BasicText(
        text = text,
        modifier = modifier,
        overflow = overflow,
        maxLines = maxLines,
        style = mergedStyle
    )
}
