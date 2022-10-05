package com.example.hackathon_2022.ui.main

import android.widget.Button
import com.example.hackathon_2022.ui.base.BaseActivity
import com.example.hackathon_2022.ui.dolbomi.DolbomiFragment
import com.example.hackathon_2022.ui.info.InfoFragment
import com.example.hackathon_2022.ui.job.JobFragment
import com.example.hackathon_2022.utils.navItemClick
import com.example.presentation.R
import com.example.presentation.databinding.ActivityMainOldBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainOldActivity : BaseActivity<ActivityMainOldBinding>(R.layout.activity_main_old) {
    override fun initView() {
        initBottomNav()
    }

    override fun observeEvent() {
    }

    private fun initBottomNav() {
        supportFragmentManager.beginTransaction().replace(R.id.mainFragmentContainer, JobFragment())
            .commit()
        binding.jobBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.dolbomiBtn, binding.infoBtn), true) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.mainFragmentContainer, JobFragment()).commit()
            }
        }
        binding.dolbomiBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.jobBtn, binding.infoBtn), true) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.mainFragmentContainer, DolbomiFragment()).commit()
            }
        }
        binding.infoBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.jobBtn, binding.dolbomiBtn), true) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.mainFragmentContainer, InfoFragment()).commit()
            }
        }
    }
}