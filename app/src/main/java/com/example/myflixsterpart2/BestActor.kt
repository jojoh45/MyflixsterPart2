package com.example.myflixsterpart2

import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable



@Keep
@Serializable
data class SearchNewsResponse(
    @SerialName("results")
    val results: BaseResponse?
)

@Keep
@Serializable
data class BaseResponse(
    @SerialName("known_for")
    val known_for: List<BestActor>
)






@Keep
@Serializable
data class BestActor (
    @SerialName("name")
    val actorName: String?,
    @SerialName("profile_path")
    val actorImageUrl: String?,
    @SerialName("original_title")
    val knowForText: String?,
    @SerialName("backdrop_path")
    val knowForImageUrl: String?,
    @SerialName("overview")
    val overview: String?
)