package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

/**
 * Composable 우측 상단에 뱃지 표현.
 *
 * @param count 뱃지 내부에 표시 할 숫자.
 * @param offset 뱃지의 위치를 조정할 수 있는 offset.
 */
@OptIn(ExperimentalTextApi::class)
@Stable
fun Modifier.badge(
    count: Int,
    offset: DpOffset = DpOffset.Zero
): Modifier = this.composed {
    val badgeColor = DealiColor.primary01
    val textColor = DealiColor.primary04

    val textMeasurer = rememberTextMeasurer()
    val textStyle = DealiFont.c1sb10.merge(
        TextStyle(color = textColor)
    )

    val isSingleDigit = count < 10
    val singleDigitBadgeRadius = with(LocalDensity.current) {
        8.dp.toPx()
    }
    val multiDigitBadgeSize = with(LocalDensity.current) {
        DpSize(21.dp, 14.dp).toSize()
    }

    drawWithCache {
        val measuredText = textMeasurer.measure(
            text = count.toString(),
            style = textStyle
        )

        val badgeCenter = Offset(x = size.width, y = 0f)
        val badgeRadius = CornerRadius(x = 100f, y = 100f)
        val badgeOffset = Offset(
            x = offset.x.toPx(),
            y = offset.y.toPx()
        )

        onDrawWithContent {
            drawContent()

            if (isSingleDigit) {
                drawCircle(
                    color = badgeColor,
                    radius = singleDigitBadgeRadius,
                    center = Offset(
                        x = badgeCenter.x + badgeOffset.x,
                        y = badgeCenter.y + badgeOffset.y
                    ),
                )
            } else {
                drawRoundRect(
                    color = badgeColor,
                    topLeft = Offset(
                        x = badgeCenter.x - multiDigitBadgeSize.width / 2f + badgeOffset.x,
                        y = badgeCenter.y - multiDigitBadgeSize.height / 2f + badgeOffset.y
                    ),
                    size = multiDigitBadgeSize,
                    cornerRadius = badgeRadius,
                )
            }

            drawText(
                textLayoutResult = measuredText,
                topLeft = Offset(
                    x = badgeCenter.x - measuredText.size.width / 2f + badgeOffset.x,
                    y = badgeCenter.y - measuredText.size.height / 2f + badgeOffset.y
                ),
            )
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
private fun BadgePreview() {
    Row(
        modifier = Modifier.size(width = 200.dp, height = 100.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(color = Color.Black)
                .badge(count = 3)
        )
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(color = Color.Black)
                .badge(count = 24)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
private fun BadgePreview_Offset() {
    Row(
        modifier = Modifier.size(width = 200.dp, height = 100.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(color = Color.Black)
                .badge(count = 3, offset = DpOffset(x = 0.dp, y = 5.dp))
        )
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(color = Color.Black)
                .badge(count = 24, offset = DpOffset(x = 0.dp, y = 5.dp))
        )
    }
}
