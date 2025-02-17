package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.textlink.CoreTextLink
import net.deali.designsystem.internal.textlink.TextLinkSize
import net.deali.designsystem.internal.textlink.TextLinkStyle
import net.deali.designsystem.theme.DealiColor

@Composable
fun textLinkMedium01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    contentAlignment: Alignment = Alignment.Center,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreTextLink(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        textLinkStyle = TextLinkStyle.Default,
        textLinkSize = TextLinkSize.Medium,
        defaultColor = DealiColor.primary01,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkMedium02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    contentAlignment: Alignment = Alignment.Center,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreTextLink(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        textLinkStyle = TextLinkStyle.Default,
        textLinkSize = TextLinkSize.Medium,
        defaultColor = DealiColor.primary04,
        disabledColor = DealiColor.w50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkMedium03(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    contentAlignment: Alignment = Alignment.Center,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreTextLink(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        textLinkStyle = TextLinkStyle.Default,
        textLinkSize = TextLinkSize.Medium,
        defaultColor = DealiColor.secondary01,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkMedium04(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    contentAlignment: Alignment = Alignment.Center,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreTextLink(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        textLinkStyle = TextLinkStyle.Default,
        textLinkSize = TextLinkSize.Medium,
        defaultColor = DealiColor.g100,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkMedium05(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    contentAlignment: Alignment = Alignment.Center,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreTextLink(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        textLinkStyle = TextLinkStyle.Default,
        textLinkSize = TextLinkSize.Medium,
        defaultColor = DealiColor.g80,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkMedium06(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    contentAlignment: Alignment = Alignment.Center,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreTextLink(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        textLinkStyle = TextLinkStyle.Default,
        textLinkSize = TextLinkSize.Medium,
        defaultColor = DealiColor.g70,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkMedium07(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    contentAlignment: Alignment = Alignment.Center,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreTextLink(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        textLinkStyle = TextLinkStyle.Default,
        textLinkSize = TextLinkSize.Medium,
        defaultColor = DealiColor.g60,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}


@Composable
fun textLinkLineMedium01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    contentAlignment: Alignment = Alignment.Center,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreTextLink(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        textLinkStyle = TextLinkStyle.Line,
        textLinkSize = TextLinkSize.Medium,
        defaultColor = DealiColor.primary01,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineMedium02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    contentAlignment: Alignment = Alignment.Center,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreTextLink(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        textLinkStyle = TextLinkStyle.Line,
        textLinkSize = TextLinkSize.Medium,
        defaultColor = DealiColor.primary04,
        disabledColor = DealiColor.w50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineMedium03(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    contentAlignment: Alignment = Alignment.Center,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreTextLink(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        textLinkStyle = TextLinkStyle.Line,
        textLinkSize = TextLinkSize.Medium,
        defaultColor = DealiColor.secondary01,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineMedium04(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    contentAlignment: Alignment = Alignment.Center,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreTextLink(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        textLinkStyle = TextLinkStyle.Line,
        textLinkSize = TextLinkSize.Medium,
        defaultColor = DealiColor.g100,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineMedium05(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    contentAlignment: Alignment = Alignment.Center,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreTextLink(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        textLinkStyle = TextLinkStyle.Line,
        textLinkSize = TextLinkSize.Medium,
        defaultColor = DealiColor.g80,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineMedium06(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    contentAlignment: Alignment = Alignment.Center,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreTextLink(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        textLinkStyle = TextLinkStyle.Line,
        textLinkSize = TextLinkSize.Medium,
        defaultColor = DealiColor.g70,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineMedium07(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    contentAlignment: Alignment = Alignment.Center,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreTextLink(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        textLinkStyle = TextLinkStyle.Line,
        textLinkSize = TextLinkSize.Medium,
        defaultColor = DealiColor.g60,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Preview(showBackground = true, backgroundColor = 0x666666)
@Composable
private fun Preview() {
    val modifier = Modifier.padding(bottom = 8.dp)

    Column {
        textLinkMedium01(
            modifier = modifier,
            onClick = {},
            text = "Text Link Medium 01",
        )

        textLinkMedium02(
            modifier = modifier,
            onClick = {},
            text = "Text Link Medium 02",
        )

        textLinkMedium03(
            modifier = modifier,
            onClick = {},
            text = "Text Link Medium 03",
        )

        textLinkMedium04(
            modifier = modifier,
            onClick = {},
            text = "Text Link Medium 04",
        )

        textLinkMedium05(
            modifier = modifier,
            onClick = {},
            text = "Text Link Medium 05",
        )

        textLinkMedium06(
            modifier = modifier,
            onClick = {},
            text = "Text Link Medium 06",
        )

        textLinkMedium07(
            modifier = modifier,
            onClick = {},
            text = "Text Link Medium 07",
        )

        textLinkLineMedium01(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Medium 01",
        )

        textLinkLineMedium02(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Medium 02",
        )

        textLinkLineMedium03(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Medium 03",
        )

        textLinkLineMedium04(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Medium 04",
        )

        textLinkLineMedium05(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Medium 05",
        )

        textLinkLineMedium06(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Medium 06",
        )

        textLinkLineMedium07(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Medium 07",
        )
    }
}
