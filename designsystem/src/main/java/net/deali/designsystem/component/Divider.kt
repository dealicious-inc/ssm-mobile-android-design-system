package net.deali.designsystem.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * 가로 구분선.
 *
 * @param color 구분선 색상.
 * @param modifier [Modifier].
 * @param thickness 구분선 두께.
 * @param cap 선 양 끝의 스타일.
 */
@Composable
fun HorizontalDivider(
    color: Color,
    modifier: Modifier = Modifier,
    thickness: Dp = 1.dp,
    cap: StrokeCap = Stroke.DefaultCap,
) {
    val thicknessPx = with(LocalDensity.current) { thickness.toPx() }
    Canvas(
        modifier = modifier.then(
            Modifier
                .fillMaxWidth()
                .heightIn(min = thickness)
        )
    ) {
        val heightCenter = this.size.height / 2f
        drawLine(
            color = color,
            start = Offset(x = 0f, y = heightCenter),
            end = Offset(x = this.size.width, y = heightCenter),
            strokeWidth = thicknessPx,
            cap = cap,
        )
    }
}

/**
 * 세로 구분선.
 *
 * @param color 구분선 색상.
 * @param modifier [Modifier].
 * @param thickness 구분선 두께.
 * @param cap 선 양 끝의 스타일.
 */
@Composable
fun VerticalDivider(
    color: Color,
    modifier: Modifier = Modifier,
    thickness: Dp = 1.dp,
    cap: StrokeCap = Stroke.DefaultCap,
) {
    val thicknessPx = with(LocalDensity.current) { thickness.toPx() }
    Canvas(
        modifier = modifier.then(
            Modifier
                .fillMaxHeight()
                .widthIn(min = thickness)
        )
    ) {
        val widthCenter = this.size.width / 2f
        drawLine(
            color = color,
            start = Offset(x = widthCenter, y = 0f),
            end = Offset(x = widthCenter, y = this.size.height),
            strokeWidth = thicknessPx,
            cap = cap,
        )
    }
}

/**
 * 가로 점선 구분선.
 *
 * @param color 선의 색상.
 * @param modifier [Modifier].
 * @param thickness 선의 굵기.
 * @param intervals 점선의 간격과 길이 옵션.
 * @param cap 선 양 끝의 스타일.
 */
@Composable
fun HorizontalDashedDivider(
    color: Color,
    modifier: Modifier = Modifier,
    thickness: Dp = 1.dp,
    intervals: DashedDividerIntervals = DashedDividerIntervals.Default,
    cap: StrokeCap = Stroke.DefaultCap,
) {
    val density = LocalDensity.current
    val thicknessPx = with(density) {
        thickness.toPx()
    }
    val pathIntervals = with(intervals) {
        with(density) {
            toPathIntervals()
        }
    }
    Canvas(
        modifier = modifier.then(
            Modifier
                .fillMaxWidth()
                .heightIn(min = thickness)
        )
    ) {
        val heightCenter = this.size.height / 2f
        drawLine(
            color = color,
            start = Offset(x = 0f, y = heightCenter),
            end = Offset(x = this.size.width, y = heightCenter),
            strokeWidth = thicknessPx,
            cap = cap,
            pathEffect = PathEffect.dashPathEffect(
                intervals = pathIntervals,
                phase = 0f
            )
        )
    }
}

/**
 * 세로 점선 구분선.
 *
 * @param color 선의 색상.
 * @param modifier [Modifier].
 * @param thickness 선의 굵기.
 * @param intervals 점선의 간격과 길이 옵션.
 * @param cap 선 양 끝의 스타일.
 */
@Composable
fun VerticalDashedDivider(
    color: Color,
    modifier: Modifier = Modifier,
    thickness: Dp = 1.dp,
    intervals: DashedDividerIntervals = DashedDividerIntervals.Default,
    cap: StrokeCap = Stroke.DefaultCap,
) {
    val density = LocalDensity.current
    val thicknessPx = with(density) {
        thickness.toPx()
    }
    val pathIntervals = with(intervals) {
        with(density) {
            toPathIntervals()
        }
    }
    Canvas(
        modifier = modifier.then(
            Modifier
                .fillMaxHeight()
                .widthIn(min = thickness)
        )
    ) {
        val widthCenter = this.size.width / 2f
        drawLine(
            color = color,
            start = Offset(x = widthCenter, y = 0f),
            end = Offset(x = widthCenter, y = this.size.height),
            strokeWidth = thicknessPx,
            cap = cap,
            pathEffect = PathEffect.dashPathEffect(
                intervals = pathIntervals,
                phase = 0f
            )
        )
    }
}

/**
 * 점선 구분선의 각 점선의 길이와 그 사이의 너비 정보가 담긴 옵션.
 *
 * @param dashLength 각 점선의 길이.
 * @param spacing 각 점선 사이의 거리.
 */
@Immutable
data class DashedDividerIntervals(
    val dashLength: Dp,
    val spacing: Dp
) {
    fun Density.toPathIntervals(): FloatArray {
        return with(this) {
            floatArrayOf(
                dashLength.toPx(),
                spacing.toPx(),
            )
        }
    }

    companion object {
        val Default = DashedDividerIntervals(
            dashLength = 3.dp,
            spacing = 3.dp,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HorizontalDividerPreview() {
    HorizontalDivider(
        modifier = Modifier
            .width(100.dp)
            .padding(16.dp),
        color = Color.Gray,
        thickness = 2.dp,
    )
}

@Preview(showBackground = true)
@Composable
private fun VerticalDividerPreview() {
    VerticalDivider(
        modifier = Modifier
            .height(100.dp)
            .padding(16.dp),
        color = Color.Gray,
        thickness = 2.dp,
    )
}

@Preview(showBackground = true)
@Composable
private fun HorizontalDashedDividerPreview() {
    HorizontalDashedDivider(
        modifier = Modifier
            .width(100.dp)
            .padding(16.dp),
        color = Color.Gray,
        thickness = 2.dp,
        intervals = DashedDividerIntervals(dashLength = 6.dp, spacing = 4.dp),
    )
}

@Preview(showBackground = true)
@Composable
private fun VerticalDashedDividerPreview() {
    VerticalDashedDivider(
        modifier = Modifier
            .height(100.dp)
            .padding(16.dp),
        color = Color.Gray,
        thickness = 2.dp,
        intervals = DashedDividerIntervals(dashLength = 6.dp, spacing = 4.dp),
    )
}
