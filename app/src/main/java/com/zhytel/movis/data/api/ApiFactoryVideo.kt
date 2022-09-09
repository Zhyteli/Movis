package com.zhytel.movis.data.api

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactoryVideo {
    private const val BASE_URL_VIDEOS = "https://api.themoviedb.org/3/"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .baseUrl(BASE_URL_VIDEOS)
        .build()

    val apiService = retrofit.create(ApiService::class.java)
}