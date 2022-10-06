package com.example.hackathon_2022.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.presentation.databinding.ItemJobBinding

class RecommendJobAdapter(val itemClick: () -> Unit): RecyclerView.Adapter<RecommendJobAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemJobBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(itemClick: () -> Unit) {
            binding.coTxt.text = "GS25 대구수성점"
            binding.coShape.text = "매장관리 및 판매"
            binding.cityTxt.text = "위치 : 대구 수성구"
            binding.timeTxt.text = "시간 : 14:00 ~ 21:00"
            binding.moneyTxt.text = "시급 : 10,000원"
            binding.jobLayout.setOnClickListener {itemClick()}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemJobBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(itemClick)
    }

    override fun getItemCount(): Int = 5
}