package com.example.bmi_vm.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.bmi_vm.ui.screens.BMIscreen
import com.example.bmi_vm.ui.theme.BMI_VMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BMI_VMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BMIscreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
