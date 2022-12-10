package com.zibro.data.response

import com.google.gson.annotations.SerializedName

data class LocalCurrencyStore(
    @SerializedName("regionMnyFacltStus")
    val regionMnyFacltStus: List<RegionMnyFacltStu>
)

data class RegionMnyFacltStu(
    @SerializedName("head")
    val head: List<Head>,
    @SerializedName("row")
    val row: List<Row>
)

data class Result(
    @SerializedName("CODE")
    val cODE: String,
    @SerializedName("MESSAGE")
    val mESSAGE: String
)


data class Row(
    @SerializedName("BIZREGNO")
    val bIZREGNO: String,
    @SerializedName("CLSBIZ_DAY")
    val cLSBIZDAY: Any,
    @SerializedName("CMPNM_NM")
    val cMPNMNM: String,
    @SerializedName("FRCS_NO")
    val fRCSNO: Int,
    @SerializedName("INDUTYPE_CD")
    val iNDUTYPECD: String,
    @SerializedName("INDUTYPE_NM")
    val iNDUTYPENM: String,
    @SerializedName("LEAD_TAX_MAN_STATE")
    val lEADTAXMANSTATE: String,
    @SerializedName("LEAD_TAX_MAN_STATE_CD")
    val lEADTAXMANSTATECD: String,
    @SerializedName("REFINE_LOTNO_ADDR")
    val rEFINELOTNOADDR: String,
    @SerializedName("REFINE_ROADNM_ADDR")
    val rEFINEROADNMADDR: String,
    @SerializedName("SIGUN_NM")
    val sIGUNNM: String
)

data class Head(
    @SerializedName("api_version")
    val apiVersion: String,
    @SerializedName("list_total_count")
    val listTotalCount: Int,
    @SerializedName("RESULT")
    val rESULT: Result
)