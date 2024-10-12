package com.nurlanamirzayeva.skyecho

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.nurlanamirzayeva.skyecho.ui.theme.SkyEchoTheme
import com.nurlanamirzayeva.skyecho.ui.screens.WeatherScreen

class MainActivity : ComponentActivity() {
    @SuppressLint("InlinedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SkyEchoTheme {
               WeatherScreen()
            }
        }

        window.setFlags(

            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        window.decorView.systemUiVisibility=
            window.decorView.systemUiVisibility or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
    }



}

