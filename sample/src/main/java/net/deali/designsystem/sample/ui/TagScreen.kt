package net.deali.designsystem.sample.ui

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
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.TagLargePrimaryFilledBlue
import net.deali.designsystem.component.TagLargePrimaryFilledGray
import net.deali.designsystem.component.TagLargePrimaryFilledPink
import net.deali.designsystem.component.TagLargeSecondaryOutlinedBlue
import net.deali.designsystem.component.TagLargeSecondaryOutlinedGray
import net.deali.designsystem.component.TagLargeSecondaryOutlinedPink
import net.deali.designsystem.component.TagMediumPrimaryFilledBlue
import net.deali.designsystem.component.TagMediumPrimaryFilledGray
import net.deali.designsystem.component.TagMediumPrimaryFilledPink
import net.deali.designsystem.component.TagMediumSecondaryOutlinedBlue
import net.deali.designsystem.component.TagMediumSecondaryOutlinedGray
import net.deali.designsystem.component.TagMediumSecondaryOutlinedPink
import net.deali.designsystem.component.TagSmallPrimaryFilledBlue
import net.deali.designsystem.component.TagSmallPrimaryFilledGray
import net.deali.designsystem.component.TagSmallPrimaryFilledPink
import net.deali.designsystem.component.TagSmallSecondaryOutlinedBlue
import net.deali.designsystem.component.TagSmallSecondaryOutlinedGray
import net.deali.designsystem.component.TagSmallSecondaryOutlinedPink
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.util.getRandomText

@Composable
fun TagScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Tag",
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
                TagSmallContainer()
            }
            item {
                TagMediumContainer()
            }
            item {
                TagLargeContainer()
            }
        }
    }
}

@Composable
private fun TagSmallContainer() {
    Item(
        text = "Tag Small"
    ) {
        SubContainer(
            text = "Filled Tags"
        ) {
            TagSmallPrimaryFilledPink(
                text = getRandomText(1)
            )

            TagSmallPrimaryFilledBlue(
                text = getRandomText(1)
            )

            TagSmallPrimaryFilledGray(
                text = getRandomText(1)
            )
        }

        SubContainer(
            text = "Outlined Tags"
        ) {
            TagSmallSecondaryOutlinedPink(
                text = getRandomText(1)
            )

            TagSmallSecondaryOutlinedBlue(
                text = getRandomText(1)
            )

            TagSmallSecondaryOutlinedGray(
                text = getRandomText(1)
            )
        }
    }
}

@Composable
private fun TagMediumContainer() {
    Item(
        text = "Tag Medium"
    ) {
        SubContainer(
            text = "Filled Tags"
        ) {
            TagMediumPrimaryFilledPink(
                text = getRandomText(1)
            )

            TagMediumPrimaryFilledBlue(
                text = getRandomText(1)
            )

            TagMediumPrimaryFilledGray(
                text = getRandomText(1)
            )
        }

        SubContainer(
            text = "Outlined Tags"
        ) {
            TagMediumSecondaryOutlinedPink(
                text = getRandomText(1)
            )

            TagMediumSecondaryOutlinedBlue(
                text = getRandomText(1)
            )

            TagMediumSecondaryOutlinedGray(
                text = getRandomText(1)
            )
        }
    }
}

@Composable
private fun TagLargeContainer() {
    Item(
        text = "Tag Large"
    ) {
        SubContainer(
            text = "Filled Tags"
        ) {
            TagLargePrimaryFilledPink(
                text = getRandomText(1)
            )

            TagLargePrimaryFilledBlue(
                text = getRandomText(1)
            )

            TagLargePrimaryFilledGray(
                text = getRandomText(1)
            )
        }

        SubContainer(
            text = "Outlined Tags"
        ) {
            TagLargeSecondaryOutlinedPink(
                text = getRandomText(1)
            )

            TagLargeSecondaryOutlinedBlue(
                text = getRandomText(1)
            )

            TagLargeSecondaryOutlinedGray(
                text = getRandomText(1)
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
private fun TagScreenPreview() {
    TagScreen(
        onBackPress = {}
    )
}
