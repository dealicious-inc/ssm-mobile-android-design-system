package net.deali.designsystem.internal.toggle

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import net.deali.designsystem.theme.gray10
import net.deali.designsystem.theme.gray20
import net.deali.designsystem.theme.gray60
import net.deali.designsystem.theme.pink10
import net.deali.designsystem.theme.pink60
import net.deali.designsystem.theme.white100

internal object ToggleDefaults {
    val SlideSize: DpSize = DpSize(width = 34.dp, height = 14.dp)
    val HandleRadius: Dp = 10.dp
    val MinSize: DpSize = DpSize(
        width = SlideSize.width,
        height = max(SlideSize.height, HandleRadius * 2)
    )

    @Composable
    fun colors(): ToggleColors {
        return DefaultToggleColors(
            slideColor = gray60,
            selectedSlideColor = pink10,
            disabledSlideColor = gray20,
            handleColor = white100,
            selectedHandleColor = pink60,
            disabledHandleColor = gray10,
        )
    }
}

@Stable
internal interface ToggleColors {
    @Composable
    fun slideColor(selected: Boolean, enabled: Boolean): State<Color>

    @Composable
    fun handleColor(selected: Boolean, enabled: Boolean): State<Color>
}

@Immutable
private class DefaultToggleColors(
    private val slideColor: Color,
    private val selectedSlideColor: Color,
    private val disabledSlideColor: Color,
    private val handleColor: Color,
    private val selectedHandleColor: Color,
    private val disabledHandleColor: Color,
) : ToggleColors {
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

    @Composable
    override fun handleColor(selected: Boolean, enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) {
                if (selected) {
                    selectedHandleColor
                } else {
                    handleColor
                }
            } else {
                disabledHandleColor
            }
        )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (this::class != other::class) return false

        other as DefaultToggleColors

        if (this.slideColor != other.slideColor) return false
        if (this.selectedSlideColor != other.selectedSlideColor) return false
        if (this.disabledSlideColor != other.disabledSlideColor) return false
        if (this.handleColor != other.handleColor) return false
        if (this.selectedHandleColor != other.selectedHandleColor) return false
        if (this.disabledHandleColor != other.disabledHandleColor) return false

        return true
    }

    override fun hashCode(): Int {
        var hash = slideColor.hashCode()
        hash = 31 * hash + selectedSlideColor.hashCode()
        hash = 31 * hash + disabledSlideColor.hashCode()
        hash = 31 * hash + handleColor.hashCode()
        hash = 31 * hash + selectedHandleColor.hashCode()
        hash = 31 * hash + disabledHandleColor.hashCode()
        return hash
    }
}
