package com.conde.danikka

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.conde.danikka.components.MainPage.HomePage_BG
import com.conde.danikka.components.MainPage.Search_1
import com.conde.danikka.ui.theme.DarkBackground

@Composable

fun MainPage(){
    Box(Modifier.background(DarkBackground)) {
        HomePage_BG()
        Search_1 {  }
    }
}