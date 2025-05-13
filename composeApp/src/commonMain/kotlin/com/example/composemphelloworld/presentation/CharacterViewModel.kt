package com.example.composemphelloworld.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composemphelloworld.domain.model.BaseResult
import com.example.composemphelloworld.domain.repository.CharacterRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CharacterViewModel(private val repository: CharacterRepository) : ViewModel() {

    private val _stateUI = MutableStateFlow(CharacterStateUI())
    val stateUI: StateFlow<CharacterStateUI> get() = _stateUI.asStateFlow()

    init {
        getCharacters()
    }

    private fun getCharacters() {
        _stateUI.update { _stateUI.value.copy(error = null, loading = true) }

        viewModelScope.launch(Dispatchers.Main) {
            when (val result = repository.getCharacters()) {
                is BaseResult.Error -> _stateUI.update {
                    _stateUI.value.copy(
                        error = result.exception,
                        loading = false
                    )
                }

                is BaseResult.Success -> _stateUI.update {
                    _stateUI.value.copy(
                        characters = result.data,
                        error = null,
                        loading = false
                    )
                }
            }


        }
    }

    override fun onCleared() {
        viewModelScope.cancel()
        super.onCleared()
    }
}