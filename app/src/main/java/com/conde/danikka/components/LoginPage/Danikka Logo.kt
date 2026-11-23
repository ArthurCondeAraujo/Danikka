package com.conde.danikka.components.LoginPage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.conde.danikka.R

@Composable
fun DanikkaLogo() {
    Image(painter = painterResource(id = R.drawable.danikka_dark), contentDescription = "Danikka Logo", modifier = Modifier.width(275.dp))
}