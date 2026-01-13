package net.deali.designsystem.internal.textfield

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.unit.Dp

@Stable
internal interface TextFieldPaddings {
    @Composable
    fun padding(
        hasLeadingContent: Boolean,
        hasTrailingContent: Boolean
    ): State<PaddingValues>
}


@Immutable
internal class TextFieldPaddingsImpl(
    private val decoratedStart: Dp,
    private val decoratedEnd: Dp,
    private val horizontal: Dp,
    private val vertical: Dp,
) : TextFieldPaddings {
    @Composable
    override fun padding(
        hasLeadingContent: Boolean,
        hasTrailingContent: Boolean
    ): State<PaddingValues> {
        val start = when (hasLeadingContent) {
            true -> decoratedStart
            false -> horizontal
        }

        val end = when (hasTrailingContent) {
            true -> decoratedEnd
            false -> horizontal
        }

        return rememberUpdatedState(
            PaddingValues(start = start, end = end, top = vertical, bottom = vertical)
        )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (this::class != other::class) return false

        other as TextFieldPaddingsImpl

        if (this.horizontal != other.horizontal) return false
        if (this.decoratedStart != other.decoratedStart) return false
        return this.vertical == other.vertical
    }

    override fun hashCode(): Int {
        var hash = horizontal.hashCode()
        hash = 31 * hash + decoratedStart.hashCode()
        hash = 31 * hash + vertical.hashCode()
        return hash
    }
}