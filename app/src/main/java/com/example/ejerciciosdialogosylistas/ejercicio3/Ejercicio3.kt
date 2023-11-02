package com.example.ejerciciosdialogosylistas.ejercicio3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import kotlin.random.Random

@Composable
fun PantallaEjercicio3() {

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        repeat(15) {
            /* TODO : Crear 15 componentes ElementoLista, cada uno con su Slider de un color random.
            *   ¿Cuál es el estado de cada Slider? ¿Cómo establecemos lo que tienen que hacer?*/
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

/*
 * Funcion que devuelve un Color generado al azar.
 */
fun ColorRandom(): Color {
    val r = Random.nextInt(256)
    val g = Random.nextInt(256)
    val b = Random.nextInt(256)
    return Color(r, g, b)
}