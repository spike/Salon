package com.github.spike.salon

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class ServiceAvailable(
    val label: String,
    @DrawableRes val iconId: Int
)