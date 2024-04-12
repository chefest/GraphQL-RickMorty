package com.chefsito.rickmorty.data

import com.chefsito.rickmorty.MyApolloClient
import com.chefsito.rickmorty.data.graphql.GetCharactersQuery

/**
 * This class use MyApolloClient to handle the communication
 * between the query and the server
 */
class GetCharacters(
    val myApolloClient: MyApolloClient
) {
    /**
     * This function use the Apollo client
     * and get the character list
     */
    suspend fun GetCharacterList(): GetCharactersQuery.Data? {
        val response = myApolloClient.get().query(GetCharactersQuery()).execute()
        return response.data
    }
}