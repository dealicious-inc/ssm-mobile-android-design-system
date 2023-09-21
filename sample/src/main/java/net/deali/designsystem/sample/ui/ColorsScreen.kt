package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
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
        ColorScreenItem(DealiColor.etc01, "etc01"),
        ColorScreenItem(DealiColor.etc02, "etc02"),
        ColorScreenItem(DealiColor.etc03, "etc03"),
        ColorScreenItem(DealiColor.etc04, "etc04"),
        ColorScreenItem(DealiColor.etc05, "etc05"),
        ColorScreenItem(DealiColor.etc06, "etc06"),
    )

    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Colors",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left,
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = DealiColor.primary04),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(10.dp)
        ) {
            items(colorScreenItems.size) { index ->
                val color = colorScreenItems[index]
                Item(
                    color = color.color,
                    name = color.name,
                    code = color.color.toHexString()
                )
            }
        }
    }
}

@Composable
private fun Item(
    color: Color,
    name: String,
    code: String
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
                .then(if (name.contains("white")) Modifier.border(1.dp, DealiColor.g10) else Modifier)
                .background(color)
                .aspectRatio(1f)
        )

        DealiText(
            text = name,
            style = DealiFont.b1r15,
            color = DealiColor.g100
        )

        DealiText(
            text = code,
            style = DealiFont.b1r15,
            color = DealiColor.g100
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
    val name: String
)
