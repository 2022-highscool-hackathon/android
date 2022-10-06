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
import com.example.presentation.databinding.FragmentHelper2SexBinding

class HelperFragment_2_sex : BaseFragment<FragmentHelper2SexBinding>(R.layout.fragment_helper_2_sex){
    override fun initView() {
        val signUpActivity = (activity as SignUpActivity)

        binding.btnHelperSex.setOnClickListener {
            signUpActivity.goFragment("2", HelperFragment_3_phone_number())
        }
    }

    override fun observeEvent() {}

}