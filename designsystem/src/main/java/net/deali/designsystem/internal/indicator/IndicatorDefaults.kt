package net.deali.designsystem.internal.indicator

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import net.deali.designsystem.theme.DealiColor

internal object IndicatorDefaults {
    @Composable
    fun activeColor(type: IndicatorType): Color = when (type) {
        IndicatorType.DOTS -> DealiColor.primary01
        IndicatorType.DOTS_WHITE -> DealiColor.primary04
    }

    @Composable
    fun inactiveColor(type: IndicatorType): Color = when (type) {
        IndicatorType.DOTS -> DealiColor.g30
        IndicatorType.DOTS_WHITE -> DealiColor.w50
    }
}
