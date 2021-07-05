package com.example.ramchallenge.data.network

import com.example.ramchallenge.data.network.response.EpisodeResponse
import retrofit2.http.GET

interface EpisodeApi {

    @GET("/episode")
    suspend fun getEpisodeList() : EpisodeResponse
}