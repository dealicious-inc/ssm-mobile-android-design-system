package net.deali.designsystem.util.visualtransformation

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

/**
 * TextField에서 숫자를 전화번호 형태로 변환해 보여주는 [VisualTransformation].
 *
 * 현재는 한국의 전화번호 표시 방식만 지원합니다.
 *
 * @param separator 번호의 각 부분를 구분하는 구분 문자.
 */
class PhoneNumberVisualTransformation(
    private val separator: Char = '-'
) : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        if (!text.text.isNumberOrEmpty()) {
            return TransformedText(text, OffsetMapping.Identity)
        }

        val separatorIndices = getSeparatorIndices(text.text)
        val phoneNumberText = text.text.toPhoneNumberFormat(separator, separatorIndices)

        return TransformedText(
            text = AnnotatedString(phoneNumberText),
            offsetMapping = PhoneNumberOffsetMapping(
                separator = separator,
                transformedText = phoneNumberText
            )
        )
    }

    private fun String.toPhoneNumberFormat(separator: Char, separatorIndices: IntArray): String {
        if (this.isEmpty()) {
            return ""
        }
        val formattedText = StringBuilder(this)
        for (index in separatorIndices.reversedArray()) {
            formattedText.insert(index, separator)
        }
        return formattedText.toString()
    }

    /**
     * 입력 된 문자를 바탕으로 구분 문자가 들어가야 할 index 목록 반환.
     *
     * 주의: 반환되는 index는 구분자 추가 전의 index입니다. 예를 들어 현재 전화번호가 01012345678 인 경우,
     * [3, 7]이 반환되는데, 이는 010 다음, 1234 다음의 index를 의미합니다. 이미 구분자가 하나 이상 추가 된 문자열
     * 에서 처리하면 구분자가 잘못 삽입될 수 있습니다.
     */
    private fun getSeparatorIndices(text: String): IntArray {
        val length = text.length
        return if (text.startsWith(SEOUL_LOCAL_NUMBER)) {
            when (length) {
                0, 1, 2 -> intArrayOf()
                3, 4, 5 -> intArrayOf(2)
                6, 7, 8, 9 -> intArrayOf(2, 5)
                else -> intArrayOf(2, 6)
            }
        } else {
            when (length) {
                0, 1, 2, 3 -> intArrayOf()
                4, 5, 6 -> intArrayOf(3)
                7, 8, 9, 10 -> intArrayOf(3, 6)
                else -> intArrayOf(3, 7)
            }
        }
    }

    private class PhoneNumberOffsetMapping(
        private val separator: Char,
        private val transformedText: String,
    ) : OffsetMapping {

        override fun originalToTransformed(offset: Int): Int {
            if (transformedText.isEmpty()) {
                return 0
            }
            val stringUntilOffset = transformedText.substringWithout(0, offset) {
                it == separator
            }
            return offset + stringUntilOffset.count { it == separator }
        }

        override fun transformedToOriginal(offset: Int): Int {
            if (transformedText.isEmpty()) {
                return 0
            }
            val stringUntilOffset = transformedText.substring(0, offset)
            return offset - stringUntilOffset.count { it == separator }
        }
    }

    companion object {
        /** 서울의 지역번호 */
        const val SEOUL_LOCAL_NUMBER = "02"
    }
}
