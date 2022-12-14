package com.example.data.remote.request.user

import com.example.domain.param.user.ResumeParam
import com.google.gson.annotations.SerializedName

data class ResumeRequest(
    @SerializedName("usercode") val userCode: String,
    @SerializedName("wanted") val wanted: String,
    @SerializedName("work") val work: String,
)

fun ResumeParam.toRequest() = ResumeRequest(
    userCode = userCode,
    wanted = wanted,
    work = work
)
