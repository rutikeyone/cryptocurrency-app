package com.mobiledev.cryptocurrencyapp.data.remote.dto

import com.mobiledev.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailDto(
    val contract: String,
    val contracts: List<Contract>,
    val description: String,
    val developmentStatus: String,
    val firstDataAt: String,
    val hardwareWallet: Boolean,
    val hashAlgorithm: String,
    val id: String,
    val isActive: Boolean,
    val isNew: Boolean,
    val lastDataAt: String,
    val links: Links,
    val linksExtended: List<LinksExtended>,
    val message: String,
    val name: String,
    val openSource: Boolean,
    val orgStructure: String,
    val parent: Parent,
    val platform: String,
    val proofType: String,
    val rank: Int,
    val startedAt: String,
    val symbol: String,
    val tags: List<Tag>,
    val teamMember: List<TeamMember>,
    val type: String,
    val whitePaper: Whitepaper
)

fun CoinDetailDto.toCoinDetail() : CoinDetail{
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        rank = rank,
        isActive =  isActive,
        tags = tags.map { it.name },
        team = teamMember,
        symbol = symbol
    )
}