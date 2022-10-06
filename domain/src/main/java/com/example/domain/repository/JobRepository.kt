package com.example.domain.repository

import com.example.domain.entity.job.JobEntity
import com.example.domain.param.job.JobUploadParam

interface JobRepository {
    suspend fun jobUpload(request: JobUploadParam): Void?
    suspend fun getJob(key: String): JobEntity?
    suspend fun myUploadedJob(key: String): Void?
}