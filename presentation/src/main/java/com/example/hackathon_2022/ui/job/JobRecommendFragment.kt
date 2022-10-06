package com.example.hackathon_2022.ui.job

import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackathon_2022.adapter.RecommendJobAdapter
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.detail_job.DetailJobActivity
import com.example.presentation.R
import com.example.presentation.databinding.FragmentJobRecommendBinding

class JobRecommendFragment: BaseFragment<FragmentJobRecommendBinding>(R.layout.fragment_job_recommend) {
    override fun initView() {
        initRecyclerview()
    }

    override fun observeEvent() {
    }

    private fun initRecyclerview() {
        binding.jobRecyclerview.adapter = RecommendJobAdapter  {
            startActivity(Intent(context, DetailJobActivity::class.java))
        }
        binding.jobRecyclerview.layoutManager = LinearLayoutManager(context)
    }
}