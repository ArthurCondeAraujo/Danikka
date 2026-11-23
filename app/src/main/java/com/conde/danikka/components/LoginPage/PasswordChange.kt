package com.conde.danikka.components.LoginPage

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.conde.danikka.components.testing.placeholder

@Composable
fun PasswordChangeText () {
    Box(Modifier.fillMaxWidth() .background(color = Color.Red),) {
        Text(text = "Esqueceu a sua senha?", Modifier.clickable { placeholder() })
    }
}