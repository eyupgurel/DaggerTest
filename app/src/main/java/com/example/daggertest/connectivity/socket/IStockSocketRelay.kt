package com.example.daggertest.connectivity.socket

import com.jakewharton.rxrelay2.BehaviorRelay
import com.jakewharton.rxrelay2.ReplayRelay

interface IStockSocketRelay{
    val BroadcastRelay: BehaviorRelay<String>
    //val ReplayRelay: ReplayRelay<String>
}
