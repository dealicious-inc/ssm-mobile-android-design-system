package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.textLinkMedium01
import net.deali.designsystem.component.textLinkMedium02
import net.deali.designsystem.component.textLinkMedium03
import net.deali.designsystem.component.textLinkMedium04
import net.deali.designsystem.component.textLinkMedium05
import net.deali.designsystem.component.textLinkMedium06
import net.deali.designsystem.component.textLinkMedium07
import net.deali.designsystem.theme.DealiColor

@Composable
fun TextLinkMediumSamples(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        item {
            TextLinkMediumSamples()
        }
    }
}

@Composable
private fun TextLinkMediumSamples() {
    TextLinkSampleLayout(
        title = "textLinkMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkMedium01(
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
        title = "textLinkMedium02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkMedium02(
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
        title = "textLinkMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkMedium03(
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
        title = "textLinkMedium04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkMedium04(
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
        title = "textLinkMedium05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkMedium05(
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
        title = "textLinkMedium06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkMedium06(
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
        title = "textLinkMedium07",
        dark = false,
    ) {
        for (i in 0 until 3) {
            TextLinkByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled ->
                textLinkMedium07(
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
