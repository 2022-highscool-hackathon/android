package com.example.hackathon_2022.ui.detail_job

import android.content.Intent
import android.net.Uri
import com.example.hackathon_2022.ui.base.BaseActivity
import com.example.presentation.R
import com.example.presentation.databinding.ActivityJobDetailBinding

class DetailJobActivity: BaseActivity<ActivityJobDetailBinding>(R.layout.activity_job_detail) {
    override fun initView() {
        clickCall()
    }

    override fun observeEvent() {
    }

    private fun clickCall() {
        binding.callBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:01040426797"))
            startActivity(intent)
        }
    }
}