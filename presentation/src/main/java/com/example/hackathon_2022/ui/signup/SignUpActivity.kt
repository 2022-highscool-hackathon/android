package com.example.hackathon_2022.ui.signup

import android.util.Log
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.example.domain.param.user.SignUpParam
import com.example.hackathon_2022.ui.base.BaseActivity
import com.example.hackathon_2022.ui.signup.ceo.CeoFragment_1_name
import com.example.hackathon_2022.ui.signup.helper.HelperFragment_1_name
import com.example.hackathon_2022.ui.signup.old.OldFragment_1_Name
import com.example.hackathon_2022.vm.SignUpViewModel
import com.example.presentation.R
import com.example.presentation.databinding.ActivitySignUpBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SignUpActivity @Inject constructor(): BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {

    //private val signUpViewModel: SignUpViewModel by viewModels()

    override fun initView() {
        val who = intent.getStringExtra("who") ?: ""
        elder = who

        when (who) {
            "elder" -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame_sign_up, OldFragment_1_Name()).commit()
            }
            "caregiver" -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame_sign_up, HelperFragment_1_name()).commit()
            }
            "employee" -> {
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

    override fun observeEvent() {
//        signUpViewModel.userCreate.observe(this){
//            Log.d("TAG", "observeEvent: $it")
//            usercode = it
//        }
    }

    companion object{
        var list_what = ArrayList<String>()
        var list_want = ArrayList<String>()
        var phone = ""
        var password = ""
        var nickname = ""
        var sex = ""
        var role = ""
        var elder = ""
        var usercode = 0
        var age = 0
    }

    fun userCreate(signUpParam: SignUpParam){
        //signUpViewModel.userCrete(signUpParam)
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