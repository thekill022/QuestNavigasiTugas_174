package com.example.myapplication

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.view.DisplayData
import com.example.myapplication.view.SplashScreen

enum class Navigation {
    SplashScreen,
    HomeData,
    FormData
}

@Composable
fun ManageTab(navController : NavHostController = rememberNavController()) {

Scaffold {
    innerPad ->
    NavHost(
        navController = navController,
        startDestination = Navigation.SplashScreen.name,
        modifier = Modifier.padding(innerPad)
        ) {
        composable(
            route = Navigation.SplashScreen.name
        ) {
            SplashScreen(onClickToHome = {navController.navigate(route = Navigation.HomeData.name)})
        }
        composable(
            route = Navigation.HomeData.name
        ) {
            DisplayData(onButtonNext = {}, onButtonBack = {backToSplash(navController)})
        }
    }
}

}

private fun backToSplash(navController : NavHostController) {
    navController.popBackStack(
        route = Navigation.SplashScreen.name,
        inclusive = false
    )
}