package com.github.spike.salon.ui.bottomnavigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.github.spike.salon.R
import com.github.spike.salon.ui.theme.SalonTheme

@Composable
fun BottomNavigationBar(modifier: Modifier) {
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
@Preview(showBackground = true)
@Composable
fun BottomNavigationPreview() {
    SalonTheme {
        BottomNavigationBar(Modifier)
    }
}

