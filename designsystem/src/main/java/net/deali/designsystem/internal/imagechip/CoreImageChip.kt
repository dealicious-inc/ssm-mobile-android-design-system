package net.deali.designsystem.internal.imagechip

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.Indication
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil3.compose.SubcomposeAsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.HorizontalSpacer
import net.deali.designsystem.component.Icon
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.util.click.singleClickable
import kotlin.math.max
import kotlin.math.min

@Composable
internal fun CoreRegularImageChip(
    imageUrl: String,
    @DrawableRes placeholder: Int,
    text: String,
    textAlign: TextAlign?,
    subContent: @Composable (() -> Unit)?,
    @DrawableRes rightIcon: Int?,
    rightIconColor: Color?,
    clickable: Boolean,
    selected: Boolean,
    enabled: Boolean,
    imageChipSize: ImageChipSize,
    interactionSource: MutableInteractionSource,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    onRightIconClick: (() -> Unit)?,
) {
    val textStyle = ImageChipDefaults.chipTextStyle(imageChipSize, selected, enabled)
    val imageChipSizes = ImageChipDefaults.sizes(imageChipSize)
    val imageChipPaddings = ImageChipDefaults.chipPaddings()
    val imageChipColors = ImageChipDefaults.colors()

    val textColor by imageChipColors.textColor(enabled = enabled, selected = selected)
    val imageSize by imageChipSizes.imageSize()
    val placeholderSize by imageChipSizes.placeholderSize()

    CoreImageChipLayout(
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        imageChipSizes = imageChipSizes,
        imageChipPaddings = imageChipPaddings,
        imageChipColors = imageChipColors,
        interactionSource = interactionSource,
        modifier = modifier,
        onClick = onClick,
    ) {
        ChipImage(
            imageUrl = imageUrl,
            imageSize = imageSize,
            placeholder = placeholder,
            placeholderSize = placeholderSize,
            enabled = enabled,
        )

        HorizontalSpacer(width = 8.dp)

        DealiText(
            modifier = Modifier.weight(weight = 1f),
            text = text,
            style = if (textAlign == null) textStyle else textStyle.copy(textAlign = textAlign),
            color = textColor,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )

        if (subContent != null) {
            HorizontalSpacer(width = 4.dp)

            subContent()
        }

        if (rightIcon != null) {
            HorizontalSpacer(width = 4.dp)

            val useIconDefaultColor = rightIconColor == null
            val useCustomIconColor = rightIconColor != Color.Unspecified
            if (onRightIconClick == null) {
                Icon(
                    iconRes = rightIcon,
                    size = 16.dp,
                    color = when {
                        useIconDefaultColor -> Color.Unspecified
                        useCustomIconColor -> rightIconColor!!
                        else -> textColor
                    }
                )
            } else {
                Icon(
                    iconRes = rightIcon,
                    size = 16.dp,
                    onClick = onRightIconClick,
                    color = when {
                        useIconDefaultColor -> Color.Unspecified
                        useCustomIconColor -> rightIconColor!!
                        else -> textColor
                    },
                    enabled = enabled,
                )
            }
        }
    }
}

@Composable
private fun CoreImageChipLayout(
    clickable: Boolean,
    selected: Boolean,
    enabled: Boolean,
    imageChipSizes: ImageChipSizes,
    imageChipPaddings: ImageChipPaddings,
    imageChipColors: ImageChipColors,
    interactionSource: MutableInteractionSource,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit,
) {
    val chipMinSize by imageChipSizes.chipMinSize()
    val chipPaddings by imageChipPaddings.backgroundPadding()
    val backgroundColor by imageChipColors.backgroundColor(enabled, selected)

    Box(
        modifier = modifier
            .clip(shape = RoundedCornerShape(40.dp))
            .defaultMinSize(
                minWidth = chipMinSize,
                minHeight = chipMinSize,
            )
            .width(IntrinsicSize.Min)
            .background(color = backgroundColor)
            .clickableOrNothing(
                clickable = clickable,
                interactionSource = interactionSource,
                indication = ripple(),
                enabled = enabled,
                role = Role.Button,
                onClick = onClick,
            ),
        contentAlignment = Alignment.Center,
    ) {
        Row(
            modifier = Modifier
                .idealChipsWidth()
                .padding(chipPaddings),
            verticalAlignment = Alignment.CenterVertically,
            content = content,
        )
    }
}

@Composable
internal fun ChipImage(
    imageUrl: String,
    imageSize: Dp,
    @DrawableRes placeholder: Int,
    placeholderSize: Dp,
    enabled: Boolean,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .clip(shape = CircleShape)
            .background(color = DealiColor.primary04)
            .border(width = 0.5.dp, color = DealiColor.b5, shape = CircleShape)
            .size(imageSize),
        contentAlignment = Alignment.Center
    ) {
        SubcomposeAsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(imageUrl)
                .crossfade(true)
                .build(),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            loading = {
                PlaceholderImage(
                    size = placeholderSize,
                    placeholder = placeholder,
                )
            },
            error = {
                PlaceholderImage(
                    size = placeholderSize,
                    placeholder = placeholder,
                )
            }
        )

        if (!enabled) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = CircleShape)
                    .background(DealiColor.w40)
            )
        }
    }
}

@Composable
private fun PlaceholderImage(
    size: Dp,
    @DrawableRes placeholder: Int,
    modifier: Modifier = Modifier,
) {
    Image(
        modifier = modifier
            .size(size),
        painter = painterResource(placeholder),
        contentScale = ContentScale.Crop,
        contentDescription = null,
        colorFilter = ColorFilter.tint(DealiColor.g30)
    )
}

/**
 * 클릭을 사용하는 경우 [clickable] Modifier를 적용하고 사용하지 않는 경우 아무 것도 적용하지 않아
 * 클릭 이벤트를 잡지 않도록 만드는 편의성 Modifier.
 */
@Composable
@Stable
private fun Modifier.clickableOrNothing(
    clickable: Boolean,
    interactionSource: MutableInteractionSource,
    indication: Indication?,
    enabled: Boolean = true,
    role: Role? = null,
    onClick: () -> Unit
): Modifier {
    return if (clickable) {
        this.then(
            Modifier
                .singleClickable(
                    interactionSource = interactionSource,
                    indication = indication,
                    enabled = enabled,
                    role = role,
                    onClick = onClick
                )
        )
    } else {
        this
    }
}

/**
 * 테두리를 사용하는 경우 테두리 Modifier를 적용하고 사용하지 않는 경우 아무 것도 적용하지 않는 Modifier.
 */
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
