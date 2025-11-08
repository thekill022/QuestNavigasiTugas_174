package com.example.myapplication.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SplashScreen(modifier : Modifier) {
    
    Column {
        Text(text = "Selamat Datang", modifier = Modifier.fillMaxWidth().padding(top = 90.dp), fontSize = 26.sp, textAlign = TextAlign.Center)

    }
    
}