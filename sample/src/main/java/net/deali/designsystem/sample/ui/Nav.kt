package net.deali.designsystem.sample.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
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
                }
            )
        }
        composable("typography") {
            TypographyScreen()
        }
    }
}
