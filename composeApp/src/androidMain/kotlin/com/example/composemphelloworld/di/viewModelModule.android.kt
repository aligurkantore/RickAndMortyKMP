package com.example.composemphelloworld.di

import com.example.composemphelloworld.presentation.CharacterViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun viewModelModule(): Module = module {
    viewModelOf(::CharacterViewModel)

}