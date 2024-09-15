package com.ravikrs.kmp.demo.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherInfoResponse(
    @SerialName("current_weather")
    val currentWeather: CurrentWeather,
    val current_weather_units: CurrentWeatherUnits,
    val elevation: Double,
    val generationtime_ms: Double,
    val latitude: Double,
    val longitude: Double,
    val timezone: String,
    val timezone_abbreviation: String,
    val utc_offset_seconds: Int
)