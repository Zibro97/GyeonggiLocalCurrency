package com.zibro.data.mapper

import com.zibro.data.response.*
import com.zibro.domain.model.*

fun LocalCurrencyStore.toNetworkModel() : LocalCurrencyStoreModel = LocalCurrencyStoreModel(
    this.regionMnyFacltStus.map { it.toNetworkModel() }
)

fun RegionMnyFacltStu.toNetworkModel() = RegionMnyFacltStuModel(
    this.head.map { it.toNetworkModel() },
    this.row.map { it.toNetworkModel() }
)

fun Head.toNetworkModel() = HeadModel(
    this.apiVersion,
    this.listTotalCount,
    this.rESULT.toNetworkModel()
)

/**
 *
 * @param bIZREGNO String,
 * @param cLSBIZDAY Any,
 * @param cMPNMNM String,
 * @param fRCSNO Int,
 * @param iNDUTYPECD String,
 * @param iNDUTYPENM String,
 * @param lEADTAXMANSTATE String,
 * @param lEADTAXMANSTATECD String,
 * @param rEFINELOTNOADDR String,
 * @param rEFINEROADNMADDR String,
 * @param sIGUNNM String
 */
fun Row.toNetworkModel() = RowModel(
    this.bIZREGNO,
    this.cLSBIZDAY,
    this.cMPNMNM,
    this.fRCSNO,
    this.iNDUTYPECD,
    this.iNDUTYPENM,
    this.lEADTAXMANSTATE,
    this.lEADTAXMANSTATECD,
    this.rEFINELOTNOADDR,
    this.rEFINEROADNMADDR,
    this.sIGUNNM,
)

fun Result.toNetworkModel() = ResultModel(
    this.cODE,
    this.mESSAGE,
)