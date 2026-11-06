package com.example.ejerciciosdialogosylistas.ejercicio3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun PantallaEjercicio3(onSliderPulsado: (Float) -> Unit) {

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(30) { // for each
            // Se pintarán tantos elementos como quepan en pantalla
            ElementoListaSlider(onSliderPulsado)
        }
    }
}


@Composable
fun DetalleEjercicio3(multiplicador : Float){
    Column(Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "Hola, soy un texto aqui bien tranquilote", fontSize = 200.sp * multiplicador)
    }
}
