package net.deali.designsystem.internal.switch

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.DealiColor

internal object SwitchDefaults {
    @Composable
    fun colors(): DefaultSwitchColors {
        return DefaultSwitchColors(
            onSlideColor = DealiColor.primary01,
            onDisabledSlideColor = DealiColor.primary01.copy(0.5f),
            offSlideColor = DealiColor.g30,
            offDisabledSlideColor = DealiColor.g30.copy(0.5f),
            handleColor = DealiColor.primary04,
        )
    }

    @Composable
    fun switchSize(size: SwitchSize): DpSize {
        return when (size) {
            SwitchSize.Large -> {
                DpSize(width = 50.dp, height = 30.dp)
            }
            SwitchSize.Small -> {
                DpSize(width = 36.dp, height = 22.dp)
            }
        }
    }

    @Composable
    fun switchHandleRadius(size: SwitchSize): Dp {
        return when (size) {
            SwitchSize.Large -> {
                13.dp
            }
            SwitchSize.Small -> {
                9.dp
            }
        }
    }
}
