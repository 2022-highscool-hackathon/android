package com.example.hackathon_2022.ui.main

import android.widget.Button
import com.example.hackathon_2022.ui.base.BaseActivity
import com.example.hackathon_2022.ui.dolbomi.DolbomiDolbomiFragment
import com.example.hackathon_2022.ui.info.InfoDolbomiFragment
import com.example.hackathon_2022.utils.navItemClick
import com.example.presentation.R
import com.example.presentation.databinding.ActivityMainDolbomiBinding

class MainDolbomiActivity: BaseActivity<ActivityMainDolbomiBinding>(R.layout.activity_main_dolbomi) {
    override fun initView() {
        initBottomNav()
    }

    override fun observeEvent() {
    }

    private fun initBottomNav() {
        supportFragmentManager.beginTransaction().replace(R.id.mainFragmentContainer, DolbomiDolbomiFragment()).commit()
        binding.dolbomiBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.infoBtn), isBottom = true) {
                supportFragmentManager.beginTransaction().replace(R.id.mainFragmentContainer, InfoDolbomiFragment()).commit()
            }
        }
        binding.infoBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.dolbomiBtn), isBottom = true) {
                supportFragmentManager.beginTransaction().replace(R.id.mainFragmentContainer, DolbomiDolbomiFragment()).commit()
            }
        }
    }
}