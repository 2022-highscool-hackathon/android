package com.example.domain.usecase

import com.example.domain.param.user.ResumeParam
import com.example.domain.repository.UserRepository
import javax.inject.Inject

class ResumeUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend fun resume(request: ResumeParam) = userRepository.resume(request)
}