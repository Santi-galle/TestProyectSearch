package com.example.testproyectsliverpool.PLP.Presentation.States

import com.example.testproyectsliverpool.PLP.Data.Models.Response.ApiResponse
import com.example.testproyectsliverpool.PLP.Data.Models.Response.Record

data class ProductListState(
    val products:  List<Record> = listOf()
)
