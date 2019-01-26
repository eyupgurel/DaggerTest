package com.example.daggertest.connectivity.socket

import com.jakewharton.rxrelay2.BehaviorRelay

interface IStockSocketRelay{
    val BroadcastRelay: BehaviorRelay<String>
}
