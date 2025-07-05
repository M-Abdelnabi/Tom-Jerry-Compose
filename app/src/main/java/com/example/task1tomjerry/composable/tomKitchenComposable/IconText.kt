package com.example.task1tomjerry.composable.tomKitchenComposable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.ui.theme.CardBG
import com.example.task1tomjerry.ui.theme.IbmFont

@Composable
fun IconText(icon: Painter, text: String) {
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = icon,
            contentDescription = " ",
            modifier = Modifier
                .size(24.dp),
            tint = CardBG
        )
        Text(
            text = text,
            fontFamily = IbmFont,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(start = 8.dp),
            color = CardBG.copy(alpha = 0.87f)

            )
    }
}

@Preview
@Composable
fun IconTextPreview() {
    IconText(painterResource(id = R.drawable.ruler_icon), "High tension")
}