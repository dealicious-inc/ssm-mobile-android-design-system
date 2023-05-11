package net.deali.designsystem.component

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import net.deali.designsystem.theme.gray100
import net.deali.designsystem.unit.tu

@Composable
fun DealiText(
    text: String,
    style: TextStyle,
    modifier: Modifier = Modifier,
    color: Color = gray100,
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