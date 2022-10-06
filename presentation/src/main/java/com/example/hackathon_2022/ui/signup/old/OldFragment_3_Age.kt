package com.example.hackathon_2022.ui.signup.old

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.hackathon_2022.ui.signup.SignUpActivity.Companion.age
import com.example.hackathon_2022.ui.signup.ceo.CeoFragment_2_phone_number
import com.example.presentation.R
import com.example.presentation.databinding.FragmentOld3AgeBinding

class OldFragment_3_Age : BaseFragment<FragmentOld3AgeBinding>(R.layout.fragment_old_3_age) {
    override fun initView() {
        val signUpActivity = (activity as SignUpActivity)

        binding.run {
            btnOldAge.setOnClickListener {
                age = etOldAge.text.toString().toInt()
                signUpActivity.goFragment("3-1", OldFragment_4_PhoneNumber())
            }
        }
    }

    override fun observeEvent() {}
}