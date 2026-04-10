package com.darrius.sokohub.navigation


import android.content.Intent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.darrius.sokohub.ui.screens.about.AboutScreen
import com.darrius.sokohub.ui.screens.auth.LoginScreen
import com.darrius.sokohub.ui.screens.auth.RegisterScreen
import com.darrius.sokohub.ui.screens.home.HomeScreen
import com.darrius.sokohub.ui.screens.intent.IntentScreen
import com.darrius.sokohub.ui.screens.onboarding.OnBoardingScreen
import com.darrius.sokohub.ui.screens.service.ServiceScreen
import com.darrius.sokohub.ui.theme.neworange

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_ONBOARDING
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }

        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUT_LOGIN) {
            LoginScreen(navController)
        }

        composable(ROUT_REGISTER) {
            RegisterScreen(navController)
        }

        composable(ROUT_ONBOARDING) {
            OnBoardingScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }




    }
}