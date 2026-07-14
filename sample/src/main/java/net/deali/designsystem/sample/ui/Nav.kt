package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.deali.designsystem.sample.data.datastore.DataStoreUtil
import net.deali.designsystem.sample.data.model.Screen
import net.deali.designsystem.sample.ui.main.MainScreen
import net.deali.designsystem.sample.ui.screen.AccordionScreen
import net.deali.designsystem.sample.ui.screen.AlertScreen
import net.deali.designsystem.sample.ui.screen.BottomSheetScreen
import net.deali.designsystem.sample.ui.screen.ButtonsRoundScreen
import net.deali.designsystem.sample.ui.screen.ButtonsScreen
import net.deali.designsystem.sample.ui.screen.CheckBoxScreen
import net.deali.designsystem.sample.ui.screen.CheckCircleScreen
import net.deali.designsystem.sample.ui.screen.ChipsScreen
import net.deali.designsystem.sample.ui.screen.ColorsScreen
import net.deali.designsystem.sample.ui.screen.DateTimePickerScreen
import net.deali.designsystem.sample.ui.screen.DividerScreen
import net.deali.designsystem.sample.ui.screen.DropdownScreen
import net.deali.designsystem.sample.ui.screen.ErrorCaseScreen
import net.deali.designsystem.sample.ui.screen.IconsScreen
import net.deali.designsystem.sample.ui.screen.ImageChipsScreen
import net.deali.designsystem.sample.ui.screen.IndicatorScreen
import net.deali.designsystem.sample.ui.screen.LabeledTextScreen
import net.deali.designsystem.sample.ui.screen.NoticeScreen
import net.deali.designsystem.sample.ui.screen.PlaceholderImageScreen
import net.deali.designsystem.sample.ui.screen.RadioButtonScreen
import net.deali.designsystem.sample.ui.screen.RatingScreen
import net.deali.designsystem.sample.ui.screen.SearchInputScreen
import net.deali.designsystem.sample.ui.screen.SearchInputWithTagScreen
import net.deali.designsystem.sample.ui.screen.ShadowsScreen
import net.deali.designsystem.sample.ui.screen.SliderScreen
import net.deali.designsystem.sample.ui.screen.SwipeRefreshScreen
import net.deali.designsystem.sample.ui.screen.SwitchScreen
import net.deali.designsystem.sample.ui.screen.TabBarScreen
import net.deali.designsystem.sample.ui.screen.TagScreen
import net.deali.designsystem.sample.ui.screen.TextAreaButtonScreen
import net.deali.designsystem.sample.ui.screen.TextAreaScreen
import net.deali.designsystem.sample.ui.screen.TextInputScreen
import net.deali.designsystem.sample.ui.screen.TextInputWithButtonScreen
import net.deali.designsystem.sample.ui.screen.TextLinkScreen
import net.deali.designsystem.sample.ui.screen.TooltipScreen
import net.deali.designsystem.sample.ui.screen.TopBarScreen
import net.deali.designsystem.sample.ui.screen.TypographyScreen
import net.deali.designsystem.theme.DealiColor

/**
 * 시스템 바(status bar, navigation bar)와 키보드 인셋만큼 패딩을 적용하는 공통 destination.
 * clipToBounds로 인셋 영역 밖 그리기(collapsing top bar의 translationY 등)도 차단한다.
 *
 * 단, 바텀시트처럼 딤드가 시스템 바 영역까지 덮어야 하는 화면은
 * 이 래퍼 대신 일반 composable을 사용하고 화면 내부에서 인셋을 처리한다.
 */
private fun NavGraphBuilder.insetComposable(
    route: String,
    content: @Composable () -> Unit,
) {
    composable(route) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .imePadding()
                .clipToBounds()
        ) {
            content()
        }
    }
}

@Composable
fun Nav(
    dataStoreUtil: DataStoreUtil,
    tokens: List<Screen>,
    atoms: List<Screen>,
    molecules: List<Screen>,
    others: List<Screen>,
) {
    val navController = rememberNavController()

    NavHost(
        modifier = Modifier
            .fillMaxSize()
            .background(DealiColor.primary04),
        navController = navController,
        startDestination = Screen.Menu.route
    ) {
        menuGraph(tokens, atoms, molecules, others, navController, dataStoreUtil)
        tokenGraph(navController, dataStoreUtil)
        atomsGraph(navController)
        moleculesGraph(navController)
        othersGraph(navController)
    }
}

