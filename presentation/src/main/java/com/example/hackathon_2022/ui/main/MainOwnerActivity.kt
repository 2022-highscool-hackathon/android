package com.example.hackathon_2022.ui.main

import android.widget.Button
import com.example.hackathon_2022.ui.base.BaseActivity
import com.example.hackathon_2022.ui.dolbomi.DolbomiFragment
import com.example.hackathon_2022.ui.info.InfoFragment
import com.example.hackathon_2022.ui.job.JobFragment
import com.example.hackathon_2022.ui.job.JobOwnerFragment
import com.example.hackathon_2022.utils.navItemClick
import com.example.presentation.R
import com.example.presentation.databinding.ActivityMainOwnerBinding

class MainOwnerActivity: BaseActivity<ActivityMainOwnerBinding>(R.layout.activity_main_owner) {
    override fun initView() {
        initBottomNav()
    }

    override fun observeEvent() {
    }

    private fun initBottomNav() {
        supportFragmentManager.beginTransaction().replace(R.id.mainFragmentContainer, JobOwnerFragment())
            .commit()
        binding.jobBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.infoBtn), true) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.mainFragmentContainer, JobOwnerFragment()).commit()
            }
        }
        binding.infoBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.jobBtn), true) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.mainFragmentContainer, InfoFragment()).commit()
            }
        }
    }
}