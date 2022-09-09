package com.zhytel.movis.data.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zhytel.movis.domain.Movie

class MovieResponse {
    @SerializedName("page")
    @Expose
    var page = 0

    @SerializedName("results")
    @Expose
    var movies: List<Movie>? = null

    @SerializedName("total_pages")
    @Expose
    var totalPages = 0

    @SerializedName("total_results")
    @Expose
    var totalMovies = 0
}