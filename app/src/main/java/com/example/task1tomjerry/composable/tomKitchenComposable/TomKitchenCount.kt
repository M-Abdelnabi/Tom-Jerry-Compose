package com.example.task1tomjerry.composable.tomKitchenComposable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.ui.theme.CartTextColor
import com.example.task1tomjerry.ui.theme.IbmFont
import com.example.task1tomjerry.ui.theme.TomCountBackground

@Composable
fun TomKitchenCount() {
    Row(
        modifier = Modifier
            .padding(bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .height(30.dp)
                .width(96.dp)
                .clip(shape = RoundedCornerShape(8.dp))
                .background(TomCountBackground)
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
                    .padding(horizontal = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    painter = painterResource(R.drawable.money_bag_icon),
                    contentDescription = "Money Bag",
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .size(16.dp),
                    tint = CartTextColor
                )

                Text(
                    text = "5 cheeses",
                    fontFamily = IbmFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    color = CartTextColor
                )
            }
        }
    }
}

@Preview
@Composable
fun TomKitchenCountPreview() {
    TomKitchenCount()
}