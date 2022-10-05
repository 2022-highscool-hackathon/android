package com.example.hackathon_2022.ui.job

import android.graphics.Color
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.dolbomi.DolbomiFragment
import com.example.hackathon_2022.ui.info.InfoFragment
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
            navItemClick(it as Button, binding.recommendBtn, binding.nearBtn)
        }
        binding.recommendBtn.setOnClickListener {
            navItemClick(it as Button, binding.allBtn, binding.nearBtn)
        }
        binding.nearBtn.setOnClickListener {
            navItemClick(it as Button, binding.allBtn, binding.recommendBtn)
        }
    }

    private fun navItemClick(current: Button, other1: Button, other2: Button) {
        current.setBackgroundResource(R.drawable.bg_tab_selected)
        current.setTextColor(Color.WHITE)
        other1.setBackgroundResource(R.drawable.bg_tab_unselected_white)
        other1.setTextColor(Color.BLACK)
        other2.setBackgroundResource(R.drawable.bg_tab_unselected_white)
        other2.setTextColor(Color.BLACK)
    }
}