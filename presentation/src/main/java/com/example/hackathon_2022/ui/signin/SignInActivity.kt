package com.example.hackathon_2022.ui.signin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hackathon_2022.ui.base.BaseActivity
import com.example.presentation.R
import com.example.presentation.databinding.ActivitySignInBinding

class SignInActivity : BaseActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {
    override fun initView() {

        //비밀 번호 8~30자 특수기호랑 영어만
    }

    override fun observeEvent() {}
}
