package com.example.hackathon_2022.di

import com.example.data.repository.UserRepositoryImpl
import com.example.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class MyRepositoryModule {
    @Binds
    abstract fun bindUserRepositoryImpl(
        userRepositoryImpl: UserRepositoryImpl
    ): UserRepository
}