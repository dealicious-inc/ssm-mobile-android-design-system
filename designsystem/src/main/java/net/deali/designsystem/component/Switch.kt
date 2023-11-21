package net.deali.designsystem.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.switch.CoreSwitch
import net.deali.designsystem.internal.switch.SwitchSize

@Composable
fun SwitchSmall(
    isOn: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onChange: (Boolean) -> Unit,
) {
    CoreSwitch(
        modifier = modifier,
        size = SwitchSize.Small,
        isOn = isOn,
        enabled = enabled,
        interactionSource = interactionSource,
        onChange = onChange,
    )
}

@Composable
fun SwitchLarge(
    isOn: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onChange: (Boolean) -> Unit,
) {
    CoreSwitch(
        modifier = modifier,
        size = SwitchSize.Large,
        isOn = isOn,
        enabled = enabled,
        interactionSource = interactionSource,
        onChange = onChange,
    )
}

@Composable
@Preview(showBackground = true)
private fun SwitchSmallPreview() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        var on1 by remember { mutableStateOf(true) }
        var on2 by remember { mutableStateOf(true) }
        var on3 by remember { mutableStateOf(false) }
        var on4 by remember { mutableStateOf(false) }

        SwitchSmall(
            isOn = on1,
            onChange = { on1 = it }
        )
        SwitchSmall(
            isOn = on2,
            enabled = false,
            onChange = { on2 = it }
        )
        SwitchSmall(
            isOn = on3,
            onChange = { on3 = it }
        )
        SwitchSmall(
            isOn = on4,
            enabled = false,
            onChange = { on4 = it }
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun SwitchLargePreview() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        var on1 by remember { mutableStateOf(true) }
        var on2 by remember { mutableStateOf(true) }
        var on3 by remember { mutableStateOf(false) }
        var on4 by remember { mutableStateOf(false) }

        SwitchLarge(
            isOn = on1,
            onChange = { on1 = it }
        )
        SwitchLarge(
            isOn = on2,
            enabled = false,
            onChange = { on2 = it }
        )
        SwitchLarge(
            isOn = on3,
            onChange = { on3 = it }
        )
        SwitchLarge(
            isOn = on4,
            enabled = false,
            onChange = { on4 = it }
        )
    }
}
