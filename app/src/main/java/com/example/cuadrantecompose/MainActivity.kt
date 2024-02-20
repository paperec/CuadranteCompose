package com.example.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Cuadrante()
                }
            }
        }
    }
}

@Composable
private fun subCuadrante(
    titulo: String,
    texto: String,
    fondo: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(fondo)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = texto,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun Cuadrante() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            subCuadrante(
                titulo = stringResource(R.string.titulo1),
                texto = stringResource(R.string.texto1),
                fondo = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            subCuadrante(
                titulo = stringResource(R.string.titulo2),
                texto = stringResource(R.string.texto2),
                fondo = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            subCuadrante(
                titulo = stringResource(R.string.titulo3),
                texto = stringResource(R.string.texto3),
                fondo = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            subCuadrante(
                titulo = stringResource(R.string.titulo4),
                texto = stringResource(R.string.texto4),
                fondo = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteComposeTheme {
        Cuadrante()
    }
}