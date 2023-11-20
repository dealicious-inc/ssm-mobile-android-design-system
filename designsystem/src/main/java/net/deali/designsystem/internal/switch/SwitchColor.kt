package net.deali.designsystem.internal.switch

import androidx.compose.animation.animateColorAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color


@Stable
internal interface SwitchColors {
    @Composable
    fun slideColor(isOn: Boolean, enabled: Boolean): State<Color>

    fun handleColor(): Color
}

@Immutable
internal class DefaultSwitchColors(
    private val onSlideColor: Color,
    private val onDisabledSlideColor: Color,
    private val offSlideColor: Color,
    private val offDisabledSlideColor: Color,
    private val handleColor: Color,
) : SwitchColors {
    @Composable
    override fun slideColor(isOn: Boolean, enabled: Boolean): State<Color> {
        return animateColorAsState(
            targetValue = if (enabled) {
                if (isOn) {
                    onSlideColor
                } else {
                    offSlideColor
                }
            } else {
                if (isOn) {
                    onDisabledSlideColor
                } else {
                    offDisabledSlideColor
                }
            },
            label = "slideColorAnimation"
        )
    }

    override fun handleColor(): Color {
        return handleColor
    }

//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (other == null) return false
//        if (this::class != other::class) return false
//
//        other as DefaultSwitchColors
//
//        if (this.onSlideColor != other.onSlideColor) return false
//        if (this.onDisabledSlideColor != other.onDisabledSlideColor) return false
//        if (this.offSlideColor != other.offSlideColor) return false
//        if (this.offDisabledSlideColor != other.offDisabledSlideColor) return false
//        if (this.handleColor != other.handleColor) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        var hash = slideColor.hashCode()
//        hash = 31 * hash + onSlideColor.hashCode()
//        hash = 31 * hash + onDisabledSlideColor.hashCode()
//        hash = 31 * hash + offSlideColor.hashCode()
//        hash = 31 * hash + offDisabledSlideColor.hashCode()
//        hash = 31 * hash + handleColor.hashCode()
//        return hash
//    }
}
