package net.deali.designsystem.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.tooltip.ArrowDirection
import net.deali.designsystem.internal.tooltip.CoreDealiTooltip
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

/**
 * Tooltip component
 *
 * @param text 툴팁에 표시할 텍스트
 * @param isShow 툴팁 Visible 여부
 * @param bubblePaddingY content와 툴팁 사이의 간격
 * @param arrowDirection 툴팁의 화살표 방향 (default : TopCenter)
 * @param onDismiss 툴팁 레이아웃 외 부분을 클릭할 때 호출되는 콜백
 * @param content 툴팁이 표기될 anchor content
 */
@Composable
fun Tooltip(
    text: String,
    isShow: Boolean,
    modifier: Modifier = Modifier,
    bubblePaddingY: Dp = 6.dp,
    arrowDirection: ArrowDirection? = null,
    onDismiss: () -> Unit,
    content: @Composable (Modifier) -> Unit
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        CoreDealiTooltip(
            modifier = Modifier,
            isShow = isShow,
            bubblePaddingY = bubblePaddingY,
            absoluteAlignment = arrowDirection,
            onDismiss = onDismiss,
            anchorContent = content,
            tooltipContent = {
                DealiText(
                    modifier = Modifier
                        .padding(
                            horizontal = 16.dp,
                            vertical = 12.dp
                        ),
                    text = text,
                    style = DealiFont.b3r13,
                    color = DealiColor.primary04,
                )
            }
        )
    }
}

@Composable
@Preview(widthDp = 360, heightDp = 480)
private fun TooltipPreview() {
    // 아쉽게도 preview에서는 position이 안잡혀서 tooltip이 보이지 않습니다.
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val alignments = listOf(
            Alignment.TopStart,
            Alignment.TopCenter,
            Alignment.TopEnd,
            Alignment.CenterStart,
            Alignment.Center,
            Alignment.CenterEnd,
            Alignment.BottomStart,
            Alignment.BottomCenter,
            Alignment.BottomEnd
        )

        alignments.forEach { alignment ->
            Tooltip(
                modifier = Modifier
                    .align(alignment)
                    .padding(30.dp),
                text = "Tooltip",
                isShow = true,
                onDismiss = {}
            ) { innerModifier ->
                Icon16(
                    modifier = innerModifier,
                    iconRes = R.drawable.ic_info,
                    onClick = {}
                )
            }
        }
    }
}
