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
 * 체크박스 컴포넌트.
 *
 * @param checked 체크 상태
 * @param text 옆에 표시할 문구
 * @param modifier 컴포넌트에 적용할 [Modifier]
 * @param enabled 활성화 상태
 * @param onCheck 체크 시 콜백
 */
@Composable
fun CheckBox(
    checked: Boolean,
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onCheck: () -> Unit
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
        CheckBoxIcon(
            checked = checked,
            enabled = enabled
        )

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

/**
 * 체크박스 아이콘 컴포넌트.
 *
 * @param checked 체크 상태
 * @param modifier 컴포넌트에 적용할 [Modifier]
 * @param enabled 활성화 상태
 * @param onCheck 체크 시 콜백, `null`인 경우 클릭 이벤트 제거.
 */
@Composable
fun CheckBoxIcon(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onCheck: (() -> Unit)? = null,
) {
    val iconRes = when {
        enabled.not() && checked -> R.drawable.ic_checkbox_ondisable
        enabled.not() && checked.not() -> R.drawable.ic_checkbox_disable
        checked -> R.drawable.ic_checkbox_on
        else -> R.drawable.ic_checkbox_off
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
            onClick = onCheck,
            enabled = enabled,
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun CheckBoxPreview() {
    Column(
        modifier = Modifier
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        CheckBox(
            checked = false,
            text = "checkbox_off",
            onCheck = {}
        )
        CheckBox(
            checked = true,
            text = "checkbox_on",
            onCheck = {}
        )
        CheckBox(
            checked = false,
            text = "checkbox_disable",
            enabled = false,
            onCheck = {}
        )
        CheckBox(
            checked = true,
            text = "checkbox_ondisable",
            enabled = false,
            onCheck = {}
        )
    }
}
