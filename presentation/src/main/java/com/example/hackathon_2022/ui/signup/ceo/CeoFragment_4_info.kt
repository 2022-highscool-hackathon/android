package com.example.hackathon_2022.ui.signup.ceo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.main.MainOwnerActivity
import com.example.presentation.R
import com.example.presentation.databinding.FragmentCeo4InfoBinding

class CeoFragment_4_info : BaseFragment<FragmentCeo4InfoBinding>(R.layout.fragment_ceo_4_info) {
    override fun initView() {
        binding.btnCeoInfo.setOnClickListener { 
            startActivity(Intent(requireContext(),MainOwnerActivity::class.java))
        }
    }

    override fun observeEvent() {}
}