package com.github.spike.salon.ui.salonservices

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
import com.github.spike.salon.ui.theme.SalonTheme

@OptIn(ExperimentalMaterialApi::class)
@ExperimentalFoundationApi
@Composable
fun ServicesSection(modifier: Modifier) {
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
            modifier = modifier
                .width(IntrinsicSize.Max)
                .weight(1f)
        )
        Card(
            modifier = modifier.size(24.dp),
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
fun ServicesList(modifier: Modifier) {
    val servicesList = listOf(
        ServiceAvailable (
            label = "Haircut",
            R.drawable.haircut_sitting
        ),
        ServiceAvailable (
            label = "Haircut Jr.",
            R.drawable.haircut_junior
        ),
        ServiceAvailable (
            label = "Shampoo",
            R.drawable.shampoo2
        ),
        ServiceAvailable (
            label = "Shave",
            R.drawable.shaver_outline
        ),
        ServiceAvailable (
            label = "Trim",
            R.drawable.haircut_one_hair
        ),
        ServiceAvailable (
            label = "Check-in",
            R.drawable.building
        ),
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
            Cell(serviceListed = servicesList[it], modifier)
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun ServicesSectionFrame(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(bottom=16.dp)
    ) {
        Column {
            ServicesSection(modifier)
            ServicesList(modifier)
        }
    }
}

@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun ServicesSectionPreview() {
    SalonTheme {
        ServicesSectionFrame(Modifier)
    }
}

