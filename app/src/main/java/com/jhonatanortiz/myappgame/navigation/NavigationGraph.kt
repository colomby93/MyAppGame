package com.jhonatanortiz.myappgame.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jhonatanortiz.myappgame.routes.SplashRoute

@Composable
fun NavigationGraph(navHostController: NavHostController = rememberNavController()) {
    NavHost(navController = navHostController, startDestination = Screen.Splash.route) {
        composable(Screen.Splash.route) {
            SplashRoute{
                navHostController.navigate(Screen.First.route) {
                    popUpTo(0) {
                        inclusive = true
                    }
            }

            }
        }
    }
}


