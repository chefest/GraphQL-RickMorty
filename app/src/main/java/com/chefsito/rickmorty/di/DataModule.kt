package com.chefsito.rickmorty.di

import com.chefsito.rickmorty.MyApolloClient
import com.chefsito.rickmorty.data.GetCharacters
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DataModule {
    @Provides
    fun providesGetCharacters(
        myApolloClient: MyApolloClient
    ): GetCharacters = GetCharacters(
        myApolloClient = myApolloClient
    )
}