package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.deali.designsystem.sample.data.model.Screen
import net.deali.designsystem.sample.data.datastore.DataStoreUtil
import net.deali.designsystem.sample.ui.main.MainScreen
import net.deali.designsystem.sample.ui.screen.BottomSheetScreen
import net.deali.designsystem.sample.ui.screen.ButtonsScreen
import net.deali.designsystem.sample.ui.screen.CheckBoxScreen
import net.deali.designsystem.sample.ui.screen.CheckCircleScreen
import net.deali.designsystem.sample.ui.screen.CheckLineScreen
import net.deali.designsystem.sample.ui.screen.ChipsScreen
import net.deali.designsystem.sample.ui.screen.ColorsScreen
import net.deali.designsystem.sample.ui.screen.CornerRadiusScreen
import net.deali.designsystem.sample.ui.screen.DateTimePickerScreen
import net.deali.designsystem.sample.ui.screen.DropdownScreen
import net.deali.designsystem.sample.ui.screen.IconsScreen
import net.deali.designsystem.sample.ui.screen.IndentationsScreen
import net.deali.designsystem.sample.ui.screen.IndicatorScreen
import net.deali.designsystem.sample.ui.screen.PopupScreen
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
import net.deali.designsystem.sample.ui.screen.TooltipScreen
import net.deali.designsystem.sample.ui.screen.TypographyScreen
import net.deali.designsystem.theme.DealiColor

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
    composable(Screen.Menu.route) {
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
    composable(Screen.Typography.route) {
        TypographyScreen(
            onBackPress = navController::popBackStack,
            dataStoreUtil = dataStoreUtil
        )
    }
    composable(Screen.Colors.route) {
        ColorsScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Indentations.route) {
        IndentationsScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Icons.route) {
        IconsScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Shadows.route) {
        ShadowsScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.CornerRadius.route) {
        CornerRadiusScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Indicator.route) {
        IndicatorScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Buttons.route) {
        ButtonsScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Chips.route) {
        ChipsScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.BottomSheet.route) {
        BottomSheetScreen(onBackPress = navController::popBackStack)
    }

    composable(Screen.TabBar.route) {
        TabBarScreen(onBackPress = navController::popBackStack)
    }
}


private fun NavGraphBuilder.tokenGraph(
    navController: NavController,
    dataStoreUtil: DataStoreUtil,
) {
    composable(Screen.Typography.route) {
        TypographyScreen(
            onBackPress = navController::popBackStack,
            dataStoreUtil = dataStoreUtil,
        )
    }
    composable(Screen.Colors.route) {
        ColorsScreen(
            onBackPress = navController::popBackStack,
        )
    }
    composable(Screen.Indentations.route) {
        IndentationsScreen(
            onBackPress = navController::popBackStack,
        )
    }
    composable(Screen.Shadows.route) {
        ShadowsScreen(
            onBackPress = navController::popBackStack,
        )
    }
    composable(Screen.CornerRadius.route) {
        CornerRadiusScreen(
            onBackPress = navController::popBackStack,
        )
    }
    composable(Screen.Icons.route) {
        IconsScreen(
            onBackPress = navController::popBackStack,
        )
    }
}

private fun NavGraphBuilder.atomsGraph(
    navController: NavController,
) {
    composable(Screen.Buttons.route) {
        ButtonsScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Chips.route) {
        ChipsScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.CheckBox.route) {
        CheckBoxScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.CheckCircle.route) {
        CheckCircleScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.CheckLine.route) {
        CheckLineScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.RadioButton.route) {
        RadioButtonScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Switch.route) {
        SwitchScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.TextInput.route) {
        TextInputScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.SearchInput.route) {
        SearchInputScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.TextArea.route) {
        TextAreaScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Dropdown.route) {
        DropdownScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Indicator.route) {
        IndicatorScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Rating.route) {
        RatingScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Tooltip.route) {
        TooltipScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Tag.route) {
        TagScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Divider.route) {
//        DividerScreen(onBackPress = navController::popBackStack) TODO 스크린 추가
    }
}

private fun NavGraphBuilder.moleculesGraph(
    navController: NavController,
) {
    composable(Screen.TopBar.route) {
//        TopBarScreen(onBackPress = navController::popBackStack) TODO 스크린 추가
    }
    composable(Screen.TabBar.route) {
        TabBarScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.SearchBar.route) {
//        SearchBarScreen(onBackPress = navController::popBackStack) TODO 스크린 추가
    }
    composable(Screen.FilterBar.route) {
//        FilterBarScreen(onBackPress = navController::popBackStack) TODO 스크린 추가
    }
    composable(Screen.ErrorCase.route) {
//        ErrorCaseScreen(onBackPress = navController::popBackStack) TODO 스크린 추가
    }
    composable(Screen.BottomSheet.route) {
        BottomSheetScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.DateTimePicker.route) {
        DateTimePickerScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.TextInputWithButton.route) {
        TextInputWithButtonScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.TextAreaButton.route) {
        TextAreaButtonScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.SearchInputWithTag.route) {
        SearchInputWithTagScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Popup.route) {
        PopupScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Slider.route) {
        SliderScreen(onBackPress = navController::popBackStack)
    }
}

private fun NavGraphBuilder.othersGraph(
    navController: NavController,
) {
    composable(Screen.SwipeRefresh.route) {
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
    ) {
        navigationBar()
        content()
    }
}
