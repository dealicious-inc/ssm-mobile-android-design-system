@file:OptIn(ExperimentalComposeUiApi::class)

package net.deali.designsystem.internal.slider

import android.view.MotionEvent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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
fun CoreRangeSlider(
    modifier: Modifier = Modifier,
    leftInitValue: Float = 0f,
    rightInitValue: Float = 1f,
    trackColor: Color = DealiColor.primary01,
    trackBackgroundColor: Color = DealiColor.g30,
    trackCornerRadius: CornerRadius = CornerRadius(32f, 32f),
    trackHeight: Dp = 6.dp,
    thumbRadius: Dp = 11.dp,
    onValueChanged: (left: Float, right: Float) -> Unit
) {
    /** 왼쪽 thumb의 소수점값 (0f~1f) */
    var leftThumbValue by remember { mutableStateOf(leftInitValue) }

    /** 오른쪽 thumb의 소수점값 (0f~1f) */
    var rightThumbValue by remember { mutableStateOf(rightInitValue) }

    /** thumb의 반지름.toPx */
    val thumbRadiusPx = with(LocalDensity.current) { thumbRadius.toPx() }

    /** 전체 width */
    var width by remember { mutableStateOf(0f) }

    /** 전체 height */
    var height by remember { mutableStateOf(0f) }

    /** 두 thumb가 겹쳐서 둘다 눌렸는지 여부 */
    var isBothThumbClicked by remember { mutableStateOf(false) }

    /** 왼쪽 thumb 움직이고 있는지 여부 */
    var isLeftThumbDragging by remember { mutableStateOf(false) }

    /** 오른쪽 thumb 움직이고 있는지 여부 */
    var isRightThumbDragging by remember { mutableStateOf(false) }

    /** 왼쪽 thumb 가 0~width 사이에서 움직인 offset 값 */
    var leftThumbOffset by remember { mutableStateOf(Offset.Zero) }

    /** 오른쪽 thumb 가 0~width 사이에서 움직인 offset 값 */
    var rightThumbOffset by remember { mutableStateOf(Offset.Zero) }

    /** 동그라미만 드래그 영역으로 지정하면 너무 작아서 편의성을 위해 클릭영역 크기 증폭 */
    val extraClickAreaSize = 50

    /** thumb 그림자 브러쉬 */
    val thumbShadowBrush: Brush = kotlin.run {
        Brush.radialGradient(
            colorStops = arrayOf(
                0.1f to DealiColor.transparent,
                0.8f to DealiColor.b10,
            ),
        )
    }

    Canvas(
        modifier = modifier
            .height(trackHeight)
            .pointerInteropFilter(
                onTouchEvent = { motionEvent ->
                    when (motionEvent.action) {
                        MotionEvent.ACTION_DOWN -> {
                            val x = motionEvent.x
                            val y = motionEvent.y
                            val leftTouched =
                                sqrt((x - leftThumbOffset.x).pow(2) + (y - leftThumbOffset.y).pow(2))
                            val rightTouched = sqrt(
                                (x - rightThumbOffset.x).pow(2) + (y - rightThumbOffset.y).pow(2)
                            )
                            if (leftTouched < (thumbRadiusPx + extraClickAreaSize) && rightTouched < (thumbRadiusPx + extraClickAreaSize)) {
                                isBothThumbClicked = true
                            } else if (leftTouched < (thumbRadiusPx + extraClickAreaSize)) {
                                isLeftThumbDragging = true
                            } else if (rightTouched < (thumbRadiusPx + extraClickAreaSize)) {
                                isRightThumbDragging = true
                            }
                        }

                        MotionEvent.ACTION_MOVE -> {
                            val x = motionEvent.x

                            //겹쳐있을 때에는 움직이는 방향의 thumb 선택
                            if (isBothThumbClicked) {
                                if (x <= rightThumbOffset.x) {
                                    isBothThumbClicked = false
                                    isLeftThumbDragging = true
                                } else {
                                    isBothThumbClicked = false
                                    isRightThumbDragging = true
                                }
                            }

                            if (isLeftThumbDragging) {
                                leftThumbValue = if (x <= 0) {
                                    0f
                                } else if (x >= width * rightThumbValue) {
                                    rightThumbValue.arrangeFloat()
                                } else {
                                    (x / width).arrangeFloat()
                                }
                                leftThumbOffset = leftThumbOffset.copy(x = width * leftThumbValue)
                                onValueChanged(leftThumbValue, rightThumbValue)

                            } else if (isRightThumbDragging) {
                                rightThumbValue = if (x >= width) {
                                    1f
                                } else if (x <= width * leftThumbValue) {
                                    leftThumbValue.arrangeFloat()
                                } else {
                                    (x / width).arrangeFloat()
                                }
                                rightThumbOffset =
                                    rightThumbOffset.copy(x = width * rightThumbValue)
                                onValueChanged(leftThumbValue, rightThumbValue)
                            }
                        }

                        MotionEvent.ACTION_UP -> {
                            isLeftThumbDragging = false
                            isRightThumbDragging = false
                        }
                    }
                    true
                }
            )
            .onGloballyPositioned {
                leftThumbOffset =
                    Offset(x = it.size.width * leftThumbValue, y = it.size.height / 2f)
                rightThumbOffset =
                    Offset(x = it.size.width * rightThumbValue, y = it.size.height / 2f)
            }
    ) {
        width = this.size.width
        height = this.size.height

        //Track Background
        drawRoundRect(
            color = trackBackgroundColor,
            cornerRadius = trackCornerRadius,
            topLeft = Offset(x = 0f, y = trackHeight.toPx() / 4f),
            size = Size(width = width, height = trackHeight.toPx())
        )

        //Track
        drawRect(
            color = trackColor,
            topLeft = Offset(x = width * leftThumbValue, y = 0f),
            size = Size(width = width * (rightThumbValue - leftThumbValue), height = height)
        )

        //Left Shadow
        drawCircle(
            brush = thumbShadowBrush,
            radius = (thumbRadiusPx + 1.5f),
            center = Offset(leftThumbOffset.x + 0.8f, leftThumbOffset.y + 0.8f),
        )

        //Left Thumb
        drawCircle(
            color = DealiColor.primary04,
            radius = thumbRadiusPx,
            center = leftThumbOffset,
        )

        //Right Shadow
        drawCircle(
            brush = thumbShadowBrush,
            radius = (thumbRadiusPx + 1.5f),
            center = Offset(rightThumbOffset.x + 0.8f, rightThumbOffset.y + 0.8f),
        )

        //Right Thumb
        drawCircle(
            color = DealiColor.primary04,
            radius = thumbRadiusPx,
            center = rightThumbOffset,
        )
    }
}

/** 소수점 둘째 자리까지 정리 */
private fun Float.arrangeFloat(): Float {
    return ((this * 100).toInt()) / 100f
}

@Preview
@Composable
private fun PreviewCoreRangeSlider() {
    Column {
        CoreRangeSlider(onValueChanged = {_,_->})

        Spacer(modifier = Modifier.height(20.dp))

        CoreRangeSlider(
            leftInitValue = 0.2f,
            rightInitValue = 0.7f,
            onValueChanged = { _, _ -> }
        )
    }
}