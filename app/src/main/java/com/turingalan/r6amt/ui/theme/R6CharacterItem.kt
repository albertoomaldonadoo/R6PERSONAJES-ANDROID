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
import com.turingalan.r6amt.data.Personaje
import com.turingalan.r6amt.data.PersonajesRepositorio

@Composable
fun R6PersonajeItem(personaje: Personaje) {

    Row (
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier.size(40.dp).clip(CircleShape),
            painter = painterResource(personaje.imagen),
            contentDescription = "Imagen del personaje",
            contentScale = ContentScale.Crop
        )
        Column (
            modifier = Modifier.padding(start = 16.dp)
        ){
            Text(text = personaje.nombre, style = MaterialTheme.typography.titleMedium)
            Text(text = personaje.descripcion)
        }
    }

}

@Composable
fun R6ListaPersonajes(modifier: Modifier = Modifier) {
    val personajes : List<Personaje> = PersonajesRepositorio.cogerPersonajes()
    LazyColumn(modifier = modifier) {
        items(
            items = personajes,
            key = {it.nombre}
        ){
            personaje->
            R6PersonajeItem(
                personaje = personaje
            )
        }
    }

}

@Composable
@Preview(showBackground = true)
fun R6ListaPersonajesPreview() {
    R6ListaPersonajes()
}
