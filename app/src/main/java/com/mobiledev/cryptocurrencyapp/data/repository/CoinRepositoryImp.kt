package com.mobiledev.cryptocurrencyapp.data.repository

import com.mobiledev.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.mobiledev.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.mobiledev.cryptocurrencyapp.data.remote.dto.CoinDto
import com.mobiledev.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImp @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}