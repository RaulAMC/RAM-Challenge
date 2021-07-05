package com.example.ramchallenge.data.repository

import com.example.ramchallenge.data.network.CharacterApiBuilder
import com.example.ramchallenge.model.CharacterModel

class CharacterRepositoryImp(private val charService: CharacterApiBuilder) : CharacterRepository {
    override suspend fun getCharacter(): List<CharacterModel> {
        return charService.getCharacter()
    }
}
