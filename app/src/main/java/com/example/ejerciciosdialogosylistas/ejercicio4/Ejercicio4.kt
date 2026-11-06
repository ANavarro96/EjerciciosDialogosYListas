package com.example.ejerciciosdialogosylistas.ejercicio4

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExpandedFullScreenSearchBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.SearchBarValue
import androidx.compose.material3.Text
import androidx.compose.material3.rememberSearchBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaEjercicio4() {
    /* Esta lista es inmutable */
    val listaNombres = listOf(
        "El Xokas", "Jordi Wild", "Ibai Llanos", "Rubius", "WillyRex",
        "Zazza el italiano", "Filthy Frank", "ZelenDust", "Sasel Landia",
        "8", "Mr Jagger", "Señor Bestia", "Asmongold", "XQC"
    )

    /* TODO: ¿Por qué hay que crear esto? */
    val listaMutable =
        remember { mutableStateListOf<String>().apply { addAll(listaNombres) } }

    var buscado by remember { mutableStateOf("") }
    val scope = rememberCoroutineScope() // Similar a un Thread en java

    Column(modifier = Modifier.fillMaxSize()) {
        /* TODO: Usar textFieldState y searchBarState para la gestión de búsqueda y expansión */
        var estadoBarra = rememberSearchBarState()
        var estadoTexto = rememberTextFieldState()
        // TODO: Implementar la SearchBar con su SearchBarDefaults.InputField e icono de búsqueda.
       SearchBar(
            state = estadoBarra,
            inputField = {
                SearchBarDefaults.InputField(
                    textFieldState = estadoTexto,
                    searchBarState = estadoBarra,
                    onSearch = {
                        buscado = estadoTexto.text.toString()
                        scope.launch {
                            estadoBarra.animateToCollapsed()
                        }

                    },
                    placeholder = { Text("Buscar...") },
                    leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Buscar") }
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        ExpandedFullScreenSearchBar(
            state = estadoBarra,
            inputField = {
                SearchBarDefaults.InputField(
                    textFieldState = estadoTexto,
                    searchBarState = estadoBarra,
                    onSearch = {
                        buscado = estadoTexto.text.toString()
                        scope.launch {
                            estadoBarra.animateToCollapsed()
                        }

                    },
                    placeholder = { Text("Buscar...") },
                    leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Buscar") }
                )
            }
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
            ) {
                items(listaMutable){
                    if(it.contains(estadoTexto.text, ignoreCase = true)){

                        ListItem(headlineContent = {Text(it)}
                            , Modifier.clickable{
                                buscado = it
                                scope.launch { // run de java
                                    estadoBarra.animateToCollapsed()
                                }

                            })
                    }

                }
            /* TODO:
                Mostrar los elementos de listaNombres filtrados usando el composable ListItem */

            }

        }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            //
           items(listaMutable){ youtuber ->
               // si el youtuber es el seleccionado...
               // if seleccionado, if youtuber == seleccionado
               if(youtuber.contains(buscado)) {
                   Text(youtuber, modifier = Modifier.size(150.dp))
               }
           }
        }
    }
}
