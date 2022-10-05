package com.example.data.repository

import com.example.data.remote.datasource.JobDataSource
import com.example.data.remote.response.toEntity
import com.example.domain.entity.JobEntity
import com.example.domain.repository.JobRepository
import javax.inject.Inject

class JobRepositoryImpl @Inject constructor(
    private val jobDataSource: JobDataSource
): JobRepository {
    override suspend fun getJob(key: String): JobEntity? {
        return jobDataSource.getJob(key = key)?.toEntity()
    }
}