package net.deali.designsystem.internal.chips

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.IntrinsicMeasurable
import androidx.compose.ui.layout.IntrinsicMeasureScope
import androidx.compose.ui.layout.LayoutModifier
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.platform.InspectorInfo
import androidx.compose.ui.platform.InspectorValueInfo
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.theme.DealiColor
import kotlin.math.max
import kotlin.math.min

@Composable
internal fun CoreChips(
    onClick: () -> Unit,
    onRemoveClick: () -> Unit,
    text: String,
    textAlign: TextAlign?,
    @DrawableRes leftIcon: Int?,
    leftIconColor: Color?,
    @DrawableRes removeIcon: Int,
    useRemoveIcon: Boolean,
    clickable: Boolean,
    selected: Boolean,
    enabled: Boolean,
    chipsStyle: ChipsStyle,
    chipsSize: ChipsSize,
    chipsColors: ChipsColors,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val textStyle = ChipsDefaults.chipsTextStyle(chipsSize, chipsStyle, selected, enabled)
    val contentColor by chipsColors.contentColor(enabled)

    CoreChipsLayout(
        onClick = onClick,
        leftIcon = leftIcon,
        useRemoveIcon = useRemoveIcon,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipsStyle = chipsStyle,
        chipsSize = chipsSize,
        chipsColors = chipsColors,
        modifier = modifier,
        interactionSource = interactionSource,
    ) {
        NormalContent(
            onRemoveClick = onRemoveClick,
            text = text,
            textStyle = textStyle,
            textAlign = textAlign,
            leftIcon = leftIcon,
            leftIconColor = leftIconColor,
            removeIcon = removeIcon,
            useRemoveIcon = useRemoveIcon,
            enabled = enabled,
            contentColor = contentColor,
        )
    }
}

@Composable
internal fun CoreCustomChips(
    onClick: () -> Unit,
    onRemoveClick: () -> Unit,
    @DrawableRes removeIcon: Int,
    useRemoveIcon: Boolean,
    clickable: Boolean,
    selected: Boolean,
    enabled: Boolean,
    chipsStyle: ChipsStyle,
    chipsSize: ChipsSize,
    chipsColors: ChipsColors,
    spacingBetweenContentAndRemove: Dp,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    val contentColor by chipsColors.contentColor(enabled)

    CoreChipsLayout(
        onClick = onClick,
        leftIcon = null,
        useRemoveIcon = useRemoveIcon,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipsStyle = chipsStyle,
        chipsSize = chipsSize,
        chipsColors = chipsColors,
        modifier = modifier,
        interactionSource = interactionSource,
    ) {
        DepthContent(
            onRemoveClick = onRemoveClick,
            removeIcon = removeIcon,
            useRemoveIcon = useRemoveIcon,
            enabled = enabled,
            contentColor = contentColor,
            spacingBetweenContentAndRemove = spacingBetweenContentAndRemove,
            content = content,
        )
    }
}

@Composable
internal fun ChipsImage(
    imageUrl: String,
    enabled: Boolean,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .clip(shape = CircleShape)
            .border(width = 1.dp, color = DealiColor.b5, shape = CircleShape)
            .size(12.dp)
    ) {
        if (enabled) {
            AsyncImage(
                model = imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        } else {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = DealiColor.g40)
            )
        }
    }
}

