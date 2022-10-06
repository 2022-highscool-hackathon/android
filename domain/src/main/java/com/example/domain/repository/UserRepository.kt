package com.example.domain.repository

import com.example.domain.entity.user.InfoEntity
import com.example.domain.entity.user.LoginEntity
import com.example.domain.param.user.*

interface UserRepository {
    suspend fun signUp(request: SignUpParam): Int
    suspend fun login(request: LoginParam): LoginEntity?
    suspend fun getInfo(key: String): InfoEntity?
    suspend fun dolbomi(request: DolbomiParam): Void?
    suspend fun age(request: AgeParam): Void?
    suspend fun resume(request: ResumeParam): Void?
    suspend fun caregivers(key: String): Void?
}