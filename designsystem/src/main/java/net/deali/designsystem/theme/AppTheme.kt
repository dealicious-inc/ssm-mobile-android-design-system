package net.deali.designsystem.theme

import androidx.compose.foundation.LocalIndication
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import java.util.Locale

@Composable
fun AppTheme(
    language: String = Locale.KOREA.language,
    content: @Composable () -> Unit
) {
    val typography = when (language) {
        Locale.SIMPLIFIED_CHINESE.language -> defaultTypography()
        else -> pretendardTypography()
    }

    val rippleIndication = rememberRipple()

    MaterialTheme(typography = MaterialTypography) {
        CompositionLocalProvider(
            LocalColors provides DealiColor,
            LocalIndication provides rippleIndication,
            LocalRippleTheme provides AppRippleTheme,
            LocalTypography provides typography,
            LocalShapes provides AppTheme.shapes,
            content = content
        )
    }
}

object AppTheme {
    val shapes: AppShape
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current
}