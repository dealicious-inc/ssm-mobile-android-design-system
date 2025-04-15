package net.deali.designsystem.internal.errorcase

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.theme.DealiColor

internal object ErrorCaseDefaults {

    val iconColor: Color
        @Composable
        get() = DealiColor.g60

    val padding: PaddingValues
        @Composable
        get() = PaddingValues(
            start = 40.dp,
            end = 40.dp,
            top = 72.dp
        )

    @Composable
    fun icon(state: ErrorCaseState): Int = when (state) {
        ErrorCaseState.NOTICE -> R.drawable.ic_notice_filled
        ErrorCaseState.REFRESH -> R.drawable.ic_refresh_2_filled
    }
}
