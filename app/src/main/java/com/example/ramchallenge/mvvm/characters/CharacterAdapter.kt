package com.example.ramchallenge.mvvm.characters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ramchallenge.R
import com.example.ramchallenge.model.CharacterModel

class CharacterAdapter(private val characterList: List<CharacterModel>) : RecyclerView.Adapter<CharacterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_character, parent, false)
        return CharacterViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(characterList[position])
    }

    override fun getItemCount() = characterList.size

}