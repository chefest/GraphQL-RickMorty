package com.chefsito.rickmorty.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun UCharacterCard(
    modifier: Modifier = Modifier,
    name: String = "",
    gender: String = "",
    url: String = "",
    created: String = "",
    padding: Dp = 5.dp,
    elevation: Dp = 10.dp
) {
    Card(
        modifier = modifier
            .padding(padding)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(elevation),
        shape = CardDefaults.elevatedShape,
    ) {
        Row {
            UImage(url = url)
            Column {
                ULabel(text = stringResource(id = R.string.name, name))
                ULabel(text = stringResource(id = R.string.gender, gender))
                ULabel(text = stringResource(id = R.string.created, created))
            }
        }
    }
}