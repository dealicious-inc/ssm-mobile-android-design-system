package net.deali.designsystem.internal.imagechip

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

internal object ImageChipDefaults {
    @Composable
    fun colors(): ImageChipColors {
        return DefaultImageChipColors()
    }

    @Composable
    fun sizes(chipSize: ImageChipSize): ImageChipSizes {
        return DefaultImageChipSizes(chipSize)
    }

    @Composable
    fun chipPaddings(): ImageChipPaddings {
        return DefaultImageChipPaddings()
    }

    @Composable
    fun chipTextStyle(
        chipSize: ImageChipSize,
        selected: Boolean,
        enabled: Boolean,
    ): TextStyle {
        return when (chipSize) {
            ImageChipSize.Large -> if (enabled && selected) DealiFont.sh3sb16 else DealiFont.sh3r16
            ImageChipSize.Medium -> if (enabled && selected) DealiFont.b2sb14 else DealiFont.b2r14
            ImageChipSize.Small -> if (enabled && selected) DealiFont.b2sb14 else DealiFont.b2r14
        }
    }
}

@Stable
internal interface ImageChipColors {
    @Composable
    fun backgroundColor(enabled: Boolean, selected: Boolean): State<Color>

    @Composable
    fun textColor(enabled: Boolean, selected: Boolean): State<Color>

    @Composable
    fun imageColor(enabled: Boolean, selected: Boolean): State<Color>
}

@Immutable
private class DefaultImageChipColors : ImageChipColors {
    @Composable
    override fun backgroundColor(enabled: Boolean, selected: Boolean): State<Color> {
        return rememberUpdatedState(
            when {
                enabled && selected -> DealiColor.g100
                enabled && !selected -> DealiColor.b5
                else -> DealiColor.b5
            }
        )
    }

    @Composable
    override fun textColor(enabled: Boolean, selected: Boolean): State<Color> {
        return rememberUpdatedState(
            when {
                enabled && selected -> DealiColor.primary04
                enabled && !selected -> DealiColor.g80
                else -> DealiColor.g50
            }
        )
    }

    @Composable
    override fun imageColor(enabled: Boolean, selected: Boolean): State<Color> {
        return rememberUpdatedState(
            when {
                enabled && selected -> DealiColor.transparent
                enabled && !selected -> DealiColor.transparent
                else -> DealiColor.w40
            }
        )
    }
}

@Stable
internal interface ImageChipPaddings {
    @Composable
    fun backgroundPadding(): State<PaddingValues>
}

@Immutable
private class DefaultImageChipPaddings : ImageChipPaddings {
    @Composable
    override fun backgroundPadding(): State<PaddingValues> {
        return rememberUpdatedState(
            PaddingValues(start = 4.dp, end = 12.dp)
        )
    }
}

@Stable
internal interface ImageChipSizes {
    @Composable
    fun chipMinSize(): State<Dp>

    @Composable
    fun imageSize(): State<Dp>

    @Composable
    fun placeholderSize(): State<Dp>
}

@Immutable
private class DefaultImageChipSizes(
    val chipSize: ImageChipSize,
) : ImageChipSizes {
    @Composable
    override fun chipMinSize(): State<Dp> {
        return rememberUpdatedState(
            when (chipSize) {
                ImageChipSize.Large -> 46.dp
                ImageChipSize.Medium -> 40.dp
                ImageChipSize.Small -> 32.dp
            }
        )
    }

    @Composable
    override fun imageSize(): State<Dp> {
        return rememberUpdatedState(
            when (chipSize) {
                ImageChipSize.Large -> 38.dp
                ImageChipSize.Medium -> 32.dp
                ImageChipSize.Small -> 24.dp
            }
        )
    }

    @Composable
    override fun placeholderSize(): State<Dp> {
        return rememberUpdatedState(
            when (chipSize) {
                ImageChipSize.Large -> 19.dp
                ImageChipSize.Medium -> 16.dp
                ImageChipSize.Small -> 12.dp
            }
        )
    }
}

