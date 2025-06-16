package com.example.calculadoraandroid

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculadoraScreen(){

    Column (modifier= Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(16.dp)
    ){
        Box(
            modifier = Modifier
                .padding(8.dp)
                .clip(RoundedCornerShape(12.dp))
                .fillMaxWidth()
                .background(Color.Black)
                .border(1.dp, Color.Black),
            contentAlignment = Alignment.Center
        ){
            Text(
                text="MI CASIO",
                textAlign = TextAlign.Center,
                fontSize = 40.sp,
                color = Color.White
            )
        }


        Spacer(modifier = Modifier.height(8.dp))

        Box(
            modifier = Modifier
                .padding(8.dp)
                .weight(1f)
                .clip(RoundedCornerShape(12.dp))
                .fillMaxWidth()
                .background(Color.LightGray)
                .border(1.dp, Color.Black),
            contentAlignment = Alignment.BottomEnd
        ){
            Text(
                text="_",
                textAlign = TextAlign.End,
                fontSize = 32.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Column(
            modifier= Modifier
                .weight(6f)
                .fillMaxWidth()
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="1", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.Black)
                }
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="2", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.Black)
                }
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="3", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.Black)
                }

                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.Blue)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="+", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.White)
                }

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="4", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.Black)
                }
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="5", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.Black)
                }
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="6", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.Black)
                }
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.Blue)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="-", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.White)
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="7", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.Black)
                }
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="8", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.Black)
                }
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="9", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.Black)
                }
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.Blue)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="*", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.White)
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="0", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.Black)
                }
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text=",", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.Black)
                }
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.Red)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="DEL", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.White)
                }
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.Blue)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="/", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.White)
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.Red)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="AC", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.White)
                }
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .weight(1f)
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.Green)
                        .border(1.dp, Color.Black),
                    contentAlignment = Alignment.Center
                ){
                    Text(text="=", textAlign = TextAlign.Center, fontSize = 28.sp, color = Color.White)
                }
            }
        }
    }

}

@Preview (showBackground = true)
@Composable
fun CalculadoraScreenPreview(){
    CalculadoraScreen()
}