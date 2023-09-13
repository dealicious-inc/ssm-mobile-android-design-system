package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.button.ButtonLarge
import net.deali.designsystem.internal.button.ButtonMedium
import net.deali.designsystem.internal.button.ButtonSmall
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.util.getRandomText

@Composable
fun ButtonSmallFilled(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    ButtonSmall(
        modifier = modifier,
        text = text,
        textStyle = DealiFont.b4sb12,
        textColor = DealiColor.primary04,
        backgroundColor = if (enabled) DealiColor.primary01 else DealiColor.g40,
        enabled = enabled,
        process = process,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonSmallFilled(
    text: String,
    backgroundBrush: Brush,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    ButtonSmall(
        modifier = modifier,
        text = text,
        textStyle = DealiFont.b4sb12,
        textColor = DealiColor.primary04,
        backgroundBrush = backgroundBrush,
        enabled = enabled,
        process = process,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonMediumFilled(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    ButtonMedium(
        modifier = modifier,
        text = text,
        textStyle = DealiFont.b2sb14,
        textColor = DealiColor.primary04,
        backgroundColor = if (enabled) DealiColor.primary01 else DealiColor.g40,
        enabled = enabled,
        process = process,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonMediumFilled(
    text: String,
    backgroundBrush: Brush,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    ButtonMedium(
        modifier = modifier,
        text = text,
        textStyle = DealiFont.b2sb14,
        textColor = DealiColor.primary04,
        backgroundBrush = backgroundBrush,
        enabled = enabled,
        process = process,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonLargeFilled(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    ButtonLarge(
        modifier = modifier,
        text = text,
        textStyle = DealiFont.b1sb15,
        textColor = DealiColor.primary04,
        backgroundColor = if (enabled) DealiColor.primary01 else DealiColor.g40,
        enabled = enabled,
        process = process,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonLargeFilled(
    text: String,
    backgroundBrush: Brush,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    ButtonLarge(
        modifier = modifier,
        text = text,
        textStyle = DealiFont.b1sb15,
        textColor = DealiColor.primary04,
        backgroundBrush = backgroundBrush,
        enabled = enabled,
        process = process,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonSmallOutlined(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    ButtonSmall(
        modifier = modifier,
        text = text,
        textStyle = DealiFont.b4sb12,
        textColor = if (enabled) DealiColor.primary01 else DealiColor.g40,
        backgroundColor = DealiColor.primary04,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, if (enabled) DealiColor.primary01 else DealiColor.g40),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonMediumOutlined(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    ButtonMedium(
        modifier = modifier,
        text = text,
        textStyle = DealiFont.b2sb14,
        textColor = if (enabled) DealiColor.primary01 else DealiColor.g40,
        backgroundColor = DealiColor.primary04,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, if (enabled) DealiColor.primary01 else DealiColor.g40),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonLargeOutlined(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    ButtonLarge(
        modifier = modifier,
        text = text,
        textStyle = DealiFont.b1sb15,
        textColor = if (enabled) DealiColor.primary01 else DealiColor.g40,
        backgroundColor = DealiColor.primary04,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, if (enabled) DealiColor.primary01 else DealiColor.g40),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonSmallTonalOutlined(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    ButtonSmall(
        modifier = modifier,
        text = text,
        textStyle = DealiFont.b4sb12,
        textColor = if (enabled) DealiColor.g80 else DealiColor.g40,
        backgroundColor = DealiColor.g10,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, DealiColor.g30),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonMediumTonalOutlined(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    ButtonMedium(
        modifier = modifier,
        text = text,
        textStyle = DealiFont.b2sb14,
        textColor = if (enabled) DealiColor.g80 else DealiColor.g40,
        backgroundColor = DealiColor.g10,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, DealiColor.g30),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonLargeTonalOutlined(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    ButtonLarge(
        modifier = modifier,
        text = text,
        textStyle = DealiFont.b1sb15,
        textColor = if (enabled) DealiColor.g80 else DealiColor.g40,
        backgroundColor = DealiColor.g10,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, DealiColor.g30),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonSmallText(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    ButtonSmall(
        modifier = modifier,
        text = text,
        textStyle = DealiFont.b4r12,
        textColor = if (enabled) DealiColor.g80 else DealiColor.g40,
        backgroundColor = DealiColor.transparent,
        enabled = enabled,
        process = process,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonMediumText(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    ButtonMedium(
        modifier = modifier,
        text = text,
        textStyle = DealiFont.b2r14,
        textColor = if (enabled) DealiColor.g80 else DealiColor.g40,
        backgroundColor = DealiColor.transparent,
        enabled = enabled,
        process = process,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonLargeText(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit,
) {
    ButtonLarge(
        modifier = modifier,
        text = text,
        textStyle = DealiFont.b1sb15,
        textColor = if (enabled) DealiColor.g80 else DealiColor.g40,
        backgroundColor = DealiColor.transparent,
        enabled = enabled,
        process = process,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonSmallFilledPreview() {
    Row(
        modifier = Modifier.padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonSmallFilled(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonSmallFilled(
            text = getRandomText(1),
            backgroundBrush = DealiColor.gradient,
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonSmallFilled(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonMediumFilledPreview() {
    Row(
        modifier = Modifier.padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonMediumFilled(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonMediumFilled(
            text = getRandomText(1),
            backgroundBrush = DealiColor.gradient,
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonMediumFilled(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonLargeFilledPreview() {
    Row(
        modifier = Modifier.padding(4.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        ButtonLargeFilled(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonLargeFilled(
            text = getRandomText(1),
            backgroundBrush = DealiColor.gradient,
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonLargeFilled(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonSmallOutlinedPreview() {
    Row(
        modifier = Modifier.padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonSmallOutlined(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonSmallOutlined(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonMediumOutlinedPreview() {
    Row(
        modifier = Modifier.padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonMediumOutlined(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonMediumOutlined(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonLargeOutlinedPreview() {
    Row(
        modifier = Modifier.padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonLargeOutlined(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonLargeOutlined(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonSmallTonalOutlinedPreview() {
    Row(
        modifier = Modifier.padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonSmallTonalOutlined(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonSmallTonalOutlined(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonMediumTonalOutlinedPreview() {
    Row(
        modifier = Modifier.padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonMediumTonalOutlined(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonMediumTonalOutlined(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonLargeTonalOutlinedPreview() {
    Row(
        modifier = Modifier.padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonLargeTonalOutlined(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonLargeTonalOutlined(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}


@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonSmallTextPreview() {
    Row(
        modifier = Modifier.padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonSmallText(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonSmallText(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonMediumTextPreview() {
    Row(
        modifier = Modifier.padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonMediumText(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonMediumText(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun ButtonLargeTextPreview() {
    Row(
        modifier = Modifier.padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonLargeText(
            text = getRandomText(1),
            enabled = true,
            process = false,
            onClick = {}
        )

        ButtonLargeText(
            text = getRandomText(1),
            enabled = false,
            process = false,
            onClick = {}
        )
    }
}
