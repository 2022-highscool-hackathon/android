package com.example.hackathon_2022.ui.start

import android.content.Intent
import android.graphics.Color
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import com.example.hackathon_2022.ui.base.BaseActivity
import com.example.hackathon_2022.ui.signin.SignInActivity
import com.example.hackathon_2022.ui.signup.SignUpActivity
import com.example.presentation.R
import com.example.presentation.databinding.ActivityStartBinding

class StartActivity : BaseActivity<ActivityStartBinding>(R.layout.activity_start) {
    override fun initView() {
        val intent = Intent(this@StartActivity, SignUpActivity::class.java)

        binding.run {
            btnStartGoLogin.setOnClickListener {
                startActivity(Intent(this@StartActivity,SignInActivity::class.java))
            }

            btnStart1.setOnClickListener {
                intent.putExtra("who","elder")
                startActivity(intent)
            }
            btnStart1.setOnTouchListener(object : OnTouchListener{
                override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
                    val status = p1?.action

                    tvStart1.setTextColor(Color.parseColor("#ffffff"))
                    imageStart1.setImageResource(R.drawable.start_image_0_white)

                    if(status == MotionEvent.ACTION_UP){
                        tvStart1.setTextColor(Color.parseColor("#000000"))
                        imageStart1.setImageResource(R.drawable.start_image_0)
                    }
                    return false
                }

            })
            btnStart2.setOnClickListener {
                intent.putExtra("who","caregiver")
                startActivity(intent)
            }
            btnStart2.setOnTouchListener(object : OnTouchListener{
                override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
                    val status = p1?.action

                    tvStart2.setTextColor(Color.parseColor("#ffffff"))
                    imageStart2.setImageResource(R.drawable.start_image_1_white)

                    if(status == MotionEvent.ACTION_UP){
                        tvStart2.setTextColor(Color.parseColor("#000000"))
                        imageStart2.setImageResource(R.drawable.start_image_1)
                    }
                    return false
                }

            })
            binding.btnStart3.setOnClickListener {
                intent.putExtra("who","employee")
                startActivity(intent)
            }
            btnStart3.setOnTouchListener(object : OnTouchListener{
                override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
                    val status = p1?.action

                    tvStart3.setTextColor(Color.parseColor("#ffffff"))
                    imageStart3.setImageResource(R.drawable.start_image_2_white)

                    if(status == MotionEvent.ACTION_UP){
                        tvStart3.setTextColor(Color.parseColor("#000000"))
                        imageStart3.setImageResource(R.drawable.start_image_2)
                    }
                    return false
                }

            })
        }
    }

    override fun observeEvent() {}

}
