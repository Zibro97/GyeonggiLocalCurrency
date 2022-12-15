package com.zibro.data.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class LocalCurrencyStore(
    @SerializedName("RegionMnyFacltStus")
    @Expose
    val regionMnyFacltStus: List<RegionMnyFacltStu>
)

data class RegionMnyFacltStu(
    @SerializedName("head")
    @Expose
    val head: List<Head>?,
    @SerializedName("row")
    @Expose
    val row: List<Row>?,
)

data class Result(
    @SerializedName("CODE")
    @Expose
    val code: String,
    @SerializedName("MESSAGE")
    @Expose
    val message: String
)


data class Row(
    @SerializedName("BIZREGNO")
    @Expose
    val businessRegistrationNumber: String,
    @SerializedName("CLSBIZ_DAY")
    @Expose
    val closeBusinessDay: String?,
    @SerializedName("CMPNM_NM")
    @Expose
    val storeName: String,
    @SerializedName("FRCS_NO")
    @Expose
    val merchantNumber: Int,
    @SerializedName("INDUTYPE_CD")
    @Expose
    val industryCode: String,
    @SerializedName("INDUTYPE_NM")
    @Expose
    val industryName: String,
    @SerializedName("LEAD_TAX_MAN_STATE")
    @Expose
    val closedBusinessState: String,
    @SerializedName("LEAD_TAX_MAN_STATE_CD")
    @Expose
    val closedBusinessStateCode: String,
    @SerializedName("REFINE_LOTNO_ADDR")
    @Expose
    val locationNumberAddress: String,
    @SerializedName("REFINE_ROADNM_ADDR")
    @Expose
    val locationRoadNameAddress: String?,
    @SerializedName("SIGUN_NM")
    @Expose
    val sigunName: String
)

data class Head(
    @SerializedName("api_version")
    @Expose
    val apiVersion: String?,
    @SerializedName("list_total_count")
    @Expose
    val listTotalCount: Int,
    @Expose
    @SerializedName("RESULT")
    val result: Result?
)