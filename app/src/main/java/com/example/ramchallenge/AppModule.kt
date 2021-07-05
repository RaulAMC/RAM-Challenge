package com.example.ramchallenge

import com.example.ramchallenge.data.network.CharacterApiBuilder
import com.example.ramchallenge.data.repository.CharacterRepository
import com.example.ramchallenge.data.repository.CharacterRepositoryImp
import com.example.ramchallenge.ui.characters.CharacterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val racModule : Module = module {
    viewModel{
        CharacterViewModel(get())
    }

    factory<CharacterRepository> { CharacterRepositoryImp(get())}
    single { CharacterApiBuilder()  }



}