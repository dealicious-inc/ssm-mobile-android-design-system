package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.black010
import net.deali.designsystem.theme.black015
import net.deali.designsystem.theme.black020
import net.deali.designsystem.theme.black022
import net.deali.designsystem.theme.gray10
import net.deali.designsystem.theme.gray100
import net.deali.designsystem.theme.gray20
import net.deali.designsystem.theme.gray30
import net.deali.designsystem.theme.transparent
import net.deali.designsystem.theme.white100
import net.deali.designsystem.util.shadow

@Composable
fun ShadowsScreen(
    onBackPress: () -> Unit
) {
    val shadowsScreenItems = listOf(
        ShadowsScreenItem(name = "Elevation_none", color = transparent, offsetY = 0.dp, blurRadius = 0.dp),
        ShadowsScreenItem(name = "Shadow_type1", color = black010, offsetY = (-1).dp, blurRadius = 6.dp),
        ShadowsScreenItem(name = "Shadow_type2", color = black022, offsetY = 1.dp, blurRadius = 3.dp),
        ShadowsScreenItem(name = "Elevation_type3", color = black022, offsetY = 2.dp, blurRadius = 7.dp),
        ShadowsScreenItem(name = "Elevation_type4", color = black020, offsetY = 4.dp, blurRadius = 8.dp),
        ShadowsScreenItem(name = "Elevation_type5", color = black015, offsetY = 10.dp, blurRadius = 20.dp),
        ShadowsScreenItem(name = "Elevation_type6", color = black015, offsetY = 20.dp, blurRadius = 50.dp),
    )

    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Shadows",
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
            items(shadowsScreenItems.size) { index ->
                val shadow = shadowsScreenItems[index]

                Container(
                    name = shadow.name,
                    color = shadow.color,
                    offsetY = shadow.offsetY,
                    blurRadius = shadow.blurRadius
                )
            }
        }
    }
}

@Composable
private fun Container(
    name: String,
    color: Color,
    offsetY: Dp,
    blurRadius: Dp
) {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .clip(RoundedCornerShape(6.dp))
            .background(white100)
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(6.dp))
                .background(gray10)
                .padding(20.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Spacer(
                modifier = Modifier
                    .width(150.dp)
                    .height(80.dp)
                    .shadow(
                        color = color,
                        offsetY = offsetY,
                        blurRadius = blurRadius,
                        borderRadius = 10.dp
                    )
                    .clip(AppTheme.shapes.radius10)
                    .background(white100)
                    .border(1.dp, gray30, AppTheme.shapes.radius10)
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        DealiText(
            text = name,
            style = AppTheme.typography.b1r15,
            color = gray100
        )
    }
}

@Composable
@Preview
private fun ShadowsScreenPreview() {
    ShadowsScreen(
        onBackPress = {}
    )
}

private data class ShadowsScreenItem(
    val name: String,
    val color: Color,
    val offsetY: Dp,
    val blurRadius: Dp
)
