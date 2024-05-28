package net.deali.designsystem.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

/**
 * 체크 라인 컴포넌트.
 *
 * @param checked 체크 상태
 * @param text 옆에 표시할 문구
 * @param modifier 컴포넌트에 적용할 [Modifier]
 * @param enabled 활성화 상태
 * @param isAd 체크 스타일을 AD 스타일로 설정
 * @param onCheck 체크 시 콜백
 */
@Composable
fun Checkline(
    checked: Boolean,
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isAd: Boolean = false,
    onCheck: () -> Unit,
) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(4.dp))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(),
                enabled = enabled,
                role = Role.Checkbox,
                onClick = onCheck
            )
            .then(modifier),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (isAd) {
            ChecklineAdIcon(
                checked = checked,
                enabled = enabled
            )
        } else {
            ChecklineIcon(
                checked = checked,
                enabled = enabled
            )
        }

        DealiText(
            modifier = Modifier
                .padding(start = 8.dp, end = 3.dp),
            text = text,
            style = DealiFont.b2r14,
            color = when {
                enabled.not() -> DealiColor.g50
                else -> DealiColor.g100
            },
            maxLines = 1
        )
    }
}

@Composable
fun ChecklineIcon(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    noRipple: Boolean = false,
    onCheck: (() -> Unit)? = null,
) {
    ChecklineIcon(
        modifier = modifier,
        checked = checked,
        enabled = enabled,
        isAd = false,
        onCheck = onCheck,
        noRipple = noRipple,
    )
}

@Composable
fun ChecklineAdIcon(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    noRipple: Boolean = false,
    onCheck: (() -> Unit)? = null,
) {
    ChecklineIcon(
        modifier = modifier,
        checked = checked,
        enabled = enabled,
        isAd = true,
        onCheck = onCheck,
        noRipple = noRipple,
    )
}

/**
 * 체크 라인 아이콘 컴포넌트.
 *
 * @param checked 체크 상태
 * @param modifier 컴포넌트에 적용할 [Modifier]
 * @param enabled 활성화 상태
 * @param isAd 체크 스타일을 AD 스타일로 설정
 * @param noRipple 리플 효과 제거 여부
 * @param onCheck 체크 시 콜백. `null`인 경우 클릭 이벤트 제거.
 */
@Composable
private fun ChecklineIcon(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean,
    isAd: Boolean,
    noRipple: Boolean = false,
    onCheck: (() -> Unit)? = null,
) {
    val iconRes = when {
        enabled.not() -> R.drawable.ic_checkline_disabled
        checked && isAd -> R.drawable.ic_checkline_onad
        checked && isAd.not() -> R.drawable.ic_checkline_on
        else -> R.drawable.ic_checkline_off
    }

    if (onCheck == null) {
        Icon24(
            modifier = modifier,
            iconRes = iconRes
        )
    } else {
        Icon24(
            modifier = modifier,
            iconRes = iconRes,
            enabled = enabled,
            onClick = onCheck,
            noRipple = noRipple,
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ChecklinePreview() {
    Column(
        modifier = Modifier
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Checkline(
            checked = false,
            text = "checkline_off",
            onCheck = {}
        )
        Checkline(
            checked = true,
            text = "checkline_on",
            onCheck = {}
        )
        Checkline(
            checked = true,
            text = "checkline_onad",
            isAd = true,
            onCheck = {}
        )
        Checkline(
            checked = true,
            text = "checkline_disable",
            enabled = false,
            onCheck = {}
        )
    }
}
