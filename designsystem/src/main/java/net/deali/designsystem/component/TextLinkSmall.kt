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
fun textLinkSmall01(
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
        textLinkSize = TextLinkSize.Small,
        defaultColor = DealiColor.primary01,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkSmall02(
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
        textLinkSize = TextLinkSize.Small,
        defaultColor = DealiColor.primary04,
        disabledColor = DealiColor.w50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkSmall03(
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
        textLinkSize = TextLinkSize.Small,
        defaultColor = DealiColor.secondary01,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkSmall04(
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
        textLinkSize = TextLinkSize.Small,
        defaultColor = DealiColor.g100,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkSmall05(
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
        textLinkSize = TextLinkSize.Small,
        defaultColor = DealiColor.g80,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkSmall06(
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
        textLinkSize = TextLinkSize.Small,
        defaultColor = DealiColor.g70,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkSmall07(
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
        textLinkSize = TextLinkSize.Small,
        defaultColor = DealiColor.g60,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}


@Composable
fun textLinkLineSmall01(
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
        textLinkSize = TextLinkSize.Small,
        defaultColor = DealiColor.primary01,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineSmall02(
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
        textLinkSize = TextLinkSize.Small,
        defaultColor = DealiColor.primary04,
        disabledColor = DealiColor.w50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineSmall03(
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
        textLinkSize = TextLinkSize.Small,
        defaultColor = DealiColor.secondary01,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineSmall04(
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
        textLinkSize = TextLinkSize.Small,
        defaultColor = DealiColor.g100,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineSmall05(
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
        textLinkSize = TextLinkSize.Small,
        defaultColor = DealiColor.g80,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineSmall06(
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
        textLinkSize = TextLinkSize.Small,
        defaultColor = DealiColor.g70,
        disabledColor = DealiColor.g50,
        onClick = onClick,
        contentAlignment = contentAlignment,
        interactionSource = interactionSource,
    )
}

@Composable
fun textLinkLineSmall07(
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
        textLinkSize = TextLinkSize.Small,
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
        textLinkSmall01(
            modifier = modifier,
            onClick = {},
            text = "Text Link Small 01",
        )

        textLinkSmall02(
            modifier = modifier,
            onClick = {},
            text = "Text Link Small 02",
        )

        textLinkSmall03(
            modifier = modifier,
            onClick = {},
            text = "Text Link Small 03",
        )

        textLinkSmall04(
            modifier = modifier,
            onClick = {},
            text = "Text Link Small 04",
        )

        textLinkSmall05(
            modifier = modifier,
            onClick = {},
            text = "Text Link Small 05",
        )

        textLinkSmall06(
            modifier = modifier,
            onClick = {},
            text = "Text Link Small 06",
        )

        textLinkSmall07(
            modifier = modifier,
            onClick = {},
            text = "Text Link Small 07",
        )

        textLinkLineSmall01(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Small 01",
        )

        textLinkLineSmall02(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Small 02",
        )

        textLinkLineSmall03(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Small 03",
        )

        textLinkLineSmall04(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Small 04",
        )

        textLinkLineSmall05(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Small 05",
        )

        textLinkLineSmall06(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Small 06",
        )

        textLinkLineSmall07(
            modifier = modifier,
            onClick = {},
            text = "Text Link Line Small 07",
        )
    }
}
