package com.example.rokomariapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rokomariapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    private val recently_sold_data = listOf(
        RecentlySoldItemData(R.drawable.recently_sold_one, "The Monk Who\nWho Sold His\nFerrari"),
        RecentlySoldItemData(R.drawable.recently_sold_two, "Master Your\nEnglish\nGrammer"),
        RecentlySoldItemData(R.drawable.recently_sold_one, "The Monk Who\nWho Sold His\nFerrari"),
        RecentlySoldItemData(R.drawable.recently_sold_two, "Master Your\nEnglish\nGrammer"),
        RecentlySoldItemData(R.drawable.recently_sold_one, "The Monk Who\nWho Sold His\nFerrari"),
        RecentlySoldItemData(R.drawable.recently_sold_two, "Master Your\nEnglish\nGrammer"),
        RecentlySoldItemData(R.drawable.recently_sold_one, "The Monk Who\nWho Sold His\nFerrari"),
        RecentlySoldItemData(R.drawable.recently_sold_two, "Master Your\nEnglish\nGrammer"),
        RecentlySoldItemData(R.drawable.recently_sold_one, "The Monk Who\nWho Sold His\nFerrari"),
        RecentlySoldItemData(R.drawable.recently_sold_two, "Master Your\nEnglish\nGrammer")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentHomeBinding.bind(view)

        initViews()
    }

    private fun initViews() {
        val layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.adRv.layoutManager = layoutManager
        binding.adRv.adapter = AdAdapter(
            listOf(
                AdData(R.drawable.ad1),
                AdData(R.drawable.ad2),
                AdData(R.drawable.ad3)
            )
        )

        val layoutManager_recent_item =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        binding.recentlySoldRv.layoutManager = layoutManager_recent_item
        binding.recentlySoldRv.adapter = RecentlySoldItemAdapter(recently_sold_data)
    }
}
