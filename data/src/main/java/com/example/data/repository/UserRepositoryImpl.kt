package com.example.data.repository

import com.example.data.remote.datasource.UserDataSource
import com.example.data.remote.request.toRequest
import com.example.data.remote.response.toEntity
import com.example.domain.entity.InfoEntity
import com.example.domain.entity.LoginEntity
import com.example.domain.param.DolbomiParam
import com.example.domain.param.LoginParam
import com.example.domain.param.ResumeParam
import com.example.domain.param.SignUpParam
import com.example.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userDataSource: UserDataSource
): UserRepository {
    override suspend fun signUp(request: SignUpParam): Void? {
        return userDataSource.signUp(request = request.toRequest())
    }

    override suspend fun login(request: LoginParam): LoginEntity? {
        return userDataSource.login(request = request.toRequest())?.toEntity()
    }

    override suspend fun getInfo(key: String): InfoEntity? {
        return userDataSource.getInfo(key = key)?.toEntity()
    }

    override suspend fun dolbomi(request: DolbomiParam): Void? {
        return userDataSource.dolbomi(request = request.toRequest())
    }

    override suspend fun resume(request: ResumeParam): Void? {
        return userDataSource.resume(request = request.toRequest())
    }
}