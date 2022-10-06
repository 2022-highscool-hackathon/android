package com.example.data.remote.request.job

import com.example.domain.param.job.JobUploadParam
import com.google.gson.annotations.SerializedName

data class JobUploadRequest(
    @SerializedName("usercode") val userCode: String,
    @SerializedName("registrationNumber") val registrationNumber: String,
    @SerializedName("name") val name: String,
    @SerializedName("adress") val address: String
)

fun JobUploadParam.toRequest() = JobUploadRequest(
    userCode = userCode,
    registrationNumber = registrationNumber,
    name = name,
    address = address
)