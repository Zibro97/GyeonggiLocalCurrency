package com.zibro.domain.model

data class RowModel(
    val businessRegistrationNumber: String,
    val closeBusinessDay: Any,
    val storeName: String,
    val merchantNumber: Int,
    val industryCode: String,
    val industryName: String,
    val closedBusinessState: String,
    val closedBusinessStateCode: String,
    val locationNumberAddress: String,
    val locationRoadNameAddress: String,
    val sigunName: String
)
