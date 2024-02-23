package net.deali.designsystem.sample.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.theme.DealiShape

@Composable
fun CornerRadiusScreen(
    onBackPress: () -> Unit
) {
    val radiusItems = listOf(
        CornerRadiusScreenItem("Radius : 0", DealiShape.radius0),
        CornerRadiusScreenItem("Radius : 6", DealiShape.radius6),
        CornerRadiusScreenItem("Radius : 4", DealiShape.radius4),
        CornerRadiusScreenItem("Radius : 3", DealiShape.radius3),
        CornerRadiusScreenItem("Radius : 100%", DealiShape.radius100),
        CornerRadiusScreenItem("Radius : 20", DealiShape.radius20),
        CornerRadiusScreenItem("Radius : 10", DealiShape.radius10),
    )

    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Corner Radius",
                onBack = onBackPress,
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
            items(radiusItems.size) { index ->
                val radiusItem = radiusItems[index]
                Item(
                    name = radiusItem.name,
                    shape = radiusItem.shape
                )
            }
        }
    }
}

@Composable
private fun Item(
    name: String,
    shape: Shape
) {
    Box(
        modifier = Modifier
            .width(200.dp)
            .height(50.dp)
            .border(
                border = BorderStroke(1.dp, DealiColor.g100),
                shape = shape
            ),
        contentAlignment = Alignment.Center
    ) {
        DealiText(
            text = name,
            style = DealiFont.b1r15,
            color = DealiColor.g100
        )
    }
}

@Composable
@Preview
private fun CornerRadiusScreenPreview() {
    CornerRadiusScreen(
        onBackPress = {}
    )
}

private data class CornerRadiusScreenItem(
    val name: String,
    val shape: Shape,
)
