package com.example.ramchallenge.mvvm.characters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ramchallenge.R
import com.example.ramchallenge.model.CharacterModel

class CharacterViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    var image: ImageView = itemView.findViewById(R.id.item_character_image)
    var name: TextView = itemView.findViewById(R.id.item_character_name)

    fun bind(character: CharacterModel) {
        name.text = character.name
        Glide.with(itemView.context)
            .load(character.image)
            .into(image)
    }
}