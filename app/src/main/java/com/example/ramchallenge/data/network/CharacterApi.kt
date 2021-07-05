package com.example.ramchallenge.data.network

import com.example.ramchallenge.data.network.response.CharacterResponse
import retrofit2.Response
import retrofit2.http.GET

interface CharacterApi {

    @GET("/api/character")
    suspend fun getCharacterList() : Response<CharacterResponse>


}