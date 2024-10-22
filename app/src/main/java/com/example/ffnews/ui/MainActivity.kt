package com.example.ffnews.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.ffnews.ui.theme.MyappTheme
import androidx.compose.material3.Text
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.example.ffnews.presentation.onboarding.OnBoardingScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        installSplashScreen()
        //enableEdgeToEdge()
        setContent {
            MyappTheme {
                Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)) {
                    OnBoardingScreen()
                }
            }
        }
    }
}