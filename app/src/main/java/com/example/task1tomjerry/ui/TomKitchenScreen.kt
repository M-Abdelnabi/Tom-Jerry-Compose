package com.example.task1tomjerry.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.composable.tomKitchenComposable.ButtonContent
import com.example.task1tomjerry.composable.tomKitchenComposable.IconText
import com.example.task1tomjerry.composable.tomKitchenComposable.TomKitchenContent
import com.example.task1tomjerry.ui.theme.ButtonBackground
import com.example.task1tomjerry.ui.theme.CardBG
import com.example.task1tomjerry.ui.theme.KitchenBackground
import com.example.task1tomjerry.ui.theme.PrimaryBGColor
import com.example.task1tomjerry.ui.theme.ShapeColor

@Composable
fun TomKitchenScreen(modifier: Modifier = Modifier) {
    Box {
        Column(
            modifier = Modifier
                .padding(bottom = 8.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(PrimaryBGColor)
                    .background(KitchenBackground)
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.background_shape),
                    contentDescription = "Tom Kitchen Background Custom Shape",
                    modifier = Modifier
                        .size(width = 384.dp, height = 414.dp)
                        .offset(x = (-95).dp, y = (-50).dp),
                    tint = ShapeColor

                )
                Column(
                    modifier = Modifier.padding(start = 16.dp, top = 40.dp)
                ) {
                    IconText(painterResource(id = R.drawable.ruler_icon), "High tension")
                    Spacer(modifier = Modifier.height(16.dp))
                    IconText(painterResource(id = R.drawable.chef_icon), "Shocking foods")
                }

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 162.dp)
                        .clip(shape = RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp))
                        .background(PrimaryBGColor)
                ) {

                    TomKitchenContent()

                }
                Image(
                    painterResource(R.drawable.pasta_plate),
                    contentDescription = "Pasta Plate",
                    modifier = Modifier
                        .padding(top = 18.dp, end = 24.dp)
                        .width(188.dp)
                        .height(168.dp)
                        .align(Alignment.TopEnd)
                )

            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(CardBG)
        ) {
            Button(
                onClick = { },
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 15.dp)
                    .fillMaxWidth()
                    .height(64.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(ButtonBackground),

                ) {
                ButtonContent()
            }
        }
    }
}

@Preview
@Composable
fun TomKitchenScreenPreview() {
    TomKitchenScreen()
}