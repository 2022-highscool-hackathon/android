package com.example.data.remote.api

import com.example.data.remote.request.job.JobUploadRequest
import com.example.data.remote.response.job.JobResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface JobAPI {
    @POST("job/upload")
    suspend fun jobUpload(
        @Body request: JobUploadRequest
    ): Response<Void>

    @GET("job")
    suspend fun getJob(
        @Header("Authorization") key: String
    ): Response<JobResponse>

    @GET("job/my/uploaded")
    suspend fun myUploadedJob(
        @Header("Authorization") key: String
    ): Response<Void>
}