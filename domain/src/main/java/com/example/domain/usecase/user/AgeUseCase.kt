package com.example.domain.usecase.user

import com.example.domain.param.user.AgeParam
import com.example.domain.repository.UserRepository
import javax.inject.Inject

class AgeUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend fun age(request: AgeParam) = userRepository.age(request)
}