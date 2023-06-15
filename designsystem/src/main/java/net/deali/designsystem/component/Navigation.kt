package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import net.deali.designsystem.theme.AppTheme

@Composable
fun NavigationBar(
    modifier: Modifier = Modifier,
    title: String = "",
    backgroundColor: Color = AppTheme.colors.primary04,
    actions: @Composable RowScope.() -> Unit = {},
    navigationIcon: @Composable BoxScope.() -> Unit = {},
) {
    ConstraintLayout(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(backgroundColor)
    ) {
        val (navigationRef, titleRef, actionRef) = createRefs()

        Box(
            modifier = Modifier
                .constrainAs(navigationRef) {
                    centerVerticallyTo(parent)
                    start.linkTo(parent.start, 16.dp)
                },
            content = navigationIcon
        )

        DealiText(
            modifier = Modifier
                .constrainAs(titleRef) {
                    centerVerticallyTo(parent)
                    start.linkTo(navigationRef.end, 8.dp)
                    end.linkTo(actionRef.start, 20.dp)
                    width = Dimension.fillToConstraints
                },
            text = title,
            style = AppTheme.typography.sh3b16,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
            color = AppTheme.colors.text01
        )

        Row(
            modifier = Modifier
                .constrainAs(actionRef) {
                    centerVerticallyTo(parent)
                    end.linkTo(parent.end, 20.dp)
                },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.End),
            content = actions
        )
    }
}
