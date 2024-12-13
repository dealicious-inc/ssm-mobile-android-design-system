package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.VerticalSpacer
import net.deali.designsystem.component.textLinkLarge01
import net.deali.designsystem.component.textLinkLarge02
import net.deali.designsystem.component.textLinkLarge03
import net.deali.designsystem.component.textLinkLarge04
import net.deali.designsystem.component.textLinkLarge05
import net.deali.designsystem.component.textLinkLarge06
import net.deali.designsystem.component.textLinkLarge07
import net.deali.designsystem.component.textLinkLineLarge01
import net.deali.designsystem.component.textLinkLineLarge02
import net.deali.designsystem.component.textLinkLineLarge03
import net.deali.designsystem.component.textLinkLineLarge04
import net.deali.designsystem.component.textLinkLineLarge05
import net.deali.designsystem.component.textLinkLineLarge06
import net.deali.designsystem.component.textLinkLineLarge07
import net.deali.designsystem.theme.DealiColor

@Composable
fun TextLinkLargeSamples(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        item {
            TextLinkLargeSamples()
            VerticalSpacer(20.dp)
        }

        item {
            TextLinkLineLargeSamples()
        }
    }
}

@Composable
private fun TextLinkLargeSamples() {
    TextLinkSampleLayout(
        title = "textLinkLarge01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkLarge01(
                    text = text,
                    onClick = {},
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                )
            }
        }
    }

    TextLinkSampleLayout(
        title = "textLinkLarge02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkLarge02(
                    text = text,
                    onClick = {},
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                )
            }
        }
    }

    TextLinkSampleLayout(
        title = "textLinkLarge03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkLarge03(
                    text = text,
                    onClick = {},
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                )
            }
        }
    }

    TextLinkSampleLayout(
        title = "textLinkLarge04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkLarge04(
                    text = text,
                    onClick = {},
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                )
            }
        }
    }

    TextLinkSampleLayout(
        title = "textLinkLarge05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkLarge05(
                    text = text,
                    onClick = {},
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                )
            }
        }
    }

    TextLinkSampleLayout(
        title = "textLinkLarge06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkLarge06(
                    text = text,
                    onClick = {},
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                )
            }
        }
    }

    TextLinkSampleLayout(
        title = "textLinkLarge07",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkLarge07(
                    text = text,
                    onClick = {},
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                )
            }
        }
    }
}

@Composable
private fun TextLinkLineLargeSamples() {
    TextLinkSampleLayout(
        title = "textLinkLineLarge01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkLineLarge01(
                    text = text,
                    onClick = {},
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                )
            }
        }
    }

    TextLinkSampleLayout(
        title = "textLinkLineLarge02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkLineLarge02(
                    text = text,
                    onClick = {},
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                )
            }
        }
    }

    TextLinkSampleLayout(
        title = "textLinkLineLarge03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkLineLarge03(
                    text = text,
                    onClick = {},
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                )
            }
        }
    }

    TextLinkSampleLayout(
        title = "textLinkLineLarge04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkLineLarge04(
                    text = text,
                    onClick = {},
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                )
            }
        }
    }

    TextLinkSampleLayout(
        title = "textLinkLineLarge05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkLineLarge05(
                    text = text,
                    onClick = {},
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                )
            }
        }
    }

    TextLinkSampleLayout(
        title = "textLinkLineLarge06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkLineLarge06(
                    text = text,
                    onClick = {},
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                )
            }
        }
    }

    TextLinkSampleLayout(
        title = "textLinkLineLarge07",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkLineLarge07(
                    text = text,
                    onClick = {},
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                )
            }
        }
    }
}
