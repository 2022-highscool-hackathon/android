package com.example.hackathon_2022.ui.signup.old

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.presentation.R
import com.example.presentation.databinding.FragmentOld3OX4EtcBinding

class OldFragment_3_OX_4_etc : BaseFragment<FragmentOld3OX4EtcBinding>(R.layout.fragment_old_3__o_x_4_etc) {
    override fun initView() {

        val signUpActivity = activity as SignUpActivity

        binding.run {
            btnOldEtc.setOnClickListener {
                signUpActivity.goFragment("3-4",OldFragment_6_CheckOX())
            }
        }
    }

    override fun observeEvent() {}
}