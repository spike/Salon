package com.github.spike.salon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.github.spike.salon.ui.banner.Banner
import com.github.spike.salon.ui.bottomnavigation.BottomNavigationBar
import com.github.spike.salon.ui.hairdressers.HairDressers
import com.github.spike.salon.ui.salonservices.ServicesSectionFrame

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
                    ScaffoldLayout(Modifier)
                }
            }
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun Content(modifier: Modifier) {
    Column {
        Banner(modifier)
        HairDressers(modifier)
        ServicesSectionFrame(modifier)
    }
}

@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SalonTheme {
        ScaffoldLayout(Modifier)
    }
}


@ExperimentalFoundationApi
@Composable
fun ScaffoldLayout(modifier: Modifier) {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Open))
    Scaffold(
        scaffoldState = scaffoldState,
        content = { padding ->
            Content(modifier)
        },
        bottomBar = {
            BottomNavigationBar(modifier)
         }
    )
}
