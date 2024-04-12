package com.chefsito.rickmorty.data

import com.chefsito.rickmorty.MyApolloClient
import com.chefsito.rickmorty.data.graphql.GetCharactersQuery
import com.chefsito.rickmorty.models.CharacterDataModel

/**
 * This class use MyApolloClient to handle the communication
 * between the query and the server
 */
class GetCharacters constructor (
    private val myApolloClient: MyApolloClient
) {
    /**
     * This function use the Apollo client
     * and get the character list
     */
    suspend fun GetCharacterList(): List<CharacterDataModel> {
        var listOfCharacters = listOf<CharacterDataModel>()
        try {
            val characters = myApolloClient
                .get()
                .query(GetCharactersQuery())
                .execute()
                .data?.characters
            characters?.results?.let {
                listOfCharacters = it.map {
                    CharacterDataModel(
                        name = it?.name?:"",
                        genter = it?.gender?:"",
                        created = it?.created?:"",
                        urlImage = it?.image?:""
                    )
                }
            }
        } catch (ex: Exception) {
            ex.toString()
        }
        return listOfCharacters
    }
}