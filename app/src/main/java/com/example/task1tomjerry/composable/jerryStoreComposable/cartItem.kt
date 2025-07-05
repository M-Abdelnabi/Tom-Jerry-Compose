package com.example.task1tomjerry.composable.jerryStoreComposable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.example.task1tomjerry.ui.theme.CardBG
import com.example.task1tomjerry.ui.theme.IbmFont
import com.example.task1tomjerry.ui.theme.PrimaryTitleTextColor
import com.example.task1tomjerry.ui.theme.SecondaryTextColor

@Composable
fun CartItem(
    painter: Painter,
    title: String,
    subtitle: String,
    oldCheeseCount: Int? = null,
    cheeseCount: Int
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(244.dp),
        contentAlignment = Alignment.Center

    ) {
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp)
                .clip(shape = RoundedCornerShape(16.dp))
                .align(Alignment.BottomCenter),
            colors = CardDefaults.cardColors(
                containerColor = CardBG
            )

        ) {
            Spacer(modifier = Modifier.height(92.dp))
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(84.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = title,
                            fontFamily = IbmFont,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = PrimaryTitleTextColor,
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "$subtitle\n",
                            fontFamily = IbmFont,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            color = SecondaryTextColor,
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp, top = 12.dp)
                        .align(Alignment.BottomCenter),
                    contentAlignment = Alignment.Center

                ) {
                    ProductPrice(cheeseCount, oldCheeseCount)
                }

            }


        }
        Image(
            painter = painter,
            contentDescription = "Tom Icon",
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.TopCenter)
        )
    }


}

@Preview
@Composable
fun CartItemPreview() {
    CartItem(
        painterResource(id = R.drawable.tom_sport),
        "Tom Sport",
        "He runs 1 meter... trips over his boot.\n",
        5,
        3
    )
}