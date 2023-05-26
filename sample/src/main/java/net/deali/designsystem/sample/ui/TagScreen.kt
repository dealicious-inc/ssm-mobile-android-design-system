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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.appresource.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.TagLargePrimaryFulledBlue
import net.deali.designsystem.component.TagLargePrimaryFulledGray
import net.deali.designsystem.component.TagLargePrimaryFulledPink
import net.deali.designsystem.component.TagLargeSecondaryOutlinedBlue
import net.deali.designsystem.component.TagLargeSecondaryOutlinedGray
import net.deali.designsystem.component.TagLargeSecondaryOutlinedPink
import net.deali.designsystem.component.TagMediumPrimaryFulledBlue
import net.deali.designsystem.component.TagMediumPrimaryFulledGray
import net.deali.designsystem.component.TagMediumPrimaryFulledPink
import net.deali.designsystem.component.TagMediumSecondaryOutlinedBlue
import net.deali.designsystem.component.TagMediumSecondaryOutlinedGray
import net.deali.designsystem.component.TagMediumSecondaryOutlinedPink
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.TagSmallPrimaryFulledBlue
import net.deali.designsystem.component.TagSmallPrimaryFulledGray
import net.deali.designsystem.component.TagSmallPrimaryFulledPink
import net.deali.designsystem.component.TagSmallSecondaryOutlinedBlue
import net.deali.designsystem.component.TagSmallSecondaryOutlinedGray
import net.deali.designsystem.component.TagSmallSecondaryOutlinedPink
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.gray20
import net.deali.designsystem.theme.white100
import net.deali.designsystem.unit.getRandomText

@Composable
fun TagScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Tag",
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
                .background(color = gray20),
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
            text = "Fulled Tags"
        ) {
            TagSmallPrimaryFulledPink(
                text = getRandomText(1)
            )

            TagSmallPrimaryFulledBlue(
                text = getRandomText(1)
            )

            TagSmallPrimaryFulledGray(
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
            text = "Fulled Tags"
        ) {
            TagMediumPrimaryFulledPink(
                text = getRandomText(1)
            )

            TagMediumPrimaryFulledBlue(
                text = getRandomText(1)
            )

            TagMediumPrimaryFulledGray(
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
            text = "Fulled Tags"
        ) {
            TagLargePrimaryFulledPink(
                text = getRandomText(1)
            )

            TagLargePrimaryFulledBlue(
                text = getRandomText(1)
            )

            TagLargePrimaryFulledGray(
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
            .background(white100)
    ) {
        DealiText(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            text = text,
            style = AppTheme.typography.h2b24
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
        style = AppTheme.typography.sh2r18
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
