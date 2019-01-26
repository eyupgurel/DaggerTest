package com.example.daggertest.connectivity.rest

import dagger.Module
import dagger.Provides

@Module
class NetworkModule {
    @Provides
    internal fun providesUri(): String {
        return "www.google.com"
    }
}
