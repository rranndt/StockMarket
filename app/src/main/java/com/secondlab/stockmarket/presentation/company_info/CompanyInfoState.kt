package com.secondlab.stockmarket.presentation.company_info

import com.secondlab.stockmarket.domain.model.CompanyInfo
import com.secondlab.stockmarket.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null,
)