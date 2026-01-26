package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.Icon
import net.deali.designsystem.component.Tooltip
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.internal.tooltip.TooltipArrowDirectionState
import net.deali.designsystem.internal.tooltip.TooltipColorState
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.util.getRandomText

@Composable
fun TooltipScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            TopBar(
                title = "Tooltip",
                onBack = onBackPress,
            )
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(DealiColor.g50)
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
                var isShow by remember { mutableStateOf(false) }

                Tooltip(
                    text = getRandomText(15),
                    isShow = isShow,
                    colorState = if (alignment == Alignment.Center) TooltipColorState.BLUE else TooltipColorState.WHITE,
                    modifier = Modifier
                        .align(alignment)
                        .padding(30.dp),
                    arrowDirectionState = if (alignment == Alignment.Center) TooltipArrowDirectionState.TOP else null,
                    maxWidth = if (alignment == Alignment.Center) 100.dp else Dp.Unspecified,
                    onDismiss = {
                        isShow = false
                    }
                ) { innerModifier ->
                    Icon(
                        modifier = innerModifier,
                        iconRes = R.drawable.ic_info,
                        size = 16.dp,
                        onClick = {
                            isShow = !isShow
                        }
                    )
                }
            }
        }
    }
}

@Composable
@Preview
private fun TooltipScreenPreview() {
    TooltipScreen(
        onBackPress = {}
    )
}
