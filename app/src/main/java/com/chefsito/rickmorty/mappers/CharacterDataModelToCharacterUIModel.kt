package com.chefsito.rickmorty.mappers

import com.chefsito.rickmorty.models.CharacterDataModel
import com.chefsito.rickmorty.models.CharacterUIModel


fun CharacterDataModel.toCharacterUIModel(): CharacterUIModel {
    return CharacterUIModel(
        name = this.name,
        genter = this.genter,
        created = this.created,
        urlImage = this.urlImage
    )
}