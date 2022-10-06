package com.example.hackathon_2022.ui.signup.old

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.presentation.R
import com.example.presentation.databinding.FragmentOld3OXBinding

class OldFragment_3_OX : BaseFragment<FragmentOld3OXBinding>(R.layout.fragment_old_3_o_x) {
    override fun initView() {
        val signUpActivity = (activity as SignUpActivity)
        var ox = true

        binding.btnOldO.isChecked = true

        binding.btnOldO.setOnClickListener {
            ox = true
        }
        binding.btnOldX.setOnClickListener {
            ox = false
        }

        binding.btnOldSex.setOnClickListener {
            if(ox){
                signUpActivity.goFragment("3-2",OldFragment_3_OX_1_week())
            }else{
                signUpActivity.goFragment("3-2",OldFragment_6_CheckOX())
            }
        }
    }

    override fun observeEvent() {}
}