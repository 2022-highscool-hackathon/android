package com.example.hackathon_2022.ui.signup.old

import android.content.Intent
import android.util.Log
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.main.MainOldActivity
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.hackathon_2022.ui.signup.SignUpActivity.Companion.list_want
import com.example.hackathon_2022.ui.signup.SignUpActivity.Companion.list_what
import com.example.presentation.R
import com.example.presentation.databinding.FragmentOld6ResumeBinding

class OldFragment_6_Resume : BaseFragment<FragmentOld6ResumeBinding>(R.layout.fragment_old_6__resume) {
    override fun initView() {
        val signUpActivity = (activity as SignUpActivity)

        textSet()

        binding.btnOldResume.setOnClickListener {
            startActivity(Intent(context, MainOldActivity::class.java))
            activity?.finish()
        }
        binding.btnOldWhat.setOnClickListener {
            signUpActivity.goFragment("6-2",OldFragment_7_what())
        }
        binding.btnOldWant.setOnClickListener {
            signUpActivity.goFragment("6-2",OldFragment_8_want())
        }

    }

    override fun observeEvent() {}

    private fun textSet(){
        if(list_what.isNotEmpty()){

            var what = ""

            for(i in 0 until list_what.size){
                what = what.plus(list_what[i])
                what = what.plus(", ")
            }

            binding.tvWhat.text = what
        }

        if(list_want.isNotEmpty()){
            var want = ""

            for(i in 0 until list_want.size){
                want = want.plus(list_want[i])
                want = want.plus(", ")
            }

            binding.tvWant.text = want
        }
    }
}