package com.example.ramchallenge.models

import com.example.ramchallenge.models.enums.GenderCharacterEnum
import com.example.ramchallenge.models.enums.StatusCharacterEnum

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
    val episode: ArrayList<String>? = null,
    val url  : String = "",
    val created  : String = "" //TODO> Change for date
)
