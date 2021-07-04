package com.example.ramchallenge.model.enums

import com.google.gson.annotations.SerializedName

enum class StatusCharacterEnum {
    @SerializedName("Alive") LIVE,
    @SerializedName("Dead") DEAD,
    @SerializedName("unknown") UNKNOWN
}