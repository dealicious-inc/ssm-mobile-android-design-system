package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

/**
 * 뱃지의 수평 정렬 방식.
 */
enum class BadgeAlignment {
    /** 왼쪽 끝 고정 → 오른쪽으로 늘어남 */
    Start,
    /** 가운데 고정 → 양쪽으로 늘어남 */
    Center,
    /** 오른쪽 끝 고정 → 왼쪽으로 늘어남 */
    End
}

/**
 * Composable 우측 상단에 원형점 형태의 뱃지 표현.
 *
 * @param badgeRadius 원형점의 반지름.
 * @param offset 뱃지의 위치를 조정할 수 있는 offset.
 */
@Stable
fun Modifier.badge(
    badgeRadius: Dp,
    offset: DpOffset = DpOffset.Zero
): Modifier = this.drawWithCache {
    val badgeColor = DealiColor.primary01
    val badgeCenter = Offset(x = size.width, y = 0f)
    val badgeOffset = Offset(
        x = offset.x.toPx(),
        y = offset.y.toPx()
    )

    onDrawWithContent {
        drawContent()
        drawCircle(
            color = badgeColor,
            radius = badgeRadius.toPx(),
            center = Offset(
                x = badgeCenter.x + badgeOffset.x,
                y = badgeCenter.y + badgeOffset.y
            )
        )
    }
}

/**
 * Composable 우측 상단에 숫자가 포함 된 뱃지 표현.
 *
 * @param count 뱃지 내부에 표시 할 숫자.
 * @param offset 뱃지의 위치를 조정할 수 있는 offset.
 * @param alignment 뱃지의 수평 정렬 방식.
 */
@Stable
fun Modifier.badge(
    count: Int,
    offset: DpOffset = DpOffset.Zero,
    alignment: BadgeAlignment = BadgeAlignment.Center
): Modifier = badge(
    text = count.toString(),
    offset = offset,
    alignment = alignment
)

/**
 * Composable 우측 상단에 숫자가 포함 된 뱃지 표현.
 *
 * @param text 뱃지 내부에 표시 할 내용.
 * @param offset 뱃지의 위치를 조정할 수 있는 offset.
 * @param alignment 뱃지의 수평 정렬 방식.
 */
@Stable
fun Modifier.badge(
    text: String,
    offset: DpOffset = DpOffset.Zero,
    alignment: BadgeAlignment = BadgeAlignment.Center
): Modifier = this.composed {
    val badgeColor = DealiColor.primary01
    val textColor = DealiColor.primary04

    val textMeasurer = rememberTextMeasurer()
    val textStyle = DealiFont.c1sb10.merge(
        TextStyle(color = textColor)
    )

    drawWithCache {
        val measuredText = textMeasurer.measure(
            text = text,
            style = textStyle
        )

        val badgeSize = Size(
            width = measuredText.size.width.toFloat() + 8.dp.toPx(),
            height = 14.dp.toPx(),
        )

        val badgeCenter = Offset(x = size.width, y = 0f)
        val badgeRadius = CornerRadius(x = 100f, y = 100f)
        val badgeOffset = Offset(
            x = offset.x.toPx(),
            y = offset.y.toPx()
        )

        val badgeX = when (alignment) {
            BadgeAlignment.Start -> badgeCenter.x + badgeOffset.x
            BadgeAlignment.Center -> badgeCenter.x - badgeSize.width / 2f + badgeOffset.x
            BadgeAlignment.End -> badgeCenter.x - badgeSize.width + badgeOffset.x
        }

        val textX = when (alignment) {
            BadgeAlignment.Start -> badgeCenter.x + (badgeSize.width - measuredText.size.width) / 2f + badgeOffset.x
            BadgeAlignment.Center -> badgeCenter.x - measuredText.size.width / 2f + badgeOffset.x
            BadgeAlignment.End -> badgeCenter.x - badgeSize.width + (badgeSize.width - measuredText.size.width) / 2f + badgeOffset.x
        }

        onDrawWithContent {
            drawContent()

            drawRoundRect(
                color = badgeColor,
                topLeft = Offset(
                    x = badgeX,
                    y = badgeCenter.y - badgeSize.height / 2f + badgeOffset.y
                ),
                size = badgeSize,
                cornerRadius = badgeRadius,
            )

            drawText(
                textLayoutResult = measuredText,
                topLeft = Offset(
                    x = textX,
                    y = badgeCenter.y - measuredText.size.height / 2f + badgeOffset.y
                ),
            )
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
private fun Preview() {
    Column {
        // 원형점 뱃지
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Black)
                    .badge(badgeRadius = 2.dp)
            )
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Black)
                    .badge(
                        badgeRadius = 2.dp,
                        offset = DpOffset(x = 0.dp, y = 5.dp)
                    )
            )
        }

        // Center 정렬 (기본값) - 가운데를 기준으로 양쪽으로 확장
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Black)
                    .badge(count = 3, alignment = BadgeAlignment.Center)
            )
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Black)
                    .badge(count = 24, alignment = BadgeAlignment.Center)
            )
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Black)
                    .badge(count = 111, alignment = BadgeAlignment.Center)
            )
        }

        // Start 정렬 - 왼쪽 끝 고정, 오른쪽으로 확장
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Black)
                    .badge(count = 3, alignment = BadgeAlignment.Start)
            )
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Black)
                    .badge(count = 24, alignment = BadgeAlignment.Start)
            )
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Black)
                    .badge(count = 111, alignment = BadgeAlignment.Start)
            )
        }

        // End 정렬 - 오른쪽 끝 고정, 왼쪽으로 확장
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Black)
                    .badge(count = 3, alignment = BadgeAlignment.End)
            )
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Black)
                    .badge(count = 24, alignment = BadgeAlignment.End)
            )
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Black)
                    .badge(count = 111, alignment = BadgeAlignment.End)
            )
        }
    }
}
