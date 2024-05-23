package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import net.deali.designsystem.R
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.theme.DealiShape

@OptIn(ExperimentalTextApi::class)
@Composable
fun Dropdown(
    value: String,
    modifier: Modifier = Modifier,
    label: String? = null,
    isNecessary: Boolean = false,
    @DrawableRes icon: Int? = null,
    iconColor: Color = Color.Unspecified,
    isOpen: Boolean = false,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
    isDisabled: Boolean = false,
    onClick: () -> Unit,
) {
    val isLabelVisible = !label.isNullOrEmpty() || isNecessary

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        AnimatedVisibility(
            visible = isLabelVisible,
            enter = expandVertically(expandFrom = Alignment.Top),
            exit = shrinkVertically(shrinkTowards = Alignment.Top)
        ) {
            ConstraintLayout(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                val (labelRef, labelContentRef) = createRefs()
                createHorizontalChain(labelRef, labelContentRef, chainStyle = ChainStyle.Packed(0f))

                DealiText(
                    modifier = Modifier
                        .constrainAs(labelRef) {
                            start.linkTo(parent.start)
                            end.linkTo(labelContentRef.start)
                            width = Dimension.preferredWrapContent
                            centerVerticallyTo(parent)
                        },
                    text = label ?: "",
                    style = DealiFont.b2r14,
                    color = DealiColor.g100,
                )

                val textMeasurer = rememberTextMeasurer()
                val oneLineTextHeight = with(LocalDensity.current) {
                    textMeasurer.measure(
                        text = "A",
                        style = DealiFont.b2r14
                    ).size.height.toDp()
                }

                Row(
                    modifier = Modifier
                        .constrainAs(labelContentRef) {
                            start.linkTo(labelRef.end)
                            end.linkTo(parent.end)
                            top.linkTo(parent.top)
                        }
                        .height(oneLineTextHeight)
                        .padding(horizontal = 4.dp),
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (isNecessary) {
                        Canvas(
                            modifier = Modifier
                                .size(5.dp)
                                .align(Alignment.Top)
                                .offset(y = 4.dp)
                        ) {
                            drawCircle(color = DealiColor.primary01)
                        }
                    }
                }
            }
        }

        InnerText(
            modifier = Modifier,
            value = value,
            icon = icon,
            iconColor = iconColor,
            isOpen = isOpen,
            isDisabled = isDisabled,
            onClick = onClick,
        )

        AnimatedVisibility(
            visible = isHelperTextVisible,
            enter = expandVertically(expandFrom = Alignment.Top),
            exit = shrinkVertically(shrinkTowards = Alignment.Top)
        ) {
            DealiText(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp),
                text = helperText ?: "",
                style = DealiFont.b2r14,
                color = DealiColor.g70,
            )
        }
    }
}

@Composable
private fun InnerText(
    value: String,
    @DrawableRes icon: Int?,
    isOpen: Boolean,
    isDisabled: Boolean,
    modifier: Modifier = Modifier,
    iconColor: Color = Color.Unspecified,
    onClick: () -> Unit,
) {
    val contentColor = if (isDisabled) DealiColor.g70 else DealiColor.g100
    val backgroundColor = if (isDisabled) DealiColor.g10 else DealiColor.primary04

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(46.dp)
            .clip(DealiShape.radius6)
            .border(
                width = 1.dp,
                color = DealiColor.g20,
                shape = DealiShape.radius6
            )
            .background(backgroundColor)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(),
                enabled = !isDisabled,
                role = Role.Button,
                onClick = onClick
            )
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (icon != null) {
            Icon16(
                iconRes = icon,
                color = iconColor
            )

            HorizontalSpacer(width = 4.dp)
        }

        DealiText(
            modifier = Modifier
                .weight(1f),
            text = value,
            style = DealiFont.b2r14,
            color = contentColor
        )

        HorizontalSpacer(width = 16.dp)

        Icon24(
            iconRes = if (isOpen) R.drawable.ic_arrow_right else R.drawable.ic_arrow_open,
            color = contentColor
        )
    }
}

@Composable
@Preview
private fun Preview() {
    Dropdown(
        value = "value",
        label = "label",
        isNecessary = true,
        icon = R.drawable.ic_alarm,
        isOpen = true,
        helperText = "helper Text",
        isDisabled = false,
        onClick = {}
    )
}