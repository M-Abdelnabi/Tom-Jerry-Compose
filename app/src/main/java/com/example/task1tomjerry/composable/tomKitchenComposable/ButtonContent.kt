package com.example.task1tomjerry.composable.tomKitchenComposable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.ui.theme.CardBG
import com.example.task1tomjerry.ui.theme.IbmFont

@Composable
fun ButtonContent() {
    Row(
        modifier = Modifier
            .fillMaxHeight()
            .padding(horizontal = 9.dp)
,        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier,
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Add to cart",
                fontFamily = IbmFont,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = CardBG.copy(alpha = 0.87f),
            )
        }

        Icon(
            painter = painterResource(R.drawable.dot_separate_icon),
            contentDescription = " ",
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .size(8.dp),
            tint = CardBG.copy(alpha = 0.38f)
        )

        Box(modifier = Modifier.fillMaxHeight()) {
            Column(modifier = Modifier
                .width(72.dp)
                .height(38.dp),
                ) {
                Box(
                    modifier = Modifier
                        .padding(vertical = 2.dp)
                        .fillMaxWidth()
                        .height(18.dp),
                ) {
                    Text(
                        text = "3 cheeses",
                        fontFamily = IbmFont,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        color = CardBG,
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .padding(top = 2.dp)
                        .fillMaxWidth(),
                ) {
                    Text(
                        text = "5 cheeses",
                        fontFamily = IbmFont,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        style = TextStyle(
                            fontSize = 12.sp, textDecoration = TextDecoration.LineThrough
                        ),
                        color = CardBG.copy(alpha = 0.8f),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun ButtonContentPreview() {
    ButtonContent()
}