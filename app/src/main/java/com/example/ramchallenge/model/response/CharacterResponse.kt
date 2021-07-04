package com.example.ramchallenge.model.response

import com.example.ramchallenge.model.CharacterModel
import com.example.ramchallenge.model.PageInfoModel

data class CharacterResponse (
        val info: PageInfoModel,
        val results: List<CharacterModel>
)