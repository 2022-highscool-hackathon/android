package com.example.data.remote.response.user

import com.example.domain.entity.user.LoginEntity
import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("token") val token: String
)

fun LoginResponse.toEntity() = LoginEntity(
    token = token
)