@Composable
private fun CoreChipsLayout(
    onClick: () -> Unit,
    @DrawableRes leftIcon: Int?,
    useRemoveIcon: Boolean,
    clickable: Boolean,
    selected: Boolean,
    enabled: Boolean,
    chipsStyle: ChipsStyle,
    chipsSize: ChipsSize,
    chipsColors: ChipsColors,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    val chipsShape = ChipsDefaults.chipsShape(style = chipsStyle)
    val chipsMinSize = ChipsDefaults.chipsMinSize(size = chipsSize)
    val textStyle = ChipsDefaults.chipsTextStyle(chipsSize, chipsStyle, selected, enabled)
    val backgroundColor by chipsColors.backgroundColor(enabled, selected)
    val outlineColor by chipsColors.outlineColor(enabled, selected)

    Box(
        modifier = modifier
            .clip(shape = chipsShape)
            .outlineBorderOrNothing(
                enableBorder = true,
                color = outlineColor,
                shape = chipsShape
            )
            .defaultMinSize(
                minWidth = chipsMinSize,
                minHeight = chipsMinSize,
            )
            .width(IntrinsicSize.Min)
            .height(chipsMinSize)
            .background(color = backgroundColor)
            .then(
                if (clickable) {
                    Modifier
                        .clickable(
                            interactionSource = interactionSource,
                            indication = rememberRipple(),
                            enabled = enabled,
                            role = Role.Button,
                            onClick = onClick,
                        )
                } else {
                    Modifier
                }
            ),
        contentAlignment = Alignment.Center,
    ) {
        Row(
            modifier = Modifier
                .idealChipsWidth()
                .padding(
                    ChipsDefaults.chipsPaddings(
                        size = chipsSize,
                        style = chipsStyle,
                        useLeftIcon = leftIcon != null,
                        useRemoveIcon = useRemoveIcon,
                        fontWeight = textStyle.fontWeight,
                    )
                ),
            verticalAlignment = Alignment.CenterVertically,
            content = content,
        )
    }
}

@Composable
private fun RowScope.NormalContent(
    onRemoveClick: () -> Unit,
    text: String,
    textStyle: TextStyle,
    textAlign: TextAlign?,
    @DrawableRes leftIcon: Int?,
    leftIconColor: Color?,
    @DrawableRes removeIcon: Int,
    useRemoveIcon: Boolean,
    enabled: Boolean,
    contentColor: Color,
) {
    if (leftIcon != null) {
        Icon16(
            iconRes = leftIcon,
            color = when {
                leftIconColor == Color.Unspecified || enabled.not() -> contentColor
                leftIconColor == null -> Color.Unspecified
                else -> leftIconColor
            },
        )
        Spacer(modifier = Modifier.width(4.dp))
    }
    DealiText(
        modifier = Modifier.weight(weight = 1f),
        text = text,
        style = textStyle.copy(textAlign = textAlign),
        color = contentColor,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
    )
    if (useRemoveIcon) {
        Spacer(modifier = Modifier.width(4.dp))
        Icon16(
            onClick = onRemoveClick,
            enabled = enabled,
            iconRes = removeIcon,
            color = contentColor,
        )
    }
}

@Composable
private fun RowScope.DepthContent(
    onRemoveClick: () -> Unit,
    @DrawableRes removeIcon: Int,
    useRemoveIcon: Boolean,
    enabled: Boolean,
    contentColor: Color,
    spacingBetweenContentAndRemove: Dp,
    content: @Composable RowScope.() -> Unit,
) {
    Row(
        modifier = Modifier.weight(1f),
        verticalAlignment = Alignment.CenterVertically,
        content = content,
    )
    if (useRemoveIcon) {
        Spacer(modifier = Modifier.width(spacingBetweenContentAndRemove))
        Icon16(
            onClick = onRemoveClick,
            enabled = enabled,
            iconRes = removeIcon,
            color = contentColor,
        )
    }
}

@Stable
private fun Modifier.outlineBorderOrNothing(
    enableBorder: Boolean,
    color: Color,
    shape: Shape,
): Modifier {
    return if (enableBorder) {
        this.then(Modifier.border(width = 1.dp, color = color, shape = shape))
    } else {
        this
    }
}

/**
 * `Modifier.fillMaxWidth()`와 `Modifier.width(IntrinsicSize.Max)`를 사용 했을 때의 너비 중 가장 이상적인
 * 값을 너비로 적용시키는 Size Modifier.
 *
 * Chips는 width를 별도 지정하지 않은 경우 최소한의 크기를 가져야 하고, 너비를 지정 한 경우 양 옆의 아이콘은 최대한 끝에
 * 붙으면서 중심의 텍스트 영역은 남은 공간을 전부 차지해야 한다.
 *
 * 최소한의 크기를 가지려면 상위 레이아웃에 `IntrinsicSize.Min`을 주고, 하위 content에 `IntrinsicSize.Max`를 주어야 한다.
 * 하지만 너비를 직접 주어 필요한 영역보다 넓어진 경우 text 영역을 늘이기 위해서는 상위 레이아웃에 `IntrinsicSize.Min`을 주고,
 * 하위 content에 `fillMaxWidth`를 주어야 한다.
 * 기본 Modifier로는 두 경우 모두를 만족하는 것이 불가능하기 때문에 커스텀 Modifier로 개발함.
 */
