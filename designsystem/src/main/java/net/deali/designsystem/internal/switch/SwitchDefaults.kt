package net.deali.designsystem.internal.switch

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.AppTheme

internal object SwitchDefaults {
    val MinSize: DpSize = DpSize(width = 50.dp, height = 30.dp)
    val SlideSize: DpSize = DpSize(width = 50.dp, height = 30.dp)
    val HandleRadius: Dp = 13.dp

    @Composable
    fun colors(): SwitchColors {
        return DefaultSwitchColors(
            slideColor = AppTheme.colors.bg05,
            selectedSlideColor = AppTheme.colors.primary01,
            disabledSlideColor = AppTheme.colors.divider01.copy(0.5f),
            handleColor = AppTheme.colors.primary04,
        )
    }
}

@Stable
internal interface SwitchColors {
    @Composable
    fun slideColor(selected: Boolean, enabled: Boolean): State<Color>

    fun handleColor(): Color
}

@Immutable
private class DefaultSwitchColors(
    private val slideColor: Color,
    private val selectedSlideColor: Color,
    private val disabledSlideColor: Color,
    private val handleColor: Color,
) : SwitchColors {
    @Composable
    override fun slideColor(selected: Boolean, enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) {
                if (selected) {
                    selectedSlideColor
                } else {
                    slideColor
                }
            } else {
                disabledSlideColor
            }
        )
    }

    override fun handleColor(): Color {
        return handleColor
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (this::class != other::class) return false

        other as DefaultSwitchColors

        if (this.slideColor != other.slideColor) return false
        if (this.selectedSlideColor != other.selectedSlideColor) return false
        if (this.disabledSlideColor != other.disabledSlideColor) return false
        if (this.handleColor != other.handleColor) return false

        return true
    }

    override fun hashCode(): Int {
        var hash = slideColor.hashCode()
        hash = 31 * hash + selectedSlideColor.hashCode()
        hash = 31 * hash + disabledSlideColor.hashCode()
        hash = 31 * hash + handleColor.hashCode()
        return hash
    }
}
