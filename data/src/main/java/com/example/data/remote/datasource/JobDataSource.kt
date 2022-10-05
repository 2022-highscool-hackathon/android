package com.example.data.remote.datasource

import com.example.data.remote.response.JobResponse

interface JobDataSource {
    suspend fun getJob(key: String): JobResponse?
}