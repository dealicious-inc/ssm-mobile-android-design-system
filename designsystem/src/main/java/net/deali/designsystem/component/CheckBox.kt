package net.deali.designsystem.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.util.getRandomText

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
                .padding(start = 8.dp),
            text = text,
            style = AppTheme.typography.b3r13,
            color = when {
                enabled.not() -> AppTheme.colors.text05
                checked -> AppTheme.colors.primary01
                else -> AppTheme.colors.text01
            },
            maxLines = 1
        )
    }
}

@Composable
private fun CheckBoxIcon(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    Icon24(
        modifier = modifier,
        iconRes = when {
            enabled.not() -> R.drawable.ic_checkbox_disabled_ver01
            checked -> R.drawable.ic_checkbox_on_ver01
            else -> R.drawable.ic_checkbox_off_ver01
        }
    )
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
            text = getRandomText(2),
            onCheck = {}
        )
        CheckBox(
            checked = true,
            text = getRandomText(2),
            onCheck = {}
        )
        CheckBox(
            checked = true,
            text = getRandomText(2),
            enabled = false,
            onCheck = {}
        )
    }
}
