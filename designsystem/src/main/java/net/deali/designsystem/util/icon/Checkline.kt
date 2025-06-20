package net.deali.designsystem.util.icon

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.Icon

/**
 * 체크 라인 아이콘 컴포넌트.
 *
 * @param checked 체크 상태
 * @param enabled 활성화 상태
 * @param isAd 체크 스타일을 AD 스타일로 설정
 * @param noRipple 리플 효과 제거 여부
 * @param onCheck 체크 시 콜백. `null`인 경우 클릭 이벤트 제거.
 */
@Composable
fun Checkline(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isAd: Boolean = false,
    noRipple: Boolean = false,
    onCheck: (() -> Unit)? = null,
) {
    val iconRes = when {
        enabled.not() -> R.drawable.ic_checkline_disabled
        checked && isAd -> R.drawable.ic_checkline_onad
        checked && !isAd -> R.drawable.ic_checkline_on
        else -> R.drawable.ic_checkline_off
    }

    if (onCheck == null) {
        Icon(
            modifier = modifier
                .padding(4.dp),
            iconRes = iconRes,
            size = 16.dp,
        )
    } else {
        Icon(
            modifier = modifier
                .padding(4.dp),
            iconRes = iconRes,
            size = 16.dp,
            enabled = enabled,
            onClick = onCheck,
            noRipple = noRipple,
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ChecklinePreview() {
    Column {
        Checkline(
            checked = false,
        )
        Checkline(
            checked = true,
        )
        Checkline(
            checked = true,
            isAd = true,
            onCheck = {}
        )
        Checkline(
            checked = true,
            isAd = true,
            enabled = false,
            onCheck = {}
        )
    }
}
