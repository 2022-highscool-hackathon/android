package com.example.domain.usecase

import com.example.domain.param.SignUpParam
import com.example.domain.repository.UserRepository
import javax.inject.Inject

class SignUpUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend fun signUp(request: SignUpParam) = userRepository.signUp(request)
}