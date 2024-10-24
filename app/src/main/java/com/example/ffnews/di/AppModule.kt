package com.example.ffnews.di

import android.app.Application
import com.example.ffnews.data.manger.LocalUserMangerImpl
import com.example.ffnews.domain.manger.LocalUserManger
import com.example.ffnews.domain.usecases.app_entry.AppEntryUseCases
import com.example.ffnews.domain.usecases.app_entry.ReadAppEntry
import com.example.ffnews.domain.usecases.app_entry.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @[Provides Singleton]
    fun provideLocalUserManger(
        application: Application
    ): LocalUserManger = LocalUserMangerImpl(application)

    @[Provides Singleton]
    fun provideAppEntryUseCases(
        localUserManger: LocalUserManger
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManger),
        saveAppEntry = SaveAppEntry(localUserManger)
    )
}