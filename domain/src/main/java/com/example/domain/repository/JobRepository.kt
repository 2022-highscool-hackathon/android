package com.example.domain.repository

import com.example.domain.entity.JobEntity

interface JobRepository {
    suspend fun getJob(key: String): JobEntity?
}