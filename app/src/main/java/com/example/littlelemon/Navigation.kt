package com.example.littlelemon

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navController: NavHostController,
        readPreferences : () -> Map<String, String>,
        savePreferences : (firstName : String, lastName : String, email : String) -> Unit,
        databaseMenuItems : List<MenuItemRoom>
) {

    val isNewUser = readPreferences()["firstName"] == "";

    NavHost(navController = navController, startDestination = if (isNewUser) { OnBoarding.route } else { Home.route }) {
        composable(OnBoarding.route) {
            OnBoarding(navController, savePreferences)
        }
        composable(Home.route) {
            Home(navController, readPreferences, databaseMenuItems)
        }
        composable(Profile.route) {
            Profile(navController, readPreferences, savePreferences)
        }
    }
}
