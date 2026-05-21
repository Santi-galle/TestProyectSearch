package com.example.testproyectsliverpool.PLP.Presentation.View

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.testproyectsliverpool.PLP.Presentation.ViewModel.ProductViewModel

@Composable
fun ProductListScreen(
    vm: ProductViewModel = hiltViewModel()
) {

    val stateUI by vm.state.collectAsStateWithLifecycle()

    LaunchedEffect(Unit) {
        vm.getProductList("Playeras")
    }

    LazyColumn {
        items(stateUI.products) {product ->
            Text(text = product.title)
            Text(text = product.productType)
        }
    }

}