package com.example.testproyectsliverpool.PLP.Data.Models.Request

import com.google.gson.annotations.SerializedName

data class ProductsRequest(
    @SerializedName("gbi_visitorId")
    val visitId: String = "f0124d9b-594e-4aa5-afc9-27ad31aa9177",
    @SerializedName("query")
    val query: String,//busqueda
    @SerializedName("dataCenter")
    val dataCenter: String = "SiteA",
    @SerializedName("brand")
    val brand: String = "LP",
    @SerializedName("channel")
    val channel: String = "APP",
    @SerializedName("skip")
    val skip: Int = 0,
    @SerializedName("pageSize")
    val pageSize: Int = 48,
    @SerializedName("pageNum")
    val pageNum: Int = 1
)
