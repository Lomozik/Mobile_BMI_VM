package com.example.bmi_vm.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.text.DecimalFormat

class BMIViewModel: ViewModel() {
    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")
    val height:Float
        get(){
            return heightInput.toFloatOrNull()?:0.0f
        }
    val weight:Int
        get(){
            return weightInput.toIntOrNull()?:0
        }
    val bmi: String
        get() {
            var bmi_calc = 0.0f
            if (weight > 0 && height > 0){
                bmi_calc = weight / (height * height)
            }
            return bmi_calc.toString()
        }
}