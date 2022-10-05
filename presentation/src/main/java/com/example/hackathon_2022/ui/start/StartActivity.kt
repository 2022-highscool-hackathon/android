package com.example.hackathon_2022.ui.start

import android.content.Intent
import com.example.hackathon_2022.ui.base.BaseActivity
import com.example.hackathon_2022.ui.signin.SignInActivity
import com.example.presentation.R
import com.example.presentation.databinding.ActivityStartBinding

class StartActivity : BaseActivity<ActivityStartBinding>(R.layout.activity_start) {
    override fun initView() {
        binding.run {
            binding.btnStartGoLogin.setOnClickListener {
                startActivity(Intent(this@StartActivity,SignInActivity::class.java))
            }
        }
    }

    override fun observeEvent() {}

}
