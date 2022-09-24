package com.github.spike.salon.salonservices

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.spike.salon.R
import com.github.spike.salon.ServiceAvailable

@OptIn(ExperimentalMaterialApi::class)
@ExperimentalFoundationApi
@Composable
fun ServicesSection() {
    Row(
        modifier = Modifier.padding(
            start = 24.dp,
            end = 32.dp
        )
    ) {
        Text(
            text = "Services",
            style = MaterialTheme.typography.h6,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier
                .width(IntrinsicSize.Max)
                .weight(1f)
        )
        Card(
            modifier = Modifier.size(24.dp),
            shape = CircleShape,
            elevation = 0.dp,
            onClick = {

            }
        ) {
            Image(
                painterResource(R.drawable.ic_right_arrow),
                contentDescription = "",
            )
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun ServicesList() {
    val servicesList = listOf(
        ServiceAvailable (
            label = "Check-in",
            R.drawable.building
        ),
        ServiceAvailable (
            label = "Haircut",
            R.drawable.haircut_sitting
        ),
        ServiceAvailable (
            label = "Haircut + Shampoo",
            R.drawable.shampoo2
        ),
        ServiceAvailable (
            label = "Haircut Jr.",
            R.drawable.haircut_junior
        ),
        ServiceAvailable (
            label = "Trim",
            R.drawable.haircut_one_hair
        ),
        ServiceAvailable (
            label = "Shave",
            R.drawable.shaver_outline
        )
    )
    LazyVerticalGrid(
        cells = GridCells.Adaptive(150.dp),
        // cells = GridCells.Fixed(2),
        contentPadding = PaddingValues(
            start = 8.dp,
            end = 8.dp,
            bottom = 40.dp
        ),
    ) {
        items(servicesList.size) {
            Cell(serviceListed = servicesList[it])
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun ServicesSectionFrame() {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(bottom=16.dp)
    ) {
        Column {
            ServicesSection()
            ServicesList()
        }
    }
}

@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun ServicesSectionPreview() {
    ServicesSectionFrame()
}

