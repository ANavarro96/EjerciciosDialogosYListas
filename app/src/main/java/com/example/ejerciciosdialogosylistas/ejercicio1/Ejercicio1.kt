package com.example.ejerciciosdialogosylistas.ejercicio1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuAnchorType.Companion.PrimaryNotEditable
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.MenuAnchorType
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.ejerciciosdialogosylistas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaEjercicio1(){

    val listaOpciones = arrayListOf("Hasbulla", "La pulga", "El bicho" , "pablo motos")
    val textFieldState = rememberTextFieldState()

    Column(){

        ExposedDropdownMenuBox(
            modifier = Modifier.fillMaxWidth()
            ,expanded = false /*TODO: Declarar una variable de estado que gestione la expansion*/
            , onExpandedChange = { /*TODO: Modificar la variable de estado */ } ) {


            // TODO: Gestionar los eventos, añadir un icono, titulo y placeholder.
            TextField(
                state = textFieldState,
                readOnly = true,
                modifier = Modifier.fillMaxWidth()
                    .menuAnchor(
                        PrimaryNotEditable, enabled = true)
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
