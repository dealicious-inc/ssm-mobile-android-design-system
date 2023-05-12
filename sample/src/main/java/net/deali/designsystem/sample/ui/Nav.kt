package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
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
        startDestination = "menu"
    ) {
        composable("menu") {
            MenuScreen(
                navigateToTypography = {
                    navController.navigate("typography")
                },
                navigateToColors = {
                    navController.navigate("colors")
                },
                navigateToIconography = {
                    navController.navigate("iconography")
                },
                navigateToButton = {
                    navController.navigate("buttons")
                }
            )
        }
        composable("typography") {
            TypographyScreen(
                onBackPress = navController::popBackStack
            )
        }
        composable("colors") {
            ColorsScreen(
                onBackPress = navController::popBackStack
            )
        }
        composable("iconography") {
            IconographyScreen(
                onBackPress = navController::popBackStack
            )
        }
        composable("buttons") {
            ButtonsScreen(
                onBackPress = navController::popBackStack
            )
        }
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
