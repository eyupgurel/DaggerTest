package com.example.daggertest

import com.example.daggertest.di.DaggerMyApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MyApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val myApplicationComponent = DaggerMyApplicationComponent.builder().application(this).build()
        myApplicationComponent.inject(this)
        return myApplicationComponent
    }
}
