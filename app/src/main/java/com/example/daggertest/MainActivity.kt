package com.example.daggertest

import android.os.Bundle
import com.example.daggertest.connectivity.socket.IStockSocketRelay
import com.example.daggertest.connectivity.socket.StockSocketRelay
import dagger.android.DaggerActivity
import javax.inject.Inject
import io.socket.client.Socket
import javax.inject.Provider

class MainActivity : DaggerActivity() {
    @Inject lateinit var uri: String
    @Inject lateinit var stockSocketRelay: IStockSocketRelay
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
