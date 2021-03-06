package com.example.daggertest.main

import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent
interface MainActivitySubcomponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}
