package com.chefsito.rickmorty.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun UCharacterCardPreview(
) {
    UCharacterCard(
        modifier = Modifier,
        name = "Ken Guzman",
        gender = "causae",
        url = "https://duckduckgo.com/?q=altera",
        created = "mel"
    )
}