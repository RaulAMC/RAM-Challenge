package com.example.ramchallenge.ui.characters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ramchallenge.R
import com.example.ramchallenge.databinding.ItemCharacterBinding
import com.example.ramchallenge.model.CharacterModel
import com.example.ramchallenge.model.enums.StatusCharacterEnum

class CharacterAdapter(private val characterList: List<CharacterModel>) : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val binding = ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharacterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(characterList[position])
    }

    override fun getItemCount() = characterList.size

    class CharacterViewHolder (private val binding: ItemCharacterBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(character: CharacterModel) {
            binding.name.text = character.name
            binding.status.text = itemView.resources.getText(getStatus(character.status))
            binding.location.text = character.location.name
            Glide.with(itemView.context)
                .load(character.image)
                .into(binding.image)
        }

        private fun getStatus(status: StatusCharacterEnum): Int {
            return when(status) {
                StatusCharacterEnum.LIVE -> R.string.status_live
                StatusCharacterEnum.DEAD -> R.string.status_dead
                else -> R.string.status_unknown
            }

        }
    }

}