@Stable
private fun Modifier.idealChipsWidth(): Modifier {
    return this.then(
        MaxOfParentWidthAndIntrinsicWidthModifier(
            inspectorInfo = {
                name = "idealChipsWidth"
            }
        )
    )
}

private class MaxOfParentWidthAndIntrinsicWidthModifier(
    inspectorInfo: InspectorInfo.() -> Unit
) : LayoutModifier, InspectorValueInfo(inspectorInfo) {

    override fun MeasureScope.measure(
        measurable: Measurable,
        constraints: Constraints
    ): MeasureResult {
        val constraintsWhenFillParent = calculateFillParentContentConstraints(constraints)
        val constraintsWhenIntrinsic = calculateIntrinsicContentConstraints(measurable, constraints)
        // `Modifier.fillMaxWidth()`와 `Modifier.width(IntrinsicSize.Max)`의 너비 중 더 넓은 값 사용.
        // content는 허용 되는 한 최대한 공간을 차지해야 내부 text가 충분히 늘어날 수 있기 때문.
        val contentConstraints = maxOf(constraintsWhenFillParent, constraintsWhenIntrinsic)
        // 하지만 Chips의 껍데기를 넘어가서는 안되기 때문에 제한.
        val finalConstraints = minOf(contentConstraints, constraints)

        val placeable = measurable.measure(finalConstraints)
        return layout(placeable.width, placeable.height) {
            placeable.placeRelative(0, 0)
        }
    }

    /**
     * 부모 Composable 내에서 가능 한 최대 width를 계산.
     * `Modifier.fillMaxWidth()`를 사용 했을 때 계산되는 너비와 같음.
     */
    private fun calculateFillParentContentConstraints(constraints: Constraints): Constraints {
        val minWidth: Int
        val maxWidth: Int
        if (constraints.hasBoundedWidth) {
            val width = constraints.maxWidth.coerceIn(constraints.minWidth, constraints.maxWidth)
            minWidth = width
            maxWidth = width
        } else {
            minWidth = constraints.minWidth
            maxWidth = constraints.maxWidth
        }
        return Constraints(minWidth, maxWidth)
    }

    /**
     * 부모 Composable 내에서 자식 Composable이 가질 수 있는 최대 width를 계산.
     * `Modifier.width(IntrinsicSize.Max)`를 사용 했을 때 계산되는 너비와 같음.
     */
    private fun calculateIntrinsicContentConstraints(
        measurable: IntrinsicMeasurable,
        constraints: Constraints
    ): Constraints {
        val width = measurable.maxIntrinsicWidth(constraints.maxHeight)
        return Constraints.fixedWidth(width)
    }

    override fun IntrinsicMeasureScope.minIntrinsicWidth(
        measurable: IntrinsicMeasurable,
        height: Int
    ) = measurable.maxIntrinsicWidth(height)

    private fun minOf(constraints1: Constraints, constraints2: Constraints): Constraints {
        return Constraints(
            minWidth = min(constraints1.minWidth, constraints2.minWidth),
            maxWidth = min(constraints1.maxWidth, constraints2.maxWidth),
            minHeight = min(constraints1.minHeight, constraints2.minHeight),
            maxHeight = min(constraints1.maxHeight, constraints2.maxHeight),
        )
    }

    private fun maxOf(constraints1: Constraints, constraints2: Constraints): Constraints {
        return Constraints(
            minWidth = max(constraints1.minWidth, constraints2.minWidth),
            maxWidth = max(constraints1.maxWidth, constraints2.maxWidth),
            minHeight = max(constraints1.minHeight, constraints2.minHeight),
            maxHeight = max(constraints1.maxHeight, constraints2.maxHeight),
        )
    }
}
