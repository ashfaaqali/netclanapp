package com.example.ashfaqnetclan.ui.fragments.explore_sub_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ashfaqnetclan.databinding.BusinessFragmentBinding

class BusinessFragment: Fragment() {
    private lateinit var binding: BusinessFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = BusinessFragmentBinding.inflate(layoutInflater)
        return binding.root
    }
}