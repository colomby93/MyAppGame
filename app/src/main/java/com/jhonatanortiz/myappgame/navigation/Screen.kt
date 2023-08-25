package com.jhonatanortiz.myappgame.navigation

sealed class Screen(val route: String){
    object Splash: Screen("Splash")
    object First: Screen("First")
}
