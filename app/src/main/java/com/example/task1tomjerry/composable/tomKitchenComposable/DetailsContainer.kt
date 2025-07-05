package com.example.task1tomjerry.composable.tomKitchenComposable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.ui.theme.IbmFont
import com.example.task1tomjerry.ui.theme.MealDescriptionColor
import com.example.task1tomjerry.ui.theme.SecondaryTextColor
import com.example.task1tomjerry.ui.theme.TemperatureIconColor
import com.example.task1tomjerry.ui.theme.TomCountBackground

@Composable
fun CartItem(
    painter: Painter,
    title: String,
    subtitle: String,
) {
    Box(
        modifier = Modifier
            .height(112.dp)
            .clip(shape = RoundedCornerShape(12.dp))
            .background(TomCountBackground), contentAlignment = Alignment.Center

    ) {
        Box(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        )
        {
            Icon(
                painter = painter,
                contentDescription = "Money Bag",
                modifier = Modifier
                    .padding(end = 4.dp)
                    .size(32.dp)
                    .align(Alignment.TopCenter),
                tint = TemperatureIconColor
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = title,
                        fontFamily = IbmFont,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        color = MealDescriptionColor.copy(alpha = 0.6f),
                    )
                }
                Box(
                    modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "$subtitle",
                        fontFamily = IbmFont,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        color = SecondaryTextColor,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }

    }
}

@Preview
@Composable
fun CartItemPreview() {
    CartItem(
        painterResource(R.drawable.temperature_icon),
        "1000 V",
        "Temperature ",
    )
}