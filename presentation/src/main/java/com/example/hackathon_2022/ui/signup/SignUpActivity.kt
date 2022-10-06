package com.example.hackathon_2022.ui.signup

import androidx.fragment.app.Fragment
import com.example.hackathon_2022.ui.base.BaseActivity
import com.example.hackathon_2022.ui.signup.ceo.CeoFragment_1_name
import com.example.hackathon_2022.ui.signup.helper.HelperFragment_1_name
import com.example.hackathon_2022.ui.signup.old.OldFragment_1_Name
import com.example.presentation.R
import com.example.presentation.databinding.ActivitySignUpBinding

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
    override fun initView() {
        val who = intent.getStringExtra("who") ?: ""

        when (who) {
            "노인" -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame_sign_up, OldFragment_1_Name()).commit()
            }
            "돌보미" -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame_sign_up, HelperFragment_1_name()).commit()
            }
            "사장님" -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame_sign_up, CeoFragment_1_name()).commit()
            }
            else -> {
                finish()
            }
        }


        binding.btnSignUpBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun observeEvent() {}

    companion object{
        var list_what = ArrayList<String>()
        var list_want = ArrayList<String>()
    }

    fun goFragment(backStack: String, fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(R.anim.horizon_enter,R.anim.none,R.anim.none,R.anim.horizon_exit)
            .add(R.id.frame_sign_up,fragment,backStack)
            .addToBackStack(backStack)
            .commit()
    }

    fun goFragmentNoStack(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(R.anim.horizon_enter,R.anim.none,R.anim.none,R.anim.horizon_exit)
            .add(R.id.frame_sign_up,fragment)
            .commit()
    }


    fun onBackPressedSign(){
        onBackPressed()
    }

}