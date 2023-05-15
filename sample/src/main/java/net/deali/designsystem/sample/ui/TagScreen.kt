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
import net.deali.designsystem.component.LargePrimaryFulledBlueTag
import net.deali.designsystem.component.LargePrimaryFulledGrayTag
import net.deali.designsystem.component.LargePrimaryFulledPinkTag
import net.deali.designsystem.component.LargeSecondaryOutlinedBlueTag
import net.deali.designsystem.component.LargeSecondaryOutlinedGrayTag
import net.deali.designsystem.component.LargeSecondaryOutlinedPinkTag
import net.deali.designsystem.component.MediumPrimaryFulledBlueTag
import net.deali.designsystem.component.MediumPrimaryFulledGrayTag
import net.deali.designsystem.component.MediumPrimaryFulledPinkTag
import net.deali.designsystem.component.MediumSecondaryOutlinedBlueTag
import net.deali.designsystem.component.MediumSecondaryOutlinedGrayTag
import net.deali.designsystem.component.MediumSecondaryOutlinedPinkTag
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.SmallPrimaryFulledBlueTag
import net.deali.designsystem.component.SmallPrimaryFulledGrayTag
import net.deali.designsystem.component.SmallPrimaryFulledPinkTag
import net.deali.designsystem.component.SmallSecondaryOutlinedBlueTag
import net.deali.designsystem.component.SmallSecondaryOutlinedGrayTag
import net.deali.designsystem.component.SmallSecondaryOutlinedPinkTag
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
            SmallPrimaryFulledPinkTag(
                text = getRandomText(1)
            )

            SmallPrimaryFulledBlueTag(
                text = getRandomText(1)
            )

            SmallPrimaryFulledGrayTag(
                text = getRandomText(1)
            )
        }

        SubContainer(
            text = "Outlined Tags"
        ) {
            SmallSecondaryOutlinedPinkTag(
                text = getRandomText(1)
            )

            SmallSecondaryOutlinedBlueTag(
                text = getRandomText(1)
            )

            SmallSecondaryOutlinedGrayTag(
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
            MediumPrimaryFulledPinkTag(
                text = getRandomText(1)
            )

            MediumPrimaryFulledBlueTag(
                text = getRandomText(1)
            )

            MediumPrimaryFulledGrayTag(
                text = getRandomText(1)
            )
        }

        SubContainer(
            text = "Outlined Tags"
        ) {
            MediumSecondaryOutlinedPinkTag(
                text = getRandomText(1)
            )

            MediumSecondaryOutlinedBlueTag(
                text = getRandomText(1)
            )

            MediumSecondaryOutlinedGrayTag(
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
            LargePrimaryFulledPinkTag(
                text = getRandomText(1)
            )

            LargePrimaryFulledBlueTag(
                text = getRandomText(1)
            )

            LargePrimaryFulledGrayTag(
                text = getRandomText(1)
            )
        }

        SubContainer(
            text = "Outlined Tags"
        ) {
            LargeSecondaryOutlinedPinkTag(
                text = getRandomText(1)
            )

            LargeSecondaryOutlinedBlueTag(
                text = getRandomText(1)
            )

            LargeSecondaryOutlinedGrayTag(
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
            style = AppTheme.typography.H1_24_B
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
        style = AppTheme.typography.SH2_18_R
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
