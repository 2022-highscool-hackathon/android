package com.example.domain.usecase

import com.example.domain.param.user.LoginParam
import com.example.domain.repository.UserRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend fun login(request: LoginParam) = userRepository.login(request)
}