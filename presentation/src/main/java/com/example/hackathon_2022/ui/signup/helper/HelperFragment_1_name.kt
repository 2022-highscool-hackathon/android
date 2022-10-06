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
import com.example.presentation.databinding.FragmentHelper1NameBinding
import com.example.presentation.databinding.FragmentOld1NameBinding

class HelperFragment_1_name : BaseFragment<FragmentHelper1NameBinding>(R.layout.fragment_helper_1_name) {
    override fun initView() {
        val signUpActivity = (activity as SignUpActivity)

        binding.btnHelperName.setOnClickListener {
            signUpActivity.goFragment("1", HelperFragment_2_sex())
        }
    }

    override fun observeEvent() {}
}