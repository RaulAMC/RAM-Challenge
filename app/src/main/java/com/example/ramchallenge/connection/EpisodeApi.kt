package com.example.ramchallenge.connection

import com.example.ramchallenge.model.response.EpisodeResponse
import retrofit2.http.GET

interface EpisodeApi {

    @GET("/episode")
    suspend fun getEpisodeList() : EpisodeResponse
}