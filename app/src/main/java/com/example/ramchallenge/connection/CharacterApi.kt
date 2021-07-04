package com.example.ramchallenge.connection

import com.example.ramchallenge.model.response.CharacterResponse
import retrofit2.http.GET

interface CharacterApi {

    @GET("/character")
    suspend fun getCharacterList() : CharacterResponse


}