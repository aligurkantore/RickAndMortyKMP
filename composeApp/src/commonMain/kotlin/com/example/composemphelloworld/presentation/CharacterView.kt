package com.example.composemphelloworld.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composemphelloworld.designsystem.component.RMCard
import org.koin.compose.koinInject

@Composable

fun CharacterView(viewModel: CharacterViewModel = koinInject ()) {

    val uiState by viewModel.stateUI.collectAsState()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .padding(30.dp),
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        items(uiState.characters) {
            RMCard(it)
        }
    }
}