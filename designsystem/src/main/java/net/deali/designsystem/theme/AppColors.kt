package net.deali.designsystem.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val pink10 = Color(0xFFFEECEF)
val pink60 = Color(0xFFFB4760)
val pink90 = Color(0xFFEC2843)

val blue10 = Color(0xFFEAEFFF)
val blue70 = Color(0xFF3668F4)
val blue90 = Color(0xFF0E46E4)

val gray10 = Color(0xFFF5F6FB)
val gray20 = Color(0xFFEBEEF6)
val gray30 = Color(0xFFDFE3ED)
val gray40 = Color(0xFFD0D6E1)
val gray50 = Color(0xFFBEC5D2)
val gray60 = Color(0xFFA6ADBD)
val gray70 = Color(0xFF8F97A7)
val gray100 = Color(0xFF222222)

val black010 = Color(0x1A000000)
val black020 = Color(0x33000000)
val black040 = Color(0x66000000)
val black080 = Color(0xCC000000)
val black100 = Color(0xFF000000)

val white020 = Color(0x33FFFFFF)
val white060 = Color(0x99FFFFFF)
val white100 = Color(0xFFFFFFFF)

val orange10 = Color(0xFFFFECDB)
val orange50 = Color(0xFFFF7C44)
val orange60 = Color(0xFFFF6827)

val transparent = Color(0x00FFFFFF)

class AppColors(
    error: Color,
    links: Color,
    info: Color,
    warning: Color,
    success: Color,
    isLight: Boolean
) {
    var error by mutableStateOf(error)
        private set

    var links by mutableStateOf(links)
        private set

    var info by mutableStateOf(info)
        private set

    var warning by mutableStateOf(warning)
        private set

    var success by mutableStateOf(success)
        private set

    var isLight by mutableStateOf(isLight)
        internal set

    fun copy(
        error: Color = this.error,
        links: Color = this.links,
        info: Color = this.info,
        warning: Color = this.warning,
        success: Color = this.success,
        isLight: Boolean = this.isLight
    ) = AppColors(
        error,
        links,
        info,
        warning,
        success,
        isLight
    )

    fun updateColorsFrom(other: AppColors) {
        error = other.error
        links = other.links
        info = other.info
        warning = other.warning
        success = other.success
        isLight = other.isLight
    }
}

internal val LocalColors = staticCompositionLocalOf { lightColors() }

fun lightColors(
    error: Color = errorLight,
    links: Color = linksLight,
    info: Color = infoLight,
    warning: Color = warningLight,
    success: Color = successLight
): AppColors = AppColors(
    error = error,
    links = links,
    info = info,
    warning = warning,
    success = success,
    isLight = true
)

fun darkColors(
    error: Color = errorDark,
    links: Color = linksDark,
    info: Color = infoDark,
    warning: Color = warningDark,
    success: Color = successDark
): AppColors = AppColors(
    error = error,
    links = links,
    info = info,
    warning = warning,
    success = success,
    isLight = false
)

// light color
private val errorLight = Color(0xFFFA1818)
private val linksLight = Color(0xFF2B66FD)
private val infoLight = Color(0xFF2B66FD)
private val warningLight = Color(0xFFFFD600)
private val successLight = Color(0xFF1BDA17)

// dark color
private val errorDark = Color(0xFFFA1818)
private val linksDark = Color(0xFF2B66FD)
private val infoDark = Color(0xFF2B66FD)
private val warningDark = Color(0xFFFFD600)
private val successDark = Color(0xFF1BDA17)
