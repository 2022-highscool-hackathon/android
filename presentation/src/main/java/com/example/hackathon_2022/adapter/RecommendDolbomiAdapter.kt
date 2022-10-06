package com.example.hackathon_2022.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.presentation.R
import com.example.presentation.databinding.ItemDolbomiBinding

class RecommendDolbomiAdapter: RecyclerView.Adapter<RecommendDolbomiAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemDolbomiBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.peopleImg.setBackgroundResource(if(position % 2 == 0) R.drawable.ic_man else R.drawable.ic_girl)
            binding.nameTxt.text = "김ㅇㅇ"
            binding.ageTxt.text = "|만00세"
            binding.introduceTxt.text = "잘부탁드려요!"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemDolbomiBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = 10
}