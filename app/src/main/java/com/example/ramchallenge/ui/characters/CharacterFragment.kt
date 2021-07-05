package com.example.ramchallenge.ui.characters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ramchallenge.databinding.CharacterFragmentBinding
import com.example.ramchallenge.model.CharacterModel
import com.example.ramchallenge.ui.State
import org.koin.androidx.viewmodel.ext.android.viewModel


class CharacterFragment : Fragment() {

    private val characterViewModel by viewModel<CharacterViewModel>()
    private var _binding: CharacterFragmentBinding? = null
    private val binding get() = _binding!!
    private var characterList = ArrayList<CharacterModel>()

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = CharacterFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        characterViewModel.onCreate()
        characterViewModel.characterModel.observe(viewLifecycleOwner, Observer {
            when (it) {
                is State.Empty -> {
                    binding.loadingBar.isVisible = false
                    binding.characterList.visibility = View.GONE
//                    TODO("Create emptyView")
                }
                is State.Loading -> {
                    binding.loadingBar.isVisible = true
                    binding.characterList.visibility = View.GONE
                }
                is State.Success -> {
                    characterList.addAll(it.data as List<CharacterModel>)
                    binding.characterList.layoutManager = LinearLayoutManager(context)
                    binding.characterList.adapter = CharacterAdapter(characterList)

                    binding.loadingBar.isVisible = false
                    binding.characterList.visibility = View.VISIBLE
                }
            }



        })


    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }


}