package com.example.composemphelloworld

import android.app.Application
import com.example.composemphelloworld.di.dataSourceModel
import com.example.composemphelloworld.di.networkModule
import com.example.composemphelloworld.di.repositoryModule
import com.example.composemphelloworld.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class RickAndMortyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@RickAndMortyApp)
            androidLogger()
            modules(networkModule, dataSourceModel, repositoryModule, viewModelModule())
        }
    }
}