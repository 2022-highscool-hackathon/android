package com.example.domain.usecase.user

import com.example.domain.param.ResumeParam
import com.example.domain.repository.UserRepository
import javax.inject.Inject

class ResumeUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend fun resume(request: ResumeParam) = userRepository.resume(request)
}