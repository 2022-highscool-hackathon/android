package com.example.hackathon_2022.ui.signup.old

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.presentation.R
import com.example.presentation.databinding.FragmentOld2SexBinding
import com.example.presentation.databinding.FragmentOld3OXBinding

class OldFragment_2_Sex : BaseFragment<FragmentOld2SexBinding>(R.layout.fragment_old_2_sex) {
    override fun initView() {
        binding.run {
            val signUpActivity = (activity as SignUpActivity)

            btnOldMale.isChecked = true

            binding.btnOldSex.setOnClickListener {
                signUpActivity.goFragment("2", OldFragment_3_OX())
            }
        }
    }

    override fun observeEvent() {}
}