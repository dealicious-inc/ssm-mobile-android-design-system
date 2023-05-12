package net.deali.designsystem.sample.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.gray20
import net.deali.designsystem.theme.gray30
import net.deali.designsystem.theme.white100
import net.deali.designsystem.unit.getRandomText

@Composable
fun TypographyScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = gray20)
            .padding(10.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Content(
            title = "H1_32_B",
            style = AppTheme.typography.H1_32_B
        )

        Content(
            title = "H1_24_B",
            style = AppTheme.typography.H1_24_B
        )

        Content(
            title = "SH1_20_B",
            style = AppTheme.typography.SH1_20_B
        )

        Content(
            title = "SH1_20_M",
            style = AppTheme.typography.SH1_20_M
        )

        Content(
            title = "SH2_18_B",
            style = AppTheme.typography.SH2_18_B
        )

        Content(
            title = "SH2_18_R",
            style = AppTheme.typography.SH2_18_R
        )

        Content(
            title = "SH3_16_B",
            style = AppTheme.typography.SH3_16_B
        )

        Content(
            title = "SH3_16_R",
            style = AppTheme.typography.SH3_16_R
        )

        Content(
            title = "B1_15_B",
            style = AppTheme.typography.B1_15_B
        )

        Content(
            title = "B1_15_R",
            style = AppTheme.typography.B1_15_R
        )

        Content(
            title = "B1_14_B",
            style = AppTheme.typography.B1_14_B
        )

        Content(
            title = "B2_14_M",
            style = AppTheme.typography.B2_14_M
        )

        Content(
            title = "B2_14_R",
            style = AppTheme.typography.B2_14_R
        )

        Content(
            title = "B3_13_B",
            style = AppTheme.typography.B3_13_B
        )

        Content(
            title = "B3_13_M",
            style = AppTheme.typography.B3_13_M
        )

        Content(
            title = "B3_13_R",
            style = AppTheme.typography.B3_13_R
        )

        Content(
            title = "B4_12_B",
            style = AppTheme.typography.B4_12_B
        )

        Content(
            title = "C1_10_B",
            style = AppTheme.typography.C1_10_B
        )

        Content(
            title = "C1_10_R",
            style = AppTheme.typography.C1_10_R
        )
    }
}

@Composable
private fun Content(
    title: String,
    style: TextStyle
) {
    var isVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(6.dp))
            .background(white100)
            .clickable(
                onClick = { isVisible = !isVisible }
            )
    ) {
        DealiText(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            text = title,
            style = style
        )

        AnimatedVisibility(
            visible = isVisible,
            enter = expandVertically(expandFrom = Alignment.Top),
            exit = shrinkVertically(shrinkTowards = Alignment.Top)
        ) {
            Column {
                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(color = gray30)
                )

                DealiText(
                    modifier = Modifier
                        .padding(30.dp),
                    text = getRandomText(),
                    style = style
                )
            }
        }
    }
}

@Composable
@Preview
private fun TypographyScreenPreview() {
    TypographyScreen()
}