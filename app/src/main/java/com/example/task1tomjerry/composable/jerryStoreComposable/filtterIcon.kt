package com.example.task1tomjerry.composable.jerryStoreComposable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.ui.theme.CartTextColor

@Composable
fun AddToCartIcon() {
    Box(
        modifier = Modifier
            .size(48.dp)
            .clip(shape = RoundedCornerShape(12.dp))
            .background(CartTextColor),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = R.drawable.filter_icon),
            contentDescription = "Filter",
            modifier = Modifier
                .height(17.5.dp)
                .width(19.5.dp),
            tint = Color.White
        )

    }

}


@Preview
@Composable
fun FilterIconPreview() {
    AddToCartIcon()
}