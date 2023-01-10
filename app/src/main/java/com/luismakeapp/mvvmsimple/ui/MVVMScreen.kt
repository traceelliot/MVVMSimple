package com.luismakeapp.mvvmsimple.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MVVMLayout(){
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "MVVM Implement", fontSize = 32.sp)
        TextField(value = "", onValueChange = {})
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Previous")
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Next")
            }
        }
    }
}