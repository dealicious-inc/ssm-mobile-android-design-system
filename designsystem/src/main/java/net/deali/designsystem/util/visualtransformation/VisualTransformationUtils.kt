package net.deali.designsystem.util.visualtransformation

/**
 * 문자열이 0에서 9사이의 문자 또는 비어 있는 경우 true.
 */
internal fun String.isNumberOrEmpty(): Boolean {
    return this.isEmpty() || this.matches(Regex("^[0-9]+$"))
}

/**
 * [substring]과 유사하게 문자열을 자르지만, [ignore] 조건을 만족하는 경우 index를 뛰어 넘어 처리.
 *
 * 예를 들어 '100,000'을 대상으로 [startIndex]를 0, [endIndex]를 4를 주면서 [ignore]는 ','와 같은 조건으로
 * 실행하는 경우 '100,0'이 반환됩니다.
 *
 * @param startIndex 문자열 자르기를 시작 할 index
 * @param endIndex 문자열 자르기를 완료 할 index (exclusive). [ignore]가 true인 경우가 발생하면 [endIndex]가
 * 늘어날 수 있습니다.
 * @param ignore 문자열 자르기를 할 때 무시할 문자 조건.
 *
 * @return 자른 문자열 반환.
 *
 * @throws IndexOutOfBoundsException 문자열 범위는 벗어나는 index를 처리하려 하는 경우 발생.
 */
internal fun String.substringWithout(
    startIndex: Int,
    endIndex: Int,
    ignore: (Char) -> Boolean,
): String {
    val subStr = StringBuilder()
    var i = 0
    var started = false
    for (c in this) {
        if (ignore(c)) {
            if (started) {
                subStr.append(c)
            }
            continue
        }
        if (!started && i == startIndex) {
            started = true
        }
        if (i == endIndex) {
            break
        }
        subStr.append(c)
        i++
    }
    return subStr.toString()
}
