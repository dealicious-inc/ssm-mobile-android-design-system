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
import androidx.navigation.navigation
import net.deali.designsystem.sample.datastore.DataStoreUtil
import net.deali.designsystem.theme.DealiColor

@Composable
fun Nav(
    dataStoreUtil: DataStoreUtil
) {
    val navController = rememberNavController()

    NavHost(
        modifier = Modifier
            .fillMaxSize()
            .background(DealiColor.primary04),
        navController = navController,
        startDestination = Screen.Menu.route
    ) {
        menuGraph(navController, dataStoreUtil)
        uiElementsGraph(navController)
        formsGraph(navController)
    }
}

private fun NavGraphBuilder.menuGraph(
    navController: NavController,
    dataStoreUtil: DataStoreUtil,
) {
    composable(Screen.Menu.route) {
        MenuScreen(
            navigateToTypography = { navController.navigate(Screen.Typography.route) },
            navigateToGrid = { navController.navigate(Screen.Grid.route) },
            navigateToColors = { navController.navigate(Screen.Colors.route) },
            navigateToIndentations = { navController.navigate(Screen.Indentations.route) },
            navigateToIconography = { navController.navigate(Screen.Iconography.route) },
            navigateToShadows = { navController.navigate(Screen.Shadows.route) },
            navigateToCornerRadius = { navController.navigate(Screen.CornerRadius.route) },
            navigateToNavigation = { navController.navigate(Screen.Navigation.route) },
            navigateToButtons = { navController.navigate(Screen.Buttons.route) },
            navigateToChip = { navController.navigate(Screen.Chip.route) },
            navigateToUIElements = { navController.navigate(Screen.UIElements.route) },
            navigateToForms = { navController.navigate(Screen.Forms.route) },
            navigateToBottomSheets = { navController.navigate(Screen.BottomSheets.route) },
            navigateToTabBar = { navController.navigate(Screen.TabBar.route) },
        )
    }
    composable(Screen.Typography.route) {
        TypographyScreen(
            onBackPress = navController::popBackStack,
            dataStoreUtil = dataStoreUtil
        )
    }
    composable(Screen.Grid.route) {
        GridScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Colors.route) {
        ColorsScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Indentations.route) {
        IndentationsScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Iconography.route) {
        IconographyScreen2(onBackPress = navController::popBackStack)
    }
    composable(Screen.Shadows.route) {
        ShadowsScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.CornerRadius.route) {
        CornerRadiusScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Navigation.route) {
        NavigationScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Buttons.route) {
        ButtonsScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.Chip.route) {
        ChipScreen(onBackPress = navController::popBackStack)
    }
    composable(Screen.BottomSheets.route) {
        BottomSheetScreen(onBackPress = navController::popBackStack)
    }

    composable(Screen.TabBar.route) {
        TabBarScreen(onBackPress = navController::popBackStack)
    }
}

