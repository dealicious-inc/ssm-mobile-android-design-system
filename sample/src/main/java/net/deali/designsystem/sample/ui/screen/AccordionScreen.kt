package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.collections.immutable.persistentListOf
import net.deali.designsystem.component.Accordion
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.component.labeledTextBullet01
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.util.getRandomText

@Composable
fun AccordionScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            TopBar(
                title = "Accordion",
                onBack = onBackPress,
            )
        }
    ) {
        var isExpanded by remember { mutableStateOf(true) }

        Accordion(
            modifier = Modifier
                .padding(16.dp),
            title = "TITLE",
            isExpanded = isExpanded,
            onClickExpand = {
                isExpanded = !isExpanded
            },
            content = {
                val texts = persistentListOf(
                    getRandomText(3),
                    getRandomText(9),
                    getRandomText(13),
                    getRandomText(15),
                )

                labeledTextBullet01(
                    textList = texts,
                    title = "Title Here",
                )

            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AccordionPreview() {
    AccordionScreen(
        onBackPress = {}
    )
}
