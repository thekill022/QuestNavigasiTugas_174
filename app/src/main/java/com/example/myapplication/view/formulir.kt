package com.example.myapplication.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Formulir(modifier : Modifier) {

    var nama by remember {
        mutableStateOf("")
    }
    var jk by remember {
        mutableStateOf("")
    }
    var status by remember {
        mutableStateOf("")
    }
    var alamat by remember {
        mutableStateOf("")
    }

    Column(modifier) {
        Text(text = "Formulir Pendaftaran", modifier = Modifier.padding(15.dp), fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Text(text = "NAMA LENGKAP", modifier = Modifier.padding(start = 30.dp, top = 10.dp))
        OutlinedTextField(
            value = nama, 
            onValueChange = { value -> 
            nama = value 
        },
            label = { Text(text = "Nama Lengkap")},
            modifier = Modifier
                .padding(start = 30.dp, top = 10.dp, end = 30.dp)
                .fillMaxWidth()
            )

        Text(text = "JENIS KELAMIN", modifier = Modifier.padding(start = 30.dp, top = 20.dp))

        val radioOption = listOf<String>("Laki - Laki", "Perempuan")
        val (selectedOption, onOptionSelected) = remember {
            mutableStateOf(radioOption[0])
        }

    }
}