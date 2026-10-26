package com.example.ejerciciosdialogosylistas.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.ejerciciosdialogosylistas.ejercicio1.PantallaEjercicio1
import com.example.ejerciciosdialogosylistas.ejercicio2.PantallaEjercicio2
import com.example.ejerciciosdialogosylistas.ejercicio3.DetalleEjercicio3
import com.example.ejerciciosdialogosylistas.ejercicio3.PantallaEjercicio3
import com.example.ejerciciosdialogosylistas.menu.PantallaMenu
import com.example.ejerciciosdialogosylistas.modelo.Rutas

@Composable
fun GrafoNavegacion() {

    val backStack = rememberNavBackStack(Rutas.MainMenu)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {

            entry<Rutas.MainMenu> {
                PantallaMenu(
                    onNavigateToEjercicio1 = { backStack.add(Rutas.EjercicioDropDown) },
                    onNavigateToEjercicio2 = { backStack.add(Rutas.EjercicioDialogo) },
                    onNavigateToEjercicio3 = { backStack.add(Rutas.EjercicioLista) }
                )
            }

            entry<Rutas.EjercicioDropDown> {
                PantallaEjercicio1()
            }

            entry<Rutas.EjercicioDialogo> {
                PantallaEjercicio2()
            }

            entry<Rutas.EjercicioLista> {
                PantallaEjercicio3()
            }

            entry<Rutas.DetalleLista> {
                /* TODO: Tenemos que gestionar la navegación aquí */
                DetalleEjercicio3(multiplicador = 1.0f)
            }
        }
    )
}
