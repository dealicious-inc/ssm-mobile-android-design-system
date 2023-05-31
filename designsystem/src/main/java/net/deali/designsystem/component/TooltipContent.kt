package net.deali.designsystem.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.deali.designsystem.theme.black100
import net.deali.designsystem.theme.blue70
import net.deali.appresource.R
import net.deali.designsystem.theme.white100

@Composable
fun TooltipContent(
    modifier: Modifier,
    tooltipsText: String,
    name: String,
    value: String,
) {
}

@Composable
fun Tooltip(
    modifier: Modifier,
    name: String,
    tooltip: String,
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        TooltipPopup(
            modifier = Modifier,
            requesterView = { modifier ->
                Icon16(
                    modifier = modifier,
                    painter = painterResource(id = R.drawable.ic_arrow_left_16_ver01)
                )
            },
            tooltipContent = {
                Text(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 8.dp),
                    text = tooltip,
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 18.sp,
                        fontWeight = FontWeight.Medium,
                    ),
                    color = white100,
                )
            }
        )
    }
}
