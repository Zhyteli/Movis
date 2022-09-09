package com.zhytel.movis.data.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zhytel.movis.domain.Trailer

class TrailerResponse {
    @SerializedName("id")
    @Expose
    var idTrailer = 0

    @SerializedName("results")
    @Expose
    var trailers: ArrayList<Trailer>? = null
}
