package net.deali.designsystem.internal.tooltip

import android.view.View
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.center
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.blue70
import kotlin.math.roundToInt


/**
 * 참고 : https://github.com/Ilinich/Compose-Tooltip_Popup
 */
@Composable
internal fun CoreDealiTooltip(
    modifier: Modifier,
    isShow: Boolean,
    onDismiss: () -> Unit,
    anchorContent: @Composable (Modifier) -> Unit,
    tooltipContent: @Composable () -> Unit,
) {
    var position by remember { mutableStateOf(TooltipPopupPosition()) }

    val view = LocalView.current.rootView

    if (isShow) {
        TooltipLayout(
            onDismissRequest = onDismiss,
            position = position,
            content = tooltipContent
        )
    }

    anchorContent(
        modifier
            .onGloballyPositioned { coordinates ->
                position = calculateTooltipPopupPosition(view, coordinates)
            }
    )
}

@Composable
private fun TooltipLayout(
    position: TooltipPopupPosition,
    arrowOffset: Dp = 0.dp,
    onDismissRequest: (() -> Unit)? = null,
    content: @Composable () -> Unit
) {
    var alignment = Alignment.TopCenter
    var offset = position.offset

    val color = blue70
    val arrowHeight = 6.dp
    val horizontalPadding = 16.dp
    val horizontalPaddingInPx = with(LocalDensity.current) {
        horizontalPadding.toPx()
    }

    val arrowOffsetInPx = with(LocalDensity.current) {
        arrowOffset.toPx()
    }

    var arrowPositionX by remember { mutableStateOf(position.centerPositionX) }

    with(LocalDensity.current) {
        val arrowPaddingPx = arrowHeight.toPx().roundToInt() * 3

        when (position.alignment) {
            TooltipAlignment.TopCenter -> {
                alignment = Alignment.TopCenter
                offset = offset.copy(
                    y = position.offset.y + arrowPaddingPx
                )
            }

            TooltipAlignment.BottomCenter -> {
                alignment = Alignment.BottomCenter
                offset = offset.copy(
                    y = position.offset.y - arrowPaddingPx
                )
            }
        }
    }

    val popupPositionProvider = remember(alignment, offset) {
        TooltipAlignmentOffsetPositionProvider(
            alignment = alignment,
            offset = offset,
            horizontalPaddingInPx = horizontalPaddingInPx,
            centerPositionX = position.centerPositionX,
        ) { position ->
            arrowPositionX = position
        }
    }

    Popup(
        popupPositionProvider = popupPositionProvider,
        onDismissRequest = onDismissRequest,
        properties = PopupProperties(dismissOnBackPress = false),
    ) {
        BubbleLayout(
            modifier = Modifier
                .padding(horizontal = horizontalPadding)
                .background(
                    color = color,
                    shape = AppTheme.shapes.radius6,
                ),
            alignment = position.alignment,
            arrowHeight = arrowHeight,
            arrowPositionX = arrowPositionX + arrowOffsetInPx,
            color = color
        ) {
            content()
        }
    }
}

private class TooltipAlignmentOffsetPositionProvider(
    val alignment: Alignment,
    val offset: IntOffset,
    val centerPositionX: Float,
    val horizontalPaddingInPx: Float,
    private val onArrowPositionX: (Float) -> Unit,
) : PopupPositionProvider {

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        var popupPosition = IntOffset(0, 0)

        // Get the aligned point inside the parent
        val parentAlignmentPoint = alignment.align(
            IntSize.Zero,
            IntSize(anchorBounds.width, anchorBounds.height),
            layoutDirection
        )
        // Get the aligned point inside the child
        val relativePopupPos = alignment.align(
            IntSize.Zero,
            IntSize(popupContentSize.width, popupContentSize.height),
            layoutDirection
        )

        // Add the position of the parent
        popupPosition += IntOffset(anchorBounds.left, anchorBounds.top)

        // Add the distance between the parent's top left corner and the alignment point
        popupPosition += parentAlignmentPoint

        // Subtract the distance between the children's top left corner and the alignment point
        popupPosition -= IntOffset(relativePopupPos.x, relativePopupPos.y)

        // Add the user offset
        val resolvedOffset = IntOffset(
            offset.x * (if (layoutDirection == LayoutDirection.Ltr) 1 else -1),
            offset.y
        )

        popupPosition += resolvedOffset

        val leftSpace = centerPositionX - horizontalPaddingInPx
        val rightSpace = windowSize.width - centerPositionX - horizontalPaddingInPx

        val tooltipWidth = popupContentSize.width
        val halfPopupContentSize = popupContentSize.center.x

        val fullPadding = horizontalPaddingInPx * 2

        val maxTooltipSize = windowSize.width - fullPadding

        val isCentralPositionTooltip =
            halfPopupContentSize <= leftSpace && halfPopupContentSize <= rightSpace

        when {
            isCentralPositionTooltip -> {
                popupPosition =
                    IntOffset(centerPositionX.toInt() - halfPopupContentSize, popupPosition.y)
                val arrowPosition = halfPopupContentSize.toFloat() - horizontalPaddingInPx
                onArrowPositionX.invoke(arrowPosition)
            }

            tooltipWidth >= maxTooltipSize -> {
                popupPosition =
                    IntOffset(windowSize.center.x - halfPopupContentSize, popupPosition.y)
                val arrowPosition = centerPositionX - popupPosition.x - horizontalPaddingInPx
                onArrowPositionX.invoke(arrowPosition)
            }

            halfPopupContentSize > rightSpace -> {
                popupPosition = IntOffset(centerPositionX.toInt(), popupPosition.y)
                val arrowPosition =
                    halfPopupContentSize + (halfPopupContentSize - rightSpace) - fullPadding

                onArrowPositionX.invoke(arrowPosition)
            }

            halfPopupContentSize > leftSpace -> {
                popupPosition = IntOffset(0, popupPosition.y)
                val arrowPosition = centerPositionX - horizontalPaddingInPx
                onArrowPositionX.invoke(arrowPosition)
            }

            else -> {
                val position = centerPositionX
                onArrowPositionX.invoke(position)
            }
        }

        return popupPosition
    }
}

