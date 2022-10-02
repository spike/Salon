package com.github.spike.salon.ui.banner

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices.NEXUS_5
import androidx.compose.ui.tooling.preview.Devices.NEXUS_7
import androidx.compose.ui.tooling.preview.Devices.PIXEL
import androidx.compose.ui.tooling.preview.Devices.PIXEL_3_XL
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
            )
            .graphicsLayer {
                clip = true
                shape = RoundedCornerShape(16.dp)
            },
        onClick = {

        },
        elevation = 2.dp,
        shape = RoundedCornerShape(16.dp),
        backgroundColor = Color(0xFFCBF5D7)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
           // verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.End,
        ) {
            Text(
                text = "Accumulate 20 points and\n get a free visit",
                modifier = Modifier.padding(
                    start = 32.dp,
                    end = 32.dp,
                    top = 8.dp,
                ),
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.SemiBold
            )
            Row(
                modifier = Modifier,
            ) {
                DrawWhiteCircles()
                DrawCircleArrow(Modifier)
            }
        }
    }
}

@Composable
fun DrawWhiteCircles() {
    Canvas(
        modifier = Modifier
            .size(size = 40.dp)
    ) {
        drawCircle(
            color = Color.White,
            center = Offset(30.dp.toPx(), 180f),
            radius = 46.dp.toPx(),
            style = Stroke(width = 2.dp.toPx()),
        )
        drawCircle(
            color = Color.White,
            center = Offset(0.dp.toPx(), 180.dp.toPx()),
            radius = 42.dp.toPx(),
            style = Stroke(width = 2.dp.toPx()),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultBannerPreview() {
    SalonTheme {
        Column() {
            Banner()
        }
    }
}
@Preview(showBackground = true, device = PIXEL_3_XL)
@Composable
fun DefaultBannerPreviewOnPixelXL() {
    SalonTheme {
        Column() {
            Banner()
        }
    }
}
@Preview(showBackground = true, device = PIXEL)
@Composable
fun DefaultBannerPreviewOnPixel() {
    SalonTheme {
        Column() {
            Banner()
        }
    }
}
@Preview(showBackground = true, device = NEXUS_5)
@Composable
fun DefaultBannerPreviewOnNexus5() {
    SalonTheme {
        Column() {
            Banner()
        }
    }
}
@Preview(showBackground = true, device = NEXUS_7)
@Composable
fun DefaultBannerPreviewOnNexus7() {
    SalonTheme {
        Column() {
            Banner()
        }
    }
}
/*
object Devices {
    const val DEFAULT = ""

   // const val NEXUS_7 = "id:Nexus 7"
    const val NEXUS_7_2013 = "id:Nexus 7 2013"
   // const val NEXUS_5 = "id:Nexus 5"
    const val NEXUS_6 = "id:Nexus 6"
    const val NEXUS_9 = "id:Nexus 9"
    const val NEXUS_10 = "name:Nexus 10"
    const val NEXUS_5X = "id:Nexus 5X"
    const val NEXUS_6P = "id:Nexus 6P"
    const val PIXEL_C = "id:pixel_c"
   // const val PIXEL = "id:pixel"
    const val PIXEL_XL = "id:pixel_xl"
    const val PIXEL_2 = "id:pixel_2"
    const val PIXEL_2_XL = "id:pixel_2_xl"
    const val PIXEL_3 = "id:pixel_3"
  //  const val PIXEL_3_XL = "id:pixel_3_xl"
    const val PIXEL_3A = "id:pixel_3a"
    const val PIXEL_3A_XL = "id:pixel_3a_xl"
    const val PIXEL_4 = "id:pixel_4"
    const val PIXEL_4_XL = "id:pixel_4_xl"

    const val AUTOMOTIVE_1024p = "id:automotive_1024p_landscape"
}

 */

