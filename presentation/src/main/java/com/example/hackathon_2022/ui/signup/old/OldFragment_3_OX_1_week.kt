package com.example.hackathon_2022.ui.signup.old

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.presentation.R
import com.example.presentation.databinding.FragmentOld3OX1WeekBinding

class OldFragment_3_OX_1_week : BaseFragment<FragmentOld3OX1WeekBinding>(R.layout.fragment_old_3__o_x_1_week) {

    private val weekList: ArrayList<String?> = arrayListOf(
        null,null,null,null,null,null,null,
    )
    override fun initView() {

        val signUpActivity = (activity as SignUpActivity)

        binding.run {
            btnMonday.setOnClickListener {
                tvChange(btnMonday, 0)
            }
            btnTuesday.setOnClickListener {
                tvChange(btnTuesday, 1)
            }
            btnWednesday.setOnClickListener {
                tvChange(btnWednesday,2)
            }
            btnThursday.setOnClickListener {
                tvChange(btnThursday,3)
            }
            btnFriday.setOnClickListener {
                tvChange(btnFriday,4)
            }
            btnSaturday.setOnClickListener {
                tvChange(btnSaturday,5)
            }
            btnSunday.setOnClickListener {
                tvChange(btnSunday,6)
            }
            btnOldWeek.setOnClickListener {
                signUpActivity.goFragment("3-1",OldFragment_3_OX_2_time())
            }
        }
    }

    override fun observeEvent() {}

    private fun tvChange(btn: Button, num: Int){
        binding.run {

        }
        btn.setOnClickListener {
            if (weekList[num] == null){
                btn.setBackgroundColor(this@OldFragment_3_OX_1_week.resources.getColor(R.color.main))
                btn.setTextColor(this@OldFragment_3_OX_1_week.resources.getColor(R.color.white))
                weekList[num] = btn.text.toString()
            }else{
                btn.setBackgroundColor(this@OldFragment_3_OX_1_week.resources.getColor(R.color.white))
                btn.setTextColor(this@OldFragment_3_OX_1_week.resources.getColor(R.color.black))
                weekList[num] = null
            }
        }
    }

}