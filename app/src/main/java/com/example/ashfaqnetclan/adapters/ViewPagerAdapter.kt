package com.example.ashfaqnetclan.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ashfaqnetclan.ui.fragments.explore_sub_fragments.BusinessFragment
import com.example.ashfaqnetclan.ui.fragments.explore_sub_fragments.MerchantFragment
import com.example.ashfaqnetclan.ui.fragments.explore_sub_fragments.PersonalFragment

class ViewPagerAdapter (fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PersonalFragment()
            1 -> BusinessFragment()
            2 -> MerchantFragment()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }

}