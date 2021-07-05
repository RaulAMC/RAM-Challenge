package com.example.ramchallenge.data.repository

import com.example.ramchallenge.model.CharacterModel

interface CharacterRepository {
    suspend fun getCharacter(): List<CharacterModel>
}