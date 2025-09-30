package com.turingalan.lazyapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.turingalan.r6amt.R

@Composable
fun R6CharacterItem(
    image: Int,
    title: String,
    description: String,
) {
    val imageModifier = Modifier.size(40.dp).clip(CircleShape)
    Row (
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = imageModifier,
            painter = painterResource(image),
            contentDescription = "Imagen personaje",
            contentScale = ContentScale.Crop
        )
        Column (
            modifier = Modifier.padding(start = 16.dp)
        ){
            Text(text = title, style = MaterialTheme.typography.titleMedium)
            Text(text = description)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun R6CharacterItemPreview() {
    R6CharacterItem(
        image = R.drawable.ash,
        title = "Ash",
        description = "Personaje de ataque"
    )
}
