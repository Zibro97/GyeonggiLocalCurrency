package com.zibro.data.mapper

import com.zibro.data.response.*
import com.zibro.domain.model.*

fun LocalCurrencyStore.toLocalCurrencyStoreModel() : LocalCurrencyStoreModel = LocalCurrencyStoreModel(
    regionMnyFacltStus.map {  data ->
        data.toRegionMnyFacltStuModel()
    }
)

fun RegionMnyFacltStu.toRegionMnyFacltStuModel() = RegionMnyFacltStuModel(
    head = head?.let{ headList ->
        headList.map { head ->
            head.toHeadModel()
        }
    },
    row = row?.let{ rowList ->
        rowList.map { row->
            row.toRowModel()
        }
    }
)

fun Head.toHeadModel() = HeadModel(
    apiVersion = apiVersion ?: "1.0v",
    listTotalCount = listTotalCount,
    result = result?.toResultModel()
)

fun Row.toRowModel() = RowModel(
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

fun Result.toResultModel() = ResultModel(
    code = code,
    message = message,
)