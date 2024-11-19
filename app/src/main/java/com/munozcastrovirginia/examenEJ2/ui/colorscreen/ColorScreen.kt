package com.munozcastrovirginia.examenEJ2.ui.colorscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp



@Composable
fun ColorScreen() {

    var color by remember { mutableStateOf(Color.Gray) }

    SeleccionarColor(color, cambiarColor = {color = it})
}

@Composable
fun SeleccionarColor(color: Color, cambiarColor: (Color)-> Unit) {

    val listaColores = listOf(
        Color.Red,
        Color.Blue,
        Color.Gray,
        Color.Black,
        Color.Green,
        Color.Yellow,
        Color.Magenta,
        Color.Cyan,
        Color.White,
    )

    Column {
        Row(
            modifier = Modifier.padding(16.dp),
        ) {
            listaColores.forEach { color ->
                Column(
                    modifier = Modifier.background(color).padding(20.dp).clickable { cambiarColor(color) },

                    ) {

                }
                Spacer(modifier = Modifier.width(8.dp))
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Box(
                modifier = Modifier
                    .background(color)
                    .padding(16.dp)
            ) {
                Text(text = "Color Seleccionado: ${color.toString()}")
            }
        }
    }
}