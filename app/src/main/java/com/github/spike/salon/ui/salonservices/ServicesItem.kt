package com.github.spike.salon.ui.salonservices

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.spike.salon.R
import com.github.spike.salon.ui.theme.SalonTheme


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Cell(
    serviceListed: ServiceAvailable,
    modifier: Modifier
) {
    Surface() {
        Card(
            modifier = modifier.padding(10.dp)
                .width(IntrinsicSize.Max),
         //   backgroundColor = Color(0xFF808080),
            shape = RoundedCornerShape(8.dp),
            elevation = 2.dp,
            onClick = {

            }
        ) {
            Column(
                modifier = modifier.padding(8.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                Card(
                    modifier = modifier.padding(8.dp)
                        .size(80.dp),
                    shape = CircleShape,
                ) {
                    Icon(
                        painterResource(serviceListed.iconId),
                       // imageVector = Icons.Filled.Favorite,
                        "",
                        modifier = Modifier.padding(4.dp),
                    )
                }
                Text(serviceListed.label)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultServicesItemPreview() {
    val serviceAvailable = ServiceAvailable (
        label = "Drop in",
        R.drawable.ic_drop_in
    )
    SalonTheme {
        Cell(serviceListed = serviceAvailable,
        Modifier
            )
    }
}