@Composable
private fun BubbleLayout(
    modifier: Modifier = Modifier,
    alignment: TooltipAlignment = TooltipAlignment.TopCenter,
    arrowHeight: Dp,
    arrowPositionX: Float,
    color: Color,
    content: @Composable () -> Unit
) {
    val arrowHeightPx = with(LocalDensity.current) {
        arrowHeight.toPx()
    }

    Box(
        modifier = modifier
            .drawBehind {
                if (arrowPositionX <= 0f) return@drawBehind

                val isTopCenter = alignment == TooltipAlignment.TopCenter

                val path = Path()

                if (isTopCenter) {
                    val position = Offset(arrowPositionX, 0f)
                    path.apply {
                        moveTo(x = position.x, y = position.y)
                        lineTo(x = position.x - arrowHeightPx, y = position.y)
                        lineTo(x = position.x, y = position.y - arrowHeightPx)
                        lineTo(x = position.x + arrowHeightPx, y = position.y)
                        lineTo(x = position.x, y = position.y)
                    }
                } else {
                    val arrowY = drawContext.size.height
                    val position = Offset(arrowPositionX, arrowY)
                    path.apply {
                        moveTo(x = position.x, y = position.y)
                        lineTo(x = position.x + arrowHeightPx, y = position.y)
                        lineTo(x = position.x, y = position.y + arrowHeightPx)
                        lineTo(x = position.x - arrowHeightPx, y = position.y)
                        lineTo(x = position.x, y = position.y)
                    }
                }

                drawPath(
                    path = path,
                    color = color,
                )
                path.close()
            }
    ) {
        content()
    }
}

private data class TooltipPopupPosition(
    val offset: IntOffset = IntOffset(0, 0),
    val alignment: TooltipAlignment = TooltipAlignment.TopCenter,

    val centerPositionX: Float = 0f,
)

private fun calculateTooltipPopupPosition(
    view: View,
    coordinates: LayoutCoordinates?,
): TooltipPopupPosition {
    coordinates ?: return TooltipPopupPosition()

    val visibleWindowBounds = android.graphics.Rect()
    view.getWindowVisibleDisplayFrame(visibleWindowBounds)

    val boundsInWindow = coordinates.boundsInWindow()

    val heightAbove = boundsInWindow.top - visibleWindowBounds.top
    val heightBelow = visibleWindowBounds.bottom - visibleWindowBounds.top - boundsInWindow.bottom

    val centerPositionX = boundsInWindow.right - (boundsInWindow.right - boundsInWindow.left) / 2

    val offsetX = centerPositionX - visibleWindowBounds.centerX()

    return if (heightAbove < heightBelow) {
        val offset = IntOffset(
            y = coordinates.size.height,
            x = offsetX.toInt()
        )
        TooltipPopupPosition(
            offset = offset,
            alignment = TooltipAlignment.TopCenter,
            centerPositionX = centerPositionX,
        )
    } else {
        TooltipPopupPosition(
            offset = IntOffset(
                y = -coordinates.size.height,
                x = offsetX.toInt()
            ),
            alignment = TooltipAlignment.BottomCenter,
            centerPositionX = centerPositionX,
        )
    }
}

private enum class TooltipAlignment {
    BottomCenter,
    TopCenter,
}
