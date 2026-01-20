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
import net.deali.designsystem.component.btnFilledRoundMedium01
import net.deali.designsystem.component.btnFilledRoundMedium02
import net.deali.designsystem.component.btnFilledRoundMedium03
import net.deali.designsystem.component.btnFilledRoundMedium04
import net.deali.designsystem.component.btnFilledRoundMedium05
import net.deali.designsystem.component.btnFilledRoundMedium06
import net.deali.designsystem.component.btnFilledTonalRoundMedium01
import net.deali.designsystem.component.btnFilledTonalRoundMedium02
import net.deali.designsystem.component.btnFilledTonalRoundMedium03
import net.deali.designsystem.component.btnFilledTonalRoundMedium04
import net.deali.designsystem.component.btnFilledTonalRoundMedium05
import net.deali.designsystem.component.btnFilledTonalRoundMedium06
import net.deali.designsystem.component.btnOutlineBgRoundMedium01
import net.deali.designsystem.component.btnOutlineBgRoundMedium03
import net.deali.designsystem.component.btnOutlineBgRoundMedium04
import net.deali.designsystem.component.btnOutlineBgRoundMedium05
import net.deali.designsystem.component.btnOutlineBgRoundMedium06
import net.deali.designsystem.component.btnOutlineRoundMedium01
import net.deali.designsystem.component.btnOutlineRoundMedium02
import net.deali.designsystem.component.btnOutlineRoundMedium03
import net.deali.designsystem.component.btnOutlineRoundMedium04
import net.deali.designsystem.component.btnOutlineRoundMedium05
import net.deali.designsystem.component.btnOutlineRoundMedium06
import net.deali.designsystem.component.btnTextRoundMedium01
import net.deali.designsystem.component.btnTextRoundMedium02
import net.deali.designsystem.component.btnTextRoundMedium03
import net.deali.designsystem.component.btnTextRoundMedium04
import net.deali.designsystem.component.btnTextRoundMedium05
import net.deali.designsystem.component.btnTextRoundMedium06
import net.deali.designsystem.component.btnTextRoundMedium07
import net.deali.designsystem.theme.DealiColor

@Composable
fun ButtonRoundMediumSamples(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        item {
            BtnFilledRoundMedium01Samples()
        }
        item {
            BtnFilledRoundMedium02Samples()
        }
        item {
            BtnFilledRoundMedium03Samples()
        }
        item {
            BtnFilledRoundMedium04Samples()
        }

        item {
            BtnFilledTonalRoundMedium01Samples()
        }
        item {
            BtnFilledTonalRoundMedium02Samples()
        }
        item {
            BtnFilledTonalRoundMedium03Samples()
        }
        item {
            BtnFilledTonalRoundMedium04Samples()
        }
        item {
            BtnFilledTonalRoundMedium05Samples()
        }
        item {
            BtnFilledTonalRoundMedium06Samples()
        }

        item {
            BtnOutlineRoundMedium01Samples()
        }
        item {
            BtnOutlineRoundMedium02Samples()
        }
        item {
            BtnOutlineRoundMedium03Samples()
        }
        item {
            BtnOutlineRoundMedium04Samples()
        }
        item {
            BtnOutlineRoundMedium05Samples()
        }
        item {
            BtnOutlineRoundMedium06Samples()
        }

        item {
            BtnOutlineBgRoundMedium01Samples()
        }
        item {
            BtnOutlineBgRoundMedium03Samples()
        }
        item {
            BtnOutlineBgRoundMedium04Samples()
        }
        item {
            BtnOutlineBgRoundMedium05Samples()
        }
        item {
            BtnOutlineBgRoundMedium06Samples()
        }

        item {
            BtnTextRoundMedium01Samples()
        }
        item {
            BtnTextRoundMedium02Samples()
        }
        item {
            BtnTextRoundMedium03Samples()
        }
        item {
            BtnTextRoundMedium04Samples()
        }
        item {
            BtnTextRoundMedium05Samples()
        }
        item {
            BtnTextRoundMedium06Samples()
        }
        item {
            BtnTextRoundMedium07Samples()
        }
    }
}

@Composable
private fun BtnFilledRoundMedium01Samples() {
    ButtonSampleLayout(
        title = "btnFilledRoundMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledRoundMedium01(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}


@Composable
private fun BtnFilledRoundMedium02Samples() {
    ButtonSampleLayout(
        title = "btnFilledRoundMedium02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledRoundMedium02(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnFilledRoundMedium03Samples() {
    ButtonSampleLayout(
        title = "btnFilledRoundMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledRoundMedium03(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnFilledRoundMedium04Samples() {
    ButtonSampleLayout(
        title = "btnFilledRoundMedium04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledRoundMedium04(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnFilledRoundMedium05Samples() {
    ButtonSampleLayout(
        title = "btnFilledRoundMedium05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledRoundMedium05(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnFilledRoundMedium06Samples() {
    ButtonSampleLayout(
        title = "btnFilledRoundMedium06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledRoundMedium06(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalRoundMedium01Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalRoundMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalRoundMedium01(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalRoundMedium02Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalRoundMedium02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalRoundMedium02(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalRoundMedium03Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalRoundMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalRoundMedium03(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalRoundMedium04Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalRoundMedium04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalRoundMedium04(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalRoundMedium05Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalRoundMedium05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalRoundMedium05(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalRoundMedium06Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalRoundMedium06",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalRoundMedium06(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineRoundMedium01Samples() {
    ButtonSampleLayout(
        title = "btnOutlineRoundMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineRoundMedium01(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineRoundMedium02Samples() {
    ButtonSampleLayout(
        title = "btnOutlineRoundMedium02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineRoundMedium02(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineRoundMedium03Samples() {
    ButtonSampleLayout(
        title = "btnOutlineRoundMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineRoundMedium03(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineRoundMedium04Samples() {
    ButtonSampleLayout(
        title = "btnOutlineRoundMedium04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineRoundMedium04(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineRoundMedium05Samples() {
    ButtonSampleLayout(
        title = "btnOutlineRoundMedium05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineRoundMedium05(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineRoundMedium06Samples() {
    ButtonSampleLayout(
        title = "btnOutlineRoundMedium06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineRoundMedium06(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineBgRoundMedium01Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgRoundMedium01",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgRoundMedium01(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineBgRoundMedium03Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgRoundMedium03",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgRoundMedium03(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineBgRoundMedium04Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgRoundMedium04",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgRoundMedium04(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineBgRoundMedium05Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgRoundMedium05",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgRoundMedium05(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineBgRoundMedium06Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgRoundMedium06",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgRoundMedium06(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnTextRoundMedium01Samples() {
    ButtonSampleLayout(
        title = "btnTextRoundMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextRoundMedium01(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnTextRoundMedium02Samples() {
    ButtonSampleLayout(
        title = "btnTextRoundMedium02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextRoundMedium02(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnTextRoundMedium03Samples() {
    ButtonSampleLayout(
        title = "btnTextRoundMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextRoundMedium03(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnTextRoundMedium04Samples() {
    ButtonSampleLayout(
        title = "btnTextRoundMedium04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextRoundMedium04(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnTextRoundMedium05Samples() {
    ButtonSampleLayout(
        title = "btnTextRoundMedium05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextRoundMedium05(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnTextRoundMedium06Samples() {
    ButtonSampleLayout(
        title = "btnTextRoundMedium06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextRoundMedium06(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Composable
private fun BtnTextRoundMedium07Samples() {
    ButtonSampleLayout(
        title = "btnTextRoundMedium07",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextRoundMedium07(
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                    onClick = {},
                )
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    ButtonRoundMediumSamples()
}
