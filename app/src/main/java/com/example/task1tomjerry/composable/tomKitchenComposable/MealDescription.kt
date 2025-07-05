package com.example.task1tomjerry.composable.tomKitchenComposable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.ui.theme.CartTextColor
import com.example.task1tomjerry.ui.theme.IbmFont
import com.example.task1tomjerry.ui.theme.MealDescriptionColor
import com.example.task1tomjerry.ui.theme.PrimaryTitleTextColor

@Composable
fun TomMealDescription() {
    Box {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier, verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .padding(bottom = 14.dp)
                            .width(178.dp)
                            .height(32.dp),
                    ) {
                        Text(
                            text = "Electric Tom pasta",
                            fontFamily = IbmFont,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = PrimaryTitleTextColor.copy(alpha = 0.87f),
                        )
                    }
                    TomKitchenCount()
                }
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    painter = painterResource(R.drawable.love_icon),
                    contentDescription = "Money Bag",
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .size(24.dp),
                    tint = CartTextColor
                )
            }
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Pasta cooked with a charger cable and\n" + "sprinkled with questionable cheese. Make sure\n" + "to unplug it before eating (or not, you decide).",
                    fontFamily = IbmFont,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = MealDescriptionColor.copy(alpha = 0.55f),
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun TomMealDescriptionPreview() {
    TomMealDescription()
}