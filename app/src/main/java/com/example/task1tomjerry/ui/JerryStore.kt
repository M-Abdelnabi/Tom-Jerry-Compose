package com.example.task1tomjerry.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.composable.jerryStoreComposable.AppBar
import com.example.task1tomjerry.composable.jerryStoreComposable.Banner
import com.example.task1tomjerry.composable.jerryStoreComposable.MyScrollableContent
import com.example.task1tomjerry.composable.jerryStoreComposable.SearchBar
import com.example.task1tomjerry.composable.jerryStoreComposable.TomSection
import com.example.task1tomjerry.ui.theme.PrimaryBGColor

@Composable
fun JerryStoreScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(PrimaryBGColor)
            .padding(top = 2.dp)
    ) {
        AppBar(
            title = "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB",
            subtitle = "Which Tom do you want to buy?",
            icon = painterResource(id = R.drawable.notification_icon),
            profileImg = painterResource(id = R.drawable.jerry_profile_image)
        )
        Spacer(modifier = modifier.height(10.dp))
        SearchBar()
        Spacer(modifier = modifier.height(8.dp))
        Box(modifier = modifier.padding(horizontal = 16.dp)) {
            Banner()
        }
        Spacer(modifier = modifier.height(24.dp))
        TomSection()
        Spacer(modifier = modifier.height(16.dp))
        MyScrollableContent()
    }

}

@Preview(showBackground = true)
@Composable
fun JerryStoreScreenPreview() {
    JerryStoreScreen()
}