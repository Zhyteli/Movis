package com.zhytel.movis.data.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zhytel.movis.domain.Review

class ReviewResponse {
    @SerializedName("id")
    @Expose
    var id = 0

    @SerializedName("page")
    @Expose
    var page = 0

    @SerializedName("results")
    @Expose
    var reviews: List<Review>? = null

    @SerializedName("total_pages")
    @Expose
    var totalPages = 0

    @SerializedName("total_results")
    @Expose
    var totalResults = 0
}