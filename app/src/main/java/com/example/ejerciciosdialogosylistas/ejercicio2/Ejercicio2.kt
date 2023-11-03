package com.example.ejerciciosdialogosylistas.ejercicio2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun PantallaEjercicio2(){
    Column(Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { /*TODO: Hay que mostrar el dialogo*/ }) {
            Text(text = "Cambiame por favor estor desesperado")
        }
        /* TODO: Activar/desactivar el estado para mostrar el dialogo */
        //Dialogo()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dialogo(){
    AlertDialog(onDismissRequest = { /*TODO: Modificar el estado para cerrar el dialogo*/ },
    confirmButton = { BotonConfirmar() },
    title = { Text("Ejemplo de dialogo")},
    text = { Text("Al darle a OK, se cambiará el color asociado al botón")},
    containerColor = Color.Yellow)
}

@Composable
fun BotonConfirmar(){
    Button(onClick = { /*TODO: La funcion que cambie el color del botón de la UI */ }) {
        Text("Cambiar Color")
    }
}


