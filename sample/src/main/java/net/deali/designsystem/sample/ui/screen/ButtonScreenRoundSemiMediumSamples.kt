package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.btnFilledRoundSemiMedium01
import net.deali.designsystem.component.btnFilledRoundSemiMedium02
import net.deali.designsystem.component.btnFilledRoundSemiMedium03
import net.deali.designsystem.component.btnFilledTonalRoundSemiMedium01
import net.deali.designsystem.component.btnFilledTonalRoundSemiMedium02
import net.deali.designsystem.component.btnFilledTonalRoundSemiMedium03
import net.deali.designsystem.component.btnFilledTonalRoundSemiMedium04
import net.deali.designsystem.component.btnFilledTonalRoundSemiMedium05
import net.deali.designsystem.component.btnFilledTonalRoundSemiMedium06
import net.deali.designsystem.component.btnOutlineBgRoundSemiMedium01
import net.deali.designsystem.component.btnOutlineBgRoundSemiMedium03
import net.deali.designsystem.component.btnOutlineBgRoundSemiMedium04
import net.deali.designsystem.component.btnOutlineBgRoundSemiMedium05
import net.deali.designsystem.component.btnOutlineBgRoundSemiMedium06
import net.deali.designsystem.component.btnOutlineRoundSemiMedium01
import net.deali.designsystem.component.btnOutlineRoundSemiMedium02
import net.deali.designsystem.component.btnOutlineRoundSemiMedium03
import net.deali.designsystem.component.btnOutlineRoundSemiMedium04
import net.deali.designsystem.component.btnOutlineRoundSemiMedium05
import net.deali.designsystem.component.btnOutlineRoundSemiMedium06
import net.deali.designsystem.component.btnTextSemiMedium01
import net.deali.designsystem.component.btnTextSemiMedium02
import net.deali.designsystem.component.btnTextSemiMedium03
import net.deali.designsystem.component.btnTextSemiMedium04
import net.deali.designsystem.component.btnTextSemiMedium05
import net.deali.designsystem.component.btnTextSemiMedium06
import net.deali.designsystem.component.btnTextSemiMedium07
import net.deali.designsystem.theme.DealiColor

@Composable
fun ButtonRoundSemiMediumSamples(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        item {
            BtnFilledRoundSemiMedium01Samples()
        }
        item {
            BtnFilledRoundSemiMedium02Samples()
        }
        item {
            BtnFilledRoundSemiMedium03Samples()
        }
        item {
            BtnFilledTonalRoundSemiMedium01Samples()
        }
        item {
            BtnFilledTonalRoundSemiMedium02Samples()
        }
        item {
            BtnFilledTonalRoundSemiMedium03Samples()
        }
        item {
            BtnFilledTonalRoundSemiMedium04Samples()
        }
        item {
            BtnFilledTonalRoundSemiMedium05Samples()
        }
        item {
            BtnFilledTonalRoundSemiMedium06Samples()
        }

        item {
            BtnOutlineRoundSemiMedium01Samples()
        }
        item {
            BtnOutlineRoundSemiMedium02Samples()
        }
        item {
            BtnOutlineRoundSemiMedium03Samples()
        }
        item {
            BtnOutlineRoundSemiMedium04Samples()
        }
        item {
            BtnOutlineRoundSemiMedium05Samples()
        }
        item {
            BtnOutlineRoundSemiMedium06Samples()
        }

        item {
            BtnOutlineBgRoundSemiMedium01Samples()
        }
        item {
            BtnOutlineBgRoundSemiMedium03Samples()
        }
        item {
            BtnOutlineBgRoundSemiMedium04Samples()
        }
        item {
            BtnOutlineBgRoundSemiMedium05Samples()
        }
        item {
            BtnOutlineBgRoundSemiMedium06Samples()
        }

        item {
            BtnTextSemiMedium01Samples()
        }
        item {
            BtnTextSemiMedium02Samples()
        }
        item {
            BtnTextSemiMedium03Samples()
        }
        item {
            BtnTextSemiMedium04Samples()
        }
        item {
            BtnTextSemiMedium05Samples()
        }
        item {
            BtnTextSemiMedium06Samples()
        }
        item {
            BtnTextSemiMedium07Samples()
        }
    }
}

