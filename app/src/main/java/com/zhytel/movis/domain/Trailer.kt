package com.zhytel.movis.domain

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Trailer(
    @SerializedName("key")
    @Expose
    val key: String?,
    @SerializedName("name")
    @Expose
    var name: String?
) {
    private val BASE_YOUTUBE_URL = "https://www.youtube.com/watch?v="

    fun getVideoUrl():String{
        return BASE_YOUTUBE_URL + key
    }

}
