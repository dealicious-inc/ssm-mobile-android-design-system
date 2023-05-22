package net.deali.designsystem.theme

import AppRippleTheme
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import java.util.Locale

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    language: String = Locale.KOREA.language,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) darkColors() else lightColors()
    val rememberedColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }

    val typography = when (language) {
        Locale.SIMPLIFIED_CHINESE.language -> defaultTypography()
        else -> pretendardTypography()
    }

    val rememberedTypography =
        remember { typography.copy() }.apply { updateTypographyFrom(typography) }
    val rippleIndication = rememberRipple()

    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        LocalIndication provides rippleIndication,
        LocalRippleTheme provides AppRippleTheme,
        LocalTypography provides rememberedTypography,
        LocalShapes provides AppTheme.shapes,
        content = content
    )
}

object AppTheme {
    val colors: AppColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current
    val typography: AppTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
    val shapes: AppShape
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current
}
