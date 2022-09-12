package com.secondlab.stockmarket.domain.repository

import com.secondlab.stockmarket.domain.model.CompanyInfo
import com.secondlab.stockmarket.domain.model.CompanyListing
import com.secondlab.stockmarket.domain.model.IntradayInfo
import com.secondlab.stockmarket.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListing(
        fetchFromRemote: Boolean,
        query: String,
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String,
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String,
    ): Resource<CompanyInfo>

}