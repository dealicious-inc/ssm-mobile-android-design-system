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
import net.deali.designsystem.theme.white100

@Composable
fun Nav() {
    val navController = rememberNavController()

    NavHost(
        modifier = Modifier
            .fillMaxSize()
            .background(white100),
        navController = navController,
        startDestination = Screen.Menu.route
    ) {
        menuGraph(navController)
        uiElementsGraph(navController)
    }
}

private fun NavGraphBuilder.menuGraph(navController: NavController) {
    composable(Screen.Menu.route) {
        MenuScreen(
            navigateToTypography = {
                navController.navigate(Screen.Typography.route)
            },
            navigateToColors = {
                navController.navigate(Screen.Colors.route)
            },
            navigateToIconography = {
                navController.navigate(Screen.Iconography.route)
            },
            navigateToButton = {
                navController.navigate(Screen.Buttons.route)
            },
            navigationToUIElements = {
                navController.navigate(Screen.UIElements.route)
            }
        )
    }
    composable(Screen.Typography.route) {
        TypographyScreen(
            onBackPress = navController::popBackStack
        )
    }
    composable(Screen.Colors.route) {
        ColorsScreen(
            onBackPress = navController::popBackStack
        )
    }
    composable(Screen.Iconography.route) {
        IconographyScreen(
            onBackPress = navController::popBackStack
        )
    }
    composable(Screen.Buttons.route) {
        ButtonsScreen(
            onBackPress = navController::popBackStack
        )
    }
}

fun NavGraphBuilder.uiElementsGraph(navController: NavController) {
    navigation(startDestination = Screen.UIElements.route, route = Screen.UIElements.menu) {
        composable(Screen.UIElements.route) {
            UIElementsScreen(
                navigateToTag = {
                    navController.navigate(Screen.Tag.route)
                },
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
    object Colors : Screen("colors")
    object Iconography : Screen("iconography")
    object Buttons : Screen("buttons")
    object UIElements : Screen("uiElements") {
        val menu = this.route + "Menu"
    }
    object Tag : Screen("Tag")
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
