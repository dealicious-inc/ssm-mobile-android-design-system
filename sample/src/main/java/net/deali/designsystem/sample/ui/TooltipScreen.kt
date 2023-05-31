package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.deali.appresource.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.Tooltip
import net.deali.designsystem.component.TooltipContent
import net.deali.designsystem.component.TooltipPopup
import net.deali.designsystem.theme.blue70
import net.deali.designsystem.theme.white100

@Composable
fun TooltipScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Tooltip",
                navigationIcon = {
                    Icon24(
                        painter = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        val horizontalPadding = 24.dp

        val descriptionLarge = "Hello it i: Tooltips text with long long long description text"
        val descriptionMedium = "Tooltips text with description"
        val descriptionShort = "Tooltips text"


        Column(Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .padding(top = 32.dp)
                    .padding(horizontal = 16.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(white100),
            ) {
                Tooltip(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp)
                        .padding(horizontal = horizontalPadding),
                    name = "Title 1",
                    tooltip = descriptionShort,
                )

                Tooltip(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp)
                        .padding(horizontal = horizontalPadding),
                    name = "Description Medium",
                    tooltip = descriptionMedium,
                )

                Tooltip(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp)
                        .padding(horizontal = horizontalPadding),
                    name = "Description Medium",
                    tooltip = descriptionMedium,
                )

                Tooltip(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, bottom = 24.dp)
                        .padding(horizontal = horizontalPadding),
                    name = "Description Large",
                    tooltip = descriptionLarge,
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Column(
                modifier = Modifier
                    .padding(top = 32.dp, bottom = 24.dp)
                    .padding(horizontal = 16.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(white100),
            ) {
                Tooltip(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp)
                        .padding(horizontal = horizontalPadding),
                    name = "tooltip bottom 1",
                    tooltip = descriptionMedium,
                )

                Tooltip(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, bottom = 24.dp)
                        .padding(horizontal = horizontalPadding),
                    name = "tooltip bottom 2",
                    tooltip = descriptionShort,
                )
            }
        }

//        TooltipPopup(
//            modifier = Modifier
//                .background(blue70),
//            requesterView = { requesterModifier ->
//                Icon16(
//                    modifier = requesterModifier,
//                    painter = painterResource(id = R.drawable.ic_arrow_left_16_ver01)
//                )
//            },
//            tooltipContent = {
//                DealiText(
//                    modifier = Modifier
//                        .padding(horizontal = 12.dp)
//                        .padding(vertical = 8.dp),
//                    text = "tooltip content",
//                    style = TextStyle(
//                        fontSize = 16.sp,
//                        lineHeight = 18.sp,
//                        fontWeight = FontWeight.Medium,
//                    ),
//                    color = white100,
//                )
//            }
//        )
    }
}

@Composable
@Preview
private fun TooltipScreenPreview() {
    TooltipScreen(
        onBackPress = {}
    )
}
