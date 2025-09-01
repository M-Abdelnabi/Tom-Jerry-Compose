package com.example.task1tomjerry.composable.jerryStoreComposable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.task1tomjerry.ui.theme.BorderLineColor
import com.example.task1tomjerry.ui.theme.CardBG
import com.example.task1tomjerry.ui.theme.CartTextColor
import com.example.task1tomjerry.ui.theme.IbmFont

@Composable
fun NotificationIcon(notificationCount: String) {
    Box(
        modifier = Modifier
            .padding(vertical = 8.dp, horizontal = 8.dp)
            .size(40.dp, 44.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 4.dp)
                .border(
                    1.dp,
                    color = BorderLineColor.copy(alpha = 0.15f),
                    shape = RoundedCornerShape(12.dp)
                )

        ) {
            Icon(
                painter = painterResource(id = R.drawable.notification_icon),
                contentDescription = "Notification",
                modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.Center)
            )

        }
        Box(
            modifier = Modifier
                .size(14.dp)
                .clip(shape = RoundedCornerShape(100.dp))
                .background(CartTextColor)
                .align(Alignment.TopEnd),
            contentAlignment = Alignment.Center
        )
        {
            Text(
                text = notificationCount,
                fontFamily = IbmFont,
                fontWeight = FontWeight.Medium,
                fontSize = 10.sp,
                color = CardBG,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NotificationIconPreview() {
    NotificationIcon("3")
}