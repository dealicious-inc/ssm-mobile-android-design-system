package net.deali.designsystem.sample.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiButton
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.black100
import net.deali.designsystem.theme.gray100
import net.deali.designsystem.theme.white100

@Composable
fun CornerRadiusScreen(
    onBackPress: () -> Unit
) {
    val radiusItems = listOf(
        CornerRadiusScreenItem("Radius : 0", AppTheme.shapes.radius0),
        CornerRadiusScreenItem("Radius : 6", AppTheme.shapes.radius6),
        CornerRadiusScreenItem("Radius : 4", AppTheme.shapes.radius4),
        CornerRadiusScreenItem("Radius : 3", AppTheme.shapes.radius3),
        CornerRadiusScreenItem("Radius : 100%", AppTheme.shapes.radius100percent),
        CornerRadiusScreenItem("Radius : 20", AppTheme.shapes.radius20),
        CornerRadiusScreenItem("Radius : 10", AppTheme.shapes.radius10)
    )

    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Corner Radius",
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
    DealiButton(
        modifier = Modifier
            .width(200.dp)
            .height(50.dp),
        shape = shape,
        enabled = true,
        border = BorderStroke(1.dp, black100),
        onClick = { }
    ) {
        DealiText(
            text = name,
            style = AppTheme.typography.b1r15,
            color = gray100
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
