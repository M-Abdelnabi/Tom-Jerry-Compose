package com.example.task1tomjerry.composable.jerryStoreComposable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.ui.theme.IbmFont
import com.example.task1tomjerry.ui.theme.PrimaryTitleTextColor
import com.example.task1tomjerry.ui.theme.SecondaryTitleTextColor

@Composable
fun AppBar(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
    icon: Painter,
    profileImg: Painter
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp, 2.dp),
        verticalAlignment = Alignment.CenterVertically

    )
    {
        Image(
            painter = profileImg,
            contentDescription = "Jerry Store Logo",
            modifier = modifier
                .clip(shape = RoundedCornerShape(12.dp))
                .size(48.dp, 48.dp)
                .padding(vertical = 4.dp)
        )
        Column(
            modifier = modifier
                .padding(start = 8.dp, top = 4.5.dp, bottom = 4.5.dp)
        ) {
            Text(
                text = title,
                color = PrimaryTitleTextColor,
                fontFamily = IbmFont,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = subtitle,
                color = SecondaryTitleTextColor,
                fontFamily = IbmFont,
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal
            )
        }
        Spacer(modifier = modifier.weight(1f))
        NotificationIcon("3")
    }
}

@Preview(showBackground = true)
@Composable
fun AppBarPreview() {
    AppBar(
        title = "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB",
        subtitle = "Which Tom do you want to buy?",
        icon = painterResource(id = R.drawable.notification_icon),
        profileImg = painterResource(id = R.drawable.jerry_profile_image)
    )
}