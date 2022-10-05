package com.example.data.remote.request

import com.example.domain.param.LoginParam
import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @SerializedName("phone") val phone: String,
    @SerializedName("password") val password: String
)

fun LoginParam.toRequest() = LoginRequest(
    phone = phone,
    password = password
)