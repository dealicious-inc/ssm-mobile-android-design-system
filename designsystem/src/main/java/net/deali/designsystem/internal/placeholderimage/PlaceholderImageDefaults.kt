package net.deali.designsystem.internal.placeholderimage

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.theme.DealiColor

internal object PlaceholderImageDefaults {
    @Composable
    fun backgroundColor(colorState: PlaceholderColorState) = when (colorState) {
        PlaceholderColorState.WHITE -> DealiColor.primary04
        PlaceholderColorState.GRAY -> DealiColor.g20
    }

    @Composable
    fun placeholderColor(colorState: PlaceholderColorState) = when (colorState) {
        PlaceholderColorState.WHITE -> DealiColor.g20
        PlaceholderColorState.GRAY -> DealiColor.primary04
    }

    @Composable
    fun placeholder(
        state: PlaceholderState?,
        @DrawableRes customPlaceholder: Int?
    ) = when (state) {
        PlaceholderState.GOODS -> R.drawable.ic_empty40
        PlaceholderState.STORE -> R.drawable.ic_home_filled
        else -> customPlaceholder
            ?: throw IllegalArgumentException("iconState or customIcon must be provided")
    }

    /**
     * 아이콘 사이즈 계산
     * 1. 정사각형일 경우
     * - 70dp 이하: 가로의 1/2
     * - 70dp 이상: 가로의 1/2.5
     *
     * 2. 직사각형일 경우 (1:1 아이콘을 4:3 비율로 변경)
     * - 가로의 1/4
     */
    @Composable
    fun placeholderSize(
        parentWidth: Dp,
        parentHeight: Dp
    ): Pair<Dp, Dp> {
        val parentRatio = parentWidth / parentHeight

        val placeholderRatio = if (parentRatio == 1f) {
            if (parentWidth <= 70.dp) 2f else 2.5f
        } else {
            4f
        }

        val placeholderRatioCorrection = if (parentRatio == 1f) 1f else 4 / 3f

        val width = parentWidth / placeholderRatio * placeholderRatioCorrection
        val height = width * placeholderRatioCorrection

        return width to height
    }
}

enum class PlaceholderColorState {
    WHITE,
    GRAY,
}

enum class PlaceholderState {
    GOODS,
    STORE,
}
