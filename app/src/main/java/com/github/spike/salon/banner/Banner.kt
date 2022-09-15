package com.github.spike.salon.banner

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
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
                start = 32.dp,
                end = 24.dp,
                top = 24.dp,
                bottom = 24.dp
            )
            .width(IntrinsicSize.Max),
        onClick = {

        },
        elevation = 2.dp,
        shape = RoundedCornerShape(16.dp),
        backgroundColor = Color(0xFFCBF5D7)

    ) {
        Text(
            text = "Accumulate 20 points and get a free visit.",
            modifier = Modifier.padding(
                start = 32.dp,
                end = 32.dp,
                top = 24.dp,
                bottom = 24.dp
            ),
            style = MaterialTheme.typography.h6
        )
        Canvas(modifier = Modifier.fillMaxSize(.1f)) {
            val canvasWidth = size.width
            val canvasHeight = size.height
            drawCircle(
                color = Color.DarkGray,
                center = Offset(x = canvasWidth - 120, y = canvasHeight -18),
                radius = size.minDimension / 6
            )
            drawCircle(
                color = Color.White,
                center = Offset(x = canvasWidth - 120, y = canvasHeight -18),
                radius = size.minDimension / 6
            )
        }
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