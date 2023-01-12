package com.luismakeapp.mvvmsimple.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MVVMLayout(
    MVVMViewModel: MVVMViewModel = viewModel()
){
    val mvvmUiState by MVVMViewModel.uiState.collectAsState()

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "MVVM Implement", fontSize = 32.sp)
        Text(text = mvvmUiState.word, fontSize = 32.sp)
        Row {
            Button(onClick = { MVVMViewModel.previousWord() }) {
                Text(text = "Previous")
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(onClick = { MVVMViewModel.nextWord() }) {
                Text(text = "Next")
            }
        }
    }
}