package com.example.data.remote.api

import com.example.data.remote.response.JobResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface JobAPI {
    @GET("job")
    suspend fun getJob(
        @Header("Authorization") key: String
    ): Response<JobResponse>
}