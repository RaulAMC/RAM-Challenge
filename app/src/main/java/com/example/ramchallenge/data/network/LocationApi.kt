package com.example.ramchallenge.data.network

import com.example.ramchallenge.data.network.response.LocationResponse
import retrofit2.http.GET

interface LocationApi {
    @GET("/location")
    suspend fun getLocationList() : LocationResponse
}