package com.example.daggertest.connectivity.socket

import android.app.PendingIntent.getActivity
import android.util.Log
import android.widget.Toast
import com.jakewharton.rxrelay2.BehaviorRelay
import io.socket.client.Socket
import io.socket.emitter.Emitter
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.json.JSONObject
import javax.inject.Provider


class StockSocketRelay(StockSocketProvider: Provider<Socket>) : IStockSocketRelay {
    override val BroadcastRelay: BehaviorRelay<String> get() = BehaviorRelay.create()
        init {
            var onConnect = Emitter.Listener {
                GlobalScope.launch {
                    StockSocketProvider.get().emit("subscribe", "msft,snap,fb,aig+")
                }
            }
            var onMessage = Emitter.Listener { args ->
                GlobalScope.launch {
                    BroadcastRelay.accept(args[0].toString())
                    Log.d("Incoming message", args[0].toString())
                }
            }
            var stockSocket = StockSocketProvider.get()
            stockSocket.on(Socket.EVENT_CONNECT, onConnect)
            stockSocket.on(Socket.EVENT_MESSAGE, onMessage)
            stockSocket.connect()
        }
}