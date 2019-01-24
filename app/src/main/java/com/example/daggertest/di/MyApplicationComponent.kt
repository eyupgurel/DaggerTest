package com.example.daggertest.di
import android.app.Application
import com.example.daggertest.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule

import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, MainActivityModule::class])
interface MyApplicationComponent : AndroidInjector<DaggerApplication> {
    override fun inject(instance: DaggerApplication)
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): MyApplicationComponent
    }
}
