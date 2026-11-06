package com.example.ejerciciosdialogosylistas.ejercicio1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.text.input.setTextAndPlaceCursorAtEnd
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuAnchorType.Companion.PrimaryNotEditable
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.MenuAnchorType
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.ejerciciosdialogosylistas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaEjercicio1(){

    val listaOpciones =
        arrayListOf("Hasbulla", "La pulga", "El bicho" , "pablo motos")
    val textFieldState = rememberTextFieldState()

    var open by remember { mutableStateOf(false) }
    var imagen by remember { mutableIntStateOf(R.drawable.pablo_motos) }

    Column(){

        ExposedDropdownMenuBox(
            modifier = Modifier.fillMaxWidth()
            ,expanded = open
            , onExpandedChange = { nuevoEstado
                -> open = nuevoEstado } ) {


            // TODO: Gestionar los eventos, añadir un icono, titulo y placeholder.
            TextField(
                state = textFieldState,
                readOnly = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .menuAnchor(
                        PrimaryNotEditable, enabled = true
                    )
            )

            DropdownMenu(expanded = open  ,
                onDismissRequest = {
                    open = false
                }) {
                /*TODO: Añadir los diferentes elementos al menú, usando el Composable
                *  DropdownMenuItem, y la lista listaOpciones */
                listaOpciones.forEach {
                    DropdownMenuItem(
                        text = { Text(it) },
                        onClick = {
                            textFieldState.setTextAndPlaceCursorAtEnd(
                                it)
                            if(it == "Hasbulla") imagen = R.drawable.hasbulla
                            else if (it == "La pulga") imagen = R.drawable.messi
                            else if (it == "El bicho") imagen = R.drawable.cr7
                            else imagen = R.drawable.pablo_motos
                            open = false
                        }
                    )
                }

            }
        }

        /* TODO: Cargar la imagen en base al elemento seleccionado */
        Image(painter = painterResource(id = imagen)
            , contentDescription = null,
            modifier = Modifier.fillMaxSize())

    }

}
