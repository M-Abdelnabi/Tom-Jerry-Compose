package com.example.task1tomjerry.composable.jerryStoreComposable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.ui.theme.CardBG
import com.example.task1tomjerry.ui.theme.IbmFont
import com.example.task1tomjerry.ui.theme.MidnightBlue
import com.example.task1tomjerry.ui.theme.SkyBlue

@Composable
fun Banner() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(110.dp)
            .clip(RoundedCornerShape(bottomEnd = 16.dp))
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(
                    Brush.linearGradient(
                        colors = listOf(MidnightBlue, SkyBlue),
                        start = Offset.Zero,
                        end = Offset.Infinite
                    )
                )
                .align(Alignment.BottomCenter)
        )
        {
            Box(
                modifier = Modifier
                    .size(width = 190.dp, height = 163.dp)
                    .offset(x = 290.14.dp, y = (-20).dp)
                    .graphicsLayer { rotationZ = 150f }
                    .background(Color.White.copy(alpha = 0.04f), shape = CircleShape)
            )

            Box(
                modifier = Modifier
                    .size(width = 182.dp, height = 160.dp)
                    .offset(x = 298.27.dp, y = (-20).dp)
                    .graphicsLayer { rotationZ = 150f }
                    .background(Color.White.copy(alpha = 0.04f), shape = CircleShape)

            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Buy 1 Tom and get 2 for free",
                        fontFamily = IbmFont,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = CardBG
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier
                        .width(177.dp)
                ) {
                    Text(
                        text = "Adopt Tom! (Free Fail-Free Guarantee)",
                        fontFamily = IbmFont,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = CardBG.copy(alpha = 0.8f)
                    )

                }
            }

        }
        Image(
            painter = painterResource(id = R.drawable.tom_banner),
            contentDescription = "Promo Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .size(width = 115.dp, height = 108.dp)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun BannerPreview() {
    Banner()
}