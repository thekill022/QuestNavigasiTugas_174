package com.example.myapplication.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Formulir(backToHome : () -> Unit) {

    var nama by remember {
        mutableStateOf("")
    }
    var alamat by remember {
        mutableStateOf("")
    }

    Column() {
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

        Row(
            modifier = Modifier
                .padding(start = 25.dp, top = 15.dp, end = 25.dp)
                .fillMaxWidth(),
        ) {
            radioOption.forEach { jk ->
                Row(
                    modifier = Modifier.selectable(
                        selected = (jk == selectedOption),
                        onClick = { onOptionSelected(jk) },
                        role = Role.RadioButton
                    )
                ) {
                    RadioButton(
                        selected = (jk == selectedOption),
                        onClick = null
                    )
                    Text(text = jk, modifier = Modifier.padding(end = 10.dp))
                }
            }
        }

        val statusOption = listOf<String>("Lajang", "Kawin", "Cerai")
        val (selectedStatus, onStatusselected) = remember {
            mutableStateOf(statusOption[0])
        }

        Text(text = "STATUS PERKAWINAN", modifier = Modifier.padding(start = 30.dp, top = 20.dp))
        Row (
            modifier = Modifier
                .padding(start = 25.dp, top = 15.dp, end = 25.dp)
                .fillMaxWidth(),
        ){
            statusOption.forEach{statuss ->
                Row(
                    modifier = Modifier.selectable(
                        selected = (statuss == selectedStatus),
                        onClick = {onStatusselected(statuss)},
                        role = Role.RadioButton
                    )
                ) {
                    
                    RadioButton(selected = (statuss == selectedStatus), onClick = null)
                    Text(text = statuss, modifier = Modifier.padding(end = 10.dp))
                    
                }
            }
        }

        Text(text = "ALAMAT", modifier = Modifier.padding(start = 30.dp, top = 20.dp))
        OutlinedTextField(
            value = alamat,
            onValueChange = { value ->
                alamat = value
            },
            label = { Text(text = "Alamat")},
            modifier = Modifier
                .padding(start = 30.dp, top = 10.dp, end = 30.dp)
                .fillMaxWidth()
        )
        
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = { backToHome() },
                modifier = Modifier
                    .padding(bottom = 25.dp)
                    .width(120.dp)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(2.dp, Color.Blue)
            ) {
                Text(text = "Kembali", color = Color.Blue)
            }

            var showDialog by remember {
                mutableStateOf(false)
            }
            Button(onClick = { showDialog = true },
                modifier = Modifier
                    .padding(bottom = 25.dp)
                    .width(120.dp)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue
                ),) {
                Text(text = "Submit")
            }

            if (showDialog) {
                AlertDialog(onDismissRequest = {
                    showDialog = false
                }, confirmButton = {
                    Button(onClick = { showDialog = false }) {
                        Text(text = "OK")
                    }
                },
                    title = { Text(text = "Data Berhasil Disimpan")},
                    text = { Text(text = "Nama \t\t\t\t\t\t\t\t: $nama\nJenis Kelamin \t: $selectedOption\nStatus \t\t\t\t\t\t\t: $selectedStatus\nAlamat \t\t\t\t\t\t\t: $alamat")})
            }

        }
        
    }
}