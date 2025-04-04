package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.ErrorCase
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.component.VerticalSpacer
import net.deali.designsystem.internal.errorcase.ErrorCaseState
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.util.getRandomText

@Composable
fun ErrorCaseScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            TopBar(
                title = "ErrorCase",
                onBack = onBackPress,
            )
        }
    ) {
        val errorCaseModifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .height(500.dp)

        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = DealiColor.g50)
                .verticalScroll(scrollState),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            DealiText(
                modifier = Modifier.padding(16.dp),
                text = "ErrorCase 텍스트만 사용",
                style = DealiFont.b2sb14,
                color = DealiColor.g100,
            )

            ErrorCase(
                modifier = errorCaseModifier,
                content = getRandomText(3),
            )

            DealiText(
                modifier = Modifier.padding(16.dp),
                text = "ErrorCase 아이콘 사용",
                style = DealiFont.b2sb14,
                color = DealiColor.g100,
            )

            ErrorCase(
                modifier = errorCaseModifier,
                content = getRandomText(3),
                state = ErrorCaseState.NOTICE,
            )

            VerticalSpacer(16.dp)

            ErrorCase(
                modifier = errorCaseModifier,
                content = getRandomText(3),
                state = ErrorCaseState.REFRESH,
                buttonText = "ButtonText",
                onClick = {}
            )

            VerticalSpacer(16.dp)

            ErrorCase(
                modifier = errorCaseModifier,
                title = getRandomText(2),
                content = getRandomText(4),
                state = ErrorCaseState.REFRESH,
                buttonText = "ButtonText",
                onClick = {},
            )

            DealiText(
                modifier = Modifier.padding(16.dp),
                text = "ErrorCase 이미지 사용",
                style = DealiFont.b2sb14,
                color = DealiColor.g100,
            )

            ErrorCase(
                modifier = errorCaseModifier,
                content = getRandomText(3),
                imageRes = R.drawable.img_mbs_filled,
            )

            VerticalSpacer(16.dp)

            ErrorCase(
                modifier = errorCaseModifier,
                content = getRandomText(3),
                imageRes = R.drawable.img_mbs_filled,
                buttonText = "ButtonText",
                onClick = {}
            )

            VerticalSpacer(16.dp)

            ErrorCase(
                modifier = errorCaseModifier,
                title = getRandomText(2),
                content = getRandomText(4),
                imageRes = R.drawable.img_mbs_filled,
                buttonText = "ButtonText",
                onClick = {},
            )

            VerticalSpacer(40.dp)
        }
    }
}

@Composable
@Preview
private fun ErrorCaseScreenPreview() {
    ErrorCaseScreen(
        onBackPress = {}
    )
}
