package com.example.composemphelloworld.data.repository

import com.example.composemphelloworld.data.CharacterDataSource
import com.example.composemphelloworld.data.mapper.toDomain
import com.example.composemphelloworld.domain.model.BaseResult
import com.example.composemphelloworld.domain.model.Character
import com.example.composemphelloworld.domain.repository.CharacterRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.withContext

class CharacterRepositoryImpl(private val dataSource: CharacterDataSource) : CharacterRepository {
    override suspend fun getCharacters(): BaseResult<List<Character>> {
        return try {
            val characters = withContext(Dispatchers.IO) {
                dataSource.getCharacters().toDomain()
            }
            BaseResult.Success(characters)
        } catch (e: Exception) {
            BaseResult.Error(e)
        }
    }
}