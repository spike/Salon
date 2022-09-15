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
import com.github.spike.salon.salonservices.Cell

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
        Row(
            modifier = Modifier.padding(
                start=24.dp,
                end=32.dp
            )
        ) {
            Text(
                text = "Our Hairdressers",
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold
            )
            Spacer(
                modifier = Modifier
                    .width(IntrinsicSize.Max)
                    .weight(1f)
            )
            Card(
                modifier = Modifier.size(32.dp),
                shape = CircleShape,
                elevation = 0.dp,
            ) {
                Image(
                    painterResource(R.drawable.ic_right_arrow),
                    contentDescription = "",
                )
            }
        }
        LazyRow(
            contentPadding = PaddingValues(4.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.padding(start= 8.dp)
        ) {
            items(4) { currentCount ->
                RowItem(number = currentCount)
            }
        }
        Row(
            modifier = Modifier.padding(
                start=24.dp,
                end=32.dp
            )
        ) {
            Text(text="Services",
                style= MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold
            )
            Spacer(
                modifier = Modifier
                    .width(IntrinsicSize.Max)
                    .weight(1f)
            )
            Card(
                modifier = Modifier.size(32.dp),
                shape = CircleShape,
                elevation = 0.dp,
            ) {
                Image(
                    painterResource(R.drawable.ic_right_arrow),
                    contentDescription = "",
                )
            }
        }
        HomeScreen()
    }
}

@Composable
fun RowItem(number: Int) {
    val avatars = arrayOf(
        R.drawable.generated_woman_face2,
        R.drawable.generated_woman_face,
        R.drawable.generated_man_face,
        R.drawable.generated_woman_face3,
    )
    Row(
        modifier = Modifier.size(80.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier.size(54.dp),
            shape = CircleShape,
            elevation = 2.dp,
            ) {
            Image(
                painterResource(avatars[number]),
                contentDescription = "",
            )
        }
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
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Column {
            ServicesSection(
                servicesList = listOf(
                    ServiceAvailable (
                        label = "Classic shaving",
                        R.drawable.ic_drop_in
                    ),
                    ServiceAvailable (
                        label = "Hair care",
                        R.drawable.ic_appointment
                    ),
                    ServiceAvailable (
                        label = "Beard trimming",
                        R.drawable.ic_drop_in
                    ),
                    ServiceAvailable (
                        label = "Classic haircut",
                        R.drawable.ic_drop_in
                    )
                )
            )
        }
    }
}
@ExperimentalFoundationApi
@Composable
fun ServicesSection(servicesList: List<ServiceAvailable>) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        contentPadding = PaddingValues (
            start = 7.5.dp,
            end = 7.5.dp,
        ),
    ) {
        items(4) {
            Cell(serviceListed = servicesList[it])
        }
    }
}

@Composable
fun TopBar() {
    TopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name),
                fontSize = 18.sp
            )
        },
        backgroundColor = colorResource(
            id = R.color.white
        ),
        contentColor = Color.White
    )
}

@Composable
fun BottomNavigationBar() {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Bookmarks,
        NavigationItem.Profile
    )
    BottomNavigation(
        backgroundColor = colorResource(
            id = R.color.black
        ),
        contentColor = Color.White,
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painterResource(id = item.icon),
                        contentDescription = item.title
                    )
                },
                label = { Text(text = item.title) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                alwaysShowLabel = false,
                selected = false,
                onClick = {

                }
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
