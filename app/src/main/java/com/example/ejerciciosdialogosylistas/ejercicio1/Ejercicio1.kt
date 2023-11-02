package com.example.ejerciciosdialogosylistas.ejercicio1

import androidx.compose.foundation.Image
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaEjercicio1(){

    val listaOpciones = arrayListOf("Hasbulla", "La pulga", "El bicho" , "pablo motos")


    ExposedDropdownMenuBox(expanded = false /*TODO: Declarar una variable de estado que gestione la expansion*/
        , onExpandedChange = { /*TODO: Modificar la variable de estado */ } ) {


        // TODO: Gestionar los eventos, añadir un icono, titulo y placeholder.
        TextField(value = "",
            onValueChange = {},
            readOnly = true
        )

        DropdownMenu(expanded = false /*TODO*/  , onDismissRequest = { /*TODO*/ }) {
            /*TODO: Añadir los diferentes elementos al menú, usando el Composable
            *  DropdownMenuItem, y la lista estática listaOpciones */
        }
    }
    
    /* TODO: Cargar la imagen en base al elemento seleccionado */
    //Image(painter = , contentDescription = null)



}