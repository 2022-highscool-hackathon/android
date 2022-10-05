package com.example.domain.repository

import com.example.domain.entity.InfoEntity
import com.example.domain.entity.LoginEntity
import com.example.domain.param.DolbomiParam
import com.example.domain.param.LoginParam
import com.example.domain.param.ResumeParam
import com.example.domain.param.SignUpParam

interface UserRepository {
    suspend fun signUp(request: SignUpParam): Void?
    suspend fun login(request: LoginParam): LoginEntity?
    suspend fun getInfo(key: String): InfoEntity?
    suspend fun dolbomi(request: DolbomiParam): Void?
    suspend fun resume(request: ResumeParam): Void?
}