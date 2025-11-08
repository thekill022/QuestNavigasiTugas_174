package com.example.myapplication.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DisplayData(modifier : Modifier) {

    val data : List<Map<String, String>> = listOf(
        mapOf(
            "nama" to "Gibran Fathoni Belva",
            "jenis_kelamin" to "Laki - Laki",
            "status" to "Lajang",
            "alamat" to "Bantul"
        ),
        mapOf(
            "nama" to "Andhika Pratama",
            "jenis_kelamin" to "Laki - Laki",
            "status" to "Kawin",
            "alamat" to "Sleman"
        )
    )

    Column {
        Text(text = "List Daftar Peserta", fontSize = 35.sp, fontWeight = FontWeight.Medium, modifier = Modifier.padding(top = 25.dp, start = 10.dp, bottom = 20.dp))

        Card(modifier = Modifier
            .fillMaxWidth()
            .height(170.dp)
            .padding(10.dp)) {
            Row(
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
               Column {
                   Text(text = "NAMA LENGKAP")
                   Text(text = "Gibran Fathoni Belva", modifier = Modifier.padding(bottom = 20.dp))

                   Text(text = "STATUS PERKAWINAN")
                   Text(text = "Lajang")

               }
                Column {
                    Text(text = "JENIS KELAMIN")
                    Text(text = "Laki - Laki", modifier = Modifier.padding(bottom = 20.dp))

                    Text(text = "ALAMAT")
                    Text(text = "Bantul")

                }
            }
        }

    }
    
}