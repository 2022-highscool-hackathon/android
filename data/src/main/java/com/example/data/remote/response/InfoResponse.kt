package com.example.data.remote.response

import com.example.domain.entity.InfoEntity
import com.google.gson.annotations.SerializedName

data class InfoResponse(
    @SerializedName("usercode") val userCode: String,
    @SerializedName("sex") val sex: String,
    @SerializedName("role") val role: String,
    @SerializedName("nickname") val name: String,
    @SerializedName("phone") val phone: String
)

fun InfoResponse.toEntity() = InfoEntity(
    userCode = userCode,
    sex = sex,
    role = role,
    name = name,
    phone = phone
)