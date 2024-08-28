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
}
