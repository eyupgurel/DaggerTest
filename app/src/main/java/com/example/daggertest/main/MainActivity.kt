package com.example.daggertest.main

import android.os.Bundle
import com.example.daggertest.R
import com.example.daggertest.connectivity.socket.IStockSocketRelay
import dagger.android.DaggerActivity
import javax.inject.Inject

class MainActivity : DaggerActivity() {
    @Inject lateinit var uri: String
    @Inject lateinit var stockSocketRelay: IStockSocketRelay
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
