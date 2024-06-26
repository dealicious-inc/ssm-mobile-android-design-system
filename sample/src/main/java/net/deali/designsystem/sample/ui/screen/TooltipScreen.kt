package net.deali.designsystem.sample.ui.screen

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
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.component.Tooltip
import net.deali.designsystem.internal.tooltip.TooltipAlignment
import net.deali.designsystem.sample.ui.NavigationContainer

@Composable
fun TooltipScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Tooltip",
                onBack = onBackPress,
            )
        }
    ) {
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
                var isShow by remember { mutableStateOf(false) }

                Tooltip(
                    modifier = Modifier
                        .align(alignment)
                        .padding(30.dp),
                    text = "신상마켓",
                    isShow = isShow,
                    absoluteAlignment = if (alignment == Alignment.Center) TooltipAlignment.TopCenter else null,
                    onDismiss = {
                        isShow = false
                    }
                ) { innerModifier ->
                    Icon16(
                        modifier = innerModifier,
                        iconRes = R.drawable.ic_info,
                        onClick = {
                            isShow = true
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
