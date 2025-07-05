package com.example.task1tomjerry.composable.tomAccountComposable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import com.example.task1tomjerry.ui.theme.PreparationText
import com.example.task1tomjerry.ui.theme.TomCountBackground

@Composable
fun StatItem(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
    profileImg: Painter,
    background: androidx.compose.ui.graphics.Color
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 2.dp)
            .clip(shape = RoundedCornerShape(12.dp))
            .background(background),
        verticalAlignment = Alignment.CenterVertically

    )
    {
        Image(
            painter = profileImg,
            contentDescription = "Jerry Store Logo",
            modifier = modifier
                .padding(start = 12.dp)
                .padding(vertical = 9.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .size(40.dp, 40.dp)
        )
        Column(
            modifier = modifier
                .padding(horizontal = 8.dp, vertical = 10.dp)
        ) {
            Text(
                text = title,
                color = PreparationText,
                fontFamily = IbmFont,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = subtitle,
                color = PreparationText.copy(alpha = 0.37f),
                fontFamily = IbmFont,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StatItemPreview() {
    StatItem(
        title = "2M 12K",
        subtitle = "No. of quarrels",
        profileImg = painterResource(id = R.drawable.evil_icon_stat),
        background = TomCountBackground
    )
}