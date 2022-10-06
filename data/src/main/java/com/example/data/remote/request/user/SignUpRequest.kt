package com.example.data.remote.request.user

import com.example.domain.param.user.SignUpParam
import com.google.gson.annotations.SerializedName

data class SignUpRequest(
    @SerializedName("nickname") val name: String,
    @SerializedName("phone") val phone: String,
    @SerializedName("password") val password: String,
    @SerializedName("sex") val sex: String,
    @SerializedName("role") val role: String
)

fun SignUpParam.toRequest() = SignUpRequest(
    name = name,
    phone = phone,
    password = password,
    sex = sex,
    role = role
)
