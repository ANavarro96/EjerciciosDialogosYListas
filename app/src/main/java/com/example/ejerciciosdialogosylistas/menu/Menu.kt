package com.example.ejerciciosdialogosylistas.menu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun PantallaMenu(
    onNavigateToEjercicio1: () -> Unit,
    onNavigateToEjercicio2: () -> Unit,
    onNavigateToEjercicio3: () -> Unit,
    onNavigateToEjercicio4: () -> Unit
) {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        BotonMenu(texto = "Ejercicio 1", funcion = onNavigateToEjercicio1)
        BotonMenu(texto = "Ejercicio 2", funcion = onNavigateToEjercicio2)
        BotonMenu(texto = "Ejercicio 3", funcion = onNavigateToEjercicio3)
        BotonMenu(texto = "Ejercicio 4", funcion = onNavigateToEjercicio4)
    }
}

@Composable
fun BotonMenu(texto: String, funcion: () -> Unit) {
    Button(onClick = funcion) {
        Text(texto)
    }
}
