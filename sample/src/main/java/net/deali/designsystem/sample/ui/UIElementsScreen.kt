package net.deali.designsystem.sample.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.btnOutlineMedium01

@Composable
fun UIElementsScreen(
    navigateToCheckBox: () -> Unit,
    navigateToCheckcircle: () -> Unit,
    navigateToRadioButton: () -> Unit,
    navigateToToggleSwitch: () -> Unit,
    navigateToSwipeRefresh: () -> Unit,
    navigateToTooltip: () -> Unit,
    navigateToRating: () -> Unit,
    navigateToPopup: () -> Unit,
    navigateToTag: () -> Unit,
    navigateToDateTimePicker: () -> Unit,
    navigateToSlider: () -> Unit,
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "UI Elements",
                onBack = onBackPress,
            )
        }
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                text = "CheckBox",
                onClick = navigateToCheckBox
            )

            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                text = "Checkcircle",
                onClick = navigateToCheckcircle
            )

            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                text = "Radio Button",
                onClick = navigateToRadioButton
            )

            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                text = "Toggle/Switch",
                onClick = navigateToToggleSwitch
            )

            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                text = "Swipe Refresh",
                onClick = navigateToSwipeRefresh
            )

            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                text = "Tooltip",
                onClick = navigateToTooltip
            )

            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                text = "Rating",
                onClick = navigateToRating
            )

            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                text = "Popup",
                onClick = navigateToPopup
            )

            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                text = "Tag",
                onClick = navigateToTag
            )

            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                text = "Date Time Picker",
                onClick = navigateToDateTimePicker
            )

            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                text = "Slider",
                onClick = navigateToSlider
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun UIElementsScreenPreview() {
    UIElementsScreen(
        navigateToCheckBox = {},
        navigateToCheckcircle = {},
        navigateToRadioButton = {},
        navigateToToggleSwitch = {},
        navigateToSwipeRefresh = {},
        navigateToTooltip = {},
        navigateToRating = {},
        navigateToPopup = {},
        navigateToTag = {},
        navigateToDateTimePicker = {},
        navigateToSlider = {},
        onBackPress = {}
    )
}
