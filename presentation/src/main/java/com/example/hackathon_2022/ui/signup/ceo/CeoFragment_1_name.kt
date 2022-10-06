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
import com.example.presentation.databinding.FragmentCeo1NameBinding

class CeoFragment_1_name : BaseFragment<FragmentCeo1NameBinding>(R.layout.fragment_ceo_1_name) {
    override fun initView() {
        val signUpActivity = (activity as SignUpActivity)

        binding.btnCeoName.setOnClickListener {
            signUpActivity.goFragment("1", CeoFragment_2_phone_number())
        }
    }

    override fun observeEvent() {}
}