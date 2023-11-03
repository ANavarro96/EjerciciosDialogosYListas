package com.example.ejerciciosdialogosylistas.ejercicio3

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ElementoListaSlider(){
    Row(
        Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)) {
        var valorSlider by remember { mutableFloatStateOf(0f) }
        Slider(value = valorSlider,
            onValueChange = { valorSlider = it},
            modifier = Modifier.weight(1f))
        IconButton(onClick = { /*TODO: Navegar hacia DetalleEjercicio3, pasando el valor del Slider*/ }) {
            Icon(Icons.Outlined.Done, contentDescription = null)
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewElementoList(){
    ElementoListaSlider()
}