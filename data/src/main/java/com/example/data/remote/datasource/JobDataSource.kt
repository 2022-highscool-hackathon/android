package com.example.data.remote.datasource

import com.example.data.remote.request.job.JobUploadRequest
import com.example.data.remote.response.job.JobResponse

interface JobDataSource {
    suspend fun jobUpload(request: JobUploadRequest): Void?
    suspend fun getJob(key: String): JobResponse?
    suspend fun myUploadedJob(key: String): Void?
}