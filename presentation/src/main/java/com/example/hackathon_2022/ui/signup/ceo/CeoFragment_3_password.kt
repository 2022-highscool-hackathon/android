package com.example.hackathon_2022.ui.signup.ceo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.hackathon_2022.ui.signup.helper.HelperFragment_2_sex
import com.example.presentation.R
import com.example.presentation.databinding.FragmentCeo3PasswordBinding

class CeoFragment_3_password : BaseFragment<FragmentCeo3PasswordBinding>(R.layout.fragment_ceo_3_password){
    override fun initView() {
        val signUpActivity = (activity as SignUpActivity)

        binding.btnCeoPassword.setOnClickListener {
            signUpActivity.goFragment("3", CeoFragment_4_info())
        }
    }

    override fun observeEvent() {}

}