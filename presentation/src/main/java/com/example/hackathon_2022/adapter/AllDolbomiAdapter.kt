package com.example.hackathon_2022.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.presentation.R
import com.example.presentation.databinding.ItemDolbomiBinding

class AllDolbomiAdapter: RecyclerView.Adapter<AllDolbomiAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemDolbomiBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.peopleImg.setBackgroundResource(if(position % 2 == 0) R.drawable.ic_grandfather else R.drawable.ic_grandmother)
            binding.nameTxt.text = "박ㅇㅇ"
            binding.ageTxt.text = "|만00세"
            binding.introduceTxt.text = "건강 상태, 주의 사항 등"
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