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
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.black010
import net.deali.designsystem.theme.black020
import net.deali.designsystem.theme.black040
import net.deali.designsystem.theme.black100
import net.deali.designsystem.theme.gray100
import net.deali.designsystem.theme.gray30
import net.deali.designsystem.theme.gray40
import net.deali.designsystem.theme.gray50
import net.deali.designsystem.theme.gray60
import net.deali.designsystem.theme.gray70
import net.deali.designsystem.theme.gray80
import net.deali.designsystem.theme.orange10
import net.deali.designsystem.theme.orange50
import net.deali.designsystem.theme.orange60
import net.deali.designsystem.theme.white020
import net.deali.designsystem.theme.white060
import net.deali.designsystem.theme.white100

@Composable
fun ColorsScreen(
    onBackPress: () -> Unit
) {
    val colorScreenItems = listOf(
        ColorScreenItem(AppTheme.colors.primary01, "primary01", "#0xFFFB4760"),
        ColorScreenItem(AppTheme.colors.primary02, "primary02", "#0xFFEC2843"),
        ColorScreenItem(AppTheme.colors.primary03, "primary03", "#0xFFFEECEF"),

        ColorScreenItem(AppTheme.colors.secondary01, "secondary01", "0xFF3668F4"),
        ColorScreenItem(AppTheme.colors.secondary02, "secondary02", "0xFF0E46E4"),
        ColorScreenItem(AppTheme.colors.secondary03, "secondary03", "0xFFEAEFFF"),

        ColorScreenItem(AppTheme.colors.bg07, "bg07", "0xFFF5F6FB"),
        ColorScreenItem(AppTheme.colors.divider03, "AppTheme.colors.divider03", "0xFFEBEEF6"),
        ColorScreenItem(gray30, "gray30", "0xFFDFE3ED"),
        ColorScreenItem(gray40, "gray40", "0xFFD0D6E1"),
        ColorScreenItem(gray50, "gray50", "0xFFBEC5D2"),
        ColorScreenItem(gray60, "gray60", "0xFFA6ADBD"),
        ColorScreenItem(gray70, "gray70", "0xFF8F97A7"),
        ColorScreenItem(gray80, "gray80", "0xFF686E7B"),
        ColorScreenItem(gray100, "gray100", "0xFF222222"),

        ColorScreenItem(black010, "black010", "0x1A000000"),
        ColorScreenItem(black020, "black020", "0x33000000"),
        ColorScreenItem(black040, "black040", "0x66000000"),
        ColorScreenItem(black100, "black100", "0xFF000000"),

        ColorScreenItem(white020, "white020", "0x33FFFFFF"),
        ColorScreenItem(white060, "white060", "0x99FFFFFF"),
        ColorScreenItem(white100, "white100", "0xFFFFFFFF"),

        ColorScreenItem(orange10, "orange10", "0xFFFFECDB"),
        ColorScreenItem(orange50, "orange50", "0xFFFF7C44"),
        ColorScreenItem(orange60, "orange60", "0xFFFF6827"),

        ColorScreenItem(AppTheme.colors.error, "error", "0xFFFA1818"),
        ColorScreenItem(AppTheme.colors.linkAndInfo, "linkAndInfo", "0xFF2B66FD"),
        ColorScreenItem(AppTheme.colors.warning, "warning", "0xFFFFD600"),
        ColorScreenItem(AppTheme.colors.success, "success", "0xFF1BDA17"),
        ColorScreenItem(AppTheme.colors.ripple, "ripple", "0x22000000"),
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
                .background(color = white100),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(10.dp)
        ) {
            items(colorScreenItems.size) { index ->
                val color = colorScreenItems[index]
                Item(
                    color = color.color,
                    name = color.name,
                    code = color.code
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
            color = gray100
        )

        DealiText(
            text = code,
            style = AppTheme.typography.b1r15,
            color = gray100
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
    val code: String
)
