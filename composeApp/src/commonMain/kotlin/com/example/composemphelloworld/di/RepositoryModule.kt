package com.example.composemphelloworld.di

import com.example.composemphelloworld.data.repository.CharacterRepositoryImpl
import com.example.composemphelloworld.domain.repository.CharacterRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val repositoryModule = module {
    singleOf(::CharacterRepositoryImpl) {
        bind<CharacterRepository>()
    }
}