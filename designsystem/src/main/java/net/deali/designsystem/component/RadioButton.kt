package net.deali.designsystem.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
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
import net.deali.designsystem.util.getRandomText

@Composable
fun RadioButton(
    selected: Boolean,
    modifier: Modifier = Modifier,
    text: String = "",
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(4.dp))
            .selectable(
                selected = selected,
                interactionSource = remember { MutableInteractionSource() },
                indication = ripple(),
                enabled = enabled,
                role = Role.RadioButton,
                onClick = onClick
            )
            .then(modifier),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioIcon(
            selected = selected,
            enabled = enabled
        )

        if (text.isNotEmpty()) {
            DealiText(
                modifier = Modifier
                    .padding(start = 8.dp),
                text = text,
                style = DealiFont.b2r14,
                color = when {
                    enabled.not() -> DealiColor.g50
                    else -> DealiColor.g100
                }
            )
        }
    }
}


@Composable
private fun RadioIcon(
    selected: Boolean,
    enabled: Boolean = true,
) {
    Icon(
        iconRes = when {
            enabled.not() -> R.drawable.ic_radiobutton_disable
            selected -> R.drawable.ic_radiobutton_on
            else -> R.drawable.ic_radiobutton_off
        },
        size = 24.dp,
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun RadioButtonPreview() {
    Column(
        modifier = Modifier
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        RadioButton(
            text = getRandomText(3),
            selected = false,
            onClick = {}
        )

        RadioButton(
            text = getRandomText(3),
            selected = true,
            onClick = {}
        )

        RadioButton(
            text = getRandomText(3),
            selected = false,
            enabled = false,
            onClick = {}
        )

        RadioButton(
            selected = false,
            onClick = {}
        )

        RadioButton(
            selected = true,
            onClick = {}
        )

        RadioButton(
            selected = false,
            enabled = false,
            onClick = {}
        )
    }
}
