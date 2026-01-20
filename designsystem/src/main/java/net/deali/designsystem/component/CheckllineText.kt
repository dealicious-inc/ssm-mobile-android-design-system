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
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.util.click.singleClickable
import net.deali.designsystem.util.icon.Checkline

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
fun ChecklineText(
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
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.Top
    ) {
        Checkline(
            checked = checked,
            enabled = enabled,
            isAd = isAd
        )

        DealiText(
            modifier = Modifier.padding(end = 3.dp, top = 2.dp),
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
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ChecklinePreview() {
    Column(
        modifier = Modifier
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ChecklineText(
            checked = false,
            text = "checkline_off",
            onCheck = {}
        )
        ChecklineText(
            checked = true,
            text = "checkline_on",
            onCheck = {}
        )
        ChecklineText(
            checked = true,
            text = "checkline_onad",
            isAd = true,
            onCheck = {}
        )
        ChecklineText(
            checked = true,
            text = "checkline_disablecheckline_disablecheckline_disablecheckline_disablecheckline_disable",
            enabled = false,
            onCheck = {}
        )
    }
}
