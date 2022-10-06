package com.example.hackathon_2022.ui.signup.old

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.presentation.R
import com.example.presentation.databinding.FragmentOld6CheckOXBinding
import com.example.presentation.databinding.FragmentOld6ResumeBinding

class OldFragment_6_CheckOX : BaseFragment<FragmentOld6CheckOXBinding>(R.layout.fragment_old_6__check_o_x) {
    override fun initView() {
        val signUpActivity = (activity as SignUpActivity)

        binding.btnOldSex.setOnClickListener {
            signUpActivity.goFragment("6-1",OldFragment_6_Resume())
        }

    }

    override fun observeEvent() {}
}