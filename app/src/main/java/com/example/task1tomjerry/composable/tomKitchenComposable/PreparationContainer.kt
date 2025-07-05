package com.example.task1tomjerry.composable.tomKitchenComposable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1tomjerry.ui.theme.IbmFont
import com.example.task1tomjerry.ui.theme.PrimaryTitleTextColor

@Composable
fun PreparationContainer() {
    Column(
        modifier = Modifier.fillMaxWidth()
                .padding(bottom = 8.dp)

    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Preparation method",
                fontFamily = IbmFont,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = PrimaryTitleTextColor.copy(alpha = 0.87f),
            )
        }
        Column(
            modifier = Modifier.padding(top = 12.dp)
        ) {
            PreparationStep(1, "Put the pasta in a toaster.")
            PreparationStep(2, "Pour battery juice over it.")
            PreparationStep(3, "Wait for the spark to ignite.")
            PreparationStep(4, "Serve with an insulating glove.")
            PreparationStep(5, "Put the pasta in a toaster.")
            PreparationStep(6, "Pour battery juice over it.")
            PreparationStep(7, "Wait for the spark to ignite.")
            PreparationStep(8, "Serve with an insulating glove.")
            PreparationStep(9, "Put the pasta in a toaster.")
            PreparationStep(10, "Pour battery juice over it.")
            PreparationStep(11, "Wait for the spark to ignite.")
            PreparationStep(12, "Serve with an insulating glove.")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreparationContainerPreview() {
    PreparationContainer()
}