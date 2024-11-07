package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DashedDividerIntervals
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.HorizontalDashedDivider
import net.deali.designsystem.component.HorizontalDivider
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.component.VerticalDashedDivider
import net.deali.designsystem.component.VerticalDivider
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun DividerScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            TopBar(
                title = "Divider",
                onBack = onBackPress,
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = DealiColor.g10),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(10.dp)
        ) {
            item {
                DividerContainer()
            }
            item {
                DashedDividerContainer()
            }
        }
    }
}

@Composable
private fun DividerContainer() {
    Item(
        text = "Divider"
    ) {
        SubContainer(
            text = "HorizontalDivider"
        ) {
            HorizontalDivider(
                modifier = Modifier
                    .width(100.dp)
                    .padding(16.dp),
                color = DealiColor.g30,
                thickness = 2.dp,
            )
        }

        SubContainer(
            text = "VerticalDivider"
        ) {
            VerticalDivider(
                modifier = Modifier
                    .height(100.dp)
                    .padding(16.dp),
                color = DealiColor.g30,
                thickness = 2.dp,
            )
        }
    }
}

@Composable
private fun DashedDividerContainer() {
    Item(
        text = "DashedDivider"
    ) {
        SubContainer(
            text = "HorizontalDashedDivider"
        ) {
            HorizontalDashedDivider(
                modifier = Modifier
                    .width(100.dp)
                    .padding(16.dp),
                color = DealiColor.g30,
                thickness = 2.dp,
                intervals = DashedDividerIntervals(dashLength = 6.dp, spacing = 4.dp),
            )
        }

        SubContainer(
            text = "VerticalDashedDivider"
        ) {
            VerticalDashedDivider(
                modifier = Modifier
                    .height(100.dp)
                    .padding(16.dp),
                color = DealiColor.g30,
                thickness = 2.dp,
                intervals = DashedDividerIntervals(dashLength = 6.dp, spacing = 4.dp),
            )
        }
    }
}

@Composable
private fun Item(
    text: String,
    content: @Composable () -> Unit
) {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(6.dp))
            .background(DealiColor.primary04)
    ) {
        DealiText(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            text = text,
            style = DealiFont.h3sb28,
            color = DealiColor.g100
        )

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            content()
        }

        Spacer(modifier = Modifier.height(30.dp))
    }
}

@Composable
private fun SubContainer(
    text: String,
    content: @Composable () -> Unit
) {
    val scrollState = rememberScrollState()

    DealiText(
        modifier = Modifier
            .padding(
                start = 30.dp,
                top = 20.dp,
                bottom = 10.dp
            ),
        text = text,
        style = DealiFont.sh2r18,
        color = DealiColor.g100
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(scrollState),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Spacer(modifier = Modifier.width(30.dp))
        content()
        Spacer(modifier = Modifier.width(30.dp))
    }
}

@Composable
@Preview
private fun DividerScreenPreview() {
    DividerScreen(
        onBackPress = {}
    )
}