fun NavGraphBuilder.uiElementsGraph(navController: NavController) {
    navigation(startDestination = Screen.UIElements.route, route = Screen.UIElements.menu) {
        composable(Screen.UIElements.route) {
            UIElementsScreen(
                navigateToCheckBox = { navController.navigate(Screen.CheckBox.route) },
                navigateToCheckcircle = { navController.navigate(Screen.Checkcircle.route) },
                navigateToRadioButton = { navController.navigate(Screen.RadioButton.route) },
                navigateToToggleSwitch = { navController.navigate(Screen.Switch.route) },
                navigateToSwipeRefresh = { navController.navigate(Screen.SwipeRefresh.route) },
                navigateToTooltip = { navController.navigate(Screen.Tooltip.route) },
                navigateToRating = { navController.navigate(Screen.Rating.route) },
                navigateToPopup = { navController.navigate(Screen.Popup.route) },
                navigateToTag = { navController.navigate(Screen.Tag.route) },
                navigateToDateTimePicker = { navController.navigate(Screen.DateTimePicker.route) },
                navigateToSlider = { navController.navigate(Screen.Slider.route) },
                onBackPress = navController::popBackStack
            )
        }
        composable(Screen.CheckBox.route) {
            CheckBoxScreen(onBackPress = navController::popBackStack)
        }
        composable(Screen.Checkcircle.route) {
            CheckcircleScreen(onBackPress = navController::popBackStack)
        }
        composable(Screen.RadioButton.route) {
            RadioButtonScreen(onBackPress = navController::popBackStack)
        }
        composable(Screen.SwipeRefresh.route) {
            SwipeRefreshScreen(onBackPress = navController::popBackStack)
        }
        composable(Screen.Switch.route) {
            SwitchScreen(onBackPress = navController::popBackStack)
        }
        composable(Screen.Tooltip.route) {
            TooltipScreen(onBackPress = navController::popBackStack)
        }
        composable(Screen.Rating.route) {
            RatingScreen(onBackPress = navController::popBackStack)
        }
        composable(Screen.Popup.route) {
            PopupScreen(onBackPress = navController::popBackStack)
        }
        composable(Screen.Tag.route) {
            TagScreen(onBackPress = navController::popBackStack)
        }
        composable(Screen.DateTimePicker.route) {
            DateTimePickerScreen(onBackPress = navController::popBackStack)
        }
        composable(Screen.Slider.route) {
            SliderScreen(
                onBackPress = navController::popBackStack
            )
        }
    }
}

fun NavGraphBuilder.formsGraph(navController: NavController) {
    navigation(startDestination = Screen.Forms.route, route = Screen.Forms.menu) {
        composable(Screen.Forms.route) {
            FormsScreen(
                navigateToInput = { navController.navigate(Screen.TextInput.route) },
                navigateToInputWithButton = { navController.navigate(Screen.TextInputWithButton.route) },
                navigateToTextArea = { navController.navigate(Screen.TextArea.route) },
                navigateToSearchInput = { navController.navigate(Screen.SearchInput.route) },
                navigateToSearchInputWithTag = { navController.navigate(Screen.SearchInputWithTag.route) },
                onBackPress = navController::popBackStack,
            )
        }
        composable(Screen.TextInput.route) {
            InputScreen(onBackPress = navController::popBackStack)
        }
        composable(Screen.TextInputWithButton.route) {
            InputWithButtonScreen(onBackPress = navController::popBackStack)
        }
        composable(Screen.TextArea.route) {
            TextAreaScreen(onBackPress = navController::popBackStack)
        }
        composable(Screen.SearchInput.route) {
            SearchInputScreen(onBackPress = navController::popBackStack)
        }
        composable(Screen.SearchInputWithTag.route) {
            SearchInputWithTagScreen(
                onBackPress = navController::popBackStack
            )
        }
    }
}

sealed class Screen(val route: String) {
    object Menu : Screen("menu")
    object Typography : Screen("typography")
    object Grid : Screen("grid")
    object Colors : Screen("colors")
    object Indentations : Screen("indentations")
    object Iconography : Screen("iconography")
    object Shadows : Screen("shadows")
    object CornerRadius : Screen("cornerRadius")
    object Navigation : Screen("navigation")
    object Buttons : Screen("buttons")
    object Chip : Screen("chip")
    object UIElements : Screen("uiElements") {
        val menu = this.route + "Menu"
    }

    object Forms : Screen("forms") {
        val menu = this.route + "Menu"
    }

    object BottomSheets : Screen("bottomSheets")
    object CheckBox : Screen("checkBox")
    object Checkcircle : Screen("checkcircle")
    object RadioButton : Screen("radioButton")
    object SwipeRefresh : Screen("swipeRefresh")
    object Switch : Screen("switch")
    object Tooltip : Screen("tooltip")
    object Rating : Screen("rating")
    object Popup : Screen("popup")
    object Tag : Screen("tag")
    object Slider : Screen("slider")
    object TextInput : Screen("textInput")
    object TextInputWithButton : Screen("textInputWithButton")
    object TextArea : Screen("textArea")
    object SearchInput : Screen("searchInput")
    object SearchInputWithTag : Screen("searchInputWithTag")
    object DateTimePicker : Screen("dateTimePicker")
    object TabBar : Screen("TabBar")
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
