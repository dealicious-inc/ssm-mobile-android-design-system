package net.deali.designsystem.sample.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.appresource.R
import net.deali.designsystem.component.ButtonMediumOutlined
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar

@Composable
fun UIElementsScreen(
    navigateToCheckBox: () -> Unit,
    navigateToCheckcircle: () -> Unit,
    navigateToRadioButton: () -> Unit,
    navigateToTooltip: () -> Unit,
    navigateToRating: () -> Unit,
    navigateToPopup: () -> Unit,
    navigateToTag: () -> Unit,
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "UI Elements",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left_16_ver01,
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .padding(10.dp)
                .weight(1f),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            ButtonMediumOutlined(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "CheckBox",
                onClick = navigateToCheckBox
            )

            ButtonMediumOutlined(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "Checkcircle",
                onClick = navigateToCheckcircle
            )

            ButtonMediumOutlined(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "Radio Button",
                onClick = navigateToRadioButton
            )

            ButtonMediumOutlined(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "Tooltip",
                onClick = navigateToTooltip
            )

            ButtonMediumOutlined(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "Rating",
                onClick = navigateToRating
            )

            ButtonMediumOutlined(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "Popup",
                onClick = navigateToPopup
            )

            ButtonMediumOutlined(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "Tag",
                onClick = navigateToTag
            )
        }
    }
}

@Composable
@Preview
private fun UIElementsScreenPreview() {
    UIElementsScreen(
        navigateToCheckBox = {},
        navigateToCheckcircle = {},
        navigateToRadioButton = {},
        navigateToTooltip = {},
        navigateToRating = {},
        navigateToPopup = {},
        navigateToTag = {},
        onBackPress = {}
    )
}
