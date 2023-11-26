package com.example.ashfaqnetclan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.core.view.marginBottom
import com.example.ashfaqnetclan.databinding.ActivityRefineBinding
import com.google.android.flexbox.FlexboxLayout
import com.google.android.material.slider.LabelFormatter
import com.google.android.material.slider.Slider

class RefineActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRefineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRefineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backArrow.setOnClickListener{
            onBackPressedDispatcher.onBackPressed()
        }

        flexBoxDynamicLayout()

        availabilityDropdown()

    }

    private fun availabilityDropdown() {
        val items = resources.getStringArray(R.array.availability_text_items)
        val arrayAdapter = ArrayAdapter(this, R.layout.availability_dropdown_item, items)
        binding.availabilityAutoCompleteTextView.setAdapter(arrayAdapter)
    }

    private fun flexBoxDynamicLayout() {
        val options = listOf("Coffee", "Business", "Hobbies", "Friendship", "Movies", "Dinning", "Dating", "Matrimony")

        for (option in options) {
            val textView = TextView(this)
            textView.text = option
            textView.setBackgroundResource(R.drawable.flexbox_color_selector)
            textView.setTextColor(getColorStateList(R.color.flexbox_text_color_selector))
            textView.gravity = Gravity.CENTER
            textView.textSize = 13F
            textView.setPadding(30, 20, 30, 20) // Adjust padding as needed

            val layoutParams = FlexboxLayout.LayoutParams(
                FlexboxLayout.LayoutParams.WRAP_CONTENT,
                FlexboxLayout.LayoutParams.WRAP_CONTENT
            )

            layoutParams.setMargins(12, 12, 12, 12)
            textView.layoutParams = layoutParams

            textView.setOnClickListener {
                textView.isSelected = !textView.isSelected
            }

            binding.flexboxLayout.addView(textView)
        }
    }

}