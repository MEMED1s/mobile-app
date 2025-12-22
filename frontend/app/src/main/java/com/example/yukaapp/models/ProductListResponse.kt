package com.example.yukaapp.models

data class ProductListResponse(
    val success: Boolean,
    val count: Int,
    val data: List<Product>
)