package com.example.composemphelloworld.data.model

import kotlinx.serialization.Serializable

@Serializable
data class CharacterResponse(
    val info: Info,
    val results: List<CharacterDTO>
)