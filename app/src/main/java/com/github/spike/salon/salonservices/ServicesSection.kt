package com.github.spike.salon.salonservices

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.github.spike.salon.ServiceAvailable

@ExperimentalFoundationApi
@Composable
fun ServicesSection(servicesList: List<ServiceAvailable>) {
    LazyVerticalGrid(
        cells = GridCells.Adaptive(150.dp),
       // cells = GridCells.Fixed(2),
        contentPadding = PaddingValues (
            start = 7.5.dp,
            end = 7.5.dp,
        ),
    ) {
        items(servicesList.size) {
            Cell(serviceListed = servicesList[it])
        }
    }
}

