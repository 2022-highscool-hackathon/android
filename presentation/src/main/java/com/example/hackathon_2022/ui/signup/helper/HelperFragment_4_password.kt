package com.example.hackathon_2022.ui.signup.helper

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.main.MainDolbomiActivity
import com.example.presentation.R
import com.example.presentation.databinding.FragmentHelper4PasswordBinding

class HelperFragment_4_password : BaseFragment<FragmentHelper4PasswordBinding>(R.layout.fragment_helper_4_password) {
    override fun initView() {
        binding.etHelperPassword.setOnClickListener {
            startActivity(Intent(context, MainDolbomiActivity::class.java))
            activity?.finish()
        }
    }

    override fun observeEvent() {}

    private fun passwordCheck(){
        binding.run {
            etHelperPassword.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    if(etHelperPassword.text.toString() != etHelperPasswordCheck.text.toString()){
                        etHelperPasswordCheckLayout.error = "비밀번호가 일치하지 않습니다"
                    }
                    else{
                        etHelperPasswordCheckLayout.error = null
                    }
                }

                override fun afterTextChanged(p0: Editable?) {}
            })

            etHelperPasswordCheck.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    if(etHelperPassword.text.toString() != etHelperPasswordCheck.text.toString()){
                        etHelperPasswordCheckLayout.error = "비밀번호가 일치하지 않습니다"
                    }
                    else{
                        etHelperPasswordCheckLayout.error = null
                    }
                }

                override fun afterTextChanged(p0: Editable?) {}
            })
        }

    }
}