package com.mobiledev.cryptocurrencyapp.presentation.coin_detail

import com.mobiledev.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading:Boolean = false,
    val coin: CoinDetail? = null,
    val error:String = ""
)