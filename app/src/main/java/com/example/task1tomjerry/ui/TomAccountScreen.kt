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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.composable.tomAccountComposable.StatContainer
import com.example.task1tomjerry.composable.tomAccountComposable.TomFavouriteFoodContainer
import com.example.task1tomjerry.composable.tomAccountComposable.TomSettingsContainer
import com.example.task1tomjerry.ui.theme.CardBG
import com.example.task1tomjerry.ui.theme.DividerColor
import com.example.task1tomjerry.ui.theme.IbmFont
import com.example.task1tomjerry.ui.theme.MealDescriptionColor
import com.example.task1tomjerry.ui.theme.PrimaryBGColor

@Composable
fun TomAccountScreen(modifier: Modifier = Modifier) {
    Box(
        modifier
            .fillMaxSize()
            .background(PrimaryBGColor)
    )
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 60.dp)
                .verticalScroll(rememberScrollState())
        )
        {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(242.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.background_account),
                        contentDescription = " ",
                        modifier = Modifier
                            .fillMaxWidth()
                            .offset(y = (-43).dp),
                        contentScale = ContentScale.FillBounds,
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 8.dp)
                        .height(144.dp)
                        .align(Alignment.TopCenter),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.tom_mirror),
                        contentDescription = " ",
                        modifier = modifier
                            .clip(shape = RoundedCornerShape(12.dp))
                            .size(64.dp, 64.dp)
                            .padding(bottom = 4.dp)
                    )

                    Text(
                        text = "Tom ",
                        fontFamily = IbmFont,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = CardBG,
                    )

                    Text(
                        text = "specializes in failure!",
                        fontFamily = IbmFont,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = CardBG.copy(alpha = 0.8f),
                    )
                    Box(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .padding(top = 4.dp)
                            .clip(shape = RoundedCornerShape(40.dp))
                            .background(CardBG.copy(alpha = 0.12f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Edit foolishness ",
                            fontFamily = IbmFont,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium,
                            color = CardBG,
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 5.dp)
                        )
                    }

                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 166.dp)
                        .clip(shape = RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp))
                        .background(PrimaryBGColor)
                ) {
                    StatContainer()

                    Spacer(modifier = Modifier.height(24.dp))

                    TomSettingsContainer()

                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 12.dp),
                        thickness = 1.dp,
                        color = DividerColor.copy()
                    )

                    TomFavouriteFoodContainer()

                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 12.dp),
                        thickness = 1.dp,
                        color = DividerColor.copy()
                    )

                    TomSettingsContainer()

                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 12.dp),
                        thickness = 1.dp,
                        color = DividerColor.copy()
                    )

                    TomFavouriteFoodContainer()

                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(PrimaryBGColor)

        )
        {
            Text(
                text = "v.TomBeta",
                fontFamily = IbmFont,
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                color = MealDescriptionColor.copy(alpha = 0.6f),
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(bottom = 20.dp)
            )
        }
    }

}


@Preview
@Composable
fun TomAccountScreenPreview() {
    TomAccountScreen()
}