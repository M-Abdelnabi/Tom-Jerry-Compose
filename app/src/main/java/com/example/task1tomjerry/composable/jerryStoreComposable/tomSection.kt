package com.example.task1tomjerry.composable.jerryStoreComposable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.ui.theme.CartTextColor
import com.example.task1tomjerry.ui.theme.IbmFont
import com.example.task1tomjerry.ui.theme.PrimaryTitleTextColor

@Composable
fun TomSection() {
    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "Cheap tom section",
                fontFamily = IbmFont,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = PrimaryTitleTextColor
            )
        }

        Box(
            modifier = Modifier.padding()
        ) {
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "View all",
                    fontFamily = IbmFont,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    color = CartTextColor,
                )
                Icon(
                    painter = painterResource(R.drawable.view_all_arrow),
                    contentDescription = "View All Arrow",
                    modifier = Modifier
                        .padding(start = 4.dp)
                        .size(10.dp, 10.dp),
                    tint = CartTextColor

                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun TomSectionPreview() {
    TomSection()
}