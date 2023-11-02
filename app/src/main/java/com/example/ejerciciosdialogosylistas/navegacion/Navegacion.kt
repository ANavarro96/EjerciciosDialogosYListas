package com.example.ejerciciosdialogosylistas.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ejerciciosdialogosylistas.ejercicio1.PantallaEjercicio1
import com.example.ejerciciosdialogosylistas.ejercicio2.PantallaEjercicio2
import com.example.ejerciciosdialogosylistas.ejercicio3.DetalleEjercicio3
import com.example.ejerciciosdialogosylistas.ejercicio3.PantallaEjercicio3
import com.example.ejerciciosdialogosylistas.menu.PantallaMenu
import com.example.ejerciciosdialogosylistas.modelo.Rutas

@Composable
fun GrafoNavegacion(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Rutas.MainMenu.ruta){

        composable(Rutas.MainMenu.ruta){
            PantallaMenu(navController = navController)
        }

        composable(Rutas.EjercicioDropDown.ruta){
            PantallaEjercicio1()
        }

        composable(Rutas.EjercicioDialogo.ruta){
            PantallaEjercicio2()
        }

        composable(Rutas.EjercicioLista.ruta){
            PantallaEjercicio3()
        }

        composable(Rutas.DetalleLista.ruta + "/{multiplicador}"){
            DetalleEjercicio3(multiplicador = it.arguments!!.getString("multiplicador")!!.toFloat())
        }


    }

}