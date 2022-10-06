package com.example.hackathon_2022.ui.signup.old

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import com.example.domain.param.user.SignUpParam
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.hackathon_2022.ui.signup.SignUpActivity.Companion.nickname
import com.example.hackathon_2022.ui.signup.SignUpActivity.Companion.password
import com.example.hackathon_2022.ui.signup.SignUpActivity.Companion.phone
import com.example.hackathon_2022.ui.signup.SignUpActivity.Companion.role
import com.example.hackathon_2022.ui.signup.SignUpActivity.Companion.sex
import com.example.presentation.R
import com.example.presentation.databinding.FragmentOld5PasswordBinding


class OldFragment_5_Password : BaseFragment<FragmentOld5PasswordBinding>(R.layout.fragment_old_5__password) {
    override fun initView() {
        passwordCheck()

        val signUpActivity = (activity as SignUpActivity)

        binding.run {
            btnOldPassword.setOnClickListener {
                if(etOldPassword.text.toString() == etOldPasswordCheck.text.toString()){
                    password = etOldPassword.text.toString()

                    Log.d("TAG", "initView: ")
                    //signUpActivity.userCreate(SignUpParam(nickname,phone,password,sex,role ))
                    signUpActivity.goFragment("5",OldFragment_3_OX())
                }
           }
        }
    }

    override fun observeEvent() {}

    private fun passwordCheck(){
        binding.run {
            etOldPassword.addTextChangedListener(object : TextWatcher{
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    if(etOldPassword.text.toString() != etOldPasswordCheck.text.toString()){
                        etOldPasswordCheckLayout.error = "비밀번호가 일치하지 않습니다"
                    }
                    else{
                        etOldPasswordCheckLayout.error = null
                    }
                }

                override fun afterTextChanged(p0: Editable?) {}
            })

            etOldPasswordCheck.addTextChangedListener(object : TextWatcher{
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    if(etOldPassword.text.toString() != etOldPasswordCheck.text.toString()){
                        etOldPasswordCheckLayout.error = "비밀번호가 일치하지 않습니다"
                    }
                    else{
                        etOldPasswordCheckLayout.error = null
                    }
                }

                override fun afterTextChanged(p0: Editable?) {}
            })
        }



    }
}