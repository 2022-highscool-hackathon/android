package com.example.hackathon_2022.ui.signup.old

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.presentation.R
import com.example.presentation.databinding.FragmentOld4PhoneNumberBinding

class OldFragment_4_PhoneNumber : BaseFragment<FragmentOld4PhoneNumberBinding>(R.layout.fragment_old_4__phone_number) {
    override fun initView() {
        val signUpActivity = (activity as SignUpActivity)

        binding.btnOldPhoneNumber.setOnClickListener {
            signUpActivity.goFragment("4",OldFragment_5_Password())
        }
    }

    override fun observeEvent() {}
}