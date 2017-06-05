package com.jordan_carr.kotlinforandroiddevelopers.domain.model

/**
 * Created by Jordan Carr on 2017-06-05.
 */

data class ForecastList(val city: String, val country: String, val dailyForecast: List<Forecast>) {
    operator fun get(position: Int): Forecast = dailyForecast[position]
    fun size(): Int = dailyForecast.size
}

data class Forecast(val date: String, val description: String, val high: Int, val low: Int)