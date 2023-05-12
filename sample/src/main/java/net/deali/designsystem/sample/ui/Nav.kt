package net.deali.designsystem.sample.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav() {
    val navController = rememberNavController()

    NavHost(
        modifier = Modifier
            .fillMaxSize(),
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
                navigateToButton = {
                    navController.navigate("buttons")
                }
            )
        }
        composable("typography") {
            TypographyScreen()
        }
        composable("colors") {
            ColorsScreen()
        }
        composable("buttons") {
            ButtonsScreen()
        }
    }
}
