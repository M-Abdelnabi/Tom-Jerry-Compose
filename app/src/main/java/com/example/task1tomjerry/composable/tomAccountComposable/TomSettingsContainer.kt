package com.example.task1tomjerry.composable.tomAccountComposable


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.ui.theme.IbmFont
import com.example.task1tomjerry.ui.theme.PrimaryTitleTextColor

@Composable
fun TomSettingsContainer() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp)
        ) {
            Text(
                text = "Tom settings",
                fontFamily = IbmFont,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryTitleTextColor.copy(alpha = 0.87f),
            )
        }
        Column(
            modifier = Modifier.padding(top = 8.dp)
        ) {
            TomSettingItem(
                settingName = "Change sleeping place",
                Settingicon = painterResource(id = R.drawable.bed_icon)
            )
            TomSettingItem(
                settingName = "Meow settings",
                Settingicon = painterResource(id = R.drawable.cat_icon)
            )
            TomSettingItem(
                settingName = "Password to open the fridge",
                Settingicon = painterResource(id = R.drawable.fridge_icon)
            )


        }

    }

}

@Preview(showBackground = true)
@Composable
fun TomSettingsContainerPreview() {
    TomSettingsContainer()
}
