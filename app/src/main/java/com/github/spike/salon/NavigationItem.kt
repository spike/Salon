package com.github.spike.salon

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object Bookmarks : NavigationItem("favorites", R.drawable.ic_bookmarks, "Bookmarks")
    object Profile : NavigationItem("profile", R.drawable.ic_profile, "Profile")
    object Haircut: NavigationItem("haircut", R.drawable.ic_scissors, "Haircut")
    object Appointment: NavigationItem("appointment", R.drawable.ic_appointment, "Book")
    object Dropin: NavigationItem("dropin", R.drawable.ic_drop_in, "Drop in")
}