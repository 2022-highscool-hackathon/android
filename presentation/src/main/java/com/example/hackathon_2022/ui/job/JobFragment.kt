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
        activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.jobFragmentContainer, JobRecommendFragment())?.commit()
        binding.recommendBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.nearBtn)) {
                activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.jobFragmentContainer, JobRecommendFragment())?.commit()
            }
        }
        binding.nearBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.recommendBtn)) {
                activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.jobFragmentContainer, JobNearFragment())?.commit()
            }
        }
    }
}