package com.example.ashfaqnetclan.ui.fragments.explore_sub_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ashfaqnetclan.databinding.PersonalFragmentBinding

class PersonalFragment: Fragment() {
    private lateinit var binding: PersonalFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = PersonalFragmentBinding.inflate(layoutInflater)
        return binding.root


    }
}