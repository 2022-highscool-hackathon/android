package com.example.data.remote.response

import com.example.domain.entity.LoginEntity
import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("token") val token: String
)

fun LoginResponse.toEntity() = LoginEntity(
    token = token
)