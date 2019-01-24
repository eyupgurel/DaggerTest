package com.example.daggertest.di

import dagger.Module
import dagger.Provides

@Module
class NetworkModule {
    @Provides
    internal fun providesUri(): String {
        return "www.google.com"
    }
}
