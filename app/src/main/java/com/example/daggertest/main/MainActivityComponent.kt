package com.example.daggertest.main
import dagger.Component


@Component(modules = [MainActivityModule::class])
interface MainActivityComponent
