package net.deali.designsystem.sample.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.appresource.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.sample.ui.IconographyScreenItem.Companion.SIZE_16
import net.deali.designsystem.sample.ui.IconographyScreenItem.Companion.SIZE_24
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.black100
import net.deali.designsystem.theme.gray10
import net.deali.designsystem.theme.gray100
import net.deali.designsystem.theme.gray20
import net.deali.designsystem.theme.gray30
import net.deali.designsystem.theme.gray60
import net.deali.designsystem.theme.pink60
import net.deali.designsystem.theme.transparent
import net.deali.designsystem.theme.white100

@Composable
fun IconographyScreen(
    onBackPress: () -> Unit
) {
    val iconographyScreenItems = listOf(
        IconographyScreenItem("ic_arrow_16", SIZE_16, R.drawable.ic_arrow_left_16_ver01, null),
        IconographyScreenItem("ic_ssmk_16", SIZE_16, R.drawable.ic_ssmk_line_16_ver02, R.drawable.ic_ssmk_filled_16_ver02),

        IconographyScreenItem("ic_ssmk_24", SIZE_24, R.drawable.ic_ssmk_line_24_ver02, R.drawable.ic_ssmk_filled_24_ver02),
    )

    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Colors",
                navigationIcon = {
                    Icon24(
                        painter = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(gray20),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(10.dp)
        ) {
            items(iconographyScreenItems.size) { index ->
                val icon = iconographyScreenItems[index]

                Container(
                    name = icon.name,
                    size = icon.size,
                    outlinedIconRes = icon.outlinedIconRes,
                    fulledIconRes = icon.fulledIconRes
                )
            }
        }
    }
}

@Composable
private fun Container(
    name: String,
    size: Dp,
    @DrawableRes outlinedIconRes: Int,
    @DrawableRes fulledIconRes: Int?
) {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .clip(RoundedCornerShape(6.dp))
            .background(white100)
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(5 / 2f)
                .clip(RoundedCornerShape(6.dp))
                .background(gray10)
                .border(1.dp, gray30, RoundedCornerShape(6.dp)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally)
        ) {
            val colors = listOf(
                gray100, pink60, gray60, white100
            )

            colors.forEach { color ->
                Item(
                    size = size,
                    color = color,
                    outlinedIconRes = outlinedIconRes,
                    fulledIconRes = fulledIconRes
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        DealiText(
            text = name,
            style = AppTheme.typography.B1_15_R
        )
    }
}

@Composable
private fun Item(
    size: Dp,
    color: Color,
    @DrawableRes outlinedIconRes: Int,
    @DrawableRes fulledIconRes: Int?
) {
    when (size) {
        SIZE_16 -> {
            Icon16(
                modifier = Modifier
                    .background(if (color == white100) black100 else transparent),
                painter = painterResource(id = outlinedIconRes),
                color = color,
                onClick = {}
            )

            if (fulledIconRes != null) {
                Icon16(
                    modifier = Modifier
                        .background(if (color == white100) black100 else transparent),
                    painter = painterResource(id = fulledIconRes),
                    color = color,
                    onClick = {}
                )
            }
        }
        SIZE_24 -> {
            Icon24(
                modifier = Modifier
                    .background(if (color == white100) black100 else transparent),
                painter = painterResource(id = outlinedIconRes),
                color = color,
                onClick = {}
            )

            if (fulledIconRes != null) {
                Icon24(
                    modifier = Modifier
                        .background(if (color == white100) black100 else transparent),
                    painter = painterResource(id = fulledIconRes),
                    color = color,
                    onClick = {}
                )
            }
        }
    }
}

@Composable
@Preview
private fun IconographyScreenPreview() {
    IconographyScreen(
        onBackPress = {}
    )
}

data class IconographyScreenItem(
    val name: String,
    val size: Dp,
    @DrawableRes val outlinedIconRes: Int,
    @DrawableRes val fulledIconRes: Int?
) {
    companion object {
        val SIZE_16 = 16.dp
        val SIZE_24 = 24.dp
        val SIZE_32 = 32.dp
    }
}