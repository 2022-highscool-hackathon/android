package com.example.hackathon_2022.di

import com.example.data.remote.datasource.JobDataSource
import com.example.data.remote.datasource.JobDataSourceImpl
import com.example.data.remote.datasource.UserDataSource
import com.example.data.repository.JobRepositoryImpl
import com.example.data.repository.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideUserRepository(userDataSource: UserDataSource) = UserRepositoryImpl(userDataSource)

    @Provides
    @Singleton
    fun provideJobRepository(jobDataSource: JobDataSource) = JobRepositoryImpl(jobDataSource)
}