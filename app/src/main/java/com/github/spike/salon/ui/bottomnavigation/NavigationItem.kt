package com.github.spike.salon.ui.bottomnavigation

import com.github.spike.salon.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object Bookmarks : NavigationItem("favorites", R.drawable.ic_bookmarks, "Bookmarks")
    object Profile : NavigationItem("profile", R.drawable.ic_profile, "Profile")
}