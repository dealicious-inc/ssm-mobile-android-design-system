package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.textlink.CoreTextLink
import net.deali.designsystem.internal.textlink.TextLinkSize
import net.deali.designsystem.internal.textlink.TextLinkStyle
import net.deali.designsystem.theme.DealiColor

@Composable
fun textLinkLarge01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
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
        textLinkSize = TextLinkSize.Large,
        defaultColor = DealiColor.primary01,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLarge02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
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
        textLinkSize = TextLinkSize.Large,
        defaultColor = DealiColor.primary04,
        disabledColor = DealiColor.w50,
        onClick = onClick,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLarge03(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
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
        textLinkSize = TextLinkSize.Large,
        defaultColor = DealiColor.secondary01,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLarge04(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
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
        textLinkSize = TextLinkSize.Large,
        defaultColor = DealiColor.g100,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLarge05(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
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
        textLinkSize = TextLinkSize.Large,
        defaultColor = DealiColor.g80,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLarge06(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
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
        textLinkSize = TextLinkSize.Large,
        defaultColor = DealiColor.g70,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLarge07(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
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
        textLinkSize = TextLinkSize.Large,
        defaultColor = DealiColor.g60,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        interactionSource = interactionSource,
    )
}


@Composable
fun textLinkLineLarge01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
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
        textLinkSize = TextLinkSize.Large,
        defaultColor = DealiColor.primary01,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineLarge02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
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
        textLinkSize = TextLinkSize.Large,
        defaultColor = DealiColor.primary04,
        disabledColor = DealiColor.w50,
        onClick = onClick,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineLarge03(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
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
        textLinkSize = TextLinkSize.Large,
        defaultColor = DealiColor.secondary01,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineLarge04(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
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
        textLinkSize = TextLinkSize.Large,
        defaultColor = DealiColor.g100,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineLarge05(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
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
        textLinkSize = TextLinkSize.Large,
        defaultColor = DealiColor.g80,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineLarge06(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
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
        textLinkSize = TextLinkSize.Large,
        defaultColor = DealiColor.g70,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineLarge07(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
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
        textLinkSize = TextLinkSize.Large,
        defaultColor = DealiColor.g60,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        interactionSource = interactionSource,
    )
}

@Preview(showBackground = true, backgroundColor = 0x666666)
@Composable
private fun Preview() {
    val modifier = Modifier.padding(bottom = 8.dp)

    Column {
        textLinkLarge01(
            modifier = modifier,
            onClick = {},
            text = "Text Link Large 01",
        )

        textLinkLarge02(
            modifier = modifier,
            onClick = {},
            text = "Text Link Large 02",
        )

        textLinkLarge03(
            modifier = modifier,
            onClick = {},
            text = "Text Link Large 03",
        )

        textLinkLarge04(
            modifier = modifier,
            onClick = {},
            text = "Text Link Large 04",
        )

        textLinkLarge05(
            modifier = modifier,
            onClick = {},
            text = "Text Link Large 05",
        )

        textLinkLarge06(
            modifier = modifier,
            onClick = {},
            text = "Text Link Large 06",
        )

        textLinkLarge07(
            modifier = modifier,
            onClick = {},
            text = "Text Link Large 07",
        )

        textLinkLineLarge01(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Large 01",
        )

        textLinkLineLarge02(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Large 02",
        )

        textLinkLineLarge03(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Large 03",
        )

        textLinkLineLarge04(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Large 04",
        )

        textLinkLineLarge05(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Large 05",
        )

        textLinkLineLarge06(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Large 06",
        )

        textLinkLineLarge07(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Large 07",
        )
    }
}
