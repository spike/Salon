package com.github.spike.salon.ui.salonservices

import androidx.annotation.DrawableRes

data class ServiceAvailable(
    val label: String,
    @DrawableRes val iconId: Int
)