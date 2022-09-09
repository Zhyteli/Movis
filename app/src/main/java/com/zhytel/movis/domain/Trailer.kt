package com.zhytel.movis.domain

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Trailer {
    private var BASE_YOUTUBE_URL = "https://www.youtube.com/watch?v="

    @SerializedName("key")
    @Expose
    var key: String? = null
        get() = BASE_YOUTUBE_URL.toString() + field

    @SerializedName("name")
    @Expose
    var name: String? = null
}
