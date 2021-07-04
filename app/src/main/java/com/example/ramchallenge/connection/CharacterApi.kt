package com.example.ramchallenge.connection

import com.example.ramchallenge.model.response.CharacterResponse
import retrofit2.Response
import retrofit2.http.GET

interface CharacterApi {

    @GET("/api/character")
    suspend fun getCharacterList() : Response<CharacterResponse>


}