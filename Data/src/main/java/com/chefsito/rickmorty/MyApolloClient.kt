package com.chefsito.rickmorty

import android.util.Log
import com.apollographql.apollo3.ApolloClient
import com.chefsito.rickmorty.data.BuildConfig

class MyApolloClient {

    var apolloClient: ApolloClient
    init {
        Log.d(this.javaClass.name,"Instance: MyApolloClient created" )
        apolloClient = ApolloClient
            .Builder()
            .serverUrl(BuildConfig.APOLLO_SERVER)
            .build()
    }

    fun get(): ApolloClient {
        return apolloClient
    }
}