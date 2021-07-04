package com.example.ramchallenge.model

import com.example.ramchallenge.model.enums.GenderCharacterEnum
import com.example.ramchallenge.model.enums.StatusCharacterEnum

class CharacterProvider {
    companion object {
        var changeList = false
        private val characterList = listOf<CharacterModel>(
            CharacterModel(1, "Rick Sanchez", StatusCharacterEnum.LIVE, "human", "", GenderCharacterEnum.MALE, PlaceModel("Earth (C-137)", "https://rickandmortyapi.com/api/location/1"),
                PlaceModel("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"), "https://rickandmortyapi.com/api/character/avatar/1.jpeg", listOf("https://rickandmortyapi.com/api/episode/1", "https://rickandmortyapi.com/api/episode/2","https://rickandmortyapi.com/api/episode/3"),
                "https://rickandmortyapi.com/api/character/1", "2017-11-04T18:48:46.250Z"),
            CharacterModel(2, "Rick Sanchez(clone)", StatusCharacterEnum.LIVE, "human", "", GenderCharacterEnum.MALE, PlaceModel("Earth (C-137)", "https://rickandmortyapi.com/api/location/1"),
                PlaceModel("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"), "https://rickandmortyapi.com/api/character/avatar/1.jpeg", listOf("https://rickandmortyapi.com/api/episode/1", "https://rickandmortyapi.com/api/episode/2","https://rickandmortyapi.com/api/episode/3"),
                "https://rickandmortyapi.com/api/character/1", "2017-11-04T18:48:46.250Z")

        )

        private val characterList1 = listOf<CharacterModel>(
            CharacterModel(2, "Rick Sanchez(clone)", StatusCharacterEnum.LIVE, "human", "", GenderCharacterEnum.MALE, PlaceModel("Earth (C-137)", "https://rickandmortyapi.com/api/location/1"),
                PlaceModel("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"), "https://rickandmortyapi.com/api/character/avatar/1.jpeg", listOf("https://rickandmortyapi.com/api/episode/1", "https://rickandmortyapi.com/api/episode/2","https://rickandmortyapi.com/api/episode/3"),
                "https://rickandmortyapi.com/api/character/1", "2017-11-04T18:48:46.250Z"),
            CharacterModel(1, "Rick Sanchez", StatusCharacterEnum.LIVE, "human", "", GenderCharacterEnum.MALE, PlaceModel("Earth (C-137)", "https://rickandmortyapi.com/api/location/1"),
                PlaceModel("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"), "https://rickandmortyapi.com/api/character/avatar/1.jpeg", listOf("https://rickandmortyapi.com/api/episode/1", "https://rickandmortyapi.com/api/episode/2","https://rickandmortyapi.com/api/episode/3"),
                "https://rickandmortyapi.com/api/character/1", "2017-11-04T18:48:46.250Z")

        )

        fun getCharacterList() : List<CharacterModel> {
            if ((1..4).random() > 2) {
                return characterList1
            }
            return characterList
        }
    }
}