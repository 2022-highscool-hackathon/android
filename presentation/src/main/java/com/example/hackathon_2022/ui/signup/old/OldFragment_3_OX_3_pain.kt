package com.example.hackathon_2022.ui.signup.old

import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.presentation.R
import com.example.presentation.databinding.FragmentOld3OX3PainBinding

class OldFragment_3_OX_3_pain : BaseFragment<FragmentOld3OX3PainBinding>(R.layout.fragment_old_3__o_x_3_pain) {
    override fun initView() {
        binding.run {
            val signUpActivity = activity as SignUpActivity

            btnOldPain.setOnClickListener {
                signUpActivity.goFragment("3-3",OldFragment_3_OX_4_etc())
            }
        }

    }

    override fun observeEvent() {}
}