package com.example.task1tomjerry.composable.tomAccountComposable


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task1tomjerry.R
import com.example.task1tomjerry.ui.theme.HeartStatContainerBG
import com.example.task1tomjerry.ui.theme.RunStatContainerBG
import com.example.task1tomjerry.ui.theme.SadStatContainerBG
import com.example.task1tomjerry.ui.theme.TomCountBackground

@Composable
fun StatContainer(
) {
    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .padding(top = 23.dp)
            .fillMaxWidth()
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f), contentAlignment = Alignment.Center
            ) {
                StatItem(
                    title = "2M 12K",
                    subtitle = "No. of quarrels",
                    profileImg = painterResource(id = R.drawable.evil_icon_stat),
                    background = TomCountBackground
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Box(
                modifier = Modifier.weight(1f), contentAlignment = Alignment.Center
            ) {
                StatItem(
                    title = "+500 h",
                    subtitle = "Chase time",
                    profileImg = painterResource(id = R.drawable.run_icon_stat),
                    background = RunStatContainerBG
                )
            }
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier.weight(1f), contentAlignment = Alignment.Center
            ) {
                StatItem(
                    title = "2M 12K",
                    subtitle = "Hunting times",
                    profileImg = painterResource(id = R.drawable.sad_icon_stat),
                    background = SadStatContainerBG
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Box(
                modifier = Modifier.weight(1f), contentAlignment = Alignment.Center
            ) {
                StatItem(
                    title = "3M 7K",
                    subtitle = "Heartbroken",
                    profileImg = painterResource(id = R.drawable.heart_icon_stat),
                    background = HeartStatContainerBG
                )
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun StatContainerPreview() {
    StatContainer()
}