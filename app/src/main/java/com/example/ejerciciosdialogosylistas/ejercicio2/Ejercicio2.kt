package com.example.ejerciciosdialogosylistas.ejercicio2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.ejerciciosdialogosylistas.utils.FuncionesUtiles

@Composable
fun PantallaEjercicio2(){

    var openDialog by remember { mutableStateOf(false) }
    var colorBoton by remember { mutableStateOf(Color.Yellow) }

    Column(Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { openDialog = true },
            colors = ButtonDefaults.buttonColors(containerColor = colorBoton)) {
            Text(text = "Cambiame por favor estoy desesperado")
        }

        /* TODO: Activar/desactivar el estado para mostrar el dialogo */
        if (openDialog){
            Dialogo(  { openDialog = false }, onChangeColor
            = { colorBoton = Color.Red
            openDialog = false})
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dialogo(onDismissRequest: () -> Unit, onChangeColor: () -> Unit){
    AlertDialog(onDismissRequest = onDismissRequest,
    confirmButton = { BotonConfirmar(onChangeColor) },
    title = { Text("Ejemplo de dialogo")},
    text = { Text("Al darle a OK, se cambiará el color asociado al botón")},
    containerColor = Color.Yellow)
}

@Composable
fun BotonConfirmar( onChangeColor: () -> Unit){
    Button(onClick ={
        onChangeColor()
    }) {
        Text("Cambiar Color")
    }
}
