package com.example.testproyectsliverpool.Retrofit

import com.example.testproyectsliverpool.PLP.Data.Service.ApiService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://sp251.liverpool.com.mx/"
    private val client = OkHttpClient.Builder()
        .build()

    val apiService: ApiService = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiService::class.java)
}