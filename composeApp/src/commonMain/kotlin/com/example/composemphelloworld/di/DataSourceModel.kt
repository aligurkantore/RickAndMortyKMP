package com.example.composemphelloworld.di

import com.example.composemphelloworld.data.CharacterDataSource
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val dataSourceModel = module {
    singleOf(::CharacterDataSource)
}