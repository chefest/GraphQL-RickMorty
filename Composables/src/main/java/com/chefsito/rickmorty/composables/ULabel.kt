package com.chefsito.rickmorty.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ULabel(
    modifier: Modifier = Modifier,
    text: String = ""
){
    Text(
        modifier = modifier,
        text = text,
        color = Color.Black
    )
}