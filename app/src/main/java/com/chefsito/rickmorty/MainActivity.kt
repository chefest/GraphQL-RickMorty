package com.chefsito.rickmorty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.chefsito.rickmorty.composables.UCharacterCard
import com.chefsito.rickmorty.ui.theme.RickMortyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: MainActivityViewModel by viewModels()
        viewModel.getCharacterList()
        setContent {
            RickMortyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val data = viewModel.charactersState.collectAsState()
                    LazyColumn(modifier = Modifier.padding(vertical = 5.dp)) {
                        items(data.value) {
                            UCharacterCard(
                                modifier = Modifier,
                                name = it.name,
                                gender = it.genter,
                                url = it.urlImage,
                                created = it.created
                            )
                        }
                    }
                }
            }
        }
    }
}