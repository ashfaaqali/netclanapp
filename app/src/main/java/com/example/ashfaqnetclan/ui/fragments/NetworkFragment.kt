package com.example.ashfaqnetclan.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ashfaqnetclan.databinding.NetworkFragmentBinding

class NetworkFragment: Fragment() {
    private lateinit var binding: NetworkFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = NetworkFragmentBinding.inflate(layoutInflater)
        return binding.root
    }
}