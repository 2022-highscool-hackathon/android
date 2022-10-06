package com.example.hackathon_2022.ui.job

import android.content.Intent
import com.example.hackathon_2022.ui.add.AddSupportActivity
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.main.MainOwnerActivity
import com.example.presentation.R
import com.example.presentation.databinding.FragmentJobOwnerAllBinding
import com.example.presentation.databinding.FragmentJobOwnerBinding

class JobOwnerAllFragment: BaseFragment<FragmentJobOwnerAllBinding>(R.layout.fragment_job_owner_all) {
    override fun initView() {
        clickAddBtn()
    }

    override fun observeEvent() {
    }

    private fun clickAddBtn() {
        binding.addBtn.setOnClickListener {
            startActivity(Intent(context, AddSupportActivity::class.java))
        }
    }
}