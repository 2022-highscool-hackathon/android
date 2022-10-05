package com.example.hackathon_2022.ui.signup

import com.example.hackathon_2022.ui.base.BaseActivity
import com.example.presentation.R
import com.example.presentation.databinding.ActivitySignUpBinding

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
    override fun initView() {
        val who = intent.getStringExtra("who")

        binding.btnSignUpBack.setOnClickListener {
            finish()
        }
    }

    override fun observeEvent() {}

}