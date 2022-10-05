package com.example.hackathon_2022.di

import com.example.domain.repository.JobRepository
import com.example.domain.repository.UserRepository
import com.example.domain.usecase.job.GetJobUseCase
import com.example.domain.usecase.user.*
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
    fun provideDolbomiUseCase(userRepository: UserRepository) = DolbomiUseCase(userRepository)

    @Provides
    @Singleton
    fun provideResumeUseCase(userRepository: UserRepository) = ResumeUseCase(userRepository)

    @Provides
    @Singleton
    fun provideGetJobUseCase(jobRepository: JobRepository) = GetJobUseCase(jobRepository)
}