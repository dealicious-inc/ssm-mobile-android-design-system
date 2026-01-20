package net.deali.designsystem.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple
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
import net.deali.designsystem.util.click.singleClickable

/**
 * 체크 서클 컴포넌트.
 *
 * @param checked 체크 상태
 * @param text 옆에 표시할 문구
 * @param modifier 컴포넌트에 적용할 [Modifier]
 * @param enabled 활성화 상태
 * @param isAd 체크 스타일을 AD 스타일로 설정
 * @param onCheck 체크 시 콜백
 */
@Composable
fun Checkcircle(
    checked: Boolean,
    text: String,
    onCheck: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isAd: Boolean = false,
) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(4.dp))
            .singleClickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = ripple(),
                enabled = enabled,
                role = Role.Checkbox,
                onClick = onCheck
            )
            .then(modifier),
        verticalAlignment = Alignment.Top
    ) {
        if (isAd) {
            CheckcircleAdIcon(
                checked = checked,
                enabled = enabled
            )
        } else {
            CheckcircleIcon(
                checked = checked,
                enabled = enabled
            )
        }

        DealiText(
            modifier = Modifier
                .padding(start = 8.dp, end = 3.dp, top = 2.dp),
            text = text,
            style = DealiFont.b2r14,
            color = when {
                enabled.not() -> DealiColor.g50
                else -> DealiColor.g100
            },
        )
    }
}

@Composable
fun CheckcircleIcon(
    checked: Boolean,
    onCheck: (() -> Unit)? = null,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    noRipple: Boolean = false,
) {
    CheckcircleIcon(
        modifier = modifier,
        checked = checked,
        enabled = enabled,
        isAd = false,
        onCheck = onCheck,
        noRipple = noRipple,
    )
}

@Composable
fun CheckcircleAdIcon(
    checked: Boolean,
    onCheck: (() -> Unit)? = null,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    noRipple: Boolean = false,
) {
    CheckcircleIcon(
        modifier = modifier,
        checked = checked,
        enabled = enabled,
        isAd = true,
        onCheck = onCheck,
        noRipple = noRipple,
    )
}

/**
 * 체크 서클 아이콘 컴포넌트.
 *
 * @param checked 체크 상태
 * @param modifier 컴포넌트에 적용할 [Modifier]
 * @param enabled 활성화 상태
 * @param isAd 체크 스타일을 AD 스타일로 설정
 * @param noRipple 리플 효과 제거 여부
 * @param onCheck 체크 시 콜백. `null`인 경우 클릭 이벤트 제거.
 */
@Composable
private fun CheckcircleIcon(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean,
    isAd: Boolean,
    noRipple: Boolean = false,
    onCheck: (() -> Unit)? = null,
) {
    val iconRes = when {
        !checked && !enabled -> R.drawable.ic_checkcircle_disabled
        checked && !enabled -> R.drawable.ic_checkcircle_ondisable
        checked && isAd -> R.drawable.ic_checkcircle_onad
        checked && !isAd -> R.drawable.ic_checkcircle_on
        else -> R.drawable.ic_checkcircle_off
    }

    if (onCheck == null) {
        Icon(
            modifier = modifier,
            iconRes = iconRes,
            size = 24.dp,
        )
    } else {
        Icon(
            modifier = modifier,
            iconRes = iconRes,
            size = 24.dp,
            noRipple = noRipple,
            enabled = enabled,
            onClick = onCheck,
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun CheckcirclePreview() {
    Column(
        modifier = Modifier
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Checkcircle(
            checked = false,
            text = "checkcircle_off",
            onCheck = {}
        )
        Checkcircle(
            checked = true,
            text = "checkcircle_on",
            onCheck = {}
        )
        Checkcircle(
            checked = true,
            text = "checkcircle_onad",
            isAd = true,
            onCheck = {}
        )
        Checkcircle(
            checked = true,
            text = "checkcircle_disablecheckcircle_disablecheckcircle_disablecheckcircle_disablecheckcircle_disablecheckcircle_disablecheckcircle_disablecheckcircle_disablecheckcircle_disable",
            enabled = false,
            onCheck = {}
        )
        Checkcircle(
            checked = false,
            text = "checkcircle_disable",
            enabled = false,
            onCheck = {}
        )
    }
}
