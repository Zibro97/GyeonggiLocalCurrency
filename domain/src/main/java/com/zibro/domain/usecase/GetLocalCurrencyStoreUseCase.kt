package com.zibro.domain.usecase

import com.zibro.domain.model.LocalCurrencyStoreModel
import com.zibro.domain.repository.LocalCurrencyStoreRepository
import com.zibro.domain.util.State

class GetLocalCurrencyStoreUseCase(
    private val repository: LocalCurrencyStoreRepository
) {
    suspend fun invoke(
        sigunName : String = "",
        businessName : String = "",
        roadNumberAddress : String = "",
        lotNumberAddress : String = "",
    ) :State<LocalCurrencyStoreModel> =
        repository.getLocalCurrencyStoreList(
            sigunName = sigunName,
            businessName = businessName,
            roadNumberAddress = roadNumberAddress,
            lotNumberAddress = lotNumberAddress
        )
}