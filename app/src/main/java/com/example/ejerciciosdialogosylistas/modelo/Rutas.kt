package com.example.ejerciciosdialogosylistas.modelo

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface Rutas : NavKey {
    @Serializable
    data object EjercicioDialogo : Rutas

    @Serializable
    data object MainMenu : Rutas

    @Serializable
    data object EjercicioLista : Rutas

    @Serializable
    data object EjercicioDropDown : Rutas

    @Serializable
    data object EjercicioSearch : Rutas

    @Serializable
    data class DetalleLista(val multiplicador: Float) : Rutas
}
