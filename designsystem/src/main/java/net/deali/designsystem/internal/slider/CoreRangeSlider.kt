@file:OptIn(ExperimentalComposeUiApi::class, ExperimentalComposeUiApi::class)

package net.deali.designsystem.internal.slider

import android.view.MotionEvent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.DealiColor
import kotlin.math.pow
import kotlin.math.sqrt

@Composable
internal fun CoreRangeSlider(
    modifier: Modifier = Modifier,
    minValue: Float = 0f,
    maxValue: Float = 1f,
    trackColor: Color = DealiColor.primary01,
    trackBackgroundColor: Color = DealiColor.g30,
    trackCornerRadius: CornerRadius = CornerRadius(32f, 32f),
    trackHeight: Dp = 6.dp,
    thumbRadius: Dp = 11.dp,
    onValueChanged: (min: Float, max: Float) -> Unit,
    onTouchEventChanged: (MotionEvent) -> Unit = {},
) {
    /** thumb의 반지름.toPx */
    val thumbRadiusPx = with(LocalDensity.current) { thumbRadius.toPx() }

    /** 전체 width */
    var width by remember { mutableStateOf(0f) }

    /** 전체 height */
    var height by remember { mutableStateOf(0f) }

    /** 두 thumb가 겹쳐서 둘다 눌렸는지 여부 */
    var isBothThumbClicked by remember { mutableStateOf(false) }

    /** 왼쪽 thumb 움직이고 있는지 여부 */
    var isMinThumbDragging by remember { mutableStateOf(false) }

    /** 오른쪽 thumb 움직이고 있는지 여부 */
    var isMaxThumbDragging by remember { mutableStateOf(false) }

    /** 왼쪽 thumb 가 0~width 사이에서 움직인 offset 값 */
    var minThumbOffset by remember { mutableStateOf(Offset.Zero) }

    /** 오른쪽 thumb 가 0~width 사이에서 움직인 offset 값 */
    var maxThumbOffset by remember { mutableStateOf(Offset.Zero) }

    /** thumb 만 드래그 영역으로 지정하면 너무 작아서 편의성을 위해 클릭영역 크기 증폭 */
    val extraClickAreaSize = 50

    /** thumb 그림자 브러쉬 */
    val thumbShadowBrush: Brush = run {
        Brush.radialGradient(
            colorStops = arrayOf(
                0.1f to DealiColor.b5,
                0.8f to DealiColor.b10,
            ),
            radius = thumbRadiusPx,
        )
    }

    Box(modifier = modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp, vertical = 9.dp),
    ) {
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(trackHeight)
                .pointerInteropFilter(
                    onTouchEvent = { motionEvent ->
                        onTouchEventChanged(motionEvent)

                        when (motionEvent.action) {
                            MotionEvent.ACTION_DOWN -> {
                                val x = motionEvent.x
                                val y = motionEvent.y
                                val leftTouched = sqrt((x - minThumbOffset.x).pow(2) + (y - minThumbOffset.y).pow(2))
                                val rightTouched = sqrt((x - maxThumbOffset.x).pow(2) + (y - maxThumbOffset.y).pow(2))
                                if (leftTouched < (thumbRadiusPx + extraClickAreaSize) && rightTouched < (thumbRadiusPx + extraClickAreaSize)) {
                                    isBothThumbClicked = true
                                } else if (leftTouched < (thumbRadiusPx + extraClickAreaSize)) {
                                    isMinThumbDragging = true
                                } else if (rightTouched < (thumbRadiusPx + extraClickAreaSize)) {
                                    isMaxThumbDragging = true
                                }
                            }

                            MotionEvent.ACTION_MOVE -> {
                                val x = motionEvent.x

                                //겹쳐있을 때에는 움직이는 방향의 thumb 선택
                                if (isBothThumbClicked) {
                                    if (x <= maxThumbOffset.x) {
                                        isBothThumbClicked = false
                                        isMinThumbDragging = true
                                    } else {
                                        isBothThumbClicked = false
                                        isMaxThumbDragging = true
                                    }
                                }

                                if (isMinThumbDragging) {
                                    val newMinValue = if (x <= 0) {
                                        0f
                                    } else if (x >= width * maxValue) {
                                        maxValue.arrangeFloat()
                                    } else {
                                        (x / width).arrangeFloat()
                                    }
                                    minThumbOffset = minThumbOffset.copy(x = width * newMinValue)
                                    onValueChanged(newMinValue, maxValue)

                                } else if (isMaxThumbDragging) {
                                    val newMaxValue = if (x >= width) {
                                        1f
                                    } else if (x <= width * minValue) {
                                        minValue.arrangeFloat()
                                    } else {
                                        (x / width).arrangeFloat()
                                    }
                                    maxThumbOffset = maxThumbOffset.copy(x = width * newMaxValue)
                                    onValueChanged(minValue, newMaxValue)
                                }
                            }

                            MotionEvent.ACTION_UP -> {
                                isMinThumbDragging = false
                                isMaxThumbDragging = false
                            }
                        }
                        true
                    }
                )
                .onGloballyPositioned {
                    minThumbOffset = Offset(x = it.size.width * minValue, y = it.size.height / 2f)
                    maxThumbOffset = Offset(x = it.size.width * maxValue, y = it.size.height / 2f)
                }
        ) {
            width = this.size.width
            height = this.size.height

            //Track Background
            drawRoundRect(
                color = trackBackgroundColor,
                cornerRadius = trackCornerRadius,
                topLeft = Offset(x = 0f, y = 0f),
                size = Size(width = width, height = trackHeight.toPx())
            )

            //Track
            drawRect(
                color = trackColor,
                topLeft = Offset(x = width * minValue, y = 0f),
                size = Size(width = width * (maxValue - minValue), height = trackHeight.toPx())
            )

            //Left Shadow
            drawCircle(
                brush = thumbShadowBrush,
                radius = (thumbRadiusPx + 1.5f),
                center = Offset(minThumbOffset.x + 0.8f, minThumbOffset.y + 0.8f),
            )

            //Left Thumb
            drawCircle(
                color = DealiColor.primary04,
                radius = thumbRadiusPx,
                center = minThumbOffset,
            )

            //Right Shadow
            drawCircle(
                brush = thumbShadowBrush,
                radius = (thumbRadiusPx + 1.5f),
                center = Offset(maxThumbOffset.x + 0.8f, maxThumbOffset.y + 0.8f),
            )

            //Right Thumb
            drawCircle(
                color = DealiColor.primary04,
                radius = thumbRadiusPx,
                center = maxThumbOffset,
            )
        }
    }
}

/** 소수점 둘째 자리까지 정리 */
private fun Float.arrangeFloat(): Float {
    return ((this * 100).toInt()) / 100f
}

@Preview(showBackground = true)
@Composable
private fun PreviewCoreRangeSlider() {
    Column {
        CoreRangeSlider(onValueChanged = { _, _ -> })

        Spacer(modifier = Modifier.height(20.dp))

        CoreRangeSlider(
            minValue = 0.2f,
            maxValue = 0.7f,
            onValueChanged = { _, _ -> }
        )
    }
}