package com.example.hackathon_2022.vm

import androidx.lifecycle.viewModelScope
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.domain.param.user.SignUpParam
import com.example.domain.usecase.user.SignUpUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val signUpUseCase: SignUpUseCase
): ViewModel() {

    private val _userCreate: MutableLiveData<Int> = MutableLiveData()
    val userCreate = _userCreate

    fun userCrete(signUpParam: SignUpParam){
       viewModelScope.launch {
           signUpUseCase.signUp(signUpParam).let { response->
               userCreate.value = response
           }
       }
    }
}