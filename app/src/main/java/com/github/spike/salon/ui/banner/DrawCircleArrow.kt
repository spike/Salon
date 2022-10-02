package com.github.spike.salon.ui.banner

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.spike.salon.ui.theme.SalonTheme

@Composable
fun DrawCircleArrow(modifier: Modifier) {
    Box () {
        Card(
            modifier = modifier
                .width(30.dp)
                .height(30.dp)
                .align(alignment = Alignment.CenterEnd)
            ,
            shape = CircleShape,
        ) {

        }
        Canvas(modifier = modifier
            .width(90.dp)
            .height(30.dp)

        ) {
            val canvasWidth = size.width
            val canvasHeight = size.height

            drawLine(
                start = Offset(x = canvasWidth/6, y = canvasHeight/2),
                end = Offset(x = 7*canvasWidth/8, y = canvasHeight/2),
                color = Color.Black,
                strokeWidth = 4f
            )
            drawLine(
                start = Offset(x = 7*canvasWidth/8-10.dp.toPx(), y = canvasHeight/2+18),
                end = Offset(x = 7*canvasWidth/8, y = canvasHeight/2),
                color = Color.Black,
                strokeWidth = 6f,
                cap= StrokeCap.Round
            )
            drawLine(
                start = Offset(x =7*canvasWidth/8-10.dp.toPx(), y = canvasHeight/2-18),
                end = Offset(x = 7*canvasWidth/8, y = canvasHeight/2),
                color = Color.Black,
                strokeWidth = 6f,
                cap= StrokeCap.Round

            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultCircleArrowPreview() {
    SalonTheme {
        DrawCircleArrow(modifier = Modifier)
    }
}
@Preview(showBackground = true, device = Devices.PIXEL_3_XL)
@Composable
fun DefaultCircleArrowPreviewOnPixelXL() {
    SalonTheme {
        DrawCircleArrow(modifier = Modifier)
    }
}
@Preview(showBackground = true, device = Devices.PIXEL)
@Composable
fun DefaultCircleArrowPreviewOnPixel() {
    SalonTheme {
        DrawCircleArrow(modifier = Modifier)
    }
}
@Preview(showBackground = true, device = Devices.NEXUS_5)
@Composable
fun DefaultCircleArrowPreviewOnNexus5() {
    SalonTheme {
        DrawCircleArrow(modifier = Modifier)
    }
}
@Preview(showBackground = true, device = Devices.NEXUS_7)
@Composable
fun DefaultCircleArrowPreviewOnNexus7() {
    SalonTheme {
        DrawCircleArrow(modifier = Modifier)
    }
}