package com.chefsito.rickmorty.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Preview
@Composable
private fun UImagePreview(){
    UImage(
        url = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
    )
}