private fun NavGraphBuilder.menuGraph(
    tokens: List<Screen>,
    atoms: List<Screen>,
    molecules: List<Screen>,
    others: List<Screen>,
    navController: NavController,
    dataStoreUtil: DataStoreUtil,
) {
    insetComposable(Screen.Menu.route) {
        MainScreen(
            tokens = tokens,
            atoms = atoms,
            molecules = molecules,
            others = others,
            onClickMenu = { screen ->
                navController.navigate(screen.route)
            },
        )
    }
    insetComposable(Screen.Typography.route) {
        TypographyScreen(
            onBackPress = navController::popBackStack,
            dataStoreUtil = dataStoreUtil
        )
    }
    insetComposable(Screen.Colors.route) {
        ColorsScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Icons.route) {
        IconsScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Shadows.route) {
        ShadowsScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Indicator.route) {
        IndicatorScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Buttons.route) {
        ButtonsScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.ButtonsRound.route) {
        ButtonsRoundScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.TextLink.route) {
        TextLinkScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Chips.route) {
        ChipsScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.ImageChips.route) {
        ImageChipsScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.BottomSheet.route) {
        BottomSheetScreen(onBackPress = navController::popBackStack)
    }

    insetComposable(Screen.TabBar.route) {
        TabBarScreen(onBackPress = navController::popBackStack)
    }
}


private fun NavGraphBuilder.tokenGraph(
    navController: NavController,
    dataStoreUtil: DataStoreUtil,
) {
    insetComposable(Screen.Typography.route) {
        TypographyScreen(
            onBackPress = navController::popBackStack,
            dataStoreUtil = dataStoreUtil,
        )
    }
    insetComposable(Screen.Colors.route) {
        ColorsScreen(
            onBackPress = navController::popBackStack,
        )
    }
    insetComposable(Screen.Shadows.route) {
        ShadowsScreen(
            onBackPress = navController::popBackStack,
        )
    }
    insetComposable(Screen.Icons.route) {
        IconsScreen(
            onBackPress = navController::popBackStack,
        )
    }
}

private fun NavGraphBuilder.atomsGraph(
    navController: NavController,
) {
    insetComposable(Screen.Buttons.route) {
        ButtonsScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.ButtonsRound.route) {
        ButtonsRoundScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.TextLink.route) {
        TextLinkScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Chips.route) {
        ChipsScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.ImageChips.route) {
        ImageChipsScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.CheckBox.route) {
        CheckBoxScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.CheckCircle.route) {
        CheckCircleScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.RadioButton.route) {
        RadioButtonScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Switch.route) {
        SwitchScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.TextInput.route) {
        TextInputScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.SearchInput.route) {
        SearchInputScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.TextArea.route) {
        TextAreaScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Dropdown.route) {
        DropdownScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Indicator.route) {
        IndicatorScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Rating.route) {
        RatingScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Tooltip.route) {
        TooltipScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Tag.route) {
        TagScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Divider.route) {
        DividerScreen(onBackPress = navController::popBackStack)
    }
}

private fun NavGraphBuilder.moleculesGraph(
    navController: NavController,
) {
    insetComposable(Screen.TopBar.route) {
        TopBarScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.TabBar.route) {
        TabBarScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.SearchBar.route) {
        //        SearchBarScreen(onBackPress = navController::popBackStack) TODO 스크린 추가
    }
    insetComposable(Screen.FilterBar.route) {
        //        FilterBarScreen(onBackPress = navController::popBackStack) TODO 스크린 추가
    }
    insetComposable(Screen.ErrorCase.route) {
        ErrorCaseScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.BottomSheet.route) {
        BottomSheetScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.DateTimePicker.route) {
        DateTimePickerScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.TextInputWithButton.route) {
        TextInputWithButtonScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.TextAreaButton.route) {
        TextAreaButtonScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.SearchInputWithTag.route) {
        SearchInputWithTagScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Alert.route) {
        AlertScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Slider.route) {
        SliderScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.LabeledText.route) {
        LabeledTextScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Accordion.route) {
        AccordionScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.Notice.route) {
        NoticeScreen(onBackPress = navController::popBackStack)
    }
    insetComposable(Screen.PlaceholderImage.route) {
        PlaceholderImageScreen(onBackPress = navController::popBackStack)
    }
}

private fun NavGraphBuilder.othersGraph(
    navController: NavController,
) {
    insetComposable(Screen.SwipeRefresh.route) {
        SwipeRefreshScreen(onBackPress = navController::popBackStack)
    }
}


@Composable
internal fun NavigationContainer(
    navigationBar: @Composable () -> Unit,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = DealiColor.primary04)
    ) {
        navigationBar()
        content()
    }
}
