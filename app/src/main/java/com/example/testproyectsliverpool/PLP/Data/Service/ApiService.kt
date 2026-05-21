package com.example.testproyectsliverpool.PLP.Data.Service

import com.example.testproyectsliverpool.PLP.Data.Models.Request.ProductsRequest
import com.example.testproyectsliverpool.PLP.Data.Models.Response.ApiResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("api/v1/search")
    suspend fun productsListApi(@Body request: ProductsRequest): ApiResponse
}