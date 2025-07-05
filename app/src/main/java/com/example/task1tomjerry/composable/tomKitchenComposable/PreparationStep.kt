package com.example.task1tomjerry.composable.tomKitchenComposable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1tomjerry.ui.theme.CardBG
import com.example.task1tomjerry.ui.theme.IbmFont
import com.example.task1tomjerry.ui.theme.PreparationText
import com.example.task1tomjerry.ui.theme.TemperatureIconColor
import com.example.task1tomjerry.ui.theme.TomCountBackground

@Composable
fun PreparationStep(number: Int, step: String) {
    Box(
        modifier = Modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth()
            .height(38.dp),
    ) {
        Box(
            modifier = Modifier
                .padding(start = 20.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp))
                .background(CardBG),
        ) {
            Text(
                text = step,
                fontFamily = IbmFont,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 25.dp, vertical = 8.dp),
                color = PreparationText
            )

        }
        Box(
            modifier = Modifier
                .size(38.dp)
                .border(
                    width = 1.dp,
                    color = TomCountBackground,
                    shape = RoundedCornerShape(100.dp),
                )
                .align(Alignment.CenterStart)
                .clip(shape = RoundedCornerShape(100.dp))
                .background(CardBG), contentAlignment = Alignment.Center
        ) {
            Text(
                text = number.toString(),
                fontFamily = IbmFont,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                color = TemperatureIconColor
            )

        }

    }
}

@Preview
@Composable
fun PreparationStepPreview() {
    PreparationStep(number = 1, step = "Put the pasta in a toaster.")
}