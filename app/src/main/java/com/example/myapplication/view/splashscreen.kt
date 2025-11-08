package com.example.myapplication.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun SplashScreen(modifier : Modifier) {

    val img = R.drawable.todo
    
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Selamat Datang", modifier = Modifier
            .fillMaxWidth()
            .padding(top = 120.dp),
            fontSize = 26.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold)
        Image(painter = painterResource(id = img), contentDescription = "ToDo icon")
        Text(text = "Gibran Fathoni Belva", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
        Text(text = "20230140174", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
        Button(onClick = { /*TODO*/ }, modifier = Modifier
            .width(300.dp)
            .height(70.dp)
            .padding(top = 20.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Blue) ) {
            Text(text = "Masuk")
        }
    }
    
}