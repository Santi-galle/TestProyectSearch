package com.example.testproyectsliverpool.PLP.Data.Models.Response

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    val records: List<Record>
)

data class Record(
    val productId: String,
    val title: String,
    val priceInfo: PriceInfo,
    val skuRepositoryId: String,
    val productType: String,
    val ratingInfo: RatingInfo,
    val featureFlags: FeatureFlags,
    val brand: String,
    val seller: List<String>,
    val category: String,
    val categories: List<String>,
    val variantsColor: List<VariantColor>,
    val geoStoreIds: List<String>
)

data class PriceInfo(
    val salePrice: Double,
    val listPrice: PriceDetail,
    val promoPrice: PriceDetail?
)

data class PriceDetail(
    val price: Double
)

data class RatingInfo(
    val productAvgRating: Double
)

data class FeatureFlags(
    @SerializedName("isMarketPlace") val isMarketPlace: Boolean,
    @SerializedName("isSponsoredRecord") val isSponsoredRecord: Boolean,
    @SerializedName("isAr") val isAr: Boolean,
    @SerializedName("isCollection") val isCollection: Boolean,
    val exceedVariantsLimit: Boolean,
    @SerializedName("isChanel") val isChanel: Boolean
)

data class VariantColor(
    val skuId: String,
    val galleryContent: List<GalleryContent>,
    val type: String,
    val colorName: String,
    val colorHex: String
)

data class GalleryContent(
    val type: String,
    val url: String
)
