package net.deali.designsystem.internal.searchinput

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.textfield.TextFieldPaddings

internal val defaultSearchInputPaddings
    @Composable
    get() = SearchInputPaddingsImpl(
        decoratedStart = 6.dp,
        decoratedEnd = 12.dp,
        horizontal = 16.dp,
    )

@Immutable
internal class SearchInputPaddingsImpl(
    private val decoratedStart: Dp,
    private val decoratedEnd: Dp,
    private val horizontal: Dp,
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
            PaddingValues(start = start, end = end)
        )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (this::class != other::class) return false

        other as SearchInputPaddingsImpl

        if (this.decoratedStart != other.decoratedStart) return false
        return this.horizontal == other.horizontal
    }

    override fun hashCode(): Int {
        var hash = decoratedStart.hashCode()
        hash = 31 * hash + horizontal.hashCode()
        return hash
    }
}