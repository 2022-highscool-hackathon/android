package com.example.hackathon_2022.ui.dolbomi

import android.widget.Button
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.utils.navItemClick
import com.example.presentation.R
import com.example.presentation.databinding.FragmentDolbomiBinding
import com.example.presentation.databinding.FragmentDolbomiDolbomiBinding

class DolbomiDolbomiFragment: BaseFragment<FragmentDolbomiDolbomiBinding>(R.layout.fragment_dolbomi_dolbomi) {
    override fun initView() {
        initMenuNav()
    }

    override fun observeEvent() {
    }

    private fun initMenuNav() {
        activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.dolbomiFragmentContainer, DolbomiDolbomiAllFragment())?.commit()
        binding.allBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.mapBtn)) {
                activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.dolbomiFragmentContainer, DolbomiDolbomiAllFragment())?.commit()
            }
        }
        binding.mapBtn.setOnClickListener {
            navItemClick(it as Button, listOf(binding.allBtn)) {
                activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.dolbomiFragmentContainer, DolbomiDolbomiMapFragment())?.commit()
            }
        }
    }
}