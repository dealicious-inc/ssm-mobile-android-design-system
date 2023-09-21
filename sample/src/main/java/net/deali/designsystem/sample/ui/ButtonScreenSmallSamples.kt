package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.btnFilledSmallGradient
import net.deali.designsystem.component.btnFilledSmallPrimary01
import net.deali.designsystem.component.btnFilledSmallPrimary02
import net.deali.designsystem.component.btnFilledTonalSmallPrimary01
import net.deali.designsystem.component.btnFilledTonalSmallPrimary02
import net.deali.designsystem.component.btnFilledTonalSmallSecondary01
import net.deali.designsystem.component.btnFilledTonalSmallSecondary02
import net.deali.designsystem.component.btnFilledTonalSmallSecondary03
import net.deali.designsystem.component.btnOutlineSmallPrimary01
import net.deali.designsystem.component.btnOutlineSmallPrimary02
import net.deali.designsystem.component.btnOutlineSmallSecondary01
import net.deali.designsystem.component.btnOutlineSmallSecondary02
import net.deali.designsystem.component.btnOutlineSmallSecondary03
import net.deali.designsystem.component.btnOutlineSmallSecondary04
import net.deali.designsystem.component.btnRoundFilledSmallGradient
import net.deali.designsystem.component.btnRoundFilledSmallPrimary01
import net.deali.designsystem.component.btnRoundFilledSmallPrimary02
import net.deali.designsystem.component.btnRoundFilledTonalSmallPrimary01
import net.deali.designsystem.component.btnRoundFilledTonalSmallPrimary02
import net.deali.designsystem.component.btnRoundFilledTonalSmallSecondary01
import net.deali.designsystem.component.btnRoundFilledTonalSmallSecondary02
import net.deali.designsystem.component.btnRoundFilledTonalSmallSecondary03
import net.deali.designsystem.component.btnRoundOutlineSmallPrimary01
import net.deali.designsystem.component.btnRoundOutlineSmallPrimary02
import net.deali.designsystem.component.btnRoundOutlineSmallSecondary01
import net.deali.designsystem.component.btnRoundOutlineSmallSecondary02
import net.deali.designsystem.component.btnRoundOutlineSmallSecondary03
import net.deali.designsystem.component.btnRoundOutlineSmallSecondary04
import net.deali.designsystem.component.btnTextSmallPrimary01
import net.deali.designsystem.component.btnTextSmallPrimary02
import net.deali.designsystem.component.btnTextSmallSecondary01
import net.deali.designsystem.component.btnTextSmallSecondary02
import net.deali.designsystem.component.btnTextSmallSecondary03
import net.deali.designsystem.component.btnTextSmallSecondary04
import net.deali.designsystem.component.btnTextSmallSecondary05
import net.deali.designsystem.theme.DealiColor

@Composable
fun SmallButtonSamples(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        item {
            BtnFilledSmallGradientSamples()
        }
        item {
            BtnFilledSmallPrimary01Samples()
        }
        item {
            BtnFilledSmallPrimary02Samples()
        }
        item {
            BtnRoundFilledSmallGradientSamples()
        }
        item {
            BtnRoundFilledSmallPrimary01Samples()
        }
        item {
            BtnRoundFilledSmallPrimary02Samples()
        }

        item {
            BtnFilledTonalSmallPrimary01Samples()
        }
        item {
            BtnFilledTonalSmallPrimary02Samples()
        }
        item {
            BtnFilledTonalSmallSecondary01Samples()
        }
        item {
            BtnFilledTonalSmallSecondary02Samples()
        }
        item {
            BtnFilledTonalSmallSecondary03Samples()
        }
        item {
            BtnRoundFilledTonalSmallPrimary01Samples()
        }
        item {
            BtnRoundFilledTonalSmallPrimary02Samples()
        }
        item {
            BtnRoundFilledTonalSmallSecondary01Samples()
        }
        item {
            BtnRoundFilledTonalSmallSecondary02Samples()
        }
        item {
            BtnRoundFilledTonalSmallSecondary03Samples()
        }

        item {
            BtnOutlineSmallPrimary01Samples()
        }
        item {
            BtnOutlineSmallPrimary02Samples()
        }
        item {
            BtnOutlineSmallSecondary01Samples()
        }
        item {
            BtnOutlineSmallSecondary02Samples()
        }
        item {
            BtnOutlineSmallSecondary03Samples()
        }
        item {
            BtnOutlineSmallSecondary04Samples()
        }
        item {
            BtnRoundOutlineSmallPrimary01Samples()
        }
        item {
            BtnRoundOutlineSmallPrimary02Samples()
        }
        item {
            BtnRoundOutlineSmallSecondary01Samples()
        }
        item {
            BtnRoundOutlineSmallSecondary02Samples()
        }
        item {
            BtnRoundOutlineSmallSecondary03Samples()
        }
        item {
            BtnRoundOutlineSmallSecondary04Samples()
        }

        item {
            BtnTextSmallPrimary01Samples()
        }
        item {
            BtnTextSmallPrimary02Samples()
        }
        item {
            BtnTextSmallSecondary01Samples()
        }
        item {
            BtnTextSmallSecondary02Samples()
        }
        item {
            BtnTextSmallSecondary03Samples()
        }
        item {
            BtnTextSmallSecondary04Samples()
        }
        item {
            BtnTextSmallSecondary05Samples()
        }
    }
}

