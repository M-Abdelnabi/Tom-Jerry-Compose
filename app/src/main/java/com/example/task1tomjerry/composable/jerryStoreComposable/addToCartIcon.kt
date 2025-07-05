package com.example.task1tomjerry.composable.jerryStoreComposable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.ui.theme.CartTextColor

@Composable
fun IconAddToCart(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .size(30.dp)
            .border(
                1.dp,
                color = CartTextColor,
                shape = RoundedCornerShape(8.dp)
            )
            .clip(shape = RoundedCornerShape(8.dp)),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = R.drawable.cart_icon),
            contentDescription = "Filter",
            modifier = Modifier
                .size(16.dp),
            tint = CartTextColor
        )
    }

}


@Preview
@Composable
fun IconAddToCartPreview() {
    IconAddToCart()
}