package net.deali.designsystem.internal.textfield

/**
 * @property ENABLED 텍스트 필드 활성화 상태.
 * @property DISABLED 텍스트 필드 비활성화 상태.
 * @property ERROR 텍스트 필드 에러 상태.
 * @property READ_ONLY 텍스트 필드 읽기 상태.
 */
enum class DealiTextFieldState {
    ENABLED,
    DISABLED,
    ERROR,
    READ_ONLY;

    val isEnabled
        get() = (this == ENABLED) || (this == ERROR)
}
