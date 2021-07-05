package com.example.ramchallenge.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ramchallenge.R
import com.example.ramchallenge.databinding.ActivityMainListBinding
import com.example.ramchallenge.ui.characters.CharacterFragment

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.character_list_fragment, CharacterFragment())
            .commitNow()
    }
}