package com.example.data.remote.datasource

import com.example.data.remote.request.LoginRequest
import com.example.data.remote.request.ResumeRequest
import com.example.data.remote.request.SignUpRequest
import com.example.data.remote.response.InfoResponse
import com.example.data.remote.response.LoginResponse

interface UserDataSource {
    suspend fun signUp(request: SignUpRequest): Void?
    suspend fun login(request: LoginRequest): LoginResponse?
    suspend fun getInfo(key: String): InfoResponse?
    suspend fun resume(request: ResumeRequest): Void?
}