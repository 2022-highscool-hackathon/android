package com.example.data.remote.datasource

import com.example.data.remote.api.JobAPI
import com.example.data.remote.request.job.JobUploadRequest
import com.example.data.remote.response.job.JobResponse
import com.example.data.utils.BaseDataSource
import javax.inject.Inject

class JobDataSourceImpl @Inject constructor(
    private val jobAPI: JobAPI
): JobDataSource, BaseDataSource() {
    override suspend fun jobUpload(request: JobUploadRequest): Void? {
        return safeApiCall { jobAPI.jobUpload(request = request) }?.body()
    }

    override suspend fun getJob(key: String): JobResponse? {
        return safeApiCall { jobAPI.getJob(key = key) }?.body()
    }

    override suspend fun myUploadedJob(key: String): Void? {
        return safeApiCall { jobAPI.myUploadedJob(key = key) }?.body()
    }
}