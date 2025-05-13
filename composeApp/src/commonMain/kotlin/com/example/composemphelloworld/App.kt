package com.example.composemphelloworld

import androidx.compose.runtime.*
import com.example.composemphelloworld.designsystem.theme.RickAndMortyAppTheme
import com.example.composemphelloworld.presentation.CharacterView
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext

@Composable
@Preview
fun App() {
    KoinContext {
        RickAndMortyAppTheme {
            CharacterView()
        }
    }
}