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
        val textWithComma = text.text.toCommaTextOrEmpty()
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

    private fun String.toCommaTextOrEmpty(): String {
        if (this.isEmpty()) {
            return ""
        }
        return try {
            String.format(Locale.getDefault(), "%,.0f", this.toDouble())
        } catch (e: NumberFormatException) {
            throw IllegalStateException("DecimalSeparatorVisualTransformation는 숫자 형태의 String만 취급합니다: currentText=$this")
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
            val stringUntilOffset = transformedText.substring(0, offset)
            val commaCount = stringUntilOffset.commaCount()
            return offset - commaCount - prefixOffset
        }

        private fun String.substringWithout(
            startIndex: Int,
            endIndex: Int,
            predicate: (Char) -> Boolean,
        ): String {
            val subStr = StringBuilder()
            var i = startIndex
            for (c in this) {
                if (predicate(c)) {
                    subStr.append(c)
                    continue
                }
                if (i == endIndex) {
                    break
                }
                subStr.append(c)
                i++
            }
            return subStr.toString()
        }

        private fun String.commaCount(): Int {
            return this.count { it == ',' }
        }
    }
}
