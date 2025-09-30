package com.turingalan.r6amt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.turingalan.lazyapp.ui.R6ListaPersonajes
import com.turingalan.r6amt.ui.theme.R6AMTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // quita los bordes y usa toda la pantalla
        setContent {
            R6AMTTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Aquí muestro la lista de personajes y le paso el padding
                    R6ListaPersonajes(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Saludo(nombre: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hola $nombre!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun SaludoPreview() {
    R6AMTTheme {
        Saludo("Android")
    }
}
