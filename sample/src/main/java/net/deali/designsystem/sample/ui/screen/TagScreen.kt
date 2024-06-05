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
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.TagFilledLarge02
import net.deali.designsystem.component.TagFilledLarge04
import net.deali.designsystem.component.TagFilledLarge01
import net.deali.designsystem.component.TagFilledLarge03
import net.deali.designsystem.component.TagOutlineLarge02
import net.deali.designsystem.component.TagOutlineLarge04
import net.deali.designsystem.component.TagOutlineLarge01
import net.deali.designsystem.component.TagFilledMedium02
import net.deali.designsystem.component.TagFilledMedium04
import net.deali.designsystem.component.TagFilledMedium01
import net.deali.designsystem.component.TagFilledMedium03
import net.deali.designsystem.component.TagOutlinedMedium02
import net.deali.designsystem.component.TagOutlinedMedium04
import net.deali.designsystem.component.TagOutlinedMedium01
import net.deali.designsystem.component.TagFilledSmall02
import net.deali.designsystem.component.TagFilledSmall04
import net.deali.designsystem.component.TagFilledSmall01
import net.deali.designsystem.component.TagFilledSmall03
import net.deali.designsystem.component.TagOutlineLarge03
import net.deali.designsystem.component.TagOutlineSmall02
import net.deali.designsystem.component.TagOutlineSmall04
import net.deali.designsystem.component.TagOutlineSmall01
import net.deali.designsystem.component.TagOutlineSmall03
import net.deali.designsystem.component.TagOutlinedMedium03
import net.deali.designsystem.sample.ui.NavigationContainer
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
            TagFilledSmall01(
                text = getRandomText(1)
            )

            TagFilledSmall02(
                text = getRandomText(1)
            )

            TagFilledSmall03(
                text = getRandomText(1)
            )

            TagFilledSmall04(
                text = getRandomText(1)
            )
        }

        SubContainer(
            text = "Outlined Tags"
        ) {
            TagOutlineSmall01(
                text = getRandomText(1)
            )

            TagOutlineSmall02(
                text = getRandomText(1)
            )

            TagOutlineSmall03(
                text = getRandomText(1)
            )

            TagOutlineSmall04(
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
            TagFilledMedium01(
                text = getRandomText(1)
            )

            TagFilledMedium02(
                text = getRandomText(1)
            )

            TagFilledMedium03(
                text = getRandomText(1)
            )

            TagFilledMedium04(
                text = getRandomText(1)
            )
        }

        SubContainer(
            text = "Outlined Tags"
        ) {
            TagOutlinedMedium01(
                text = getRandomText(1)
            )

            TagOutlinedMedium02(
                text = getRandomText(1)
            )

            TagOutlinedMedium03(
                text = getRandomText(1)
            )

            TagOutlinedMedium04(
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
            TagFilledLarge01(
                text = getRandomText(1)
            )

            TagFilledLarge02(
                text = getRandomText(1)
            )

            TagFilledLarge03(
                text = getRandomText(1)
            )

            TagFilledLarge04(
                text = getRandomText(1)
            )
        }

        SubContainer(
            text = "Outlined Tags"
        ) {
            TagOutlineLarge01(
                text = getRandomText(1)
            )

            TagOutlineLarge02(
                text = getRandomText(1)
            )

            TagOutlineLarge03(
                text = getRandomText(1)
            )

            TagOutlineLarge04(
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
