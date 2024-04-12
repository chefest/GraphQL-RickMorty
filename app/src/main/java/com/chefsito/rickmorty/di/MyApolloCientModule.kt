package com.chefsito.rickmorty.di

import com.chefsito.rickmorty.MyApolloClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class MyApolloCientModule {

    @Provides
    fun providesMyApolloClient(): MyApolloClient = MyApolloClient()

}