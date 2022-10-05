package com.example.hackathon_2022.di

import com.example.domain.repository.UserRepository
import com.example.domain.usecase.GetInfoUseCase
import com.example.domain.usecase.LoginUseCase
import com.example.domain.usecase.ResumeUseCase
import com.example.domain.usecase.SignUpUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    @Singleton
    fun provideSignUpUseCase(userRepository: UserRepository) = SignUpUseCase(userRepository)

    @Provides
    @Singleton
    fun provideLoginUseCase(userRepository: UserRepository) = LoginUseCase(userRepository)

    @Provides
    @Singleton
    fun provideGetInfoUseCase(userRepository: UserRepository) = GetInfoUseCase(userRepository)

    @Provides
    @Singleton
    fun provideResumeUseCase(userRepository: UserRepository) = ResumeUseCase(userRepository)
}