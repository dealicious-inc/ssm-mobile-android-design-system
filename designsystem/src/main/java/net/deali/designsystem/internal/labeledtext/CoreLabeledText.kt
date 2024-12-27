package net.deali.designsystem.internal.labeledtext

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
internal fun CoreLabeledTextBullet(
    text: String,
    color: Color,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
    ) {
        Box(
            modifier = Modifier
                .padding(top = 7.5.dp, end = 8.dp)
                .align(Alignment.Top)
        ) {
            Box(
                modifier = Modifier
                    .size(3.dp)
                    .clip(CircleShape)
                    .background(color),
            )
        }

        DealiText(
            text = text,
            modifier = modifier,
            style = DealiFont.b3r13,
            color = color,
        )
    }
}

@Composable
internal fun CoreLabeledTextNumber(
    text: String,
    color: Color,
    number: Number,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
    ) {
        Box(
            modifier = Modifier
                .padding(end = 4.dp)
                .align(Alignment.Top)
        ) {
            DealiText(
                text = "$number.",
                style = DealiFont.b3r13,
                color = color,
            )
        }

        DealiText(
            text = text,
            modifier = modifier,
            style = DealiFont.b3r13,
            color = color,
        )
    }
}