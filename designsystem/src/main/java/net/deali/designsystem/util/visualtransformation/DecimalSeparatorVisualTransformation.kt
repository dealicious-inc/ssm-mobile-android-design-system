package net.deali.designsystem.util.visualtransformation

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import java.util.Locale

/**
 * Jetpack Compose TextField에서 표시하는 숫자를 3자리마다 콤마를 추가해 보여주는 [VisualTransformation].
 *
 * TextField가 숫자 형태의 value를 가지고 있을 때, 자릿수에 맞춰 콤마(,)를 추가하고 [prefix]가 있다면
 * 앞에 붙여서 보여줍니다.
 * 예를 들어 TextField가 '1000000'을 value로 가지고 있고 [prefix]가 '₩'라면, '₩1,000,000'으로 보입니다.
 *
 * @param prefix 가격 형태의 숫자 앞에 표기 할 문자. (e.g. '$')
 * @param alwaysShowPrefix `true`인 경우 value가 비어 있어도 [prefix]를 보여줌. `false`인 경우
 * value가 비어 있지 않은 경우에만 [prefix]를 보여줌.
 */
class DecimalSeparatorVisualTransformation(
    private val prefix: String = "",
    private val alwaysShowPrefix: Boolean = false,
) : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        // 문자열이 숫자(소숫점 형태 허용)가 아닌 경우 transformation 하지 않고 현재 문자 그대로 표기
        if (!text.text.isNumberOrDotOrEmpty()) {
            return TransformedText(text, OffsetMapping.Identity)
        }

        // 문자열을 콤마가 포함된 형태로 포매팅할 수 없는 경우 transformation 하지 않고 현재 문자 그대로 표기
        val textWithComma = text.text.toCommaTextOrEmpty()
            ?: return TransformedText(text, OffsetMapping.Identity)

        // 콤마가 포함 된 문자열과 prefix를 모두 처리해 transformation
        val textWithCommaAndPrefix = if (alwaysShowPrefix || textWithComma.isNotEmpty()) {
            prefix + textWithComma
        } else {
            textWithComma
        }
        return TransformedText(
            text = AnnotatedString(textWithCommaAndPrefix),
            offsetMapping = DecimalSeparatorOffsetMapping(prefix, textWithCommaAndPrefix)
        )
    }

    /**
     * 0~9까지의 10진수 숫자와 온점(.)만 포함된 경우 또는 비어 있는 경우 `true`, 다른 문자가 포함된 경우 `false`.
     */
    private fun String.isNumberOrDotOrEmpty(): Boolean {
        return this.isEmpty() || this.matches(Regex("^[0-9]*\\.?[0-9]*$"))
    }

    /**
     * 문자열을 콤마가 포함된 형태로 변경. 문자열이 숫자 형태가 아닌 경우에는 `null` 반환.
     */
    private fun String.toCommaTextOrEmpty(): String? {
        if (this.isEmpty()) {
            return ""
        }
        return try {
            String.format(Locale.getDefault(), "%,.0f", this.toDouble())
        } catch (_: NumberFormatException) {
            null
        }
    }

    private class DecimalSeparatorOffsetMapping(
        private val prefix: String,
        private val transformedText: String
    ) : OffsetMapping {
        private val prefixOffset: Int = prefix.length

        override fun originalToTransformed(offset: Int): Int {
            if (transformedText.isEmpty()) {
                return 0
            }
            val stringUntilOffset = transformedText.substringWithout(0, offset) {
                it in prefix || it == ','
            }
            val commaCount = stringUntilOffset.commaCount()
            return offset + commaCount + prefixOffset
        }

        override fun transformedToOriginal(offset: Int): Int {
            if (transformedText.isEmpty()) {
                return 0
            }

            if (offset < prefixOffset) {
                return 0
            }

            val safeOffset = offset.coerceIn(0, transformedText.length)
            val stringUntilOffset = transformedText.take(safeOffset)
            val commaCount = stringUntilOffset.commaCount()
            val originalOffset = safeOffset - commaCount - prefixOffset

            return maxOf(0, originalOffset)
        }

        private fun String.commaCount(): Int {
            return this.count { it == ',' }
        }
    }
}
