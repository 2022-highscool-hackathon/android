package com.example.hackathon_2022.ui.detail_dolbomi

import com.example.hackathon_2022.ui.base.BaseActivity
import com.example.presentation.R
import com.example.presentation.databinding.FragmentDetailDolbomiBinding

class DetailDolbomiActivity: BaseActivity<FragmentDetailDolbomiBinding>(R.layout.fragment_detail_dolbomi) {
    override fun initView() {
        binding.btn.setOnClickListener { finish() }
        binding.back.setOnClickListener { finish() }
    }

    override fun observeEvent() {
    }
}