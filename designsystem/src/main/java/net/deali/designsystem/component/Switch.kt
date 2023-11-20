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
fun switchSmall(
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
fun switchLarge(
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

//// TODO: Toggle과 Switch 중 하나로 통일하는 방안을 디자인 측에서 논의중.
//@Composable
//fun Switch(
//    selected: Boolean,
//    modifier: Modifier = Modifier,
//    enabled: Boolean = true,
//    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
//    onSelectedChange: (Boolean) -> Unit,
//) {
//    var currentSelected by remember(selected) { mutableStateOf(selected) }
//    val colors = SwitchDefaults.colors()
//    val slideColor by colors.slideColor(selected, enabled)
//    val handleColor = colors.handleColor()
//
//    SwitchLayout(
//        modifier = modifier,
//        enabled = enabled,
//        interactionSource = interactionSource,
//        onClick = {
//            val newState = !currentSelected
//            currentSelected = newState
//            onSelectedChange(newState)
//        }
//    ) {
//        SwitchSlide(
//            modifier = Modifier
//                .requiredSize(SwitchDefaults.SlideSize)
//                .align(Alignment.Center),
//            color = slideColor,
//            size = SwitchDefaults.SlideSize,
//        )
//
//        val transition = updateTransition(
//            targetState = currentSelected,
//            label = "transition"
//        )
//        val handleOffsetX by transition.animateDp(
//            transitionSpec = { tween(durationMillis = 200) },
//            label = "handleOffsetX",
//            targetValueByState = { targetIsSelected ->
//                val spacing = SwitchDefaults.SlideSize.height / 2f - SwitchDefaults.HandleRadius
//                if (targetIsSelected) {
//                    SwitchDefaults.SlideSize.width - (SwitchDefaults.HandleRadius * 2) - spacing
//                } else {
//                    spacing
//                }
//            }
//        )
//        val handleOffsetY = SwitchDefaults.SlideSize.height / 2f - SwitchDefaults.HandleRadius
//
//        SwitchHandle(
//            modifier = Modifier
//                .requiredSize(size = SwitchDefaults.HandleRadius * 2)
//                .offset(x = handleOffsetX, y = handleOffsetY),
//            color = handleColor,
//            radius = SwitchDefaults.HandleRadius,
//        )
//    }
//}


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

        switchSmall(
            isOn = on1,
            onChange = { on1 = it }
        )
        switchSmall(
            isOn = on2,
            enabled = false,
            onChange = { on2 = it }
        )
        switchSmall(
            isOn = on3,
            onChange = { on3 = it }
        )
        switchSmall(
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

        switchLarge(
            isOn = on1,
            onChange = { on1 = it }
        )
        switchLarge(
            isOn = on2,
            enabled = false,
            onChange = { on2 = it }
        )
        switchLarge(
            isOn = on3,
            onChange = { on3 = it }
        )
        switchLarge(
            isOn = on4,
            enabled = false,
            onChange = { on4 = it }
        )
    }
}
