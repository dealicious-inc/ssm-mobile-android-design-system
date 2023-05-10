package net.deali.designsystem.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import net.deali.designsystem.component.LargePrimaryFulledPinkTag
import net.deali.designsystem.preview.getRandomText
import net.deali.designsystem.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    LargePrimaryFulledPinkTag(
                        modifier = Modifier
                            .clickable(onClick = {  }),
                        text = getRandomText(2)
                    )
                }
            }
        }
    }
}
