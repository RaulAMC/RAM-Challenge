package com.example.ramchallenge.mvvm.characters

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ramchallenge.connection.CharacterService
import com.example.ramchallenge.model.CharacterModel
import com.example.ramchallenge.model.CharacterProvider
import kotlinx.coroutines.launch

class CharacterViewModel: ViewModel() {

    val characterModel = MutableLiveData<List<CharacterModel>>()
    var characterService = CharacteRepository()

    fun getCharacterList() {
        val characterList = CharacterProvider.characterList
        characterModel.postValue(characterList)
    }

    fun onCreate() {
        viewModelScope.launch {
            val response = characterService.getCharacter()
            if (!response.isNullOrEmpty()) {
                characterModel.postValue(response)
            }
        }
    }
}