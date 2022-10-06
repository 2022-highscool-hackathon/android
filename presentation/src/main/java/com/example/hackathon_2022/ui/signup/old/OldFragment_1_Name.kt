package com.example.hackathon_2022.ui.signup.old

import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.presentation.R
import com.example.presentation.databinding.FragmentOld1NameBinding

class OldFragment_1_Name : BaseFragment<FragmentOld1NameBinding>(R.layout.fragment_old_1_name) {

    override fun initView() {

        val signUpActivity = (activity as SignUpActivity)

        binding.btnOldName.setOnClickListener {
            signUpActivity.goFragment("1",OldFragment_2_Sex())
        }
    }

    override fun observeEvent() {}
}