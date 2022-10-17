package com.example.myflixsterpart2
import android.support.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class SearchActorResults(
    @SerialName("results")
    val response: List<BestActor>?
)




@Keep
@Serializable
data class BestActor(
    @SerialName("name")
    val actorName: String?,
    @SerialName("profile_path")
    val actorImageUrl: String?,
    @SerialName("known_for")
    val known_for: List<KnownFor>?
) : java.io.Serializable

@Keep
@Serializable
data class KnownFor(
    @SerializedName("original_title")
    val original_title: String? = null,
    @SerializedName("backdrop_path")
    val backdrop_path: String? = null,
    @SerializedName("overview")
    val overview: String? = null
)