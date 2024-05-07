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


@Composable
fun Checkcircle(
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

@Deprecated(
    "CheckcircleIcon을 이용해주세요.",
    ReplaceWith(
        "CheckcircleIcon(\n" +
                "modifier = modifier," +
                "checked = checked," +
                "enabled = enabled," +
                "onCheck = onCheck," +
                "noRipple = noRipple," +
                ")",
        "net.deali.designsystem.component.Checkcircle"
    )
)
@Composable
fun Checkcircle(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onCheck: () -> Unit = {},
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
fun CheckcircleIcon(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    noRipple: Boolean = false,
    onCheck: () -> Unit = {},
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
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    noRipple: Boolean = false,
    onCheck: () -> Unit = {},
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

@Composable
private fun CheckcircleIcon(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean,
    isAd: Boolean,
    noRipple: Boolean = false,
    onCheck: () -> Unit = {},
) {
    Icon24(
        modifier = modifier,
        iconRes = when {
            enabled.not() -> R.drawable.ic_checkcircle_disable
            checked && isAd -> R.drawable.ic_checkcircle_onad
            checked && isAd.not() -> R.drawable.ic_checkcircle_on
            else -> R.drawable.ic_checkcircle_off
        },
        enabled = enabled,
        onClick = onCheck,
        noRipple = noRipple,
    )
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
            text = "checkcircle_disable",
            enabled = false,
            onCheck = {}
        )
    }
}
