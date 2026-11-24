package com.conde.danikka.components.RegisterPage

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.conde.danikka.ui.theme.DarkText

@Composable
fun LoginText(onLogin: () -> Unit) {
    Row {
        Text(text = "Já tem uma conta?", color = DarkText)
        Text(text = " Faça Login", Modifier.clickable { onLogin() }, color = DarkText, fontWeight = FontWeight.Bold)
    }
}