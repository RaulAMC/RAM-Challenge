package com.example.ramchallenge.ui.characters

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ramchallenge.data.repository.CharacterRepository
import com.example.ramchallenge.ui.State
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class CharacterViewModel(private val characterRep: CharacterRepository) : ViewModel() {

    val characterModel = MutableLiveData<State<out Any>>()

    fun onCreate() {
        viewModelScope.launch(IO) {
            characterModel.postValue(State.Loading())
            val response = characterRep.getCharacter()
            if (!response.isNullOrEmpty()) {
                characterModel.postValue(State.Success(response))
            } else {
                characterModel.postValue(State.Empty())
            }
        }
    }
}