package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.button.ButtonLarge
import net.deali.designsystem.internal.button.ButtonMedium
import net.deali.designsystem.internal.button.ButtonSmall
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.gray30
import net.deali.designsystem.theme.gray50
import net.deali.designsystem.theme.gray80
import net.deali.designsystem.theme.white100
import net.deali.designsystem.util.getRandomText

@Composable
fun ButtonSmallFilled(
    text: String,
    enabled: Boolean,
    modifier: Modifier = Modifier,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit
) {
    ButtonSmall(
        modifier = modifier,
        text = text,
        textColor = white100,
        backgroundColor = if (enabled) AppTheme.colors.primary01 else gray50,
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
    enabled: Boolean,
    modifier: Modifier = Modifier,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit
) {
    ButtonMedium(
        modifier = modifier,
        text = text,
        textColor = white100,
        backgroundColor = if (enabled) AppTheme.colors.primary01 else gray50,
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
    enabled: Boolean,
    modifier: Modifier = Modifier,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit
) {
    ButtonLarge(
        modifier = modifier,
        text = text,
        textColor = white100,
        backgroundColor = if (enabled) AppTheme.colors.primary01 else gray50,
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
    enabled: Boolean,
    modifier: Modifier = Modifier,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit
) {
    ButtonSmall(
        modifier = modifier,
        text = text,
        textColor = if (enabled) AppTheme.colors.primary01 else gray50,
        backgroundColor = white100,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, if (enabled) AppTheme.colors.primary01 else gray50),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonMediumOutlined(
    text: String,
    enabled: Boolean,
    modifier: Modifier = Modifier,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit
) {
    ButtonMedium(
        modifier = modifier,
        text = text,
        textColor = if (enabled) AppTheme.colors.primary01 else gray50,
        backgroundColor = white100,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, if (enabled) AppTheme.colors.primary01 else gray50),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonLargeOutlined(
    text: String,
    enabled: Boolean,
    modifier: Modifier = Modifier,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit
) {
    ButtonLarge(
        modifier = modifier,
        text = text,
        textColor = if (enabled) AppTheme.colors.primary01 else gray50,
        backgroundColor = white100,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, if (enabled) AppTheme.colors.primary01 else gray50),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonSmallTonalOutlined(
    text: String,
    enabled: Boolean,
    modifier: Modifier = Modifier,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit
) {
    ButtonSmall(
        modifier = modifier,
        text = text,
        textColor = if (enabled) gray80 else gray50,
        backgroundColor = AppTheme.colors.bg07,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, gray30),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonMediumTonalOutlined(
    text: String,
    enabled: Boolean,
    modifier: Modifier = Modifier,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit
) {
    ButtonMedium(
        modifier = modifier,
        text = text,
        textColor = if (enabled) gray80 else gray50,
        backgroundColor = AppTheme.colors.bg07,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, gray30),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonLargeTonalOutlined(
    text: String,
    enabled: Boolean,
    modifier: Modifier = Modifier,
    process: Boolean = false,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit
) {
    ButtonLarge(
        modifier = modifier,
        text = text,
        textColor = if (enabled) gray80 else gray50,
        backgroundColor = AppTheme.colors.bg07,
        enabled = enabled,
        process = process,
        border = BorderStroke(1.dp, gray30),
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        processIcon = processIcon,
        onClick = onClick
    )
}

@Composable
fun ButtonSmallText(
    text: String,
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit
) {
    ButtonSmall(
        modifier = modifier,
        text = text,
        textColor = if (enabled) gray80 else gray50,
        backgroundColor = white100,
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
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit
) {
    ButtonMedium(
        modifier = modifier,
        text = text,
        textColor = if (enabled) gray80 else gray50,
        backgroundColor = white100,
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
    enabled: Boolean,
    process: Boolean,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    @DrawableRes processIcon: Int? = null,
    onClick: () -> Unit
) {
    ButtonLarge(
        modifier = modifier,
        text = text,
        textColor = if (enabled) gray80 else gray50,
        backgroundColor = white100,
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
        modifier = Modifier
            .padding(10.dp),
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
        modifier = Modifier
            .padding(10.dp),
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
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ButtonLargeFilled(
            text = getRandomText(1),
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
        modifier = Modifier
            .padding(10.dp),
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
        modifier = Modifier
            .padding(10.dp),
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
        modifier = Modifier
            .padding(10.dp),
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
        modifier = Modifier
            .padding(10.dp),
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
        modifier = Modifier
            .padding(10.dp),
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
        modifier = Modifier
            .padding(10.dp),
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
        modifier = Modifier
            .padding(10.dp),
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
        modifier = Modifier
            .padding(10.dp),
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
        modifier = Modifier
            .padding(10.dp),
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
