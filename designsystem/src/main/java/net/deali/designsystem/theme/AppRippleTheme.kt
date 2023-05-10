import androidx.compose.material.ripple.RippleTheme.Companion.defaultRippleAlpha
import androidx.compose.material.ripple.RippleTheme.Companion.defaultRippleColor
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import net.deali.designsystem.theme.AppTheme

object AppRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor(): Color = AppTheme.colors.ripple

    @Composable
    override fun rippleAlpha(): RippleAlpha = defaultRippleAlpha(
        AppTheme.colors.ripple,
        lightTheme = !isSystemInDarkTheme()
    )
}
