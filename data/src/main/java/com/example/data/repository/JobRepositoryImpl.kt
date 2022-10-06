package com.example.data.repository

import com.example.data.remote.datasource.JobDataSource
import com.example.data.remote.request.job.*
import com.example.data.remote.response.job.*
import com.example.domain.entity.job.JobEntity
import com.example.domain.param.job.JobUploadParam
import com.example.domain.repository.JobRepository
import javax.inject.Inject

class JobRepositoryImpl @Inject constructor(
    private val jobDataSource: JobDataSource
): JobRepository {
    override suspend fun jobUpload(request: JobUploadParam): Void? {
        return jobDataSource.jobUpload(request = request.toRequest())
    }

    override suspend fun getJob(key: String): JobEntity? {
        return jobDataSource.getJob(key = key)?.toEntity()
    }

    override suspend fun myUploadedJob(key: String): Void? {
        return jobDataSource.myUploadedJob(key = key)
    }
}