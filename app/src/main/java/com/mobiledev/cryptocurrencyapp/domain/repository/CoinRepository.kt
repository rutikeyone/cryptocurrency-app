package com.mobiledev.cryptocurrencyapp.domain.repository

import com.mobiledev.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.mobiledev.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins() : List<CoinDto>

    suspend fun getCoinById(coinId:String):CoinDetailDto
}