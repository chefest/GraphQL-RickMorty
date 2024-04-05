package com.chefsito.rickmorty.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import coil.compose.AsyncImage

@Composable
fun UImage(
    modifier: Modifier = Modifier,
    url: String,
    contentDescription: String = stringResource(R.string.uimage_content_description),
    placeholder: Painter = painterResource(R.drawable.image_placeholder)
){
    AsyncImage(
        modifier = modifier,
        model = url,
        contentDescription = contentDescription,
        placeholder = placeholder
    )
}