package net.deali.designsystem.util.visualtransformation

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import java.util.Locale

/**
 * Jetpack Compose TextField에서 UI에 보이는 형태를 가격 형태처럼 바꾸어 주는 객체.
 * TextField가 숫자 형태의 value를 가지고 있을 때, 자릿수에 맞춰 콤마(,)를 추가하고 [prefix]가 있다면
 * 앞에 붙여서 보여줍니다.
 * 예를 들어 TextField가 1000000을 value로 가지고 있고 [prefix]가 ₩라면, '₩1,000,000'로 보여줍니다.
 *
 * @param prefix 가격 형태의 숫자 앞에 표기 할 문자. (e.g. '$')
 */
class PriceVisualTransformation(private val prefix: String = "") : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val priceText = text.text.toCommaTextOrEmpty()
        val priceTextWithSymbol = prefix + priceText
        return TransformedText(
            text = AnnotatedString(priceTextWithSymbol),
            offsetMapping = PriceOffsetMapping(prefix, priceTextWithSymbol)
        )
    }

    private fun String.toCommaTextOrEmpty(): String {
        if (this.isEmpty()) {
            return ""
        }
        return try {
            String.format(Locale.KOREA, "%,.0f", this.toDouble())
        } catch (e: NumberFormatException) {
            return ""
        }
    }

    private class PriceOffsetMapping(
        private val prefix: String,
        private val priceTextWithSymbol: String
    ) : OffsetMapping {
        private val prefixOffset: Int = prefix.length

        override fun originalToTransformed(offset: Int): Int {
            if (priceTextWithSymbol.isEmpty()) {
                return 0
            }
            val stringUntilOffset = priceTextWithSymbol.substringWithout(0, offset) {
                it in prefix || it == ','
            }
            val commaCount = stringUntilOffset.commaCount()
            return offset + commaCount + prefixOffset
        }

        override fun transformedToOriginal(offset: Int): Int {
            if (priceTextWithSymbol.isEmpty()) {
                return 0
            }
            if (offset < prefixOffset) {
                return 0
            }
            val stringUntilOffset = priceTextWithSymbol.substring(0, offset)
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
