package com.example.hackathon_2022.ui.signup.ceo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.hackathon_2022.ui.signup.helper.HelperFragment_2_sex
import com.example.hackathon_2022.ui.signup.helper.HelperFragment_3_phone_number
import com.example.presentation.R
import com.example.presentation.databinding.FragmentCeo2PhoneNumberBinding

class CeoFragment_2_phone_number : BaseFragment<FragmentCeo2PhoneNumberBinding>(R.layout.fragment_ceo_2_phone_number) {
    override fun initView() {
        val signUpActivity = (activity as SignUpActivity)

        binding.btnCeoPhoneNumber.setOnClickListener {
            signUpActivity.goFragment("2", CeoFragment_3_password())
        }
    }

    override fun observeEvent() {}
}