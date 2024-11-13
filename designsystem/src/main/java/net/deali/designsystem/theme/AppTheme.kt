package net.deali.designsystem.theme

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.LocalRippleConfiguration
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RippleConfiguration
import androidx.compose.material.ripple
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import java.util.Locale

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AppTheme(
    language: String = Locale.KOREA.language,
    content: @Composable () -> Unit
) {
    val typography = when (language) {
        Locale.SIMPLIFIED_CHINESE.language -> chineseTypography()
        else -> pretendardTypography()
    }

    val rippleIndication = ripple()

    val textSelectionColors = TextSelectionColors(
        handleColor = DealiColor.primary01,
        backgroundColor = DealiColor.primary01.copy(alpha = 0.4f)
    )

    val myRippleConfiguration = RippleConfiguration(color = DealiColor.ripple)

    MaterialTheme(typography = MaterialTypography) {
        CompositionLocalProvider(
            LocalColors provides DealiColor,
            LocalIndication provides rippleIndication,
            LocalRippleConfiguration provides myRippleConfiguration,
            LocalTypography provides typography,
            LocalShapes provides DealiShape,
            LocalTextSelectionColors provides textSelectionColors,
            content = content
        )
    }
}
