package com.example.data.remote.api

import com.example.data.remote.request.DolbomiRequest
import com.example.data.remote.request.LoginRequest
import com.example.data.remote.request.ResumeRequest
import com.example.data.remote.request.SignUpRequest
import com.example.data.remote.response.InfoResponse
import com.example.data.remote.response.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface UserAPI {
    @POST("user/create")
    suspend fun signUp(
        @Body request: SignUpRequest
    ): Response<Void>

    @POST("user/login")
    suspend fun login(
        @Body request: LoginRequest
    ): Response<LoginResponse>

    @GET("user/")
    suspend fun getInfo(
        @Header("Authorization") key: String
    ): Response<InfoResponse>

    @POST("user/dolbomi")
    suspend fun dolbomi(
        @Body request: DolbomiRequest
    ): Response<Void>

    @POST("user/resume")
    suspend fun resume(
        @Body request: ResumeRequest
    ): Response<Void>
}