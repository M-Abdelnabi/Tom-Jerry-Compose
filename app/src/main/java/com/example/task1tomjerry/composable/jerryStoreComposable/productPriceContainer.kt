package com.example.task1tomjerry.composable.jerryStoreComposable

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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.ui.theme.CartAmountBG
import com.example.task1tomjerry.ui.theme.CartTextColor
import com.example.task1tomjerry.ui.theme.IbmFont

@Composable
fun ProductPrice(
    cheeseCount: Int, oldCheeseCount: Int? = null
) {
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .padding(end = 8.dp)
                .height(32.dp)
                .width(120.dp)
                .clip(shape = RoundedCornerShape(8.dp))
                .background(CartAmountBG)
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
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

                if (oldCheeseCount != null) {
                    Text(
                        modifier = Modifier.padding(end = 2.dp),
                        text = oldCheeseCount.toString(),
                        fontFamily = IbmFont,
                        fontWeight = FontWeight.Medium,
                        style = TextStyle(
                            fontSize = 12.sp, textDecoration = TextDecoration.LineThrough
                        ),
                        color = CartTextColor,
                    )
                }
                Text(
                    text = "$cheeseCount cheeses",
                    fontFamily = IbmFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    color = CartTextColor
                )
            }
        }
        IconAddToCart()
    }
}

@Preview
@Composable
fun ProductPricePreview() {
    ProductPrice(oldCheeseCount = 5, cheeseCount = 3)
}