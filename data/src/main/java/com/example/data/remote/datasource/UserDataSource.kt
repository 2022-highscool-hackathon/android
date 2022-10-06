package com.example.data.remote.datasource

import com.example.data.remote.request.user.*
import com.example.data.remote.response.user.*

interface UserDataSource {
    suspend fun signUp(request: SignUpRequest): Int
    suspend fun login(request: LoginRequest): LoginResponse?
    suspend fun getInfo(key: String): InfoResponse?
    suspend fun dolbomi(request: DolbomiRequest): Void?
    suspend fun age(request: AgeRequest): Void?
    suspend fun resume(request: ResumeRequest): Void?
    suspend fun caregivers(key: String): Void?
}