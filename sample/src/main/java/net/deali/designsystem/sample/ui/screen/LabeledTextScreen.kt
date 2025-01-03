package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.HorizontalDivider
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.component.VerticalSpacer
import net.deali.designsystem.component.labeledTextBullet01
import net.deali.designsystem.component.labeledTextBullet02
import net.deali.designsystem.component.labeledTextIcon01
import net.deali.designsystem.component.labeledTextNumber01
import net.deali.designsystem.component.labeledTextNumber02
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.util.getRandomText

@Composable
fun LabeledTextScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            TopBar(
                title = "labeledText",
                onBack = onBackPress,
            )
        }
    ) {
        val texts = listOf(
            getRandomText(3),
            getRandomText(9),
            getRandomText(15),
        )

        val state = rememberScrollState()

        Column(
            modifier = Modifier
                .padding(16.dp)
                .verticalScroll(state),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            labeledTextBullet01(
                textList = texts,
                title = "labeledTextBullet01",
                iconRes = R.drawable.ic_alarm_etc,
            )

            HorizontalDivider(color = DealiColor.g30)

            labeledTextBullet02(
                textList = texts,
                title = "labeledTextBullet02",
                iconRes = R.drawable.ic_alarm_etc,
            )

            HorizontalDivider(color = DealiColor.g30)

            labeledTextNumber01(
                textList = texts,
                title = "labeledTextNumber01",
                iconRes = R.drawable.ic_alarm_etc,
            )

            HorizontalDivider(color = DealiColor.g30)

            labeledTextNumber02(
                textList = texts,
                title = "labeledTextNumber02",
                iconRes = R.drawable.ic_alarm_etc,
            )

            HorizontalDivider(color = DealiColor.g30)

            labeledTextIcon01(
                textList = texts,
                title = "labeledTextIcon01",
                iconRes = R.drawable.ic_alarm_etc,
            )

            VerticalSpacer(40.dp)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LabeledTextPreview() {
    LabeledTextScreen(
        onBackPress = {}
    )
}
