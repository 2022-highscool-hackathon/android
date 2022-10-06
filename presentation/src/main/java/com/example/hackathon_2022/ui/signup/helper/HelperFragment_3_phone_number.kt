package com.example.hackathon_2022.ui.signup.helper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.hackathon_2022.ui.signup.old.OldFragment_2_Sex
import com.example.presentation.R
import com.example.presentation.databinding.FragmentHelper3PhoneNumberBinding

class HelperFragment_3_phone_number : BaseFragment<FragmentHelper3PhoneNumberBinding>(R.layout.fragment_helper_3_phone_number) {
    override fun initView() {
        val signUpActivity = (activity as SignUpActivity)

        binding.btnHelperPhoneNumber.setOnClickListener {
            signUpActivity.goFragment("3", HelperFragment_4_password())
        }
    }

    override fun observeEvent() {}
}