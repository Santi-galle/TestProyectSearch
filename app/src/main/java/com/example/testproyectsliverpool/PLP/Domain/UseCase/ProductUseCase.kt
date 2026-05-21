package com.example.testproyectsliverpool.PLP.Domain.UseCase

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.testproyectsliverpool.PLP.Data.Datasource.ProductRepository
import com.example.testproyectsliverpool.PLP.Data.Models.Response.ApiResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

class ProductUseCase @Inject constructor(
    private val repository: ProductRepository
) {
    suspend fun getListProducts(query: String): ApiResponse {
        return repository.getListProducts(query)
    }
}