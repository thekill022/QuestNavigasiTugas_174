package com.example.myapplication.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Formulir(modifier : Modifier) {

    val nama by remember {
        mutableStateOf("")
    }
    val jk by remember {
        mutableStateOf("")
    }
    val status by remember {
        mutableStateOf("")
    }
    val alamat by remember {
        mutableStateOf("")
    }

    Column(modifier) {
        Text(text = "Formulir Pendaftaran", modifier = Modifier.padding(20.dp), fontSize = 30.sp)

    }
}