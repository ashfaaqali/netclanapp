package com.example.ashfaqnetclan.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ashfaqnetclan.databinding.GroupsFragmentBinding

class GroupsFragment: Fragment() {
    private lateinit var binding: GroupsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = GroupsFragmentBinding.inflate(layoutInflater)
        return binding.root
    }
}