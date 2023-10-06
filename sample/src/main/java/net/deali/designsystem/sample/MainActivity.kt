package net.deali.designsystem.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import net.deali.designsystem.sample.datastore.DataStoreUtil
import net.deali.designsystem.sample.ui.Nav
import net.deali.designsystem.theme.AppTheme
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dataStoreUtil = DataStoreUtil(applicationContext)

        setContent {
            val language by dataStoreUtil.getLanguage().collectAsState(initial = Locale.KOREA.language)

            AppTheme(language = language) {
                Nav(dataStoreUtil = dataStoreUtil)
            }
        }
    }
}
