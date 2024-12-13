package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.textLinkSmall01
import net.deali.designsystem.component.textLinkSmall02
import net.deali.designsystem.component.textLinkSmall03
import net.deali.designsystem.component.textLinkSmall04
import net.deali.designsystem.component.textLinkSmall05
import net.deali.designsystem.component.textLinkSmall06
import net.deali.designsystem.component.textLinkSmall07
import net.deali.designsystem.theme.DealiColor

@Composable
fun TextLinkSmallSamples(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        item {
            TextLinkSmallSamples()
        }
    }
}

@Composable
private fun TextLinkSmallSamples() {
    TextLinkSampleLayout(
        title = "textLinkSmall01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkSmall01(
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
        title = "textLinkSmall02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkSmall02(
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
        title = "textLinkSmall03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkSmall03(
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
        title = "textLinkSmall04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkSmall04(
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
        title = "textLinkSmall05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkSmall05(
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
        title = "textLinkSmall06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkSmall06(
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
        title = "textLinkSmall07",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkSmall07(
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
