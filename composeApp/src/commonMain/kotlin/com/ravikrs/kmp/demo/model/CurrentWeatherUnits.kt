package com.ravikrs.kmp.demo.model

import kotlinx.serialization.Serializable

@Serializable
data class CurrentWeatherUnits(
    val interval: String,
    val is_day: String,
    val temperature: String,
    val time: String,
    val weathercode: String,
    val winddirection: String,
    val windspeed: String
)