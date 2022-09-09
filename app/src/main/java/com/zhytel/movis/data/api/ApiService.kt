package com.zhytel.movis.data.api

import com.zhytel.movis.data.pojo.MovieResponse
import com.zhytel.movis.data.pojo.ReviewResponse
import com.zhytel.movis.data.pojo.TrailerResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("movie")
    fun getMovieResponse(
        @Query("api_key") apiKey: String,
        @Query("language") language: String,
        @Query("sort_by") sort: String,
        @Query("vote_count.gte") minVoteCountValue: String,
        @Query("page") page: String
    ): Observable<MovieResponse>

    @GET("movie/{id}/videos")
    fun getMovieTrailer(
        @Path("id") id: String,
        @Query("api_key") apiKey: String,
        @Query("language") language: String
    ): Observable<TrailerResponse>

    @GET("movie/{id}/reviews")
    fun getMovieReview(
        @Path("id") id: String,
        @Query("api_key") apiKey: String,
        @Query("language") language: String
    ): Observable<ReviewResponse>
}