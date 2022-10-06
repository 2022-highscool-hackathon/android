package com.example.hackathon_2022.ui.dolbomi

import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackathon_2022.adapter.AllDolbomiAdapter
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.detail_dolbomi.DetailDolbomiActivity
import com.example.presentation.R
import com.example.presentation.databinding.FragmentDolbomiRecommendBinding

class DolbomiDolbomiAllFragment: BaseFragment<FragmentDolbomiRecommendBinding>(R.layout.fragment_dolbomi_recommend) {
    override fun initView() {
        binding.dolbomiRecyclerview.adapter = AllDolbomiAdapter {
            startActivity(Intent(context, DetailDolbomiActivity::class.java))
        }
        binding.dolbomiRecyclerview.layoutManager = LinearLayoutManager(context)
    }

    override fun observeEvent() {
    }
}