package com.skillbox.aslanbolurov.android.cleanarchitecture.domain

import com.skillbox.aslanbolurov.android.cleanarchitecture.data.UsefulActivityDto
//import com.skillbox.aslanbolurov.android.cleanarchitecture.entity.Action
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Headers

private const val BASE_URL = "https://www.boredapi.com"

object RetrofitInstance {
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val searchSomeActionApi: SearchSomeActionApi =
        retrofit.create(SearchSomeActionApi::class.java)
}

interface SearchSomeActionApi {
    @GET("api/activity")
    suspend fun getAction(): UsefulActivityDto
}