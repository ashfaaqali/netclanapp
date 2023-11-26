package com.example.ashfaqnetclan.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ashfaqnetclan.RefineActivity
import com.example.ashfaqnetclan.adapters.ViewPagerAdapter
import com.example.ashfaqnetclan.databinding.ExploreFragmentBinding
import com.google.android.material.tabs.TabLayoutMediator

class ExploreFragment: Fragment() {
    private lateinit var binding: ExploreFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = ExploreFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager = binding.viewPager
        val tabLayout = binding.exploreTabLayout

        val adapter = ViewPagerAdapter(childFragmentManager, lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Personal"
                1 -> tab.text = "Business"
                2 -> tab.text = "Merchant"
            }
        }.attach()

        binding.refineLinearLayout.setOnClickListener {
            navigateToRefineActivity()
        }
    }

    private fun navigateToRefineActivity() {
        val intent = Intent(requireContext(), RefineActivity::class.java)
        startActivity(intent)
    }
}