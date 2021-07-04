package com.example.ramchallenge.mvvm.characters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ramchallenge.databinding.CharacterFragmentBinding
import com.example.ramchallenge.model.CharacterModel


class CharacterFragment : Fragment() {

    private val characterViewModel: CharacterViewModel by viewModels()
    private var _binding: CharacterFragmentBinding? = null
    private val binding get() = _binding!!
    private var characterList = ArrayList<CharacterModel>()

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = CharacterFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.characterList.layoutManager = LinearLayoutManager(context)
        val characterAdapter = CharacterAdapter(characterList)
        binding.characterList.adapter = characterAdapter
        characterViewModel.characterModel.observe(viewLifecycleOwner, Observer {
            characterList.addAll(it)
            characterAdapter.notifyDataSetChanged()
        })

        binding.testButton.setOnClickListener { characterViewModel.getCharacterList() }

    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }


}