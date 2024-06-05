package net.deali.designsystem.sample.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import net.deali.designsystem.sample.data.model.Screen
import net.deali.designsystem.sample.data.datastore.DataStoreUtil
import net.deali.designsystem.sample.ui.Nav
import net.deali.designsystem.theme.AppTheme
import java.util.Locale

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dataStoreUtil = DataStoreUtil(applicationContext)

        setContent {
            val language by dataStoreUtil.getLanguage()
                .collectAsState(initial = Locale.KOREA.language)

            AppTheme(
                language = language
            ) {
                Nav(
                    dataStoreUtil = dataStoreUtil,
                    tokens = getTokens(),
                    atoms = getAtoms(),
                    molecules = getMolecules(),
                    others = getOthers(),
                )
            }
        }
    }


    private fun getTokens() = listOf(
        Screen.Typography,
        Screen.Colors,
        Screen.Indentations,
        Screen.Shadows,
        Screen.CornerRadius,
        Screen.Icons,
    )

    private fun getAtoms() = listOf(
        Screen.Buttons,
        Screen.Chips,
        Screen.CheckBox,
        Screen.CheckCircle,
        Screen.CheckLine,
        Screen.RadioButton,
        Screen.Switch,
        Screen.TextInput,
        Screen.SearchInput,
        Screen.TextArea,
        Screen.Dropdown,
        Screen.Indicator,
        Screen.Rating,
        Screen.Tooltip,
        Screen.Tag,
        Screen.Divider,
    )

    private fun getMolecules() = listOf(
        Screen.TopBar,
        Screen.TabBar,
        Screen.SearchBar,
        Screen.FilterBar,
        Screen.ErrorCase,
        Screen.BottomSheet,
        Screen.DateTimePicker,
        Screen.TextInputWithButton,
        Screen.TextAreaButton,
        Screen.SearchInputWithTag,
        Screen.Popup,
        Screen.Slider,
    )

    private fun getOthers() = listOf(
        Screen.SwipeRefresh,
    )
}
