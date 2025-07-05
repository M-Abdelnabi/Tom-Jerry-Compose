package com.example.task1tomjerry.composable.jerryStoreComposable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SearchBar(modifier: Modifier = Modifier) {

    Row(modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier=Modifier
            .weight(1f)
        ){
        SearchBox()
        }
        Spacer(modifier = Modifier.width(8.dp))
        Box(modifier = Modifier.padding(end = 16.dp)){
            AddToCartIcon()
        }

    }
}

@Preview
@Composable
fun SearchBarPreview() {
    SearchBar()
}