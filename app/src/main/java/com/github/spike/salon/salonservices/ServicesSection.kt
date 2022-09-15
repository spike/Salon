package com.github.spike.salon.salonservices

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.spike.salon.R
import com.github.spike.salon.ServiceAvailable
import com.github.spike.salon.ui.theme.SalonTheme

@ExperimentalFoundationApi
@Composable
fun ServicesSection(servicesList: List<ServiceAvailable>) {
    LazyVerticalGrid(
        cells = GridCells.Adaptive(150.dp),
       // cells = GridCells.Fixed(2),
        contentPadding = PaddingValues (
            start = 8.dp,
            end = 8.dp,
            bottom= 32.dp
        ),
    ) {
        items(servicesList.size) {
            Cell(serviceListed = servicesList[it])
        }
    }
}


@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun ServicesSectionPreview() {
    val lst = listOf(
        ServiceAvailable (
            label = "Check-in",
            R.drawable.ic_drop_in
        ),
        ServiceAvailable (
            label = "Haircut",
            R.drawable.ic_appointment
        ),
        ServiceAvailable (
            label = "Haircut + Shampoo",
            R.drawable.ic_drop_in
        ),
        ServiceAvailable (
            label = "Haircut Jr.",
            R.drawable.ic_drop_in
        ),
        ServiceAvailable (
            label = "Coloring",
            R.drawable.ic_drop_in
        ),
        ServiceAvailable (
            label = "Book a Spot",
            R.drawable.ic_drop_in
        )
    )
    SalonTheme {
        ServicesSection(servicesList = lst)
    }
}

