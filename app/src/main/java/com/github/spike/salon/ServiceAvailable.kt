package com.github.spike.salon

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class ServiceAvailable(
    val title: String,
    @DrawableRes val iconId: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)