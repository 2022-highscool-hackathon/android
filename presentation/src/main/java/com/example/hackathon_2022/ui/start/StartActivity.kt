package com.example.hackathon_2022.ui.start

import android.content.Intent
import com.example.hackathon_2022.ui.base.BaseActivity
import com.example.hackathon_2022.ui.signin.SignInActivity
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.presentation.R
import com.example.presentation.databinding.ActivityStartBinding

class StartActivity : BaseActivity<ActivityStartBinding>(R.layout.activity_start) {
    override fun initView() {
        val intent = Intent(this@StartActivity, SignUpActivity::class.java)

        binding.run {
            binding.btnStartGoLogin.setOnClickListener {
                startActivity(Intent(this@StartActivity,SignInActivity::class.java))
            }
            binding.btnStart1.setOnClickListener{
                intent.putExtra("who","노인")
                startActivity(intent)
            }
            binding.btnStart2.setOnClickListener {
                intent.putExtra("who","돌보미")
                startActivity(intent)
            }
            binding.btnStart3.setOnClickListener {
                intent.putExtra("who","사장님")
                startActivity(intent)
            }
        }
    }

    override fun observeEvent() {}

}
