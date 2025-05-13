package com.example.composemphelloworld.data

import com.example.composemphelloworld.data.Client.CHARACTERS_PATH
import com.example.composemphelloworld.data.model.CharacterResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class CharacterDataSource(private val client: HttpClient) {

    suspend fun getCharacters(): CharacterResponse =
        client.get(CHARACTERS_PATH).body()
}