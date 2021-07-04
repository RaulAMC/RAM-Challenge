package com.example.ramchallenge.mvvm.characters

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ramchallenge.model.CharacterModel
import com.example.ramchallenge.model.CharacterProvider

class CharacterViewModel: ViewModel() {

    val characterModel = MutableLiveData<List<CharacterModel>>()

    fun getCharacterList() {
        val characterList = CharacterProvider.getCharacterList()
        characterModel.postValue(characterList)
    }
}