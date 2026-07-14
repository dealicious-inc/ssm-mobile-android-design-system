package net.deali.designsystem.sample.ui.main

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import net.deali.designsystem.sample.data.datastore.DataStoreUtil
import net.deali.designsystem.sample.data.model.Screen
import net.deali.designsystem.sample.ui.Nav
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.DealiColor
import java.util.Locale

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // 앱 배경이 항상 밝은 색(primary04)이므로 시스템 바 아이콘을 어두운 색으로 고정
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(Color.TRANSPARENT, Color.TRANSPARENT),
            navigationBarStyle = SystemBarStyle.light(Color.TRANSPARENT, Color.TRANSPARENT),
        )
        super.onCreate(savedInstanceState)

        val dataStoreUtil = DataStoreUtil(applicationContext)

        setContent {
            val language by dataStoreUtil.getLanguage()
                .collectAsState(initial = Locale.KOREA.language)

            AppTheme(
                language = language
            ) {
                // 시스템 바 인셋 패딩은 화면 단위로 적용 (Nav.kt의 insetComposable 참고)
                // 바텀시트의 딤드가 시스템 바 영역까지 덮어야 하므로 루트에서는 패딩하지 않음
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(DealiColor.primary04)
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
    }


    private fun getTokens() = listOf(
        Screen.Typography,
        Screen.Colors,
        Screen.Shadows,
        Screen.Icons,
    )

    private fun getAtoms() = listOf(
        Screen.Buttons,
        Screen.ButtonsRound,
        Screen.TextLink,
        Screen.Chips,
        Screen.ImageChips,
        Screen.CheckBox,
        Screen.CheckCircle,
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
        Screen.Alert,
        Screen.Slider,
        Screen.LabeledText,
        Screen.Accordion,
        Screen.Notice,
        Screen.PlaceholderImage,
    )

    private fun getOthers() = listOf(
        Screen.SwipeRefresh,
    )
}
