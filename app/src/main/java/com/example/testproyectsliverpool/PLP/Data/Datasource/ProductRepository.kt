package com.example.testproyectsliverpool.PLP.Data.Datasource

import com.example.testproyectsliverpool.PLP.Data.Models.Request.ProductsRequest
import com.example.testproyectsliverpool.PLP.Data.Models.Response.ApiResponse
import com.example.testproyectsliverpool.Retrofit.RetrofitClient
import javax.inject.Inject

class ProductRepository @Inject constructor() {
    suspend fun getListProducts(query: String): ApiResponse {
        val request = ProductsRequest(query = query)
        return RetrofitClient.apiService.productsListApi(request = request)
    }
}