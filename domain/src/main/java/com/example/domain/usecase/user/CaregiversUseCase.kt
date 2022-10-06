package com.example.domain.usecase.user

import com.example.domain.repository.UserRepository
import javax.inject.Inject

class CaregiversUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend fun caregivers(key: String) = userRepository.caregivers(key)
}