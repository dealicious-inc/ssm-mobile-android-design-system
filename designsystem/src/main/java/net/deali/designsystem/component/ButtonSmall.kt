package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import net.deali.designsystem.internal.button.ButtonDefaults
import net.deali.designsystem.internal.button.ButtonSize
import net.deali.designsystem.internal.button.ButtonStyle
import net.deali.designsystem.internal.button.CoreButton
import net.deali.designsystem.theme.DealiColor

@Composable
fun btnFilledSmallGradient(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Filled,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.gradient,
            disabledBackgroundColor = SolidColor(DealiColor.g40),
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.primary04,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnFilledSmallPrimary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Filled,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.primary01,
            disabledBackgroundColor = DealiColor.g40,
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.primary04,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnFilledSmallPrimary02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Filled,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.b40.copy(alpha = 0.4f),
            disabledBackgroundColor = DealiColor.b20.copy(alpha = 0.2f),
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.w50.copy(alpha = 0.5f),
        ),
        modifier = modifier,
    )
}

@Composable
fun btnRoundFilledSmallGradient(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Filled,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.gradient,
            disabledBackgroundColor = SolidColor(DealiColor.g40),
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.primary04,
        ),
        isRoundShape = true,
        modifier = modifier,
    )
}

@Composable
fun btnRoundFilledSmallPrimary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Filled,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.primary01,
            disabledBackgroundColor = DealiColor.g40,
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.primary04,
        ),
        isRoundShape = true,
        modifier = modifier,
    )
}

@Composable
fun btnRoundFilledSmallPrimary02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Filled,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.b40,
            disabledBackgroundColor = DealiColor.b20,
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.w50,
        ),
        isRoundShape = true,
        modifier = modifier,
    )
}

@Composable
fun btnFilledTonalSmallPrimary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.primary03,
            disabledBackgroundColor = DealiColor.g20,
            contentColor = DealiColor.primary01,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnFilledTonalSmallPrimary02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.w20,
            disabledBackgroundColor = DealiColor.w20,
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.w50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnFilledTonalSmallSecondary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.g10,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnFilledTonalSmallSecondary02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.g10,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.g80,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnFilledTonalSmallSecondary03(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.g10,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.g70,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnRoundFilledTonalSmallPrimary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.primary03,
            disabledBackgroundColor = DealiColor.g20,
            contentColor = DealiColor.primary01,
            disabledContentColor = DealiColor.g50,
        ),
        isRoundShape = true,
        modifier = modifier,
    )
}

@Composable
fun btnRoundFilledTonalSmallPrimary02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.w20,
            disabledBackgroundColor = DealiColor.w20,
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.w50,
        ),
        isRoundShape = true,
        modifier = modifier,
    )
}

@Composable
fun btnRoundFilledTonalSmallSecondary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.g10,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
        ),
        isRoundShape = true,
        modifier = modifier,
    )
}

@Composable
fun btnRoundFilledTonalSmallSecondary02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.g10,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.g80,
            disabledContentColor = DealiColor.g50,
        ),
        isRoundShape = true,
        modifier = modifier,
    )
}

@Composable
fun btnRoundFilledTonalSmallSecondary03(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.g10,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.g70,
            disabledContentColor = DealiColor.g50,
        ),
        isRoundShape = true,
        modifier = modifier,
    )
}

@Composable
fun btnOutlineSmallPrimary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.primary01,
            disabledOutlineColor = DealiColor.g30,
            contentColor = DealiColor.primary01,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnOutlineSmallPrimary02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.primary04,
            disabledOutlineColor = DealiColor.w50,
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.w50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnOutlineSmallSecondary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.secondary01,
            disabledOutlineColor = DealiColor.g30,
            contentColor = DealiColor.secondary01,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnOutlineSmallSecondary02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.g100,
            disabledOutlineColor = DealiColor.g30,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnOutlineSmallSecondary03(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.g30,
            disabledOutlineColor = DealiColor.g20,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnOutlineSmallSecondary04(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.g30,
            disabledOutlineColor = DealiColor.g20,
            contentColor = DealiColor.g80,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnRoundOutlineSmallPrimary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.primary01,
            disabledOutlineColor = DealiColor.g30,
            contentColor = DealiColor.primary01,
            disabledContentColor = DealiColor.g50,
        ),
        isRoundShape = true,
        modifier = modifier,
    )
}

@Composable
fun btnRoundOutlineSmallPrimary02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.primary04,
            disabledOutlineColor = DealiColor.w50,
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.w50,
        ),
        isRoundShape = true,
        modifier = modifier,
    )
}

@Composable
fun btnRoundOutlineSmallSecondary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.secondary01,
            disabledOutlineColor = DealiColor.g30,
            contentColor = DealiColor.secondary01,
            disabledContentColor = DealiColor.g50,
        ),
        isRoundShape = true,
        modifier = modifier,
    )
}

@Composable
fun btnRoundOutlineSmallSecondary02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.g100,
            disabledOutlineColor = DealiColor.g30,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
        ),
        isRoundShape = true,
        modifier = modifier,
    )
}

@Composable
fun btnRoundOutlineSmallSecondary03(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.g30,
            disabledOutlineColor = DealiColor.g20,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
        ),
        isRoundShape = true,
        modifier = modifier,
    )
}

@Composable
fun btnRoundOutlineSmallSecondary04(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.g20,
            disabledOutlineColor = DealiColor.g20,
            contentColor = DealiColor.g80,
            disabledContentColor = DealiColor.g50,
        ),
        isRoundShape = true,
        modifier = modifier,
    )
}

@Composable
fun btnTextSmallPrimary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Text,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            contentColor = DealiColor.primary01,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnTextSmallPrimary02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Text,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.w50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnTextSmallSecondary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Text,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            contentColor = DealiColor.secondary01,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnTextSmallSecondary02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Text,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnTextSmallSecondary03(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Text,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            contentColor = DealiColor.g80,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnTextSmallSecondary04(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Text,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            contentColor = DealiColor.g70,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
    )
}

@Composable
fun btnTextSmallSecondary05(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    CoreButton(
        onClick = onClick,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Text,
        buttonSize = ButtonSize.Small,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            contentColor = DealiColor.g60,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
    )
}
