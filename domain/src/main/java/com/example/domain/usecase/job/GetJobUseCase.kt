package com.example.domain.usecase.job

import com.example.domain.repository.JobRepository
import javax.inject.Inject

class GetJobUseCase @Inject constructor(
    private val jobRepository: JobRepository
) {
    suspend fun getJob(key: String) = jobRepository.getJob(key = key)
}