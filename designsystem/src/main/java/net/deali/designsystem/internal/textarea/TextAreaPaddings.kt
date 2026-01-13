package net.deali.designsystem.internal.textarea

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.textfield.TextFieldPaddings

internal val defaultTextAreaPaddings
    @Composable
    get() = TextAreaPaddingsImpl(
        horizontal = 16.dp,
        vertical = 13.dp,
    )

@Immutable
internal class TextAreaPaddingsImpl(
    private val horizontal: Dp,
    private val vertical: Dp,
) : TextFieldPaddings {
    @Composable
    override fun padding(
        hasLeadingContent: Boolean,
        hasTrailingContent: Boolean
    ): State<PaddingValues> {
        return rememberUpdatedState(
            PaddingValues(horizontal = horizontal, vertical = vertical)
        )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (this::class != other::class) return false

        other as TextAreaPaddingsImpl

        if (this.horizontal != other.horizontal) return false
        return this.vertical == other.vertical
    }

    override fun hashCode(): Int {
        var hash = horizontal.hashCode()
        hash = 31 * hash + vertical.hashCode()
        return hash
    }
}