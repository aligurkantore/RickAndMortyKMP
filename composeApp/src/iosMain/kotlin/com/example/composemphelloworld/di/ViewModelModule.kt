package com.example.composemphelloworld.di

import com.example.composemphelloworld.presentation.CharacterViewModel
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

actual fun viewModelModule() = module {
    factoryOf(::CharacterViewModel)
}