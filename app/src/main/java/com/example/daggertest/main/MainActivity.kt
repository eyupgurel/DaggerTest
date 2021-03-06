package com.example.daggertest.main

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.example.daggertest.R
import com.example.daggertest.connectivity.socket.IStockSocketRelay
import dagger.android.DaggerActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainActivity : DaggerActivity() {
    @Inject lateinit var uri: String
    @Inject lateinit var stockSocketRelay: IStockSocketRelay
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

     override fun onCreateView(name: String?, context: Context?, attrs: AttributeSet?): View? {
            stockSocketRelay.broadcastRelay.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).
                subscribe{stockTransaction ->
                    Log.d("Broadcasted stock transaction: ", stockTransaction.toString())
                }
           return super.onCreateView(name, context, attrs)
    }
}