@Composable
private fun BtnFilledSmallGradientSamples() {
    ButtonSampleLayout(
        title = "btnFilledSmallGradient",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledSmallGradient(
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
private fun BtnFilledSmallPrimary01Samples() {
    ButtonSampleLayout(
        title = "btnFilledSmallPrimary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledSmallPrimary01(
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
private fun BtnFilledSmallPrimary02Samples() {
    ButtonSampleLayout(
        title = "btnFilledSmallPrimary02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledSmallPrimary02(
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
private fun BtnRoundFilledSmallGradientSamples() {
    ButtonSampleLayout(
        title = "btnRoundFilledSmallGradient",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledSmallGradient(
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
private fun BtnRoundFilledSmallPrimary01Samples() {
    ButtonSampleLayout(
        title = "btnRoundFilledSmallPrimary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledSmallPrimary01(
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
private fun BtnRoundFilledSmallPrimary02Samples() {
    ButtonSampleLayout(
        title = "btnRoundFilledSmallPrimary02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledSmallPrimary02(
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
private fun BtnFilledTonalSmallPrimary01Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSmallPrimary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSmallPrimary01(
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
private fun BtnFilledTonalSmallPrimary02Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSmallPrimary02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSmallPrimary02(
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
private fun BtnFilledTonalSmallSecondary01Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSmallSecondary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSmallSecondary01(
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
private fun BtnFilledTonalSmallSecondary02Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSmallSecondary02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSmallSecondary02(
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
private fun BtnFilledTonalSmallSecondary03Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSmallSecondary03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSmallSecondary03(
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
private fun BtnRoundFilledTonalSmallPrimary01Samples() {
    ButtonSampleLayout(
        title = "btnRoundFilledTonalSmallPrimary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledTonalSmallPrimary01(
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
private fun BtnRoundFilledTonalSmallPrimary02Samples() {
    ButtonSampleLayout(
        title = "btnRoundFilledTonalSmallPrimary02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledTonalSmallPrimary02(
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
private fun BtnRoundFilledTonalSmallSecondary01Samples() {
    ButtonSampleLayout(
        title = "btnRoundFilledTonalSmallSecondary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledTonalSmallSecondary01(
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
private fun BtnRoundFilledTonalSmallSecondary02Samples() {
    ButtonSampleLayout(
        title = "btnRoundFilledTonalSmallSecondary02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledTonalSmallSecondary02(
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
private fun BtnRoundFilledTonalSmallSecondary03Samples() {
    ButtonSampleLayout(
        title = "btnRoundFilledTonalSmallSecondary03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledTonalSmallSecondary03(
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
private fun BtnOutlineSmallPrimary01Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSmallPrimary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSmallPrimary01(
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
private fun BtnOutlineSmallPrimary02Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSmallPrimary02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSmallPrimary02(
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
private fun BtnOutlineSmallSecondary01Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSmallSecondary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSmallSecondary01(
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
private fun BtnOutlineSmallSecondary02Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSmallSecondary02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSmallSecondary02(
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
private fun BtnOutlineSmallSecondary03Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSmallSecondary03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSmallSecondary03(
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
private fun BtnOutlineSmallSecondary04Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSmallSecondary04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSmallSecondary04(
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
private fun BtnRoundOutlineSmallPrimary01Samples() {
    ButtonSampleLayout(
        title = "btnRoundOutlineSmallPrimary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundOutlineSmallPrimary01(
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
private fun BtnRoundOutlineSmallPrimary02Samples() {
    ButtonSampleLayout(
        title = "btnRoundOutlineSmallPrimary02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundOutlineSmallPrimary02(
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
private fun BtnRoundOutlineSmallSecondary01Samples() {
    ButtonSampleLayout(
        title = "btnRoundOutlineSmallSecondary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundOutlineSmallSecondary01(
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
private fun BtnRoundOutlineSmallSecondary02Samples() {
    ButtonSampleLayout(
        title = "btnRoundOutlineSmallSecondary02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundOutlineSmallSecondary02(
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
private fun BtnRoundOutlineSmallSecondary03Samples() {
    ButtonSampleLayout(
        title = "btnRoundOutlineSmallSecondary03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundOutlineSmallSecondary03(
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
private fun BtnRoundOutlineSmallSecondary04Samples() {
    ButtonSampleLayout(
        title = "btnRoundOutlineSmallSecondary04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundOutlineSmallSecondary04(
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
private fun BtnTextSmallPrimary01Samples() {
    ButtonSampleLayout(
        title = "btnTextSmallPrimary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSmallPrimary01(
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
private fun BtnTextSmallPrimary02Samples() {
    ButtonSampleLayout(
        title = "btnTextSmallPrimary02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSmallPrimary02(
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
private fun BtnTextSmallSecondary01Samples() {
    ButtonSampleLayout(
        title = "btnTextSmallSecondary01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSmallSecondary01(
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
private fun BtnTextSmallSecondary02Samples() {
    ButtonSampleLayout(
        title = "btnTextSmallSecondary02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSmallSecondary02(
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
private fun BtnTextSmallSecondary03Samples() {
    ButtonSampleLayout(
        title = "btnTextSmallSecondary03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSmallSecondary03(
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
private fun BtnTextSmallSecondary04Samples() {
    ButtonSampleLayout(
        title = "btnTextSmallSecondary04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSmallSecondary04(
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
private fun BtnTextSmallSecondary05Samples() {
    ButtonSampleLayout(
        title = "btnTextSmallSecondary05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSmallSecondary05(
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
