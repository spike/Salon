package com.github.spike.salon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import com.github.spike.salon.banner.Banner
import com.github.spike.salon.bottomnavigation.BottomNavigationBar
import com.github.spike.salon.hairdressers.HairDressers
import com.github.spike.salon.salonservices.Cell
import com.github.spike.salon.salonservices.ServicesSection

import com.github.spike.salon.ui.theme.SalonTheme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SalonTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                 //   color = MaterialTheme.colors.background
                ) {
                    ScaffoldLayout()
                }
            }
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun Content() {
    Column {
        Banner()
        HairDressers()
        HomeScreen()
    }
}


@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SalonTheme {
        ScaffoldLayout()
    }
}

@ExperimentalFoundationApi
@Composable
fun HomeScreen() {
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
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(bottom=16.dp)
    ) {
        Column {
            ServicesSection(
                servicesList = lst
            )
        }
    }
}


@ExperimentalFoundationApi
@Composable
fun ScaffoldLayout() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Open))
    Scaffold(
        scaffoldState = scaffoldState,
        content = { padding ->
            Content()
        },
        bottomBar = {
            BottomNavigationBar()
         }
    )
}
