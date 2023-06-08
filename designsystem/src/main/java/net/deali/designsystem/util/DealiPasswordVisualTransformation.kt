package net.deali.designsystem.util

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

class DealiPasswordVisualTransformation constructor(
    // Unicode charactor '⬤'.
    val mask: Char = '\u2b24'
) : VisualTransformation {
    override fun filter(unmasked: AnnotatedString): TransformedText {
        return TransformedText(
            text = AnnotatedString(mask.toString().repeat(unmasked.text.length)),
            offsetMapping = OffsetMapping.Identity
        )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DealiPasswordVisualTransformation) return false
        if (this.mask != other.mask) return false
        return true
    }

    override fun hashCode(): Int {
        return mask.hashCode()
    }
}
