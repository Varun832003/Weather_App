package com.example.weatherapp.models

import java.io.Serializable
import java.math.BigInteger

data class Sys (
    val type: Int,
    val message : Double,
    val country : String,
    val sunrise: Long,
    val sunset: Long
): Serializable