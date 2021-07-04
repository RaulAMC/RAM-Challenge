package com.example.ramchallenge.mvvm.characters

import com.example.ramchallenge.connection.CharacterService
import com.example.ramchallenge.model.CharacterModel
import com.example.ramchallenge.model.CharacterProvider

class CharacteRepository {
    private val charService = CharacterService()

    suspend fun getCharacter(): List<CharacterModel> {
        val response = charService.getCharacter()
        CharacterProvider.characterList = response
        return response
    }
}