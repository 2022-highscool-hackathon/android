package com.example.data.remote.request.user

import com.example.domain.param.user.DolbomiParam
import com.google.gson.annotations.SerializedName

data class DolbomiRequest(
    @SerializedName("usercode") val userCode: String,
    @SerializedName("dolbomi") val dolbomi: Boolean
)

fun DolbomiParam.toRequest() = DolbomiRequest(
    userCode = userCode,
    dolbomi = dolbomi
)
