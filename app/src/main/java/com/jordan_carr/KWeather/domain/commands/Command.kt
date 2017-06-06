package com.jordan_carr.KWeather.domain.commands

/**
 * Created by Jordan Carr on 2017-06-05.
 */

interface Command<out T> {
    fun execute(): T
}