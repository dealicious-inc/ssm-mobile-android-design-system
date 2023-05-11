package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.LargeFulledButton
import net.deali.designsystem.component.LargeOutlinedButton
import net.deali.designsystem.component.LargeTextButton
import net.deali.designsystem.component.LargeTonalOutlinedButton
import net.deali.designsystem.component.MediumFulledButton
import net.deali.designsystem.component.MediumOutlinedButton
import net.deali.designsystem.component.MediumTextButton
import net.deali.designsystem.component.MediumTonalOutlinedButton
import net.deali.designsystem.component.SmallFulledButton
import net.deali.designsystem.component.SmallOutlinedButton
import net.deali.designsystem.component.SmallTextButton
import net.deali.designsystem.component.SmallTonalOutlinedButton
import net.deali.designsystem.sample.R
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.gray20
import net.deali.designsystem.theme.white100

@Composable
fun ButtonsScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = gray20)
            .padding(10.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonSmallContainer()
        ButtonMediumContainer()
        ButtonLargeContainer()
    }
}

@Composable
private fun ButtonSmallContainer() {
    Container(
        text = "Button Small"
    ) {
        SubContainer(
            text = "Fulled Buttons"
        ) {
            ContainerItem {
                SmallFulledButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                SmallFulledButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                SmallFulledButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                SmallFulledButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                SmallFulledButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                SmallFulledButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "Outlined Buttons"
        ) {
            ContainerItem {
                SmallOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                SmallOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                SmallOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                SmallOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                SmallOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                SmallOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "TonalOutlined Buttons"
        ) {
            ContainerItem {
                SmallTonalOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                SmallTonalOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                SmallTonalOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                SmallTonalOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                SmallTonalOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                SmallTonalOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "Text Buttons"
        ) {
            ContainerItem {
                SmallTextButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                SmallTextButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                SmallTextButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                SmallTextButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                SmallTextButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                SmallTextButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }
        }
    }
}

@Composable
private fun ButtonMediumContainer() {
    Container(
        text = "Button Medium"
    ) {
        SubContainer(
            text = "Fulled Buttons"
        ) {
            ContainerItem {
                MediumFulledButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                MediumFulledButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                MediumFulledButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                MediumFulledButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                MediumFulledButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                MediumFulledButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "Outlined Buttons"
        ) {
            ContainerItem {
                MediumOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                MediumOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                MediumOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                MediumOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                MediumOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                MediumOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "TonalOutlined Buttons"
        ) {
            ContainerItem {
                MediumTonalOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                MediumTonalOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                MediumTonalOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                MediumTonalOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                MediumTonalOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                MediumTonalOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "Text Buttons"
        ) {
            ContainerItem {
                MediumTextButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                MediumTextButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                MediumTextButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                MediumTextButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                MediumTextButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                MediumTextButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }
        }
    }
}

@Composable
private fun ButtonLargeContainer() {
    Container(
        text = "Button Large"
    ) {
        SubContainer(
            text = "Fulled Buttons"
        ) {
            ContainerItem {
                LargeFulledButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                LargeFulledButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                LargeFulledButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                LargeFulledButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                LargeFulledButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                LargeFulledButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "Outlined Buttons"
        ) {
            ContainerItem {
                LargeOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                LargeOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                LargeOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                LargeOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                LargeOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                LargeOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "TonalOutlined Buttons"
        ) {
            ContainerItem {
                LargeTonalOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                LargeTonalOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                LargeTonalOutlinedButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                LargeTonalOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                LargeTonalOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                LargeTonalOutlinedButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }
        }

        SubContainer(
            text = "Text Buttons"
        ) {
            ContainerItem {
                LargeTextButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    onClick = {}
                )

                LargeTextButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                LargeTextButton(
                    text = "Default",
                    enabled = true,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }

            ContainerItem {
                LargeTextButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    onClick = {}
                )

                LargeTextButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    leftIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )

                LargeTextButton(
                    text = "Disabled",
                    enabled = false,
                    process = false,
                    rightIcon = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                    onClick = {}
                )
            }
        }
    }
}

@Composable
private fun Container(
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
    ButtonsScreen()
}