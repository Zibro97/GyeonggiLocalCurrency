package com.zibro.domain.usecase

import com.zibro.domain.model.LocalCurrencyStoreModel
import com.zibro.domain.repository.LocalCurrencyStoreRepository
import com.zibro.domain.util.State

class GetLocalCurrencyStoreUseCase(
    private val repository: LocalCurrencyStoreRepository
) {
    suspend fun invoke(param : String) :State<LocalCurrencyStoreModel> = repository.getLocalCurrencyStoreList()
}