package com.zibro.data.network

import com.zibro.data.BuildConfig
import com.zibro.data.response.LocalCurrencyStore
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenApiService {
    /**
     * 지역화폐 가맹점 현황 request
     * @param SIGUN_NM String 시군명
     * @param CMPNM_NM String 상호명
     * @param REFINE_ROADNM_ADDR String 소재지도로명주소
     * @param REFINE_LOTINO_ADDR String 소재지지번주소
     */
    @GET("RegionMnyFacltStus")
    suspend fun getLocalCurrencyStatus(
        @Query("KEY")
        apiKey:String = BuildConfig.LOCAL_CURRENCY_API_KEY,
        @Query("Type")
        type :String = "json",
        @Query("pIndex")
        pageIndex : Int = 1,
        @Query("pSize")
        pageSize : Int = 100,
        @Query("SIGUN_NM")
        sigunName : String = "",
        @Query("CMPNM_NM")
        businessName : String = "",
        @Query("REFINE_ROADNM_ADDR")
        roadNumberAddress : String = "",
        @Query("REFINE_LOTNO_ADDR")
        lotNumberAddress : String = "",
    ) : LocalCurrencyStore
}