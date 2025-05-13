package com.example.composemphelloworld

import androidx.compose.ui.window.ComposeUIViewController
import com.example.composemphelloworld.di.dataSourceModel
import com.example.composemphelloworld.di.networkModule
import com.example.composemphelloworld.di.repositoryModule
import com.example.composemphelloworld.di.viewModelModule
import org.koin.core.context.startKoin

fun MainViewController() = ComposeUIViewController { App() }

fun initKoin() {
    startKoin {
        modules(networkModule, dataSourceModel, repositoryModule, viewModelModule())
    }
}