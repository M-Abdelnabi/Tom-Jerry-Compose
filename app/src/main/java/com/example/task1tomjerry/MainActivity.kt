package com.example.task1tomjerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.task1tomjerry.ui.TomAccountScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                //   JerryStoreScreen(modifier = Modifier.padding(innerPadding))
                //   TomKitchenScreen(modifier = Modifier.padding(innerPadding))
                TomAccountScreen(modifier = Modifier.padding(innerPadding))
            }
        }
    }
}


