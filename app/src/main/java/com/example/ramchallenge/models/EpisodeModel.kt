package com.example.ramchallenge.models

data class EpisodeModel (
    val id: Int = 0,
    val name: String = "",
    val air_date: String = "",
    val episode: String = "",
    val characters: List<String>? = null,
    val url: String = "",
    val created: String = "" //TODO> Change for date
)
