package net.deali.designsystem.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.tooltip.CoreDealiTooltip
import net.deali.designsystem.theme.AppTheme

@Composable
fun Tooltip(
    text: String,
    isShow: Boolean,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable (Modifier) -> Unit
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        CoreDealiTooltip(
            modifier = Modifier,
            isShow = isShow,
            onDismiss = onDismiss,
            anchorContent = content,
            tooltipContent = {
                Text(
                    modifier = Modifier
                        .padding(
                            horizontal = 16.dp,
                            vertical = 12.dp
                        ),
                    text = text,
                    style = AppTheme.typography.b3r13,
                    color = AppTheme.colors.primary04,
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
                    iconRes = R.drawable.ic_info_16_ver01,
                    onClick = {}
                )
            }
        }
    }
}
