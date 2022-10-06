package com.example.hackathon_2022.ui.job

import android.widget.Button
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.utils.navItemClick
import com.example.presentation.R
import com.example.presentation.databinding.FragmentJobOwnerBinding

class JobOwnerFragment: BaseFragment<FragmentJobOwnerBinding>(R.layout.fragment_job_owner) {
    override fun initView() {
        initMenuNav()
    }

    override fun observeEvent() {
    }

    private fun initMenuNav() {
        activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.jobFragmentContainer, JobOwnerAllFragment())?.commit()
        binding.allBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.mapBtn)) {
                activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.jobFragmentContainer, JobOwnerAllFragment())?.commit()
            }
        }
        binding.mapBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.allBtn)) {
                activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.jobFragmentContainer, JobOwnerMapFragment())?.commit()
            }
        }
    }
}