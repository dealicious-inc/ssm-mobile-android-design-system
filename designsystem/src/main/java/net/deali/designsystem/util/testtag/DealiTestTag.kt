package net.deali.designsystem.util.testtag

/**
 * QA E2E 자동화(Appium)용 범용 테스트 식별자.
 *
 * 디자인 시스템 공용 컴포넌트에 내장되어, 해당 컴포넌트를 쓰는 모든 화면에서 동일하게 접근할 수 있다.
 * 사용자 UI/동작에는 영향을 주지 않으며(웹 `data-cy` 대응), Compose에서는 `Modifier.testTag(...)`로 부여한다.
 * 최상위에 `testTagsAsResourceId`가 켜져 있어야 Appium에서 `resource-id`로 접근 가능하다.
 *
 * 값(키)은 절대 변경하지 않는다 — 변경 시 자동화 테스트가 깨진다.
 */
object DealiTestTag {
    /** 다이얼로그(Alert) 루트. "다이얼로그가 떴다"를 판정하는 신호로 사용한다. */
    const val DIALOG = "ssm-dialog"

    /** 다이얼로그 좌측 버튼(일반적으로 부차 동작 · 취소/닫기). */
    const val DIALOG_BUTTON_LEFT = "ssm-dialog-btn-left"

    /** 다이얼로그 우측 버튼(일반적으로 유도 동작 · 확인/이동). 단일 버튼 다이얼로그의 버튼도 이 키를 쓴다. */
    const val DIALOG_BUTTON_RIGHT = "ssm-dialog-btn-right"
}
