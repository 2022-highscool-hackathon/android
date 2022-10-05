package com.example.hackathon_2022.di

import com.example.data.remote.api.JobAPI
import com.example.data.remote.api.UserAPI
import com.example.data.remote.datasource.JobDataSourceImpl
import com.example.data.remote.datasource.UserDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    @Provides
    @Singleton
    fun provideUserDataSource(api: UserAPI) = UserDataSourceImpl(api)

    @Provides
    @Singleton
    fun provideJobDataSource(api: JobAPI) = JobDataSourceImpl(api)
}