package com.conde.danikka.components.LoginPage

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.conde.danikka.components.testing.placeholder

@Composable
fun RegisterText() {
    Row {
        Text(text = "Não tem uma conta?")
        Text(text = " Registre-se", Modifier.clickable { placeholder() })
    }
}