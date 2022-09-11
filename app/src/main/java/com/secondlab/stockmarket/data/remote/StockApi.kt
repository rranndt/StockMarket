package com.secondlab.stockmarket.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apiKey") apiKey: String,
    ): ResponseBody

    companion object {
        const val API_KEY = "GCYU6LH6MTJZAOT9"
        const val BASE_URL = "https://www.alphavantage.co/"
    }

}