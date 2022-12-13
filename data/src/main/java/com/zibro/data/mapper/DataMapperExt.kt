package com.zibro.data.mapper

import com.zibro.data.response.*
import com.zibro.domain.model.*

fun LocalCurrencyStore.toNetworkModel() : LocalCurrencyStoreModel = LocalCurrencyStoreModel(
    regionMnyFacltStus.map {  data ->
        data.toNetworkModel()
    }
)

fun RegionMnyFacltStu.toNetworkModel() = RegionMnyFacltStuModel(
    head = head.map { it.toNetworkModel() },
    row = row.map { it.toNetworkModel() }
)

fun Head.toNetworkModel() = HeadModel(
    apiVersion = apiVersion,
    listTotalCount = listTotalCount,
    result = result.toNetworkModel()
)

fun Row.toNetworkModel() = RowModel(
    businessRegistrationNumber = businessRegistrationNumber,
    closeBusinessDay = closeBusinessDay ?: "yyyy-mm-dd",
    storeName = storeName,
    merchantNumber = merchantNumber,
    industryCode = industryCode,
    industryName = industryName,
    closedBusinessState = closedBusinessState,
    closedBusinessStateCode = closedBusinessStateCode,
    locationNumberAddress = locationNumberAddress,
    locationRoadNameAddress = locationRoadNameAddress ?:"알 수 없음",
    sigunName = sigunName,
)

fun Result.toNetworkModel() = ResultModel(
    code = this.code,
    message = this.message,
)