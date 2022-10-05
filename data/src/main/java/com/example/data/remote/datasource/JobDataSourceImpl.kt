package com.example.data.remote.datasource

import com.example.data.remote.api.JobAPI
import com.example.data.remote.response.JobResponse
import com.example.data.utils.BaseDataSource
import javax.inject.Inject

class JobDataSourceImpl @Inject constructor(
    private val jobAPI: JobAPI
): JobDataSource, BaseDataSource() {
    override suspend fun getJob(key: String): JobResponse? {
        return safeApiCall { jobAPI.getJob(key = key) }?.body()
    }
}