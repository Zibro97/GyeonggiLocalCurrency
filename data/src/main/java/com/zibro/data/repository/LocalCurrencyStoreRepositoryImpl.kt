package com.zibro.data.repository

import com.zibro.data.mapper.toNetworkModel
import com.zibro.data.network.OpenApiService
import com.zibro.domain.model.LocalCurrencyStoreModel
import com.zibro.domain.repository.LocalCurrencyStoreRepository
import com.zibro.domain.util.State
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import java.lang.Exception

/**
 * 지역화폐가맹점 Repository
 */
class LocalCurrencyStoreRepositoryImpl(
    private val ioDispatcher : CoroutineDispatcher,
    private val openApiService: OpenApiService
) : LocalCurrencyStoreRepository {

    override suspend fun getLocalCurrencyStoreList(
        sigunName: String,
        businessName: String,
        roadNumberAddress: String,
        lotNumberAddress: String
    ) : State<LocalCurrencyStoreModel> = withContext(ioDispatcher){
        return@withContext try{
            openApiService.getLocalCurrencyStatus(
                sigunName = sigunName,
                businessName = businessName,
                roadNumberAddress = roadNumberAddress,
                lotNumberAddress = lotNumberAddress
            ).let { localCurrencyStore ->
                State.Success(localCurrencyStore.toNetworkModel())
            }
        } catch (e :Exception) {
            State.Error(e)
        }
    }
}