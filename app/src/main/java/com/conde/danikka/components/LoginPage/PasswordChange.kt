package com.conde.danikka.components.LoginPage

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.conde.danikka.components.testing.placeholder
import com.conde.danikka.ui.theme.DarkText

@Composable
fun PasswordChangeText () {
    Box(Modifier.fillMaxWidth().absolutePadding(0.dp, 0.dp, 0.dp, 20.dp)) {
        Text(text = "Esqueceu a sua senha?", Modifier.clickable { placeholder() },color = DarkText, fontWeight = FontWeight.Bold)
    }
}