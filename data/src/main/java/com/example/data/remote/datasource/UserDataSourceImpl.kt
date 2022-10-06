package com.example.data.remote.datasource

import com.example.data.remote.api.UserAPI
import com.example.data.remote.request.user.*
import com.example.data.remote.response.user.*
import com.example.data.utils.BaseDataSource
import javax.inject.Inject

class UserDataSourceImpl @Inject constructor(
    private val userAPI: UserAPI
): UserDataSource, BaseDataSource() {
    override suspend fun signUp(request: SignUpRequest): Void? {
        return safeApiCall { userAPI.signUp(request = request) }?.body()
    }

    override suspend fun login(request: LoginRequest): LoginResponse? {
        return safeApiCall { userAPI.login(request = request) }?.body()
    }

    override suspend fun getInfo(key: String): InfoResponse? {
        return safeApiCall { userAPI.getInfo(key = key) }?.body()
    }

    override suspend fun dolbomi(request: DolbomiRequest): Void? {
        return safeApiCall { userAPI.dolbomi(request = request) }?.body()
    }

    override suspend fun age(request: AgeRequest): Void? {
        return safeApiCall { userAPI.age(request = request) }?.body()
    }

    override suspend fun resume(request: ResumeRequest): Void? {
        return safeApiCall { userAPI.resume(request = request) }?.body()
    }

    override suspend fun caregivers(key: String): Void? {
        return safeApiCall { userAPI.caregivers(key = key) }?.body()
    }
}