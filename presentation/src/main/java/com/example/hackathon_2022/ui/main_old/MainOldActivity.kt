package com.example.hackathon_2022.ui.main_old

import android.graphics.Color
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.hackathon_2022.ui.base.BaseActivity
import com.example.hackathon_2022.ui.dolbomi.DolbomiFragment
import com.example.hackathon_2022.ui.info.InfoFragment
import com.example.hackathon_2022.ui.job.JobFragment
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
        supportFragmentManager.beginTransaction().replace(R.id.mainFragmentContainer, JobFragment()).commit()
        binding.jobBtn.setOnClickListener {
            navItemClick(it as Button, binding.dolbomiBtn, binding.infoBtn, JobFragment())
        }
        binding.dolbomiBtn.setOnClickListener {
            navItemClick(it as Button, binding.jobBtn, binding.infoBtn, DolbomiFragment())
        }
        binding.infoBtn.setOnClickListener {
            navItemClick(it as Button, binding.jobBtn, binding.dolbomiBtn, InfoFragment())
        }
    }

    private fun navItemClick(current: Button, other1: Button, other2: Button, fragment: Fragment) {
        current.setBackgroundResource(R.drawable.bg_tab_selected)
        current.setTextColor(Color.WHITE)
        other1.setBackgroundResource(R.drawable.bg_tab_unselected)
        other1.setTextColor(Color.BLACK)
        other2.setBackgroundResource(R.drawable.bg_tab_unselected)
        other2.setTextColor(Color.BLACK)
        supportFragmentManager.beginTransaction().replace(R.id.mainFragmentContainer, fragment).commit()
    }
}