package com.example.hackathon_2022.ui.signup.old

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.presentation.R
import com.example.presentation.databinding.FragmentOld3OX2TimeBinding

class OldFragment_3_OX_2_time : BaseFragment<FragmentOld3OX2TimeBinding>(R.layout.fragment_old_3__o_x_2_time) {
    override fun initView() {

        val signUpActivity = activity as SignUpActivity

        binding.run {
            btnOldTime.setOnClickListener {
                signUpActivity.goFragment("3-2",OldFragment_3_OX_3_pain())
            }
        }
    }

    override fun observeEvent() {}
}