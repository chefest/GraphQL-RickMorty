package com.chefsito.rickmorty

import com.apollographql.apollo3.ApolloClient
import com.chefsito.rickmorty.data.BuildConfig

class MyApolloClient {

    companion object {
        private lateinit var INSTANCE: MyApolloClient
        fun getInstance(): MyApolloClient {
            if (INSTANCE == null) {
                INSTANCE = MyApolloClient()
            }
            return INSTANCE
        }
    }

    private var apolloClient: ApolloClient = ApolloClient
        .Builder()
        .serverUrl(BuildConfig.APOLLO_SERVER)
        .build()

    fun get(): ApolloClient {
        return apolloClient
    }
}