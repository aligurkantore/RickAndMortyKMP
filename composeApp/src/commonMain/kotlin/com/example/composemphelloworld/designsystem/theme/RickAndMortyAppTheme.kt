package com.example.composemphelloworld.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


val appDarkColors = darkColors(
    background = AppColors.Background
)
val appLightColors = lightColors(
    background = AppColors.Background
)

@Composable
fun RickAndMortyAppTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if(isDarkTheme) appDarkColors else appLightColors,
        content = { content() }
    )
}