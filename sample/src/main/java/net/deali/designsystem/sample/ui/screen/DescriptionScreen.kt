package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.Description
import net.deali.designsystem.component.DescriptionFormat
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.util.getRandomText

@Composable
fun DescriptionScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            TopBar(
                title = "Description",
                onBack = onBackPress,
            )
        }
    ) {
        val texts = listOf(
            getRandomText(3),
            getRandomText(9),
            getRandomText(13),
            getRandomText(15),
        )

        val annotatedText = buildAnnotatedString {
            val text = "신분증 이미지를 가이드 영역에 맞춰 가로로 촬영 후 등록해주세요."
            val boldTarget1 = "가이드 영역"
            val boldStart1 = text.indexOf(boldTarget1)
            val boldEnd1 = boldStart1 + boldTarget1.length
            val boldTarget2 = "가로로 촬영"
            val boldStart2 = text.indexOf(boldTarget2)
            val boldEnd2 = boldStart2 + boldTarget2.length

            append(text)
            addStyle(style = SpanStyle(color = DealiColor.g100), start = boldStart1, end = boldEnd1)
            addStyle(style = SpanStyle(color = DealiColor.g100), start = boldStart2, end = boldEnd2)
        }

        Column(
            modifier = Modifier
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Description(
                texts = texts,
                format = DescriptionFormat.DOT,
                title = "DescriptionFormat.DOT",
            )

            Description(
                texts = texts,
                format = DescriptionFormat.NUMBER,
                title = "DescriptionFormat.NUMBER",
            )

            Description(
                text = annotatedText,
                format = DescriptionFormat.DOT,
                title = "DescriptionFormat.DOT + annotatedString",
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DescriptionPreview() {
    DescriptionScreen(
        onBackPress = {}
    )
}
