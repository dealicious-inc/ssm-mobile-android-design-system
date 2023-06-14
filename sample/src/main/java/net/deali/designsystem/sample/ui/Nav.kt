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
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import net.deali.designsystem.sample.datastore.DataStoreUtil
import net.deali.designsystem.theme.white100

@Composable
fun Nav(
    dataStoreUtil: DataStoreUtil
) {
    val navController = rememberNavController()

    NavHost(
        modifier = Modifier
            .fillMaxSize()
            .background(white100),
        navController = navController,
        startDestination = Screen.Menu.route
    ) {
        menuGraph(navController, dataStoreUtil)
        uiElementsGraph(navController)
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
            navigateToUIElements = { navController.navigate(Screen.UIElements.route) },
            navigateToForms = { navController.navigate(Screen.Forms.route) },
        )
    }
    composable(Screen.Typography.route) {
        TypographyScreen(
            onBackPress = navController::popBackStack,
            dataStoreUtil = dataStoreUtil
        )
    }
    composable(Screen.Grid.route) {
        GridScreen(
            onBackPress = navController::popBackStack
        )
    }
    composable(Screen.Colors.route) {
        ColorsScreen(
            onBackPress = navController::popBackStack
        )
    }
    composable(Screen.Indentations.route) {
        IndentationsScreen(
            onBackPress = navController::popBackStack
        )
    }
    composable(Screen.Iconography.route) {
        IconographyScreen(
            onBackPress = navController::popBackStack
        )
    }
    composable(Screen.Shadows.route) {
        ShadowsScreen(
            onBackPress = navController::popBackStack
        )
    }
    composable(Screen.CornerRadius.route) {
        CornerRadiusScreen(
            onBackPress = navController::popBackStack
        )
    }
    composable(Screen.Navigation.route) {
        NavigationScreen(
            onBackPress = navController::popBackStack
        )
    }
    composable(Screen.Buttons.route) {
        ButtonsScreen(
            onBackPress = navController::popBackStack
        )
    }
    composable(Screen.Forms.route) {
        FormsScreen(
            onBackPress = navController::popBackStack
        )
    }
}

fun NavGraphBuilder.uiElementsGraph(navController: NavController) {
    navigation(startDestination = Screen.UIElements.route, route = Screen.UIElements.menu) {
        composable(Screen.UIElements.route) {
            UIElementsScreen(
                navigateToCheckBox = { navController.navigate(Screen.CheckBox.route) },
                navigateToCheckcircle = { navController.navigate(Screen.Checkcircle.route) },
                navigateToRadioButton = { navController.navigate(Screen.RadioButton.route) },
                navigateToToggleSwitch = { navController.navigate(Screen.ToggleSwitch.route) },
                navigateToTooltip = { navController.navigate(Screen.Tooltip.route) },
                navigateToRating = { navController.navigate(Screen.Rating.route) },
                navigateToPopup = { navController.navigate(Screen.Popup.route) },
                navigateToTag = { navController.navigate(Screen.Tag.route) },
                onBackPress = navController::popBackStack
            )
        }
        composable(Screen.CheckBox.route) {
            CheckBoxScreen(
                onBackPress = navController::popBackStack
            )
        }
        composable(Screen.Checkcircle.route) {
            CheckcircleScreen(
                onBackPress = navController::popBackStack
            )
        }
        composable(Screen.RadioButton.route) {
            RadioButtonScreen(
                onBackPress = navController::popBackStack
            )
        }
        composable(Screen.ToggleSwitch.route) {
            ToggleSwitchScreen(
                onBackPress = navController::popBackStack
            )
        }
        composable(Screen.Tooltip.route) {
            TooltipScreen(
                onBackPress = navController::popBackStack
            )
        }
        composable(Screen.Rating.route) {
            RatingScreen(
                onBackPress = navController::popBackStack
            )
        }
        composable(Screen.Popup.route) {
            PopupScreen(
                onBackPress = navController::popBackStack
            )
        }
        composable(Screen.Tag.route) {
            TagScreen(
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
    object UIElements : Screen("uiElements") {
        val menu = this.route + "Menu"
    }

    object Forms : Screen("forms")

    object CheckBox : Screen("checkBox")
    object Checkcircle : Screen("checkcircle")
    object RadioButton : Screen("radioButton")
    object ToggleSwitch : Screen("toggleSwitch")
    object Tooltip : Screen("tooltip")
    object Rating : Screen("rating")
    object Popup : Screen("popup")
    object Tag : Screen("tag")
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
