package com.example.data.remote.request.user

import com.example.domain.param.user.AgeParam
import com.google.gson.annotations.SerializedName

data class AgeRequest(
    @SerializedName("usercode") val userCode: String,
    @SerializedName("age") val age: String
)

fun AgeParam.toRequest() = AgeRequest(
    userCode = userCode,
    age = age
)
