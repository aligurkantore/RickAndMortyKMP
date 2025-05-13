package com.example.composemphelloworld.data.mapper

import com.example.composemphelloworld.data.model.CharacterDTO
import com.example.composemphelloworld.data.model.CharacterResponse
import com.example.composemphelloworld.domain.model.Character


fun CharacterResponse.toDomain(): List<Character> = results.map { it.toDomain() }


fun CharacterDTO.toDomain() =
    Character(
        name = name,
        originName = origin.name,
        species = species,
        gender = gender,
        status = status,
        image = image
    )