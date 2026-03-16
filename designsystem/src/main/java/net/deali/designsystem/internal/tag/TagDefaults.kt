package net.deali.designsystem.internal.tag

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.DealiFont

internal object TagDefaults {

    @Composable
    fun height(tagSize: TagSize): Dp {
        return when (tagSize) {
            TagSize.Large -> 28.dp
            TagSize.Medium -> 26.dp
            TagSize.Small -> 16.dp
        }
    }

    @Composable
    fun textStyle(tagSize: TagSize): TextStyle {
        return when (tagSize) {
            TagSize.Large -> DealiFont.b2sb14
            TagSize.Medium -> DealiFont.b4sb12
            TagSize.Small -> DealiFont.c1sb10
        }
    }

    @Composable
    fun containerPadding(tagSize: TagSize): PaddingValues {
        return when (tagSize) {
            TagSize.Large, TagSize.Medium -> PaddingValues(horizontal = 6.dp)
            TagSize.Small -> PaddingValues(horizontal = 2.dp)
        }
    }

    @Composable
    fun textPadding(): PaddingValues {
        return PaddingValues(horizontal = 2.dp)
    }

    @Composable
    fun cornerRadius(tagSize: TagSize): Dp {
        return when (tagSize) {
            TagSize.Large, TagSize.Medium -> 4.dp
            TagSize.Small -> 3.dp
        }
    }

    @Composable
    fun iconSize(tagSize: TagSize): Dp {
        return when (tagSize) {
            TagSize.Large -> 20.dp
            TagSize.Medium -> 16.dp
            TagSize.Small -> 12.dp
        }
    }
}
