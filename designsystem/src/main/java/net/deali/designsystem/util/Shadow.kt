package net.deali.designsystem.util

import android.graphics.BlurMaskFilter
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

private val defaultShadowColor = Color.Black.copy(alpha = 0.22f)

/**
 * Composable 뒤쪽에 그림자를 그립니다.
 *
 * @param color 그림자의 색상.
 * @param offsetX 그림자 위치의 x 좌표 offset.
 * @param offsetY 그림자 위치의 y 좌표 offset.
 * @param cornerRadius 그림자의 모서리 반지름.
 * @param blurRadius 그림자 블러 효과의 세기.
 * @param spread 그림자가 퍼져 있는 정도. 커질 수록 그림자를 넓게 그립니다.
 * @param elevation 떠 있는 효과를 위한 elevation 값. 커질 수록 아래에 내려서 그림자를 그립니다.
 */
@Stable
fun Modifier.shadow(
    color: Color = defaultShadowColor,
    offsetX: Dp = 0.dp,
    offsetY: Dp = 0.dp,
    cornerRadius: Dp = 0.dp,
    blurRadius: Dp = 1.dp,
    spread: Dp = 0.dp,
    elevation: Dp = 1.dp, // TODO: 논의 필요
): Modifier = composed {
    val radiusPx = with(LocalDensity.current) { cornerRadius.toPx() }
    shadow(
        color = color,
        offsetX = offsetX,
        offsetY = offsetY,
        cornerRadius = CornerRadius(x = radiusPx, y = radiusPx),
        blurRadius = blurRadius,
        spread = spread,
        elevation = elevation,
    )
}

/**
 * Composable 뒤쪽에 그림자를 그립니다.
 *
 * @param color 그림자의 색상.
 * @param offsetX 그림자 위치의 x 좌표 offset.
 * @param offsetY 그림자 위치의 y 좌표 offset.
 * @param cornerRadius 그림자의 모서리 반지름.
 * @param blurRadius 그림자 블러 효과의 세기.
 * @param spread 그림자가 퍼져 있는 정도. 커질 수록 그림자를 넓게 그립니다.
 * @param elevation 떠 있는 효과를 위한 elevation 값. 커질 수록 아래에 내려서 그림자를 그립니다.
 */
@Stable
fun Modifier.shadow(
    color: Color = defaultShadowColor,
    offsetX: Dp = 0.dp,
    offsetY: Dp = 0.dp,
    cornerRadius: CornerRadius = CornerRadius.Zero,
    blurRadius: Dp = 1.dp,
    spread: Dp = 0.dp,
    elevation: Dp = 1.dp, // TODO: 논의 필요
): Modifier = then(
    drawBehind {
        val offsetXPx = offsetX.toPx()
        val offsetYPx = offsetY.toPx()
        drawShadow(
            color = color,
            topLeft = Offset(x = offsetXPx, y = offsetYPx),
            size = this.size,
            cornerRadius = cornerRadius,
            blurRadius = blurRadius,
            spread = spread,
            elevation = elevation,
        )
    }
)

/**
 * 그림자를 그립니다.
 *
 * @param color 그림자의 색상.
 * @param topLeft 그림자를 그릴 위치의 왼쪽 상단 offset.
 * @param size 그림자를 그릴 영역의 크기.
 * @param cornerRadius 모서리의 둥근 정도.
 * @param blurRadius 그림자 블러 효과 세기.
 * @param spread 그림자가 퍼져 있는 정도. 커질 수록 그림자를 넓게 그립니다.
 * @param elevation 떠 있는 효과를 위한 elevation 값. 커질 수록 아래에 내려서 그림자를 그립니다.
 */
fun DrawScope.drawShadow(
    color: Color = defaultShadowColor,
    topLeft: Offset = Offset.Zero,
    size: Size = Size(width = this.size.width - topLeft.x, height = this.size.height - topLeft.y),
    cornerRadius: CornerRadius = CornerRadius.Zero,
    blurRadius: Dp = 1.dp,
    spread: Dp = 0.dp,
    elevation: Dp = 1.dp,
) {
    val paint = Paint()
    val frameworkPaint = paint.asFrameworkPaint()
    val spreadPx = spread.toPx()
    val elevationPx = elevation.toPx()
    val leftPx = topLeft.x - spreadPx
    val topPx = topLeft.y - spreadPx + elevationPx
    val rightPx = topLeft.x + size.width + spreadPx
    val bottomPx = topLeft.y + size.height + spreadPx + elevationPx

    drawIntoCanvas { canvas ->
        if (blurRadius != 0.dp) {
            frameworkPaint.maskFilter =
                (BlurMaskFilter(blurRadius.toPx(), BlurMaskFilter.Blur.NORMAL))
        }

        frameworkPaint.color = color.toArgb()
        canvas.drawRoundRect(
            left = leftPx,
            top = topPx,
            right = rightPx,
            bottom = bottomPx,
            radiusX = cornerRadius.x,
            radiusY = cornerRadius.y,
            paint
        )
    }
}
