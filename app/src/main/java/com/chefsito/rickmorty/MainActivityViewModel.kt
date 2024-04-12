package com.chefsito.rickmorty

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chefsito.rickmorty.data.GetCharacters
import com.chefsito.rickmorty.mappers.toCharacterUIModel
import com.chefsito.rickmorty.models.CharacterUIModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val getCharacters: GetCharacters
) : ViewModel() {

    private val _charactersState: MutableStateFlow<List<CharacterUIModel>> =
        MutableStateFlow(mutableListOf())
    val charactersState: StateFlow<List<CharacterUIModel>> = _charactersState.asStateFlow()

    fun getCharacterList(){
        viewModelScope.launch(Dispatchers.IO) {
            val result = getCharacters.GetCharacterList().map { it.toCharacterUIModel() }
            _charactersState.update { result }
        }
    }

}