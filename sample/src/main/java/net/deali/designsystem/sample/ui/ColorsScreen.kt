package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.sample.util.toHexString
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun ColorsScreen(
    onBackPress: () -> Unit
) {
    val colorScreenItems = listOf(
        ColorScreenItem(DealiColor.primary01, "primary01"),
        ColorScreenItem(DealiColor.primary02, "primary02"),
        ColorScreenItem(DealiColor.primary03, "primary03"),
        ColorScreenItem(DealiColor.primary04, "primary04"),
        ColorScreenItem(DealiColor.primary05, "primary05"),
        ColorScreenItem(DealiColor.secondary01, "secondary01"),
        ColorScreenItem(DealiColor.secondary02, "secondary02"),
        ColorScreenItem(DealiColor.secondary03, "secondary03"),
        ColorScreenItem(DealiColor.secondary04, "secondary04"),
        ColorScreenItem(DealiColor.secondary05, "secondary05"),
        ColorScreenItem(DealiColor.secondary06, "secondary06"),
        ColorScreenItem(DealiColor.g100, "g100"),
        ColorScreenItem(DealiColor.g80, "g80"),
        ColorScreenItem(DealiColor.g70, "g70"),
        ColorScreenItem(DealiColor.g60, "g60"),
        ColorScreenItem(DealiColor.g50, "g50"),
        ColorScreenItem(DealiColor.g40, "g40"),
        ColorScreenItem(DealiColor.g30, "g30"),
        ColorScreenItem(DealiColor.g20, "g20"),
        ColorScreenItem(DealiColor.g10, "g10"),
        ColorScreenItem(DealiColor.g05, "g05"),
        ColorScreenItem(DealiColor.error, "error"),
        ColorScreenItem(DealiColor.linkAndInfo, "linkAndInfo"),
        ColorScreenItem(DealiColor.warning, "warning"),
        ColorScreenItem(DealiColor.success, "success"),
        ColorScreenItem(DealiColor.b70, "b70"),
        ColorScreenItem(DealiColor.b50, "b50"),
        ColorScreenItem(DealiColor.b40, "b40"),
        ColorScreenItem(DealiColor.b30, "b30"),
        ColorScreenItem(DealiColor.b20, "b20"),
        ColorScreenItem(DealiColor.b10, "b10"),
        ColorScreenItem(DealiColor.b5, "b5"),
        ColorScreenItem(DealiColor.w90, "w90", true),
        ColorScreenItem(DealiColor.w70, "w70", true),
        ColorScreenItem(DealiColor.w50, "w50", true),
        ColorScreenItem(DealiColor.w30, "w30", true),
        ColorScreenItem(DealiColor.w20, "w20", true),
        ColorScreenItem(DealiColor.w15, "w15", true),
        ColorScreenItem(DealiColor.w10, "w10", true),
        ColorScreenItem(DealiColor.w5, "w5", true),
    )

    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Colors",
                onBack = onBackPress,
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(colorScreenItems.size) { index ->
                val item = colorScreenItems[index]
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = if (item.useDarkMode) DealiColor.primary05 else DealiColor.primary04)
                        .padding(10.dp)

                ) {
                    Item(
                        color = item.color,
                        name = item.name,
                        code = item.color.toHexString(),
                        useDarkMode = item.useDarkMode,
                    )
                }
            }
        }
    }
}

@Composable
private fun Item(
    color: Color,
    name: String,
    code: String,
    useDarkMode: Boolean = false,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(
            modifier = Modifier
                .then(
                    if (name.contains("white")) Modifier.border(
                        1.dp,
                        DealiColor.g10
                    ) else Modifier
                )
                .background(color)
                .aspectRatio(1f)
        )

        val textColor = if (useDarkMode) DealiColor.primary04 else DealiColor.g100
        DealiText(
            text = name,
            style = DealiFont.b1r15,
            color = textColor
        )

        DealiText(
            text = code,
            style = DealiFont.b1r15,
            color = textColor
        )
    }
}

@Composable
@Preview
private fun ColorsScreenPreview() {
    ColorsScreen(
        onBackPress = {}
    )
}

private data class ColorScreenItem(
    val color: Color,
    val name: String,
    val useDarkMode: Boolean = false,
)
