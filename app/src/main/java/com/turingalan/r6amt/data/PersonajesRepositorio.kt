package com.turingalan.r6amt.data

import com.turingalan.r6amt.R

object PersonajesRepositorio {
    fun cogerPersonajes(): List<Personaje>{
        return listOf(
            Personaje(R.drawable.ash,
                "Ash",
                "Personaje de ataque 1"),
            Personaje(R.drawable.sledge,
                "Sledge",
                "Personaje de ataque 2"),
            Personaje(R.drawable.thatcher,
                "Thatcher",
                "Personaje de ataque 3"),
            Personaje(R.drawable.thermite,
                "Thermite",
                "Personaje de ataque 4"),
            Personaje(R.drawable.twitch,
                "Twitch",
                "Personaje de ataque 5"),
            Personaje(R.drawable.montagne,
                "Montagne",
                "Personaje de ataque 6"),
            Personaje(R.drawable.glaz,
                "Glaz",
                "Personaje de ataque 7"),
            Personaje(R.drawable.fuze,
                "Fuze",
                "Personaje de ataque 8"),
            Personaje(R.drawable.blitz,
                "Blitz",
                "Personaje de ataque 9"),
            Personaje(R.drawable.iq,
                "IQ",
                "Personaje de ataque 10"),
            Personaje(R.drawable.buck,
                "Buck",
                "Personaje de ataque 11"),
            Personaje(R.drawable.blackbeard,
                "Blackbeard",
                "Personaje de ataque 12"),
        )
    }
}