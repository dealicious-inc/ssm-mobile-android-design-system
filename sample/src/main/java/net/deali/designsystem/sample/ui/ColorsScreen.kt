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
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.black010
import net.deali.designsystem.theme.black020
import net.deali.designsystem.theme.black040
import net.deali.designsystem.theme.black100
import net.deali.designsystem.theme.blue10
import net.deali.designsystem.theme.blue70
import net.deali.designsystem.theme.blue90
import net.deali.designsystem.theme.gray10
import net.deali.designsystem.theme.gray100
import net.deali.designsystem.theme.gray20
import net.deali.designsystem.theme.gray30
import net.deali.designsystem.theme.gray40
import net.deali.designsystem.theme.gray50
import net.deali.designsystem.theme.gray60
import net.deali.designsystem.theme.gray70
import net.deali.designsystem.theme.gray80
import net.deali.designsystem.theme.orange10
import net.deali.designsystem.theme.orange50
import net.deali.designsystem.theme.orange60
import net.deali.designsystem.theme.pink10
import net.deali.designsystem.theme.pink60
import net.deali.designsystem.theme.pink90
import net.deali.designsystem.theme.white020
import net.deali.designsystem.theme.white060
import net.deali.designsystem.theme.white100

@Composable
fun ColorsScreen() {
    val colorPalette = listOf(
        ColorPalette(pink10, "pink10", "#0xFFFEECEF"),
        ColorPalette(pink60, "pink60", "#0xFFFB4760"),
        ColorPalette(pink90, "pink90", "#0xFFEC2843"),

        ColorPalette(blue10, "blue10", "0xFFEAEFFF"),
        ColorPalette(blue70, "blue70", "0xFF3668F4"),
        ColorPalette(blue90, "blue90", "0xFF0E46E4"),

        ColorPalette(gray10, "gray10", "0xFFF5F6FB"),
        ColorPalette(gray20, "gray20", "0xFFEBEEF6"),
        ColorPalette(gray30, "gray30", "0xFFDFE3ED"),
        ColorPalette(gray40, "gray40", "0xFFD0D6E1"),
        ColorPalette(gray50, "gray50", "0xFFBEC5D2"),
        ColorPalette(gray60, "gray60", "0xFFA6ADBD"),
        ColorPalette(gray70, "gray70", "0xFF8F97A7"),
        ColorPalette(gray80, "gray80", "0xFF686E7B"),
        ColorPalette(gray100, "gray100", "0xFF222222"),

        ColorPalette(black010, "black010", "0x1A000000"),
        ColorPalette(black020, "black020", "0x33000000"),
        ColorPalette(black040, "black040", "0x66000000"),
        ColorPalette(black100, "black100", "0xFF000000"),

        ColorPalette(white020, "white020", "0x33FFFFFF"),
        ColorPalette(white060, "white060", "0x99FFFFFF"),
        ColorPalette(white100, "white100", "0xFFFFFFFF"),

        ColorPalette(orange10, "orange10", "0xFFFFECDB"),
        ColorPalette(orange50, "orange50", "0xFFFF7C44"),
        ColorPalette(orange60, "orange60", "0xFFFF6827"),

        ColorPalette(AppTheme.colors.error, "error", "0xFFFA1818"),
        ColorPalette(AppTheme.colors.links, "links", "0xFF2B66FD"),
        ColorPalette(AppTheme.colors.info, "info", "0xFF2B66FD"),
        ColorPalette(AppTheme.colors.warning, "warning", "0xFFFFD600"),
        ColorPalette(AppTheme.colors.success, "success", "0xFF1BDA17"),
        ColorPalette(AppTheme.colors.ripple, "ripple", "0x22000000"),
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = white100),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(30.dp)
    ) {
        items(colorPalette.size) { index ->
            val color = colorPalette[index]
            Container(
                color = color.color,
                name = color.name,
                code = color.code
            )
        }
    }
}

@Composable
private fun Container(
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
                .then(if (name.contains("white")) Modifier.border(1.dp, gray20) else Modifier)
                .background(color)
                .aspectRatio(1f)
        )

        DealiText(
            text = name,
            style = AppTheme.typography.B1_15_R
        )

        DealiText(
            text = code,
            style = AppTheme.typography.B1_15_R
        )
    }
}

@Composable
@Preview
private fun ColorsScreenPreview() {
    ColorsScreen()
}

data class ColorPalette(
    val color: Color,
    val name: String,
    val code: String
)