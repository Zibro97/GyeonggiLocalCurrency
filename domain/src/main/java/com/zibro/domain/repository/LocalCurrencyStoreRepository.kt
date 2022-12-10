package com.zibro.domain.repository

import com.zibro.domain.model.LocalCurrencyStoreModel
import com.zibro.domain.util.State


interface LocalCurrencyStoreRepository {
    suspend fun getLocalCurrencyStoreList(
        sigunName : String = "",
        businessName : String = "",
        roadNumberAddress : String = "",
        lotNumberAddress : String = "",
    ) : State<LocalCurrencyStoreModel>
}