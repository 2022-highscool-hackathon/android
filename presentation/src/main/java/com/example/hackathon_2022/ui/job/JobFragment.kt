package com.example.hackathon_2022.ui.job

import android.widget.Button
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.utils.navItemClick
import com.example.presentation.R
import com.example.presentation.databinding.FragmentJobBinding

class JobFragment: BaseFragment<FragmentJobBinding>(R.layout.fragment_job) {
    override fun initView() {
        initMenuNav()
    }

    override fun observeEvent() {
    }

    private fun initMenuNav() {
        binding.allBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.recommendBtn, binding.nearBtn))
        }
        binding.recommendBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.allBtn, binding.nearBtn))
        }
        binding.nearBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.allBtn, binding.recommendBtn))
        }
    }
}