package com.example.domain.usecase

import com.example.domain.repository.UserRepository
import javax.inject.Inject

class GetInfoUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend fun getInfo(key: String) = userRepository.getInfo(key)
}