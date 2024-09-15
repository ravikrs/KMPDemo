package com.ravikrs.kmp.demo

import com.ravikrs.kmp.demo.model.WeatherInfoResponse
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class WeatherUIState(val domain: WeatherInfoResponse?)

class WeatherViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(WeatherUIState(null))
    val uiState = _uiState.asStateFlow()

    //http client to query weather api
    private val httpClient = HttpClient{
        install(ContentNegotiation) {
            json()
        }
    }

    fun updateWeatherData() {
        viewModelScope.launch {
            val weatherData = fetchWeatherData()
            _uiState.update {
                it.copy(domain = weatherData)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        httpClient.close()
    }

    private suspend fun fetchWeatherData(): WeatherInfoResponse {
        return httpClient.get("https://api.open-meteo.com/v1/forecast?latitude=52.5166718&longitude=13.3244681&current_weather=true&timezone=Europe%2FBerlin")
            .body<WeatherInfoResponse>()
    }


}