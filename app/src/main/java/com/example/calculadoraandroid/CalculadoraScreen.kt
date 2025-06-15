package com.example.calculadoraandroid

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CalculadoraScreen(){

    Column {
        Text(text="Escribe tu expresión", modifier= Modifier.weight(1f).fillMaxWidth())

        Column(modifier= Modifier.weight(6f)){
            Row {
                Text(text="1", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
                Text(text="2", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
                Text(text="3", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
                Text(text="+", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
            }

            Row {
                Text(text="4", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
                Text(text="5", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
                Text(text="6", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
                Text(text="-", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
            }

            Row {
                Text(text="7", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
                Text(text="8", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
                Text(text="9", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
                Text(text="*", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
            }

            Row {
                Text(text="0", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
                Text(text=",", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
                Text(text="DEL", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
                Text(text="/", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
            }

            Row {
                Text(text="AC", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
                Text(text="=", textAlign = TextAlign.Center ,modifier= Modifier.weight(1f).fillMaxWidth())
            }
        }
    }

}

@Preview (showBackground = true)
@Composable
fun CalculadoraScreenPreview(){
    CalculadoraScreen()
}