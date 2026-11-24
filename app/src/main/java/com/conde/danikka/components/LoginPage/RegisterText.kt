package com.conde.danikka.components.LoginPage

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun RegisterText(onRegister: () -> Unit) {
    Row {
        Text(text = "Não tem uma conta?")
        Text(text = " Registre-se", Modifier.clickable { onRegister() })
    }
}