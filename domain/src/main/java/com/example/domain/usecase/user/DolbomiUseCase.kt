package com.example.domain.usecase.user

import com.example.domain.param.DolbomiParam
import com.example.domain.repository.UserRepository
import javax.inject.Inject

class DolbomiUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend fun dolbomi(request: DolbomiParam) = userRepository.dolbomi(request)
}