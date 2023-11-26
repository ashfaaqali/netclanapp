package com.example.ashfaqnetclan

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.ashfaqnetclan.databinding.ActivityMainBinding
import com.example.ashfaqnetclan.ui.fragments.ChatFragment
import com.example.ashfaqnetclan.ui.fragments.ContactsFragment
import com.example.ashfaqnetclan.ui.fragments.ExploreFragment
import com.example.ashfaqnetclan.ui.fragments.GroupsFragment
import com.example.ashfaqnetclan.ui.fragments.NetworkFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        window.navigationBarColor = resources.getColor(R.color.md_theme_light_secondaryContainer)

        setFragment(ExploreFragment())

        // Handle bottom navigation item selection
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.xplore_menu_item -> {
                    setFragment(ExploreFragment()) // Replace with Updates fragment
                    true // Return true to indicate the item selection was handled
                }

                R.id.network_menu_item -> {
                    setFragment(NetworkFragment()) // Replace with Settings fragment
                    true // Return true to indicate the item selection was handled
                }

                R.id.chat_menu_item -> {
                    setFragment(ChatFragment()) // Replace with Updates fragment
                    true // Return true to indicate the item selection was handled
                }

                R.id.contact_menu_item -> {
                    setFragment(ContactsFragment()) // Replace with Settings fragment
                    true // Return true to indicate the item selection was handled
                }

                R.id.group_menu_item -> {
                    setFragment(GroupsFragment()) // Replace with Settings fragment
                    true // Return true to indicate the item selection was handled
                }

                else -> false // Return false if the item selection wasn't handled
            }
        }
    }
    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}