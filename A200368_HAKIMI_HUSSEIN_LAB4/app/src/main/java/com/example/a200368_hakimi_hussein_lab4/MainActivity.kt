package com.example.a200368_hakimi_hussein_lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge// Corrected import to use the theme from the current project
import com.example.a200368_hakimi_hussein_lab4.ui.theme.A200368_HAKIMI_HUSSEIN_LAB4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            // Use the correct theme for Lab 4
            A200368_HAKIMI_HUSSEIN_LAB4Theme {
                CupcakeApp()
            }
        }
    }
}
