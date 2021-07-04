package com.example.ramchallenge.model

data class LocationModel(
    val id : Int = 0,
    val name : String = "",
    val type : String = "",
    val dimension : String = "",
    val residents : List<String>? = null,
    val url : String = "",
    val created : String = "" //TODO> Change for date
)
