package com.example.daggertest.connectivity.socket

import com.example.daggertest.data.StockTransaction
import com.jakewharton.rxrelay2.BehaviorRelay


interface IStockSocketRelay{
    var broadcastRelay: BehaviorRelay<StockTransaction>
}
