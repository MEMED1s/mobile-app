package com.example.yukaapp.network

import com.example.yukaapp.models.ProductResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("products/{barcode}")
    fun getProduct(@Path("barcode") barcode: String): Call<ProductResponse>
}
