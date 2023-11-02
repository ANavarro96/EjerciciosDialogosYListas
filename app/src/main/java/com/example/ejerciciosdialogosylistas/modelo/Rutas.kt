package com.example.ejerciciosdialogosylistas.modelo

sealed class Rutas(val ruta: String){
    object EjercicioDialogo : Rutas("dialogo")
    object MainMenu : Rutas("menu")
    object EjercicioLista : Rutas("listas")
    object EjercicioDropDown : Rutas("drop")
    object DetalleLista : Rutas("detalle")
}
