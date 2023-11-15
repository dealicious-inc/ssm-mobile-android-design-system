package net.deali.designsystem.internal.slider


import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun PriceRangeSlider(
    modifier: Modifier = Modifier,
    leftInitValue: Float = 0f,
    rightInitValue: Float = 1f,
    rangePoints: List<String>,
    trackColor: Color = DealiColor.primary01,
    trackBackgroundColor: Color = DealiColor.g30,
    trackCornerRadius: CornerRadius = CornerRadius(32f, 32f),
    trackHeight: Dp = 6.dp,
    thumbRadius: Dp = 11.dp,
    onValueChanged: (left: Float, right: Float) -> Unit,
) {
    if (rangePoints.isEmpty()) {
        Log.e("PriceRangeSlider", "rangePoints가 비어 있습니다.")
        return
    }

    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        Spacer(modifier = Modifier.height(4.dp))

        CoreRangeSlider(
            modifier = modifier,
            leftInitValue = leftInitValue,
            rightInitValue = rightInitValue,
            trackColor = trackColor,
            trackBackgroundColor = trackBackgroundColor,
            trackCornerRadius = trackCornerRadius,
            trackHeight = trackHeight,
            thumbRadius = thumbRadius,
            onValueChanged = onValueChanged,
        )

        Spacer(modifier = Modifier.height(16.dp))

        PriceRangePoints(rangePoints = rangePoints)
    }
}

@Composable
private fun PriceRangePoints(
    modifier: Modifier = Modifier,
    rangePoints: List<String>,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp)
    ) {
        rangePoints.forEach {
            RangePoint(
                modifier = Modifier.weight(1f),
                text = it,
            )
        }
    }
}

@Composable
private fun RangePoint(
    modifier: Modifier = Modifier,
    text: String
) {
    Column(
        modifier = modifier,
    ) {
        Canvas(
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            val lineWidth = 1f
            val lineHeight = 6f

            val centerOffsetX = size.width / 2
            val startY = (size.height - lineHeight.dp.toPx()) / 2
            val endY = startY + lineHeight.dp.toPx()

            drawLine(
                color = DealiColor.g30,
                start = Offset(centerOffsetX + lineWidth.dp.toPx() / 2, startY),
                end = Offset(centerOffsetX + lineWidth.dp.toPx() / 2, endY)
            )
        }

        DealiText(
            modifier = Modifier
                .padding(top = 4.dp)
                .align(Alignment.CenterHorizontally),
            text = text,
            style = DealiFont.b4r12,
            color = DealiColor.g80
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRangePoints() {
    PriceRangePoints(rangePoints = listOf("1만원", "3만원", "5만원", "15만원", "25만원"))
}