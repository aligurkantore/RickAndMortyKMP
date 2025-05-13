package com.example.composemphelloworld.presentation

import com.example.composemphelloworld.domain.model.Character

data class CharacterStateUI(
    val characters: List<Character> = listOf(),
    val error: Exception? = null,
    val loading: Boolean? = false
)
