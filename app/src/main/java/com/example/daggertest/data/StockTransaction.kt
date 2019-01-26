package com.example.daggertest.data

import kotlinx.serialization.Serializable

@Serializable
data class StockTransaction(val symbol: String,
                                                            val sector: String,
                                                            val securityType: String,
                                                            val bidPrice: Double,
                                                            val bidSize: Long,
                                                            val askPrice: Double,
                                                            val askSize: Long,
                                                            val lastUpdated: Long,
                                                            val lastSalePrice: Double,
                                                            val lastSaleSize: Long,
                                                            val lastSaleTime: Long,
                                                            val marketPercent: Double,
                                                            val volume: Long,
                                                            val seq: Long)