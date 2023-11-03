package com.example.ejerciciosdialogosylistas.ejercicio1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.ejerciciosdialogosylistas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaEjercicio1(){

    val listaOpciones = arrayListOf("Hasbulla", "La pulga", "El bicho" , "pablo motos")

    Column(){
        ExposedDropdownMenuBox(
            modifier = Modifier.fillMaxWidth()
            ,expanded = false /*TODO: Declarar una variable de estado que gestione la expansion*/
            , onExpandedChange = { /*TODO: Modificar la variable de estado */ } ) {


            // TODO: Gestionar los eventos, añadir un icono, titulo y placeholder.
            TextField(value = "",
                onValueChange = {},
                readOnly = true,
                modifier = Modifier.fillMaxWidth().menuAnchor()
            )

            DropdownMenu(expanded = false /*TODO*/  , onDismissRequest = { /*TODO*/ }) {
                /*TODO: Añadir los diferentes elementos al menú, usando el Composable
                *  DropdownMenuItem, y la lista listaOpciones */
            }
        }

        /* TODO: Cargar la imagen en base al elemento seleccionado */
        Image(painter = painterResource(id = R.drawable.pablo_motos)
            , contentDescription = null,
            modifier = Modifier.fillMaxSize())

    }



}