package com.example.bmi_vm.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bmi_vm.R
import com.example.bmi_vm.viewmodels.BMIViewModel

@Composable
fun BMIscreen(modifier: Modifier, myViewModel: BMIViewModel = viewModel()) {
/*    Button(
        modifier = Modifier.padding(all = 48.dp).fillMaxWidth(),
        onClick = {
            myViewModel.increment()
        }
    ) {
        Text(text="Count ${myViewModel.count}")
    }*/
    Column {
        Text (
            text = stringResource(R.string.body_mass_index),
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center,
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )
        OutlinedTextField(
            value = myViewModel.heightInput,
            onValueChange = {myViewModel.heightInput = it.replace(',','.')},
            label = {Text(stringResource(R.string.height))},
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp)
        )
        OutlinedTextField(
            value = myViewModel.weightInput,
            onValueChange = {myViewModel.weightInput = it.replace(',','.')},
            label = {Text(stringResource(R.string.weight))},
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp)
        )
        Text(
            text = stringResource(R.string.body_mass_index_is, myViewModel.bmi, myViewModel.height, myViewModel.weight),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 16.dp)
        )
    }
}