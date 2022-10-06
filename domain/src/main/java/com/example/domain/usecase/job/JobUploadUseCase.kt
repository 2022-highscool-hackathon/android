package com.example.domain.usecase.job

import com.example.domain.param.job.JobUploadParam
import com.example.domain.repository.JobRepository
import javax.inject.Inject

class JobUploadUseCase @Inject constructor(
    private val jobRepository: JobRepository
) {
    suspend fun jobUpload(request: JobUploadParam) = jobRepository.jobUpload(request)
}