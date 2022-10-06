package com.example.hackathon_2022.ui.dolbomi

import android.widget.Button
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.job.JobNearFragment
import com.example.hackathon_2022.ui.job.JobRecommendFragment
import com.example.hackathon_2022.utils.navItemClick
import com.example.presentation.R
import com.example.presentation.databinding.FragmentDolbomiBinding

class DolbomiFragment: BaseFragment<FragmentDolbomiBinding>(R.layout.fragment_dolbomi) {
    override fun initView() {
        initMenuNav()
    }

    override fun observeEvent() {
    }

    private fun initMenuNav() {
        activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.dolbomiFragmentContainer, DolbomiRecommendFragment())?.commit()
        binding.recommendBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.nearBtn)) {
                activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.dolbomiFragmentContainer, DolbomiRecommendFragment())?.commit()
            }
        }
        binding.nearBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.recommendBtn)) {
                activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.dolbomiFragmentContainer, DolbomiNearFragment())?.commit()
            }
        }
    }
}