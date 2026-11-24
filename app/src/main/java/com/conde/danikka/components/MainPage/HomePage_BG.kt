package com.conde.danikka.components.MainPage


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.conde.danikka.R


@Composable
fun HomePage_BG(){
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.background_homepage),
            contentDescription = "Background HomePage",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()

        )
    }
}