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
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
//import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

class MainActivity : DaggerActivity() {
    @Inject lateinit var uri: String
    @Inject lateinit var stockSocketRelay: IStockSocketRelay
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

     override fun onCreateView(name: String?, context: Context?, attrs: AttributeSet?): View? {
            stockSocketRelay.BroadcastRelay.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).
                subscribe{message ->
                    Log.d("Broadcasted message", message)
               }
           return super.onCreateView(name, context, attrs)

    }
}
