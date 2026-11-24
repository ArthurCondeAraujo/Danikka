package com.conde.danikka

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController

@Composable
fun navigationSetup () {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "auth") {
        navigation(
            startDestination = "login",
            route = "auth"
        ) {
            composable ("login") {
                val viewModel = it.sharedViewModel<SampleViewModel>(navController)
                LoginPage()
            }
            composable ("register") {
                val viewModel = it.sharedViewModel<SampleViewModel>(navController)
            }
            composable ("forgot_password") {
                val viewModel = it.sharedViewModel<SampleViewModel>(navController)
            }
        }
        navigation(
            startDestination = "main_screen",
            route = "main"
        ) {
            composable ("main_screen") {
                val viewModel = it.sharedViewModel<SampleViewModel>(navController)
            }
        }
    }
}

@Composable
inline fun <reified T : ViewModel> NavBackStackEntry.sharedViewModel(navController: NavController): T {
    val navGraphRoute = destination.parent?.route ?: return viewModel()
    val  parentEntry = remember(this) {
        navController.getBackStackEntry(navGraphRoute)
    }
    return viewModel(parentEntry)
}