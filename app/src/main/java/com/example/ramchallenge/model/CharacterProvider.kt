package com.example.ramchallenge.model

class CharacterProvider {
    companion object {
        var lastPageInfo: PageInfoModel? = null
        var characterList = emptyList<CharacterModel>()
    }
}