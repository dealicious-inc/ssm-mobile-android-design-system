package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.btnFilledSemiMedium01
import net.deali.designsystem.component.btnFilledSemiMedium02
import net.deali.designsystem.component.btnFilledSemiMedium03
import net.deali.designsystem.component.btnFilledTonalSemiMedium01
import net.deali.designsystem.component.btnFilledTonalSemiMedium02
import net.deali.designsystem.component.btnFilledTonalSemiMedium03
import net.deali.designsystem.component.btnFilledTonalSemiMedium04
import net.deali.designsystem.component.btnFilledTonalSemiMedium05
import net.deali.designsystem.component.btnFilledTonalSemiMedium06
import net.deali.designsystem.component.btnOutlineBgSemiMedium01
import net.deali.designsystem.component.btnOutlineBgSemiMedium03
import net.deali.designsystem.component.btnOutlineBgSemiMedium04
import net.deali.designsystem.component.btnOutlineBgSemiMedium05
import net.deali.designsystem.component.btnOutlineBgSemiMedium06
import net.deali.designsystem.component.btnOutlineSemiMedium01
import net.deali.designsystem.component.btnOutlineSemiMedium02
import net.deali.designsystem.component.btnOutlineSemiMedium03
import net.deali.designsystem.component.btnOutlineSemiMedium04
import net.deali.designsystem.component.btnOutlineSemiMedium05
import net.deali.designsystem.component.btnOutlineSemiMedium06
import net.deali.designsystem.component.btnTextSemiMedium01
import net.deali.designsystem.component.btnTextSemiMedium02
import net.deali.designsystem.component.btnTextSemiMedium03
import net.deali.designsystem.component.btnTextSemiMedium04
import net.deali.designsystem.component.btnTextSemiMedium05
import net.deali.designsystem.component.btnTextSemiMedium06
import net.deali.designsystem.component.btnTextSemiMedium07
import net.deali.designsystem.theme.DealiColor

@Composable
fun SemiMediumButtonSamples(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        item {
            BtnFilledSemiMedium01Samples()
        }
        item {
            BtnFilledSemiMedium02Samples()
        }
        item {
            BtnFilledSemiMedium03Samples()
        }
        item {
            BtnFilledTonalSemiMedium01Samples()
        }
        item {
            BtnFilledTonalSemiMedium02Samples()
        }
        item {
            BtnFilledTonalSemiMedium03Samples()
        }
        item {
            BtnFilledTonalSemiMedium04Samples()
        }
        item {
            BtnFilledTonalSemiMedium05Samples()
        }
        item {
            BtnFilledTonalSemiMedium06Samples()
        }

        item {
            BtnOutlineSemiMedium01Samples()
        }
        item {
            BtnOutlineSemiMedium02Samples()
        }
        item {
            BtnOutlineSemiMedium03Samples()
        }
        item {
            BtnOutlineSemiMedium04Samples()
        }
        item {
            BtnOutlineSemiMedium05Samples()
        }
        item {
            BtnOutlineSemiMedium06Samples()
        }

        item {
            BtnOutlineBgSemiMedium01Samples()
        }
        item {
            BtnOutlineBgSemiMedium03Samples()
        }
        item {
            BtnOutlineBgSemiMedium04Samples()
        }
        item {
            BtnOutlineBgSemiMedium05Samples()
        }
        item {
            BtnOutlineBgSemiMedium06Samples()
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
private fun BtnFilledSemiMedium01Samples() {
    ButtonSampleLayout(
        title = "btnFilledSemiMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledSemiMedium01(
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
private fun BtnFilledSemiMedium02Samples() {
    ButtonSampleLayout(
        title = "btnFilledSemiMedium02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledSemiMedium02(
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
private fun BtnFilledSemiMedium03Samples() {
    ButtonSampleLayout(
        title = "btnFilledSemiMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledSemiMedium03(
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
private fun BtnFilledTonalSemiMedium01Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSemiMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSemiMedium01(
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
private fun BtnFilledTonalSemiMedium02Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSemiMedium02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSemiMedium02(
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
private fun BtnFilledTonalSemiMedium03Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSemiMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSemiMedium03(
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
private fun BtnFilledTonalSemiMedium04Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSemiMedium04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSemiMedium04(
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
private fun BtnFilledTonalSemiMedium05Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSemiMedium05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSemiMedium05(
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
private fun BtnFilledTonalSemiMedium06Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSemiMedium06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSemiMedium06(
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
private fun BtnOutlineSemiMedium01Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSemiMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSemiMedium01(
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
private fun BtnOutlineSemiMedium02Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSemiMedium02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSemiMedium02(
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
private fun BtnOutlineSemiMedium03Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSemiMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSemiMedium03(
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
private fun BtnOutlineSemiMedium04Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSemiMedium04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSemiMedium04(
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
private fun BtnOutlineSemiMedium05Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSemiMedium05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSemiMedium05(
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
private fun BtnOutlineSemiMedium06Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSemiMedium06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSemiMedium06(
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
private fun BtnOutlineBgSemiMedium01Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgSemiMedium01",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgSemiMedium01(
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
private fun BtnOutlineBgSemiMedium03Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgSemiMedium03",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgSemiMedium03(
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
private fun BtnOutlineBgSemiMedium04Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgSemiMedium04",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgSemiMedium04(
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
private fun BtnOutlineBgSemiMedium05Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgSemiMedium05",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgSemiMedium05(
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
private fun BtnOutlineBgSemiMedium06Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgSemiMedium06",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgSemiMedium06(
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
