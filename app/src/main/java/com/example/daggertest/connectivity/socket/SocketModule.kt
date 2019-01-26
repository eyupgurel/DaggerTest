package com.example.daggertest.connectivity.socket

import dagger.Module
import dagger.Provides
import io.socket.client.IO
import io.socket.client.Socket
import javax.inject.Provider
import javax.inject.Singleton

@Module
class SocketModule{

    @Provides @Singleton
    internal fun providesStockSocket(): Socket {
        return IO.socket("https://ws-api.iextrading.com/1.0/tops")
    }

    @Provides @Singleton
    internal fun providesStockSocketRelay(stockSocket: Provider<Socket>): IStockSocketRelay {
         return StockSocketRelay(stockSocket)
    }
}