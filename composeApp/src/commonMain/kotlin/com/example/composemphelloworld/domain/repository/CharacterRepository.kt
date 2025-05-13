package com.example.composemphelloworld.domain.repository

import com.example.composemphelloworld.domain.model.BaseResult
import com.example.composemphelloworld.domain.model.Character

interface CharacterRepository {

    suspend fun getCharacters(): BaseResult<List<Character>>
}