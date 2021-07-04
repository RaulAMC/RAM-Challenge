package com.example.ramchallenge.model.response

import com.example.ramchallenge.model.LocationModel
import com.example.ramchallenge.model.PageInfoModel

data class LocationResponse(
    val info: PageInfoModel,
    val results: List<LocationModel>
)
