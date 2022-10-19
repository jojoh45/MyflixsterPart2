package com.example.myflixsterpart2
import android.support.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class Results(
    @SerialName("results")
    val results: List<SearchActorResults>?
)

@Keep
@Serializable
data class SearchActorResults(
    @SerialName("name")
    val actorName: String?,
    @SerialName("profile_path")
    val actorImageUrl: String?,
    @SerialName("known_for")
    val knownFor: List<KnownFor>?
) : java.io.Serializable{
    val stuff = knownFor?.firstOrNull { it.overview != null }?.overview ?: ""
    val ogTitle = knownFor?.firstOrNull { it.originalTitle != null }?.originalTitle?: ""
    val movieImage = "https://image.tmdb.org/t/p/w500/${knownFor?.firstOrNull { it.knownForImageUrl != null }?.knownForImageUrl ?: ""}"
}



@Keep
@Serializable
data class KnownFor(
    @SerialName("original_title")
    val originalTitle: String? = null,
    @SerialName("poster_path")
    val knownForImageUrl: String? = null,
    @SerialName("overview")
    val overview: String? = null
) : java.io.Serializable