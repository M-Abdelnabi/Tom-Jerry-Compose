package com.example.task1tomjerry.composable.jerryStoreComposable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task1tomjerry.R

@Composable
fun MyScrollableContent() {
    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())

    ) {
        Row(
            modifier = Modifier
                .padding(bottom = 12.dp)
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier.weight(1f), contentAlignment = Alignment.Center
            ) {
                CartItem(
                    painter = painterResource(id = R.drawable.tom_sport),
                    title = "Sport Tom",
                    subtitle = "He runs 1 meter... trips over his boot.\n",
                    oldCheeseCount = 5,
                    cheeseCount = 3
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier.weight(1f), contentAlignment = Alignment.Center
            ) {
                CartItem(
                    painter = painterResource(id = R.drawable.tom_lover),
                    title = "Tom the lover",
                    subtitle = "He loves one-sidedly...\n" +
                            "and is beaten by the other\n" +
                            "side.",

                    cheeseCount = 5
                )
            }
        }
        Row(
            modifier = Modifier
                .padding(bottom = 12.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.weight(1f), contentAlignment = Alignment.Center
            ) {
                CartItem(
                    painter = painterResource(id = R.drawable.tom_bomb),
                    title = "Tom the bomb",
                    subtitle = "He blows himself u\n" +
                            " before Jerry can catch\n" +
                            "him.",
                    cheeseCount = 10
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier.weight(1f), contentAlignment = Alignment.Center
            ) {
                CartItem(
                    painter = painterResource(id = R.drawable.tom_spy),
                    title = "Spy Tom",
                    subtitle = "Disguises itself as a table.",
                    cheeseCount = 12
                )
            }
        }
        Row(
            modifier = Modifier
                .padding(bottom = 12.dp)
                .fillMaxWidth()


        ) {
            Box(
                modifier = Modifier.weight(1f), contentAlignment = Alignment.Center
            ) {
                CartItem(
                    painter = painterResource(id = R.drawable.tom_frozen),
                    title = "Frozen Tom",
                    subtitle = "He was chasing Jerry, he froze after the first look",
                    cheeseCount = 10
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier.weight(1f), contentAlignment = Alignment.Center
            ) {
                CartItem(
                    painter = painterResource(id = R.drawable.tom_sleeping),
                    title = "Sleeping Tom",
                    subtitle = "He doesn't chase anyone, he just snores in stereo.",
                    cheeseCount = 10
                )
            }
        }
    }
}

@Preview
@Composable
fun MyScrollableContentPreview() {
    MyScrollableContent()
}
