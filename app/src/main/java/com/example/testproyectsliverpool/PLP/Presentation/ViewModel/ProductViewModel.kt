package com.example.testproyectsliverpool.PLP.Presentation.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testproyectsliverpool.PLP.Data.Models.Request.ProductsRequest
import com.example.testproyectsliverpool.PLP.Data.Models.Response.ApiResponse
import com.example.testproyectsliverpool.PLP.Domain.UseCase.ProductUseCase
import com.example.testproyectsliverpool.PLP.Presentation.States.ProductListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject


@HiltViewModel
class ProductViewModel @Inject constructor(
    private val productsUseCase: ProductUseCase
) : ViewModel(){
    private val _state = MutableStateFlow(ProductListState())
    var state = _state.asStateFlow()

    fun getProductList(query: String) = viewModelScope.launch {
        try {
            val products = productsUseCase.getListProducts(query)
            _state.update { it.copy(products =  products.records) }
        } catch (e: Exception) {

        }

    }
}