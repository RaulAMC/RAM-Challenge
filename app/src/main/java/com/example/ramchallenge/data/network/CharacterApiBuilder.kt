package com.example.ramchallenge.data.network

import com.example.ramchallenge.data.network.response.CharacterResponse
import com.example.ramchallenge.model.CharacterModel
import com.example.ramchallenge.model.CharacterProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.Exception

class CharacterApiBuilder {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    private var api = retrofit.create(CharacterApi::class.java)

    suspend fun getCharacter(): List<CharacterModel> {
        try {
            val response = api.getCharacterList()
            if (response.isSuccessful) {
                CharacterProvider.characterList = response.body()!!.results
                return response.body()!!.results
            }
            return emptyList()

        } catch (e: Exception) {
            return emptyList()
        }
    }

}