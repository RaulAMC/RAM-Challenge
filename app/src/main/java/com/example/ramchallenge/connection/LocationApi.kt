package com.example.ramchallenge.connection

import com.example.ramchallenge.model.response.LocationResponse
import retrofit2.http.GET

interface LocationApi {
    @GET("/location")
    suspend fun getLocationList() : LocationResponse
}