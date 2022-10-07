package com.example.myflixsterpart2
import android.support.annotation.Keep
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
    val actorName: String? = null ,
    @SerialName("profile_path")
    val actorImageUrl: String? = null,
    @SerialName("known_for")
    val known_for: KnownFor?
) : java.io.Serializable


@Keep
@Serializable
data class KnownFor(
    @SerialName("original_title")
    val knownForText: String? = null,
    @SerialName("backdrop_path")
    val knownForImageUrl: String? = null,
    @SerialName("overview")
    val overview: String?
): java.io.Serializable
