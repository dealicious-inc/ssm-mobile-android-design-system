package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.btnFilledMediumGradient
import net.deali.designsystem.component.btnFilledMediumPrimary01
import net.deali.designsystem.component.btnFilledMediumPrimary02
import net.deali.designsystem.component.btnFilledTonalMediumPrimary01
import net.deali.designsystem.component.btnFilledTonalMediumPrimary02
import net.deali.designsystem.component.btnFilledTonalMediumSecondary01
import net.deali.designsystem.component.btnFilledTonalMediumSecondary02
import net.deali.designsystem.component.btnFilledTonalMediumSecondary03
import net.deali.designsystem.component.btnOutlineMediumPrimary01
import net.deali.designsystem.component.btnOutlineMediumPrimary02
import net.deali.designsystem.component.btnOutlineMediumSecondary01
import net.deali.designsystem.component.btnOutlineMediumSecondary02
import net.deali.designsystem.component.btnOutlineMediumSecondary03
import net.deali.designsystem.component.btnOutlineMediumSecondary04
import net.deali.designsystem.component.btnTextMediumPrimary01
import net.deali.designsystem.component.btnTextMediumPrimary02
import net.deali.designsystem.component.btnTextMediumSecondary01
import net.deali.designsystem.component.btnTextMediumSecondary02
import net.deali.designsystem.component.btnTextMediumSecondary03
import net.deali.designsystem.component.btnTextMediumSecondary04
import net.deali.designsystem.component.btnTextMediumSecondary05
import net.deali.designsystem.theme.DealiColor

@Composable
fun MediumButtonSamples(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        item {
            BtnFilledMediumGradientSamples()
        }
        item {
            BtnFilledMediumPrimary01Samples()
        }
        item {
            BtnFilledMediumPrimary02Samples()
        }

        item {
            BtnFilledTonalMediumPrimary01Samples()
        }
        item {
            BtnFilledTonalMediumPrimary02Samples()
        }
        item {
            BtnFilledTonalMediumSecondary01Samples()
        }
        item {
            BtnFilledTonalMediumSecondary02Samples()
        }
        item {
            BtnFilledTonalMediumSecondary03Samples()
        }

        item {
            BtnOutlineMediumPrimary01Samples()
        }
        item {
            BtnOutlineMediumPrimary02Samples()
        }
        item {
            BtnOutlineMediumSecond01Samples()
        }
        item {
            BtnOutlineMediumSecond02Samples()
        }
        item {
            BtnOutlineMediumSecond03Samples()
        }
        item {
            BtnOutlineMediumSecond04Samples()
        }

        item {
            BtnTextMediumPrimary01Samples()
        }
        item {
            BtnTextMediumPrimary02Samples()
        }
        item {
            BtnTextMediumSecond01Samples()
        }
        item {
            BtnTextMediumSecond02Samples()
        }
        item {
            BtnTextMediumSecond03Samples()
        }
        item {
            BtnTextMediumSecond04Samples()
        }
        item {
            BtnTextMediumSecond05Samples()
        }
    }
}

@Composable
private fun BtnFilledMediumGradientSamples() {
    ButtonSampleLayout(
        title = "btnFilledMediumGradient",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledMediumGradient(
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
private fun BtnFilledMediumPrimary01Samples() {
    ButtonSampleLayout(
        title = "btnFilledMediumPrimary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledMediumPrimary01(
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
private fun BtnFilledMediumPrimary02Samples() {
    ButtonSampleLayout(
        title = "btnFilledMediumPrimary02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledMediumPrimary02(
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
private fun BtnFilledTonalMediumPrimary01Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalMediumPrimary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalMediumPrimary01(
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
private fun BtnFilledTonalMediumPrimary02Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalMediumPrimary02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalMediumPrimary02(
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
private fun BtnFilledTonalMediumSecondary01Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalMediumSecondary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalMediumSecondary01(
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
private fun BtnFilledTonalMediumSecondary02Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalMediumSecondary02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalMediumSecondary02(
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
private fun BtnFilledTonalMediumSecondary03Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalMediumSecondary03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalMediumSecondary03(
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
private fun BtnOutlineMediumPrimary01Samples() {
    ButtonSampleLayout(
        title = "btnOutlineMediumPrimary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineMediumPrimary01(
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
private fun BtnOutlineMediumPrimary02Samples() {
    ButtonSampleLayout(
        title = "btnOutlineMediumPrimary02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineMediumPrimary02(
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
private fun BtnOutlineMediumSecond01Samples() {
    ButtonSampleLayout(
        title = "btnOutlineMediumSecondary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineMediumSecondary01(
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
private fun BtnOutlineMediumSecond02Samples() {
    ButtonSampleLayout(
        title = "btnOutlineMediumSecondary02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineMediumSecondary02(
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
private fun BtnOutlineMediumSecond03Samples() {
    ButtonSampleLayout(
        title = "btnOutlineMediumSecondary03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineMediumSecondary03(
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
private fun BtnOutlineMediumSecond04Samples() {
    ButtonSampleLayout(
        title = "btnOutlineMediumSecondary04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineMediumSecondary04(
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
private fun BtnTextMediumPrimary01Samples() {
    ButtonSampleLayout(
        title = "btnTextMediumPrimary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextMediumPrimary01(
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
private fun BtnTextMediumPrimary02Samples() {
    ButtonSampleLayout(
        title = "btnTextMediumPrimary02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextMediumPrimary02(
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
private fun BtnTextMediumSecond01Samples() {
    ButtonSampleLayout(
        title = "btnTextMediumSecondary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextMediumSecondary01(
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
private fun BtnTextMediumSecond02Samples() {
    ButtonSampleLayout(
        title = "btnTextMediumSecondary02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextMediumSecondary02(
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
private fun BtnTextMediumSecond03Samples() {
    ButtonSampleLayout(
        title = "btnTextMediumSecondary03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextMediumSecondary03(
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
private fun BtnTextMediumSecond04Samples() {
    ButtonSampleLayout(
        title = "btnTextMediumSecondary04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextMediumSecondary04(
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
private fun BtnTextMediumSecond05Samples() {
    ButtonSampleLayout(
        title = "btnTextMediumSecondary05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextMediumSecondary05(
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
