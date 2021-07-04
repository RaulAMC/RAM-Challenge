package com.example.ramchallenge.model

import com.example.ramchallenge.model.enums.GenderCharacterEnum
import com.example.ramchallenge.model.enums.StatusCharacterEnum

data class CharacterModel (
    val id : Int = 0,
    val name : String = "",
    val status : StatusCharacterEnum,
    val species : String = "",
    val type : String = "",
    val gender : GenderCharacterEnum,
    var origin : PlaceModel,
    var location : PlaceModel,
    val image : String = "",
    val episode: List<String>? = null,
    val url  : String = "",
    val created  : String = "" //TODO> Change for date
)
