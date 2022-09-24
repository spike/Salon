package com.github.spike.salon.banner

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.spike.salon.R
import com.github.spike.salon.ui.theme.SalonTheme


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Banner() {
    Card(
        modifier = Modifier
            .padding(
                start = 24.dp,
                end = 24.dp,
                top = 16.dp,
                bottom = 16.dp
            ),
        onClick = {

        },
        elevation = 2.dp,
        shape = RoundedCornerShape(16.dp),
        backgroundColor = Color(0xFFCBF5D7)

    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.End,
        ) {
                Text(
                    text = "Accumulate 20 points and get a free visit",
                    modifier = Modifier.padding(
                        start = 32.dp,
                        end = 32.dp,
                        top = 8.dp,
                    ),
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.SemiBold
                )
            Box () {

                Card(
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                        .align(alignment = Alignment.CenterEnd)
                    ,
                    shape = CircleShape,
                ) {

                }
                CallToActionArrow()
            }


        }
    }
}

@Composable
fun CallToActionArrow() {
    Canvas(modifier = Modifier
        .width(90.dp)
        .height(30.dp)

    ) {
        val canvasWidth = size.width
        val canvasHeight = size.height

        drawLine(
            start = Offset(x = canvasWidth-34f, y = canvasHeight/2),
            end = Offset(x = 20f, y = canvasHeight/2),
            color = Color.Black,
            strokeWidth = 4f
        )
    }
}

//@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SalonTheme {
        Column() {
            Banner()
        }
    }
}