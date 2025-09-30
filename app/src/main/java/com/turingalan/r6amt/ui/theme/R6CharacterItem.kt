package com.turingalan.lazyapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.turingalan.r6amt.R

// Clase para guardar los datos de cada personaje
data class R6Personaje(
    val imagen: Int,
    val nombre: String,
    val descripcion: String
)

// Lista con todos los personajes
val personajes = listOf(
    R6Personaje(R.drawable.ash, "Ash", "Personaje de ataque 1"),
    R6Personaje(R.drawable.sledge, "Sledge", "Personaje de ataque 2"),
    R6Personaje(R.drawable.thatcher, "Thatcher", "Personaje de ataque 3"),
    R6Personaje(R.drawable.thermite, "Thermite", "Personaje de ataque 4"),
    R6Personaje(R.drawable.twitch, "Twitch", "Personaje de ataque 5"),
    R6Personaje(R.drawable.montagne, "Montagne", "Personaje de ataque 6"),
    R6Personaje(R.drawable.glaz, "Glaz", "Personaje de ataque 7"),
    R6Personaje(R.drawable.fuze, "Fuze", "Personaje de ataque 8"),
    R6Personaje(R.drawable.blitz, "Blitz", "Personaje de ataque 9"),
    R6Personaje(R.drawable.iq, "IQ", "Personaje de ataque 10"),
    R6Personaje(R.drawable.buck, "Buck", "Personaje de ataque 11"),
    R6Personaje(R.drawable.blackbeard, "Blackbeard", "Personaje de ataque 12"),
)

// Función para mostrar un personaje con su foto y datos
@Composable
fun R6PersonajeItem(
    imagen: Int,
    nombre: String,
    descripcion: String,
) {
    val imagenMod = Modifier.size(40.dp).clip(CircleShape)
    Row (
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = imagenMod,
            painter = painterResource(imagen),
            contentDescription = "Imagen del personaje",
            contentScale = ContentScale.Crop
        )
        Column (
            modifier = Modifier.padding(start = 16.dp)
        ){
            Text(text = nombre, style = MaterialTheme.typography.titleMedium)
            Text(text = descripcion)
        }
    }
}

// Función para enseñar la lista entera de personajes
@Composable
fun R6ListaPersonajes(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(personajes) { personaje ->
            R6PersonajeItem(
                imagen = personaje.imagen,
                nombre = personaje.nombre,
                descripcion = personaje.descripcion
            )
        }
    }
}

// Vista previa para comprobar que se ve bien en el preview
@Composable
@Preview(showBackground = true)
fun R6ListaPersonajesPreview() {
    R6ListaPersonajes()
}
