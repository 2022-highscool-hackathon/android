package com.example.data.remote.request

import com.example.domain.param.DolbomiParam
import com.google.gson.annotations.SerializedName

data class DolbomiRequest(
    @SerializedName("usercode") val userCode: String,
    @SerializedName("dolbomi") val dolbomi: Boolean
)

fun DolbomiParam.toRequest() = DolbomiRequest(
    userCode = userCode,
    dolbomi = dolbomi
)
