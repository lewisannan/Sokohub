package com.lewis.sokohub.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lewis.sokohub.R
import com.lewis.sokohub.navigation.ROUT_ONBOARDING
import com.lewis.sokohub.ui.theme.neworange
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){


      //NAVIGATION
   val coroutineScope =rememberCoroutineScope()
    coroutineScope.launch {

        delay(2000)
        navController.navigate(ROUT_ONBOARDING)
    }
           //END

    Column(
        modifier = Modifier
            .background(neworange)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {
        Image(
            painter = painterResource(R.drawable.sokohub),
            contentDescription = "product",
            modifier = Modifier.size(300.dp)

        )

    }


}
@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}