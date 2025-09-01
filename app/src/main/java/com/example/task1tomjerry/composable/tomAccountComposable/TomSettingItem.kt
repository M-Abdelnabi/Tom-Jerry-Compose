package com.example.task1tomjerry.composable.tomAccountComposable


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.ui.theme.CardBG
import com.example.task1tomjerry.ui.theme.IbmFont
import com.example.task1tomjerry.ui.theme.PrimaryTitleTextColor
import com.example.task1tomjerry.ui.theme.SecondaryTextColor

@Composable
fun TomSettingItem(
    modifier: Modifier = Modifier, settingName: String, Settingicon: Painter
) {

    Row(
        modifier = modifier
            .padding(start = 16.dp, bottom = 12.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp, 40.dp)
                .clip(shape = RoundedCornerShape(4.dp))
                .background(CardBG),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = Settingicon,
                contentDescription = "Search Icon",
                modifier = Modifier.size(24.dp),
            )
        }
        Text(
            text = settingName,
            color = PrimaryTitleTextColor.copy(alpha = 0.87f),
            fontFamily = IbmFont,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun TomSettingItemPreview() {
    TomSettingItem(
        settingName = "Change sleeping place", Settingicon = painterResource(id = R.drawable.bed_icon)
    )
}