@Composable
private fun BtnFilledRoundSemiMedium01Samples() {
    ButtonSampleLayout(
        title = "btnFilledRoundSemiMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledRoundSemiMedium01(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}


@Composable
private fun BtnFilledRoundSemiMedium02Samples() {
    ButtonSampleLayout(
        title = "btnFilledRoundSemiMedium02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledRoundSemiMedium02(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnFilledRoundSemiMedium03Samples() {
    ButtonSampleLayout(
        title = "btnFilledRoundSemiMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledRoundSemiMedium03(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalRoundSemiMedium01Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalRoundSemiMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalRoundSemiMedium01(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalRoundSemiMedium02Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalRoundSemiMedium02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalRoundSemiMedium02(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalRoundSemiMedium03Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalRoundSemiMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalRoundSemiMedium03(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalRoundSemiMedium04Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalRoundSemiMedium04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalRoundSemiMedium04(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalRoundSemiMedium05Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalRoundSemiMedium05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalRoundSemiMedium05(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalRoundSemiMedium06Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalRoundSemiMedium06",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalRoundSemiMedium06(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineRoundSemiMedium01Samples() {
    ButtonSampleLayout(
        title = "btnOutlineRoundSemiMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineRoundSemiMedium01(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineRoundSemiMedium02Samples() {
    ButtonSampleLayout(
        title = "btnOutlineRoundSemiMedium02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineRoundSemiMedium02(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineRoundSemiMedium03Samples() {
    ButtonSampleLayout(
        title = "btnOutlineRoundSemiMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineRoundSemiMedium03(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineRoundSemiMedium04Samples() {
    ButtonSampleLayout(
        title = "btnOutlineRoundSemiMedium04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineRoundSemiMedium04(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineRoundSemiMedium05Samples() {
    ButtonSampleLayout(
        title = "btnOutlineRoundSemiMedium05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineRoundSemiMedium05(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineRoundSemiMedium06Samples() {
    ButtonSampleLayout(
        title = "btnOutlineRoundSemiMedium06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineRoundSemiMedium06(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineBgRoundSemiMedium01Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgRoundSemiMedium01",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgRoundSemiMedium01(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineBgRoundSemiMedium03Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgRoundSemiMedium03",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgRoundSemiMedium03(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineBgRoundSemiMedium04Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgRoundSemiMedium04",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgRoundSemiMedium04(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineBgRoundSemiMedium05Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgRoundSemiMedium05",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgRoundSemiMedium05(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineBgRoundSemiMedium06Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgRoundSemiMedium06",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgRoundSemiMedium06(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnTextSemiMedium01Samples() {
    ButtonSampleLayout(
        title = "btnTextSemiMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSemiMedium01(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnTextSemiMedium02Samples() {
    ButtonSampleLayout(
        title = "btnTextSemiMedium02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSemiMedium02(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnTextSemiMedium03Samples() {
    ButtonSampleLayout(
        title = "btnTextSemiMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSemiMedium03(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnTextSemiMedium04Samples() {
    ButtonSampleLayout(
        title = "btnTextSemiMedium04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSemiMedium04(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnTextSemiMedium05Samples() {
    ButtonSampleLayout(
        title = "btnTextSemiMedium05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSemiMedium05(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnTextSemiMedium06Samples() {
    ButtonSampleLayout(
        title = "btnTextSemiMedium06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSemiMedium06(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnTextSemiMedium07Samples() {
    ButtonSampleLayout(
        title = "btnTextSemiMedium07",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSemiMedium07(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    ButtonRoundSemiMediumSamples()
}
