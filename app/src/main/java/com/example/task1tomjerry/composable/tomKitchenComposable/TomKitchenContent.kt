package com.example.task1tomjerry.composable.tomKitchenComposable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.ui.theme.IbmFont
import com.example.task1tomjerry.ui.theme.PrimaryTitleTextColor

@Composable
fun TomKitchenContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 18.dp, vertical = 32.dp)
    ) {
        TomMealDescription()

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(152.dp)
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Box(
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                        .width(61.dp)
                        .height(32.dp),
                ) {
                    Text(
                        text = "Details",
                        fontFamily = IbmFont,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = PrimaryTitleTextColor.copy(alpha = 0.87f),
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier.weight(1f), contentAlignment = Alignment.Center
                    ) {
                        CartItem(
                            painterResource(R.drawable.temperature_icon),
                            "1000 V",
                            "Temperature ",
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))

                    Box(
                        modifier = Modifier.weight(1f), contentAlignment = Alignment.Center
                    ) {
                        CartItem(
                            painterResource(R.drawable.clock_icon),
                            "3 sparks",
                            "Time ",
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))

                    Box(
                        modifier = Modifier.weight(1f), contentAlignment = Alignment.Center
                    ) {
                        CartItem(
                            painterResource(R.drawable.evil_icon),
                            "1M 12K",
                            "No. of deaths ",
                        )
                    }

                }

            }
        }
        Spacer(modifier = Modifier.height(24.dp))

        PreparationContainer()
    }
}


@Preview(showBackground = true)
@Composable
fun TomKitchenScrollableContentPreview() {
    TomKitchenContent()
}