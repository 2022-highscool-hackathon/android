package com.example.hackathon_2022.ui.signup.old


import android.content.Intent
import android.widget.TextView
import com.example.hackathon_2022.ui.base.BaseFragment
import com.example.hackathon_2022.ui.main.MainOldActivity
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.hackathon_2022.ui.signup.SignUpActivity.Companion.list_want
import com.example.presentation.R
import com.example.presentation.databinding.FragmentOld8WantBinding

class OldFragment_8_want : BaseFragment<FragmentOld8WantBinding>(R.layout.fragment_old_8_want) {
    private val checkList : ArrayList<String?> = arrayListOf(
        null,null,null,null,null,null,null,null,null,null,null,null,
    )

    override fun initView() {
        binding.run {
            tv1.setOnClickListener {
                tvChange(tv1, 0)
            }
            tv2.setOnClickListener {
                tvChange(tv2,1)
            }
            tv3.setOnClickListener {
                tvChange(tv3,2)
            }
            tv4.setOnClickListener {
                tvChange(tv4,3)
            }
            tv5.setOnClickListener {
                tvChange(tv5, 4)
            }
            tv6.setOnClickListener {
                tvChange(tv6, 5)
            }
            tv7.setOnClickListener {
                tvChange(tv7, 6)
            }
            tv8.setOnClickListener {
                tvChange(tv8, 7)
            }
            tv9.setOnClickListener {
                tvChange(tv9, 8)
            }
            tv10.setOnClickListener {
                tvChange(tv10,9)
            }
            tv11.setOnClickListener {
                tvChange(tv11, 10)
            }
            tv12.setOnClickListener {
                tvChange(tv12,11)
            }
            btnOldWhat.setOnClickListener {
                list_want.clear()

                for(i in 0 until checkList.size){
                    if(checkList[i] != null){
                        list_want.add(checkList[i].toString())
                    }
                }

                val signUpActivity = (activity as SignUpActivity)
                signUpActivity.goFragment("8",OldFragment_6_Resume())

            }
        }

    }

    override fun observeEvent() {}

    private fun tvChange(tv: TextView, num: Int){
        binding.run {
            tv.setOnClickListener {
                if(checkList[num] == null){
                    tv.setBackgroundColor(this@OldFragment_8_want.resources.getColor(R.color.main))
                    checkList[num] = tv.text.toString()
                }else{
                    tv.setBackgroundColor(this@OldFragment_8_want.resources.getColor(R.color.white))
                    checkList[num] = null
                }
            }
        }
    }
}