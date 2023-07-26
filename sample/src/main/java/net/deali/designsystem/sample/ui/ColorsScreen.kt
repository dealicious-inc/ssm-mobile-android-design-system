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
import net.deali.designsystem.theme.AppTheme

@Composable
fun ColorsScreen(
    onBackPress: () -> Unit
) {
    val colorScreenItems = listOf(
        ColorScreenItem(AppTheme.colors.primary01, "primary01"),
        ColorScreenItem(AppTheme.colors.primary02, "primary02"),
        ColorScreenItem(AppTheme.colors.primary03, "primary03"),
        ColorScreenItem(AppTheme.colors.primary04, "primary04"),
        ColorScreenItem(AppTheme.colors.primary05, "primary05"),
        ColorScreenItem(AppTheme.colors.secondary01, "secondary01"),
        ColorScreenItem(AppTheme.colors.secondary02, "secondary02"),
        ColorScreenItem(AppTheme.colors.secondary03, "secondary03"),
        ColorScreenItem(AppTheme.colors.secondary04, "secondary04"),
        ColorScreenItem(AppTheme.colors.secondary05, "secondary05"),
        ColorScreenItem(AppTheme.colors.secondary06, "secondary06"),
        ColorScreenItem(AppTheme.colors.text01, "text01"),
        ColorScreenItem(AppTheme.colors.text02, "text02"),
        ColorScreenItem(AppTheme.colors.text03, "text03"),
        ColorScreenItem(AppTheme.colors.text04, "text04"),
        ColorScreenItem(AppTheme.colors.text05, "text05"),
        ColorScreenItem(AppTheme.colors.divider01, "divider01"),
        ColorScreenItem(AppTheme.colors.divider02, "divider02"),
        ColorScreenItem(AppTheme.colors.divider03, "divider03"),
        ColorScreenItem(AppTheme.colors.line01, "line01"),
        ColorScreenItem(AppTheme.colors.line02, "line02"),
        ColorScreenItem(AppTheme.colors.line03, "line03"),
        ColorScreenItem(AppTheme.colors.line04, "line04"),
        ColorScreenItem(AppTheme.colors.bg01, "bg01"),
        ColorScreenItem(AppTheme.colors.bg02, "bg02"),
        ColorScreenItem(AppTheme.colors.bg03, "bg03"),
        ColorScreenItem(AppTheme.colors.bg04, "bg04"),
        ColorScreenItem(AppTheme.colors.bg05, "bg05"),
        ColorScreenItem(AppTheme.colors.bg06, "bg06"),
        ColorScreenItem(AppTheme.colors.bg07, "bg07"),
        ColorScreenItem(AppTheme.colors.bg08, "bg08"),
        ColorScreenItem(AppTheme.colors.error, "error"),
        ColorScreenItem(AppTheme.colors.linkAndInfo, "linkAndInfo"),
        ColorScreenItem(AppTheme.colors.warning, "warning"),
        ColorScreenItem(AppTheme.colors.success, "success"),
        ColorScreenItem(AppTheme.colors.etc01, "etc01"),
        ColorScreenItem(AppTheme.colors.etc02, "etc02"),
        ColorScreenItem(AppTheme.colors.etc03, "etc03"),
        ColorScreenItem(AppTheme.colors.etc04, "etc04"),
        ColorScreenItem(AppTheme.colors.etc05, "etc05"),
        ColorScreenItem(AppTheme.colors.etc06, "etc06"),
    )

    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Colors",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left_16_ver01,
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = AppTheme.colors.primary04),
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
                .then(if (name.contains("white")) Modifier.border(1.dp, AppTheme.colors.divider03) else Modifier)
                .background(color)
                .aspectRatio(1f)
        )

        DealiText(
            text = name,
            style = AppTheme.typography.b1r15,
            color = AppTheme.colors.text01
        )

        DealiText(
            text = code,
            style = AppTheme.typography.b1r15,
            color = AppTheme.colors.text01
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
