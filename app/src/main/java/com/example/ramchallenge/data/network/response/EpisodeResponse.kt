package com.example.ramchallenge.data.network.response

import com.example.ramchallenge.model.EpisodeModel
import com.example.ramchallenge.model.PageInfoModel

data class EpisodeResponse(
    val info: PageInfoModel,
    val results: List<EpisodeModel>
)
