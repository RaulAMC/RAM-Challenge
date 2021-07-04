package com.example.ramchallenge.connection

import com.example.ramchallenge.model.CharacterModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CharacterService {
    private val retrofit = RetrofitBase.getRestrofit()

    suspend fun getCharacter(): List<CharacterModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(CharacterApi::class.java).getCharacterList()
            response.body()!!.results
        }

    }

}