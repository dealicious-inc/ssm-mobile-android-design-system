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
 * 음수 부호의 경우 [prefix] 앞에 위치합니다. 예를 들어 TextField가 `-10000`을 value로 가지고 있고 [prefix]
 * 가 `$`라면, `-$10,000`로 보입니다.
 *
 * 천 단위 구분자는 기기 로케일과 무관하게 항상 콤마(,)입니다. 커서 오프셋 매핑이 콤마를 기준으로 계산되므로
 * 로케일별 구분자('.', NBSP 등)를 따르면 매핑이 어긋나 크래시가 발생합니다.
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
        if (!text.text.isValidDecimalInput()) {
            return TransformedText(text, OffsetMapping.Identity)
        }

        val formattedNumber = text.text.formatWithCommas()
            ?: return TransformedText(text, OffsetMapping.Identity)

        val isNegative = formattedNumber.startsWith("-")
        val displayText = buildDisplayText(formattedNumber, isNegative)

        // 변환 결과가 원본보다 짧으면 Compose 내부 가정을 위반하므로 변환하지 않음
        if (displayText.length < text.text.length) {
            return TransformedText(text, OffsetMapping.Identity)
        }

        return TransformedText(
            text = AnnotatedString(displayText),
            offsetMapping = DecimalSeparatorOffsetMapping(prefix, displayText, isNegative),
        )
    }

    private fun buildDisplayText(formattedNumber: String, isNegative: Boolean): String {
        if (!alwaysShowPrefix && formattedNumber.isEmpty()) {
            return formattedNumber
        }
        return if (isNegative) {
            "-" + prefix + formattedNumber.removePrefix("-")
        } else {
            prefix + formattedNumber
        }
    }

    /** 0~9까지의 10진수 숫자와 온점(.)만 포함된 경우 또는 비어 있는 경우 `true`, 다른 문자가 포함된 경우 `false`. */
    private fun String.isValidDecimalInput(): Boolean {
        return isEmpty() || matches(Regex("^-?[0-9]*\\.?[0-9]*$"))
    }

    /** 숫자 문자열에 3자리마다 콤마를 추가. 포매팅할 수 없는 경우 `null` 반환. */
    private fun String.formatWithCommas(): String? {
        if (isEmpty()) {
            return ""
        }

        val isNegative = startsWith("-")

        val digits = if (isNegative) {
            this.removePrefix("-")
        } else {
            this
        }

        // 소수점으로 끝나는 경우 포맷 후 다시 붙임.
        // 포맷 과정에서 trailing '.'이 제거되면 변환 텍스트 길이가 원본과 같아져
        // originalToTransformed가 transformedText.length와 동일한 값을 캐릭터 인덱스로
        // 반환하게 되고, Compose 내부의 fillBoundingBoxes에서 범위 오류가 발생함.
        val hasTrailingDot = digits.endsWith(".")
        val digitsForFormat = if (hasTrailingDot) {
            digits.dropLast(1)
        } else {
            digits
        }
        // 기기 로케일(Locale.getDefault())을 쓰면 vi-VN·de-DE 등은 천 단위 구분자가 '.'(또는 NBSP)로 나와
        // ','만 카운트하는 DecimalSeparatorOffsetMapping과 어긋나고, Compose가
        // "OffsetMapping.transformedToOriginal returned invalid mapping" 으로 크래시한다.
        // 구분자를 항상 ','로 고정하기 위해 Locale.US 로 포맷한다.
        val formatted = if (digitsForFormat.isNotEmpty()) {
            try {
                String.format(Locale.US, "%,.0f", digitsForFormat.toDouble())
            } catch (_: NumberFormatException) {
                return null
            }
        } else {
            ""
        }

        val suffix = if (hasTrailingDot) "." else ""
        return if (isNegative) "-$formatted$suffix" else "$formatted$suffix"
    }

    private class DecimalSeparatorOffsetMapping(
        private val prefix: String,
        private val transformedText: String,
        private val isNegative: Boolean = false,
    ) : OffsetMapping {
        private val prefixLength: Int = prefix.length

        override fun originalToTransformed(offset: Int): Int {
            if (transformedText.isEmpty()) {
                return 0
            }
            // 음수인 경우 커서가 맨 앞(부호 앞)에 있으면 변환 텍스트도 0
            if (isNegative && offset == 0) {
                return 0
            }
            val commaCount = transformedText.substringWithout(0, offset) {
                it in prefix || it == ','
            }.commaCount()
            return (offset + commaCount + prefixLength).coerceIn(0, transformedText.length)
        }

        override fun transformedToOriginal(offset: Int): Int {
            if (transformedText.isEmpty()) {
                return 0
            }
            if (isNegative) {
                // 변환 텍스트 형식: `-{prefix}{digits}`
                // offset 0 → 부호 앞, offset 1..prefixLength → 부호 바로 뒤(prefix 영역)
                if (offset == 0) {
                    return 0
                }
                if (offset <= prefixLength) {
                    return 1
                }
            } else if (offset < prefixLength) {
                return 0
            }
            val safeOffset = offset.coerceIn(0, transformedText.length)
            val commaCount = transformedText.take(safeOffset).commaCount()
            return maxOf(0, safeOffset - commaCount - prefixLength)
        }

        private fun String.commaCount(): Int = count { it == ',' }
    }
}
