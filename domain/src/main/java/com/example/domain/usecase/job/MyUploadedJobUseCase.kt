package com.example.domain.usecase.job

import com.example.domain.repository.JobRepository
import javax.inject.Inject

class MyUploadedJobUseCase @Inject constructor(
    private val jobRepository: JobRepository
) {
    suspend fun myUploadedJob(key: String) = jobRepository.myUploadedJob(key)
}