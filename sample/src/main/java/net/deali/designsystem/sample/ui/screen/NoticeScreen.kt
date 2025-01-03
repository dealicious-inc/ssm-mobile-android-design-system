package net.deali.designsystem.sample.ui.screen

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.HorizontalDivider
import net.deali.designsystem.component.Notice
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.component.VerticalSpacer
import net.deali.designsystem.component.labeledTextBullet01
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.util.getRandomText

@Composable
fun NoticeScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            TopBar(
                title = "Notice",
                onBack = onBackPress,
            )
        }
    ) {
        val context = LocalContext.current

        Column {
            Notice(
                modifier = Modifier
                    .padding(16.dp),
                title = "TITLE",
                content = {
                    val texts = listOf(
                        getRandomText(3),
                        getRandomText(9),
                        getRandomText(13),
                        getRandomText(15),
                    )

                    labeledTextBullet01(
                        textList = texts,
                    )

                }
            )

            VerticalSpacer(24.dp)

            Notice(
                modifier = Modifier
                    .padding(16.dp),
                title = "TITLE",
                textLinkText = "Text Link",
                onClickTextLink = {
                    Toast.makeText(context, "Text Link Click", Toast.LENGTH_SHORT).show()
                },
                content = {
                    Box(
                        modifier = Modifier.height(100.dp)
                    )
                }
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    NoticeScreen(
        onBackPress = {}
    )
}
