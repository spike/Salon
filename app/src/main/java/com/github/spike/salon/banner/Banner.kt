package com.github.spike.salon.banner

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

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
        elevation = 2.dp,
        shape = RoundedCornerShape(16.dp)
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
                radius = size.minDimension / 6 + 2
            )
            drawCircle(
                color = Color.White,
                center = Offset(x = canvasWidth - 120, y = canvasHeight -18),
                radius = size.minDimension / 6
            )
        }
    }
}
