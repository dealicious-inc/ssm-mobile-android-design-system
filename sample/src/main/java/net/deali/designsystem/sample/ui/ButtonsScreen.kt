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
import net.deali.designsystem.component.ButtonLargeFulled
import net.deali.designsystem.component.ButtonLargeOutlined
import net.deali.designsystem.component.ButtonLargeText
import net.deali.designsystem.component.ButtonLargeTonalOutlined
import net.deali.designsystem.component.ButtonMediumFulled
import net.deali.designsystem.component.ButtonMediumOutlined
import net.deali.designsystem.component.ButtonMediumText
import net.deali.designsystem.component.ButtonMediumTonalOutlined
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.ButtonSmallFulled
import net.deali.designsystem.component.ButtonSmallOutlined
import net.deali.designsystem.component.ButtonSmallText
import net.deali.designsystem.component.ButtonSmallTonalOutlined
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.gray20
import net.deali.designsystem.theme.white100

@Composable
fun ButtonsScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Buttons",
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
                ButtonSmallContainer()
            }

            item {
                ButtonMediumContainer()
            }

            item {
                ButtonLargeContainer()
            }
        }
    }
}

@Composable
private fun ButtonSmallContainer() {
    Item(
        text = "Button Small"
    ) {
        SubContainer(
            text = "Fulled Buttons"
        ) {
            ContainerItem {
                ButtonSmallFulled(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                ButtonSmallFulled(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonSmallFulled(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonSmallFulled(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                ButtonSmallFulled(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonSmallFulled(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonSmallFulled(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonSmallFulled(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonSmallFulled(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "Outlined Buttons"
        ) {
            ContainerItem {
                ButtonSmallOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                ButtonSmallOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonSmallOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonSmallOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                ButtonSmallOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonSmallOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonSmallOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonSmallOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonSmallOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "TonalOutlined Buttons"
        ) {
            ContainerItem {
                ButtonSmallTonalOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                ButtonSmallTonalOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonSmallTonalOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonSmallTonalOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                ButtonSmallTonalOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonSmallTonalOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonSmallTonalOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonSmallTonalOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonSmallTonalOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "Text Buttons"
        ) {
            ContainerItem {
                ButtonSmallText(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                ButtonSmallText(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonSmallText(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonSmallText(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                ButtonSmallText(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonSmallText(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonSmallText(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonSmallText(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonSmallText(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )
            }
        }
    }
}

@Composable
private fun ButtonMediumContainer() {
    Item(
        text = "Button Medium"
    ) {
        SubContainer(
            text = "Fulled Buttons"
        ) {
            ContainerItem {
                ButtonMediumFulled(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                ButtonMediumFulled(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonMediumFulled(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonMediumFulled(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                ButtonMediumFulled(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonMediumFulled(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonMediumFulled(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonMediumFulled(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonMediumFulled(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "Outlined Buttons"
        ) {
            ContainerItem {
                ButtonMediumOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                ButtonMediumOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonMediumOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonMediumOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                ButtonMediumOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonMediumOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonMediumOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonMediumOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonMediumOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "TonalOutlined Buttons"
        ) {
            ContainerItem {
                ButtonMediumTonalOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                ButtonMediumTonalOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonMediumTonalOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonMediumTonalOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                ButtonMediumTonalOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonMediumTonalOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonMediumTonalOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonMediumTonalOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonMediumTonalOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "Text Buttons"
        ) {
            ContainerItem {
                ButtonMediumText(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                ButtonMediumText(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonMediumText(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonMediumText(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                ButtonMediumText(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonMediumText(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonMediumText(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonMediumText(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonMediumText(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )
            }
        }
    }
}

@Composable
private fun ButtonLargeContainer() {
    Item(
        text = "Button Large"
    ) {
        SubContainer(
            text = "Fulled Buttons"
        ) {
            ContainerItem {
                ButtonLargeFulled(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                ButtonLargeFulled(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonLargeFulled(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonLargeFulled(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                ButtonLargeFulled(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonLargeFulled(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonLargeFulled(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonLargeFulled(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonLargeFulled(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "Outlined Buttons"
        ) {
            ContainerItem {
                ButtonLargeOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                ButtonLargeOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonLargeOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonLargeOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                ButtonLargeOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonLargeOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonLargeOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonLargeOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonLargeOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "TonalOutlined Buttons"
        ) {
            ContainerItem {
                ButtonLargeTonalOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                ButtonLargeTonalOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonLargeTonalOutlined(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonLargeTonalOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                ButtonLargeTonalOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonLargeTonalOutlined(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonLargeTonalOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonLargeTonalOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonLargeTonalOutlined(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "Text Buttons"
        ) {
            ContainerItem {
                ButtonLargeText(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                ButtonLargeText(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonLargeText(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonLargeText(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                ButtonLargeText(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                ButtonLargeText(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                ButtonLargeText(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonLargeText(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )

                ButtonLargeText(
                    text = "Loading",
                    enabled = true,
                    process = true,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    processIcon = painterResource(id = R.drawable.ic_loading_filled_24_ver01),
                    onClick = {}
                )
            }
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
private fun ContainerItem(
    content: @Composable () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        content()
    }
}

@Composable
@Preview
private fun ButtonsScreenPreview() {
    ButtonsScreen(
        onBackPress = {}
    )
}
