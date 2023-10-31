package net.deali.designsystem.internal.datetimepicker

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
internal fun BoxScope.DefaultPickerItemContent(
    text: String,
    modifier: Modifier = Modifier
) {
    DealiText(
        modifier = modifier.align(Alignment.Center),
        text = text,
        style = DealiFont.sh1r20,
        color = DealiColor.g100,
    )
}
