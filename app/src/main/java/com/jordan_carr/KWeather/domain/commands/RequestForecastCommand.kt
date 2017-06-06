package com.jordan_carr.KWeather.domain.commands

import com.jordan_carr.KWeather.data.ForecastRequest
import com.jordan_carr.KWeather.domain.mappers.ForecastDataMapper
import com.jordan_carr.KWeather.domain.model.ForecastList

/**
 * Created by Jordan Carr on 2017-06-05.
 */

class RequestForecastCommand(val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}