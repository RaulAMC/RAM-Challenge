package com.example.ramchallenge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ramchallenge.databinding.ActivityMainListBinding

class MainListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainListBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}