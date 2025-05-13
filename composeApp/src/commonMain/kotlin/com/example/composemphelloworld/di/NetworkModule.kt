package com.example.composemphelloworld.di

import com.example.composemphelloworld.data.Client
import org.koin.dsl.module

val networkModule = module {
    single { Client.getClient() }
}